import unittest
unittest.util._MAX_LENGTH=2000

from proto.delivery.blender_pb2 import (
        QualityScoreConfig,
        QualityScoreTerm,
        QualityScoreTerms)
from proto.delivery.delivery_pb2 import (
        FlatRequest,
        Request)
from proto.delivery.INTERNAL_flat_quality_score_config_pb2 import (
        FlatQualityScoreConfig,
        QualityScoreTerm1,
        QualityScoreTerms1,
        QualityScoreTerm2,
        QualityScoreTerms2,
        QualityScoreTerm3,
        QualityScoreTerms3)

from tests.proto.util.util import assert_flat_descriptor_matches

class DeliveryTest(unittest.TestCase):

    def test_flat_descriptor_matches_request(self):
        assert_flat_descriptor_matches(self, Request.DESCRIPTOR, FlatRequest.DESCRIPTOR)

    def test_flat_descriptor_matches_quality_score_config(self):
        assert_flat_descriptor_matches(self, QualityScoreConfig.DESCRIPTOR, FlatQualityScoreConfig.DESCRIPTOR)

    def test_flat_descriptor_matches_quality_score_terms1(self):
        assert_flat_descriptor_matches(self, QualityScoreTerms.DESCRIPTOR, QualityScoreTerms1.DESCRIPTOR)

    def test_flat_descriptor_matches_quality_score_term1(self):
        assert_flat_descriptor_matches(self, QualityScoreTerm.DESCRIPTOR, QualityScoreTerm1.DESCRIPTOR)

    def test_flat_descriptor_matches_quality_score_terms2(self):
        assert_flat_descriptor_matches(self, QualityScoreTerms.DESCRIPTOR, QualityScoreTerms2.DESCRIPTOR)

    def test_flat_descriptor_matches_quality_score_term2(self):
        assert_flat_descriptor_matches(self, QualityScoreTerm.DESCRIPTOR, QualityScoreTerm2.DESCRIPTOR)

    def test_flat_descriptor_matches_quality_score_terms3(self):
        assert_flat_descriptor_matches(self, QualityScoreTerms.DESCRIPTOR, QualityScoreTerms3.DESCRIPTOR)

    def test_flat_descriptor_matches_quality_score_term3(self):
        assert_flat_descriptor_matches(
            self,
            QualityScoreTerm.DESCRIPTOR,
            QualityScoreTerm3.DESCRIPTOR,
            {'product'},
            {3})


if __name__ == '__main__':
  unittest.main()
