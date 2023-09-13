import unittest
unittest.util._MAX_LENGTH=2000

from google.protobuf.descriptor import Descriptor, FieldDescriptor
from google.protobuf.struct_pb2 import Value
from proto.event.event_pb2 import LogRequest
from typing import List, Set


class EventTest(unittest.TestCase):
    def test_catch_recursive_fields(self):
        # Starting at LogRequest since it captures most messages.
        finder = RecursiveFieldFinder(LogRequest.DESCRIPTOR)
        # IMPORTANT
        # - If you want to add new Messages to this list, you need to create a Flat{Message} and a unit test for keeping the Flat{Message}s in sync.
        # - If you want to add a new Message or field to this set, you need to update the Metrics code that flattens Avro schemas.
        self.assertEqual({
            'common.Properties.struct',
            'delivery.Request.insertion_matrix',
        },
        finder.starting_recursive_fields)


class RecursiveMessageFinderTest(unittest.TestCase):
    """Tests for a helper class."""

    def test_catch_recursive_fields_value(self):
        finder = RecursiveMessageFinder()
        finder.process_descriptor(Value.DESCRIPTOR)

        self.assertEqual({
            'google.protobuf.ListValue',
            'google.protobuf.Struct',
            'google.protobuf.Value',
            'google.protobuf.Struct.FieldsEntry',
        }, finder.recursive_messages)

    def test_catch_recursive_messages(self):
        finder = RecursiveMessageFinder()
        finder.process_descriptor(LogRequest.DESCRIPTOR)
        self.assertEqual({
            'google.protobuf.Struct',
            'google.protobuf.ListValue',
            'google.protobuf.Value',
            'google.protobuf.Struct.FieldsEntry',
        }, finder.recursive_messages)


class RecursiveFieldFinder:
    """Helps find recursive Proto Messages in a Descriptor."""

    def __init__(self, descriptor):
        self.starting_recursive_fields: Set[str] = set()
        self.finder = RecursiveMessageFinder()
        self.finder.process_descriptor(descriptor)
        self.process_descriptor(descriptor)

    def process_descriptor(self, descriptor: Descriptor):
        for f in descriptor.fields:
            if f.type == FieldDescriptor.TYPE_MESSAGE:
                if f.message_type.full_name in self.finder.recursive_messages:
                    self.starting_recursive_fields.add(f"{descriptor.full_name}.{f.name}")
                else:
                    self.process_descriptor(f.message_type)


class RecursiveMessageFinder:
    """Helps find recursive Proto Messages in a Descriptor."""

    def __init__(self):
        self.recursive_messages: Set[str] = set()
        self.non_recursive_messages: Set[str] = set()

    # Less efficient but easier to read.
    def process_descriptor(self, descriptor: Descriptor, parent_messages: List[str] = []):
        # Cycle detected
        if descriptor.full_name in parent_messages:
            # TODO - support returning all recursive members in the middle.
            index = parent_messages.index(descriptor.full_name)
            # Add all types in between to the set.
            for message in parent_messages[index:]:
                self.recursive_messages.add(message)
        else:
            # Delay copy in case we don't need to traverse deeper.
            parent_messages = parent_messages.copy()
            parent_messages.append(descriptor.full_name)
            for f in descriptor.fields:
                if f.type == FieldDescriptor.TYPE_MESSAGE:
                    self.process_descriptor(f.message_type, parent_messages)

        if not descriptor.full_name in self.recursive_messages:
            # If after traversing and the message is not in the recursive set, add to the non-recursive set.
            self.non_recursive_messages.add(descriptor.full_name)


if __name__ == '__main__':
  unittest.main()
