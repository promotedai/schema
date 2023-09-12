import unittest
unittest.util._MAX_LENGTH=2000

from proto.delivery.delivery_pb2 import (
        FlatRequest,
        Request)

from tests.proto.util.util import assert_flat_descriptor_matches

class DeliveryTest(unittest.TestCase):

    def test_flat_descriptor_matches_request(self):
        assert_flat_descriptor_matches(self, Request.DESCRIPTOR, FlatRequest.DESCRIPTOR)


if __name__ == '__main__':
  unittest.main()
