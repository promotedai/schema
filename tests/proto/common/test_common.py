import unittest
unittest.util._MAX_LENGTH=2000

from google.protobuf.struct_pb2 import ListValue, Struct, Value
from proto.common.common_pb2 import Properties
from proto.common.INTERNAL_flat_properties_pb2 import (
        FlatProperties,
        ListValue1,
        ListValue2,
        ListValue3,
        ListValue4,
        ListValue5,
        Struct1,
        Struct2,
        Struct3,
        Struct4,
        Struct5,
        Value1,
        Value2,
        Value3,
        Value4,
        Value5)
from tests.proto.util.util import assert_flat_descriptor_matches


class CommonTest(unittest.TestCase):

    def test_flat_descriptor_matches_properties(self):
        assert_flat_descriptor_matches(self, Properties.DESCRIPTOR, FlatProperties.DESCRIPTOR)

    def test_flat_descriptor_matches_list_value1(self):
        assert_flat_descriptor_matches(self, ListValue.DESCRIPTOR, ListValue1.DESCRIPTOR)

    def test_flat_descriptor_matches_list_value2(self):
        assert_flat_descriptor_matches(self, ListValue.DESCRIPTOR, ListValue2.DESCRIPTOR)

    def test_flat_descriptor_matches_list_value3(self):
        assert_flat_descriptor_matches(self, ListValue.DESCRIPTOR, ListValue3.DESCRIPTOR)

    def test_flat_descriptor_matches_list_value4(self):
        assert_flat_descriptor_matches(self, ListValue.DESCRIPTOR, ListValue4.DESCRIPTOR)

    def test_flat_descriptor_matches_list_value5(self):
        assert_flat_descriptor_matches(self, ListValue.DESCRIPTOR, ListValue5.DESCRIPTOR)

    def test_flat_descriptor_matches_struct1(self):
        assert_flat_descriptor_matches(self, Struct.DESCRIPTOR, Struct1.DESCRIPTOR)

    def test_flat_descriptor_matches_struct2(self):
        assert_flat_descriptor_matches(self, Struct.DESCRIPTOR, Struct2.DESCRIPTOR)

    def test_flat_descriptor_matches_struct3(self):
        assert_flat_descriptor_matches(self, Struct.DESCRIPTOR, Struct3.DESCRIPTOR)

    def test_flat_descriptor_matches_struct4(self):
        assert_flat_descriptor_matches(self, Struct.DESCRIPTOR, Struct4.DESCRIPTOR)

    def test_flat_descriptor_matches_struct5(self):
        assert_flat_descriptor_matches(self, Struct.DESCRIPTOR, Struct5.DESCRIPTOR)

    def test_flat_descriptor_matches_value1(self):
        assert_flat_descriptor_matches(self, Value.DESCRIPTOR, Value1.DESCRIPTOR)

    def test_flat_descriptor_matches_value2(self):
        assert_flat_descriptor_matches(self, Value.DESCRIPTOR, Value2.DESCRIPTOR)

    def test_flat_descriptor_matches_value3(self):
        assert_flat_descriptor_matches(self, Value.DESCRIPTOR, Value3.DESCRIPTOR)

    def test_flat_descriptor_matches_value4(self):
        assert_flat_descriptor_matches(self, Value.DESCRIPTOR, Value4.DESCRIPTOR)

    def test_flat_descriptor_matches_value5(self):
        assert_flat_descriptor_matches(
            self,
            Value.DESCRIPTOR,
            Value5.DESCRIPTOR,
            {'list_value', 'struct_value'},
            {5, 6})



if __name__ == '__main__':
  unittest.main()
