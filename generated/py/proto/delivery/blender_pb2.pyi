"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.containers
import google.protobuf.message
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor = ...

class BlenderRule(google.protobuf.message.Message):
    """See: https://github.com/promotedai/blender for README
    Next ID = 11.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    ATTRIBUTE_NAME_FIELD_NUMBER: builtins.int
    POSITIVE_RULE_FIELD_NUMBER: builtins.int
    INSERT_RULE_FIELD_NUMBER: builtins.int
    NEGATIVE_RULE_FIELD_NUMBER: builtins.int
    DIVERSITY_RULE_FIELD_NUMBER: builtins.int
    attribute_name: typing.Text = ...
    """The name of item attribute that this rule applies to. It may be a JSON key path."""

    @property
    def positive_rule(self) -> global___PositiveRule: ...
    @property
    def insert_rule(self) -> global___InsertRule: ...
    @property
    def negative_rule(self) -> global___NegativeRule: ...
    @property
    def diversity_rule(self) -> global___DiversityRule: ...
    def __init__(self,
        *,
        attribute_name : typing.Text = ...,
        positive_rule : typing.Optional[global___PositiveRule] = ...,
        insert_rule : typing.Optional[global___InsertRule] = ...,
        negative_rule : typing.Optional[global___NegativeRule] = ...,
        diversity_rule : typing.Optional[global___DiversityRule] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["diversity_rule",b"diversity_rule","insert_rule",b"insert_rule","negative_rule",b"negative_rule","positive_rule",b"positive_rule","rule",b"rule"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["attribute_name",b"attribute_name","diversity_rule",b"diversity_rule","insert_rule",b"insert_rule","negative_rule",b"negative_rule","positive_rule",b"positive_rule","rule",b"rule"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["rule",b"rule"]) -> typing.Optional[typing_extensions.Literal["positive_rule","insert_rule","negative_rule","diversity_rule"]]: ...
global___BlenderRule = BlenderRule

class PositiveRule(google.protobuf.message.Message):
    """A positive rule selects insertions by their score if they are associated with the same attribute
    that the rule is associated with.

    If one seeks to fill a position `p` with an insertion, then one positive rule is selected by
    random out of all positive rules. The selection process works in the following way:

    1. positive rules are filtered by whether for a given rule there exist any insertions that could
       potentially be selected (meaning there are insertions that are not yet associated with a
       different position, that are associated with the same attribute as a given rule, and that
       have not been filtered out by negative rules [see the comment on negative rules for that]);
    2. the rules remaining after 1. are filtered for the condition
       `rule.min_pos <= p <= rule.max_pos`;
    3. from the rules remaining after 2. one is selected by random based on their weight in
       `rule.select_pct`.

    After a positive rule has been selected, the insertion of the highest score is associated with
    position `p` (if, remembering point 1., that insertion is available to be allocated, has the
    same associated attribute as the selected rule, and is not ruled out by application of negative
    rules).

    Note that there is a chance of no rule (and hence no insertion) being selected if the sum of all
    rules selected in step 3. is less than 100.0. The probability of that happening is `100 - sum`.

    Positive rules are similar to insert rules, but used in a different context. While items can be
    selected just based on insert rules, positive rules are used in tandem with negative rules.
    First, negative rules are tested to filter out items. Afterwards, a positive rule is used to
    select items just like an insert rule (just without the filtered out items).

    Next ID = 4.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    SELECT_PCT_FIELD_NUMBER: builtins.int
    MIN_POS_FIELD_NUMBER: builtins.int
    MAX_POS_FIELD_NUMBER: builtins.int
    select_pct: builtins.float = ...
    """Value between 0 and 100. The weight of this rule to be selected.

    If the sum `W` of all weights is less than 100, then the chance N of no weight being chosen is
    assigned the weight `N = 100 - W`.

    Examples (given weights `{a, b, ..., z}`, each entry corresponds to a rule with weight `a`,
    `b`, `c`, etc):
    + `{100, 100}`: 2 rules with equal weight: 50% chance of each being selected
    + `{50, 50}`: as above
    + `{25, 25}`: each rule has a 25% chance of being selected; there is a 50% chance of no rule
       being selected
    + `{10, 10, 10, 10, 10`}: each of the 5 rules has a 5% chance of being selected; there is a
      is a 50% chance of no rule being selected.
    + `{50, 100}`: 2/3 chance of selecting the rule with weight 100, 1/3 chance to select that of
      weight 50.

    NOTE: a value of 0 means this rule will never be selected.

    Default: `100.0`
    """

    min_pos: builtins.int = ...
    """The minimum position that this rule applies to. If one seeks to fill a position `p < min_pos`,
    then this rule will not be considered for selection. `min_pos <= max_pos` must hold.

    Default: `0`
    """

    max_pos: builtins.int = ...
    """The maximum position that this rule applies to. If one seeks to fill a position `p > max_pos`,
    then this rule will not be considered for selection. `max_pos >= min_pos` must hold.

    Default `uint64::MAX`
    """

    def __init__(self,
        *,
        select_pct : builtins.float = ...,
        min_pos : builtins.int = ...,
        max_pos : builtins.int = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["_max_pos",b"_max_pos","_min_pos",b"_min_pos","_select_pct",b"_select_pct","max_pos",b"max_pos","min_pos",b"min_pos","select_pct",b"select_pct"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["_max_pos",b"_max_pos","_min_pos",b"_min_pos","_select_pct",b"_select_pct","max_pos",b"max_pos","min_pos",b"min_pos","select_pct",b"select_pct"]) -> None: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_max_pos",b"_max_pos"]) -> typing.Optional[typing_extensions.Literal["max_pos"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_min_pos",b"_min_pos"]) -> typing.Optional[typing_extensions.Literal["min_pos"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_select_pct",b"_select_pct"]) -> typing.Optional[typing_extensions.Literal["select_pct"]]: ...
global___PositiveRule = PositiveRule

class InsertRule(google.protobuf.message.Message):
    """An insert rule selects insertions by their score if they are associated with the same attribute
    that the rule is associated with.

    If one seeks to fill a position `p` with an insertion, then one insert rule is selected by
    random out of all insert rules. The selection process works in the following way:

    1. insert rules are filtered by whether for a given rule there exist any insertions that could
       potentially be selected (meaning there are insertions that are not yet associated with a
       different position, and that are associated with the same attribute as a given rule);
    2. the rules remaining after 1. are filtered for the condition
       `rule.min_pos <= p <= rule.max_pos`;
    3. from the rules remaining after 2. one is selected by random based on their weight in
       `rule.select_pct`.

    After an insert rule has been selected, the insertion of the highest score is associated with
    position `p` (if, remembering point 1., that insertion is available to be allocated, and has the
    same associated attribute as the selected rule).

    Note that there is a chance of no rule (and hence no insertion) being selected if the sum of all
    rules selected in step 3. is less than 100.0. The probability of that happening is `100 - sum`.

    Next ID = 4.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    SELECT_PCT_FIELD_NUMBER: builtins.int
    MIN_POS_FIELD_NUMBER: builtins.int
    MAX_POS_FIELD_NUMBER: builtins.int
    select_pct: builtins.float = ...
    """Value between 0 and 100. The weight of this rule to be selected.

    If the sum `W` of all weights is less than 100, then the chance N of no weight being chosen is
    assigned the weight `N = 100 - W`.

    Examples (given weights `{a, b, ..., z}`, each entry corresponds to a rule with weight `a`,
    `b`, `c`, etc):
    + `{100, 100}`: 2 rules with equal weight: 50% chance of each being selected
    + `{50, 50}`: as above
    + `{25, 25}`: each rule has a 25% chance of being selected; there is a 50% chance of no rule
       being selected
    + `{10, 10, 10, 10, 10`}: each of the 5 rules has a 5% chance of being selected; there is a
      is a 50% chance of no rule being selected.
    + `{50, 100}`: 2/3 chance of selecting the rule with weight 100, 1/3 chance to select that of
      weight 50.

    NOTE: a value of 0 means this rule will never be selected.

    Default: `100.0`
    """

    min_pos: builtins.int = ...
    """The minimum position that this rule applies to. If one seeks to fill a position `p < min_pos`,
    then this rule will not be considered for selection. `min_pos <= max_pos` must hold.

    Default: `0`
    """

    max_pos: builtins.int = ...
    """The maximum position that this rule applies to. If one seeks to fill a position `p > max_pos`,
    then this rule will not be considered for selection. `max_pos >= min_pos` must hold.

    Default `uint64::MAX`
    """

    def __init__(self,
        *,
        select_pct : builtins.float = ...,
        min_pos : builtins.int = ...,
        max_pos : builtins.int = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["_max_pos",b"_max_pos","_min_pos",b"_min_pos","_select_pct",b"_select_pct","max_pos",b"max_pos","min_pos",b"min_pos","select_pct",b"select_pct"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["_max_pos",b"_max_pos","_min_pos",b"_min_pos","_select_pct",b"_select_pct","max_pos",b"max_pos","min_pos",b"min_pos","select_pct",b"select_pct"]) -> None: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_max_pos",b"_max_pos"]) -> typing.Optional[typing_extensions.Literal["max_pos"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_min_pos",b"_min_pos"]) -> typing.Optional[typing_extensions.Literal["min_pos"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_select_pct",b"_select_pct"]) -> typing.Optional[typing_extensions.Literal["select_pct"]]: ...
global___InsertRule = InsertRule

class NegativeRule(google.protobuf.message.Message):
    """A negative rule tests if a given insertion may not be selected under application of positive
    rules (see the description of positive rules to undertand that process).

    A negative rule is associated with an attribute and applies to all those insertions that are
    associated with the same attribute. The applicable insertions are tested against the conditions
    laid out by the negative rule. If they fail one of the conditions, then the item is precluded
    from being selected under the subsequent application of positive rules.

    Next ID = 6.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PLUCK_PCT_FIELD_NUMBER: builtins.int
    FORBID_LESS_POS_FIELD_NUMBER: builtins.int
    MIN_SPACING_FIELD_NUMBER: builtins.int
    FORBID_GREATER_POS_FIELD_NUMBER: builtins.int
    MAX_COUNT_FIELD_NUMBER: builtins.int
    pluck_pct: builtins.float = ...
    """Value between 0 and 100. The probability that an item will be failed ("plucked) even if it
    passes all other conditions.

    NOTE: a value of 0 means that the item has to fail one of the other conditions to be discarded.
    A value of 100 means that an item will always be discarded, no matter the other conditions, as
    as long as it has an attribute matching this rule's.

    Default: `100.0`
    """

    forbid_less_pos: builtins.int = ...
    """The minimum position that items with matching associated attribute can be placed in. Items
    with the same associated attribute as the negative rule will not be considered for selection
    if one seeks to fill a position `p < forbid_less_pos`.

    Default: `0`
    """

    min_spacing: builtins.int = ...
    """The minimum number of positions between the current position and its precursor. For example,
    if `min_spacing = 1` and one seeks to fill a position `p`, then an item is discarded if the
    item at position `p-1` and the item under consideration have the same associated attribute as
    the current rule (note that attribute values do not have to match; only the fact that they
    have the same associated attribute matters).

    Default: `uint64::MAX`
    """

    forbid_greater_pos: builtins.int = ...
    """The maximum position that items with matching associated attribute can be placed in. Items
    with the same associated attribute as the negative rule will not be considered for selection
    if one seeks to fill a position `p > forbid_greater_pos`.

    Default: `uint64::MAX`
    """

    max_count: builtins.int = ...
    """The maximum number of items that are allowed to be allocated with the same attribute name as
    this rule. If `max_count` items have already been allocated in previous positions, then no
    more items with the attribute name can be allocated.

    Default: `uint64::MAX`
    """

    def __init__(self,
        *,
        pluck_pct : builtins.float = ...,
        forbid_less_pos : builtins.int = ...,
        min_spacing : builtins.int = ...,
        forbid_greater_pos : builtins.int = ...,
        max_count : builtins.int = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["_forbid_greater_pos",b"_forbid_greater_pos","_forbid_less_pos",b"_forbid_less_pos","_max_count",b"_max_count","_min_spacing",b"_min_spacing","_pluck_pct",b"_pluck_pct","forbid_greater_pos",b"forbid_greater_pos","forbid_less_pos",b"forbid_less_pos","max_count",b"max_count","min_spacing",b"min_spacing","pluck_pct",b"pluck_pct"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["_forbid_greater_pos",b"_forbid_greater_pos","_forbid_less_pos",b"_forbid_less_pos","_max_count",b"_max_count","_min_spacing",b"_min_spacing","_pluck_pct",b"_pluck_pct","forbid_greater_pos",b"forbid_greater_pos","forbid_less_pos",b"forbid_less_pos","max_count",b"max_count","min_spacing",b"min_spacing","pluck_pct",b"pluck_pct"]) -> None: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_forbid_greater_pos",b"_forbid_greater_pos"]) -> typing.Optional[typing_extensions.Literal["forbid_greater_pos"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_forbid_less_pos",b"_forbid_less_pos"]) -> typing.Optional[typing_extensions.Literal["forbid_less_pos"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_max_count",b"_max_count"]) -> typing.Optional[typing_extensions.Literal["max_count"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_min_spacing",b"_min_spacing"]) -> typing.Optional[typing_extensions.Literal["min_spacing"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_pluck_pct",b"_pluck_pct"]) -> typing.Optional[typing_extensions.Literal["pluck_pct"]]: ...
global___NegativeRule = NegativeRule

class DiversityRule(google.protobuf.message.Message):
    """Diversity rules modify the scores of insertions if equivalent insertions have been previously
    allocated.

    The purpose of diversity rules is to penalize equivalent insertions. Two insertions `i` and `j`
    are considered equivalent if they are associated with the same attribute as the rule, and if
    the value of said attribute is the same, i.e. the condition `i[attr] == j[attr]` and
    `i[attr] != nil`.
    Next ID = 2.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    MULTI_FIELD_NUMBER: builtins.int
    multi: builtins.float = ...
    """A factor modifying items' scores. If an item has been allocated at position `p`, then all the
    allocated item's value of the attribute with matching name is taken. All other items that a)
    have an attribute that the rule applies to, and b) share the same value as the just allocated
    item will have their score multiplied by `multi`.

    Example: if insertion `i` has been allocated at position `p`, then an insertion `j` will have
    its score modified by `p.score *= multi` if and only if
    `a[rule.attribute_name] == b[rule.attribute_name]` and if `a[rule.attribute_name] != nil`.

    NOTE: a multiplier `m <= 0.0` means that modified items will never be allocated again (because
    non-positive scores disqualify items outright). Multipliers of `m > 1.0` act as as a boost.
    To act as a penalty, it should be set `0.0 > m < 1.0`, but this is currently not enforced.
    """

    def __init__(self,
        *,
        multi : builtins.float = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["_multi",b"_multi","multi",b"multi"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["_multi",b"_multi","multi",b"multi"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_multi",b"_multi"]) -> typing.Optional[typing_extensions.Literal["multi"]]: ...
global___DiversityRule = DiversityRule

class BlenderConfig(google.protobuf.message.Message):
    """Next ID = 3."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    BLENDER_RULE_FIELD_NUMBER: builtins.int
    QUALITY_SCORE_CONFIG_FIELD_NUMBER: builtins.int
    @property
    def blender_rule(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___BlenderRule]:
        """List of blender rules."""
        pass
    @property
    def quality_score_config(self) -> global___QualityScoreConfig: ...
    def __init__(self,
        *,
        blender_rule : typing.Optional[typing.Iterable[global___BlenderRule]] = ...,
        quality_score_config : typing.Optional[global___QualityScoreConfig] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["quality_score_config",b"quality_score_config"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["blender_rule",b"blender_rule","quality_score_config",b"quality_score_config"]) -> None: ...
global___BlenderConfig = BlenderConfig

class QualityScoreConfig(google.protobuf.message.Message):
    """See: https://github.com/promotedai/qualityscore
    Next ID = 2.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    WEIGHTED_SUM_TERM_FIELD_NUMBER: builtins.int
    @property
    def weighted_sum_term(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___QualityScoreTerm]: ...
    def __init__(self,
        *,
        weighted_sum_term : typing.Optional[typing.Iterable[global___QualityScoreTerm]] = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["weighted_sum_term",b"weighted_sum_term"]) -> None: ...
global___QualityScoreConfig = QualityScoreConfig

class QualityScoreTerm(google.protobuf.message.Message):
    """Next ID = 14."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    ATTRIBUTE_NAME_FIELD_NUMBER: builtins.int
    RANDOM_NORMAL_FIELD_NUMBER: builtins.int
    ONES_FIELD_NUMBER: builtins.int
    FETCH_HIGH_FIELD_NUMBER: builtins.int
    FETCH_LOW_FIELD_NUMBER: builtins.int
    WEIGHT_FIELD_NUMBER: builtins.int
    OFFSET_FIELD_NUMBER: builtins.int
    attribute_name: typing.Text = ...
    """A named vector provided from elsewhere."""

    @property
    def random_normal(self) -> global___NormalDistribution:
        """Randomly generated values from a normal distribution."""
        pass
    ones: builtins.bool = ...
    """A constant value of ones. Set to any constant with offset and/or weight.
    Set to "true" to indicate that this option is set by convention.
    """

    fetch_high: builtins.float = ...
    """Maximum limit of underlying value (before weight and offset)."""

    fetch_low: builtins.float = ...
    """Minimum limit of underlying value (before weight and offset)."""

    weight: builtins.float = ...
    """Multiply by this value. default =1 (no multiply)."""

    offset: builtins.float = ...
    """Add by this value. default = 0 (no addition)"""

    def __init__(self,
        *,
        attribute_name : typing.Text = ...,
        random_normal : typing.Optional[global___NormalDistribution] = ...,
        ones : builtins.bool = ...,
        fetch_high : builtins.float = ...,
        fetch_low : builtins.float = ...,
        weight : builtins.float = ...,
        offset : builtins.float = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["_fetch_high",b"_fetch_high","_fetch_low",b"_fetch_low","attribute_name",b"attribute_name","fetch_high",b"fetch_high","fetch_low",b"fetch_low","fetch_method",b"fetch_method","ones",b"ones","random_normal",b"random_normal"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["_fetch_high",b"_fetch_high","_fetch_low",b"_fetch_low","attribute_name",b"attribute_name","fetch_high",b"fetch_high","fetch_low",b"fetch_low","fetch_method",b"fetch_method","offset",b"offset","ones",b"ones","random_normal",b"random_normal","weight",b"weight"]) -> None: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_fetch_high",b"_fetch_high"]) -> typing.Optional[typing_extensions.Literal["fetch_high"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_fetch_low",b"_fetch_low"]) -> typing.Optional[typing_extensions.Literal["fetch_low"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["fetch_method",b"fetch_method"]) -> typing.Optional[typing_extensions.Literal["attribute_name","random_normal","ones"]]: ...
global___QualityScoreTerm = QualityScoreTerm

class NormalDistribution(google.protobuf.message.Message):
    """Next ID = 3."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    MEAN_FIELD_NUMBER: builtins.int
    VARIANCE_FIELD_NUMBER: builtins.int
    mean: builtins.float = ...
    variance: builtins.float = ...
    def __init__(self,
        *,
        mean : builtins.float = ...,
        variance : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["mean",b"mean","variance",b"variance"]) -> None: ...
global___NormalDistribution = NormalDistribution
