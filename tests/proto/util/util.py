from unittest import TestCase
from google.protobuf.struct_pb2 import ListValue, Struct, Value
from google.protobuf.descriptor import Descriptor, FieldDescriptor
from typing import Set


def assert_flat_descriptor_matches(
        test: TestCase,
        descriptor: Descriptor,
        flat_descriptor: Descriptor,
        missing_field_names: Set[str] = set(),
        missing_field_numbers: Set[int] = set()):
    """Used to assert that flat messages are kept in sync."""
    field_names = set([f.name for f in descriptor.fields])
    flat_field_names = set([f.name for f in flat_descriptor.fields])
    flat_field_names.update(missing_field_names)
    test.assertSetEqual(field_names, flat_field_names,
        f"Keep {flat_descriptor.name} in sync with {descriptor.name}.")

    field_numbers = set([f.number for f in descriptor.fields])
    flat_field_numbers = set([f.number for f in flat_descriptor.fields])
    flat_field_numbers.update(missing_field_numbers)
    test.assertSetEqual(field_numbers, flat_field_numbers,
        f"Keep {flat_descriptor.name} in sync with {descriptor.name}.")
