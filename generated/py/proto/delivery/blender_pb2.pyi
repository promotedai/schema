"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.containers
import google.protobuf.internal.enum_type_wrapper
import google.protobuf.message
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor = ...

class LeafExpression(google.protobuf.message.Message):
    """This behaves like a COALESCE in SQL. Lookups are performed in order until one
    succeeds. If they all fail, the default value is produced.

    A leaf with constant value can be represented by a default with no lookups.

    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LOOKUPS_FIELD_NUMBER: builtins.int
    DEFAULT_FIELD_NUMBER: builtins.int
    @property
    def lookups(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___Lookup]: ...
    default: builtins.float = ...
    def __init__(self,
        *,
        lookups : typing.Optional[typing.Iterable[global___Lookup]] = ...,
        default : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["default",b"default","lookups",b"lookups"]) -> None: ...
global___LeafExpression = LeafExpression

class Lookup(google.protobuf.message.Message):
    """This represents a lookup into data structures outside of the syntax tree
    (e.g. a feature map).

    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    FEATURE_ID_FIELD_NUMBER: builtins.int
    PARAMETER_KEY_FIELD_NUMBER: builtins.int
    feature_id: builtins.int = ...
    parameter_key: builtins.int = ...
    def __init__(self,
        *,
        feature_id : builtins.int = ...,
        parameter_key : builtins.int = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["feature_id",b"feature_id","lookup_type",b"lookup_type","parameter_key",b"parameter_key"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["feature_id",b"feature_id","lookup_type",b"lookup_type","parameter_key",b"parameter_key"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["lookup_type",b"lookup_type"]) -> typing.Optional[typing_extensions.Literal["feature_id","parameter_key"]]: ...
global___Lookup = Lookup

class BlenderConfig(google.protobuf.message.Message):
    """This describes the executor built and used by Blender.

    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    QUALITY_SCORE_FIELD_NUMBER: builtins.int
    SORT_KEY_FIELD_NUMBER: builtins.int
    @property
    def quality_score(self) -> global___BlenderExpression:
        """How to compute the quality score. The final decision for an allocation will
        will always be a (descending) sort based on this score. Quality score ties
        are ignored.
        """
        pass
    @property
    def sort_key(self) -> global___BlenderSortKey:
        """Additional, preliminary sorting logic. Quality score-based sorting is a
        backstop for ties resulting from this.
        """
        pass
    def __init__(self,
        *,
        quality_score : typing.Optional[global___BlenderExpression] = ...,
        sort_key : typing.Optional[global___BlenderSortKey] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["quality_score",b"quality_score","sort_key",b"sort_key"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["quality_score",b"quality_score","sort_key",b"sort_key"]) -> None: ...
global___BlenderConfig = BlenderConfig

class BlenderExpression(google.protobuf.message.Message):
    """Each expression type must represent the production of a single float. This is
    the only supported output data type. Expressions are not allowed to produce
    nulls or errors.

    (Floating point arithmetic can produce special values, or simply overflow.
    These are not considered errors and handling is not defined here.)

    Next ID = 4.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LEAF_FIELD_NUMBER: builtins.int
    ARITHMETIC_EXP_FIELD_NUMBER: builtins.int
    CONDITIONAL_EXP_FIELD_NUMBER: builtins.int
    @property
    def leaf(self) -> global___LeafExpression: ...
    @property
    def arithmetic_exp(self) -> global___BlenderArithmeticExpression: ...
    @property
    def conditional_exp(self) -> global___BlenderConditionalExpression: ...
    def __init__(self,
        *,
        leaf : typing.Optional[global___LeafExpression] = ...,
        arithmetic_exp : typing.Optional[global___BlenderArithmeticExpression] = ...,
        conditional_exp : typing.Optional[global___BlenderConditionalExpression] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["arithmetic_exp",b"arithmetic_exp","conditional_exp",b"conditional_exp","exp_type",b"exp_type","leaf",b"leaf"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["arithmetic_exp",b"arithmetic_exp","conditional_exp",b"conditional_exp","exp_type",b"exp_type","leaf",b"leaf"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["exp_type",b"exp_type"]) -> typing.Optional[typing_extensions.Literal["leaf","arithmetic_exp","conditional_exp"]]: ...
global___BlenderExpression = BlenderExpression

class BlenderArithmeticExpression(google.protobuf.message.Message):
    """The specified operator is used across all inputs
    (e.g. inputs[0] + inputs[1] + inputs[2])

    Next ID = 7.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    class Operator(_Operator, metaclass=_OperatorEnumTypeWrapper):
        pass
    class _Operator:
        V = typing.NewType('V', builtins.int)
    class _OperatorEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_Operator.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN = BlenderArithmeticExpression.Operator.V(0)
        ADD = BlenderArithmeticExpression.Operator.V(1)
        MULTIPLY = BlenderArithmeticExpression.Operator.V(2)
        SUBTRACT = BlenderArithmeticExpression.Operator.V(3)
        DIVIDE = BlenderArithmeticExpression.Operator.V(4)
        MIN = BlenderArithmeticExpression.Operator.V(5)
        MAX = BlenderArithmeticExpression.Operator.V(6)

    UNKNOWN = BlenderArithmeticExpression.Operator.V(0)
    ADD = BlenderArithmeticExpression.Operator.V(1)
    MULTIPLY = BlenderArithmeticExpression.Operator.V(2)
    SUBTRACT = BlenderArithmeticExpression.Operator.V(3)
    DIVIDE = BlenderArithmeticExpression.Operator.V(4)
    MIN = BlenderArithmeticExpression.Operator.V(5)
    MAX = BlenderArithmeticExpression.Operator.V(6)

    OP_FIELD_NUMBER: builtins.int
    INPUTS_FIELD_NUMBER: builtins.int
    op: global___BlenderArithmeticExpression.Operator.V = ...
    @property
    def inputs(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___BlenderExpression]: ...
    def __init__(self,
        *,
        op : global___BlenderArithmeticExpression.Operator.V = ...,
        inputs : typing.Optional[typing.Iterable[global___BlenderExpression]] = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["inputs",b"inputs","op",b"op"]) -> None: ...
global___BlenderArithmeticExpression = BlenderArithmeticExpression

class BlenderConditionalExpression(google.protobuf.message.Message):
    """This represents if(-else) branches in processing. For a single execution of
    the expression:
    - Both sides of the predicate are computed
    - Only one of the branches is computed

    Conjunction/disjunctions (i.e. AND/OR) can be formed by nesting conditionals.

    Next ID = 6.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    class Operator(_Operator, metaclass=_OperatorEnumTypeWrapper):
        pass
    class _Operator:
        V = typing.NewType('V', builtins.int)
    class _OperatorEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_Operator.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN = BlenderConditionalExpression.Operator.V(0)
        EQUAL = BlenderConditionalExpression.Operator.V(1)
        GREATER_THAN = BlenderConditionalExpression.Operator.V(2)
        GREATER_THAN_OR_EQUAL = BlenderConditionalExpression.Operator.V(3)

    UNKNOWN = BlenderConditionalExpression.Operator.V(0)
    EQUAL = BlenderConditionalExpression.Operator.V(1)
    GREATER_THAN = BlenderConditionalExpression.Operator.V(2)
    GREATER_THAN_OR_EQUAL = BlenderConditionalExpression.Operator.V(3)

    OP_FIELD_NUMBER: builtins.int
    PREDICATE_LHS_FIELD_NUMBER: builtins.int
    PREDICATE_RHS_FIELD_NUMBER: builtins.int
    THEN_BRANCH_FIELD_NUMBER: builtins.int
    ELSE_BRANCH_FIELD_NUMBER: builtins.int
    op: global___BlenderConditionalExpression.Operator.V = ...
    @property
    def predicate_lhs(self) -> global___BlenderExpression: ...
    @property
    def predicate_rhs(self) -> global___BlenderExpression: ...
    @property
    def then_branch(self) -> global___BlenderExpression: ...
    @property
    def else_branch(self) -> global___BlenderExpression: ...
    def __init__(self,
        *,
        op : global___BlenderConditionalExpression.Operator.V = ...,
        predicate_lhs : typing.Optional[global___BlenderExpression] = ...,
        predicate_rhs : typing.Optional[global___BlenderExpression] = ...,
        then_branch : typing.Optional[global___BlenderExpression] = ...,
        else_branch : typing.Optional[global___BlenderExpression] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["else_branch",b"else_branch","predicate_lhs",b"predicate_lhs","predicate_rhs",b"predicate_rhs","then_branch",b"then_branch"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["else_branch",b"else_branch","op",b"op","predicate_lhs",b"predicate_lhs","predicate_rhs",b"predicate_rhs","then_branch",b"then_branch"]) -> None: ...
global___BlenderConditionalExpression = BlenderConditionalExpression

class BlenderSortKey(google.protobuf.message.Message):
    """This defines a tuple of expressions that Blender should use for sorting. All
    sorts are assumed to be descending, as is done with quality scores.

    Next ID = 2.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    ELEMENTS_FIELD_NUMBER: builtins.int
    @property
    def elements(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___BlenderExpression]:
        """Positions correspond to sort priority. elements[0] ties are broken using
        elements[1], elements[1] ties are broken using elements[2], and so on. Ties
        of the last element are broken by the overall quality score.
        """
        pass
    def __init__(self,
        *,
        elements : typing.Optional[typing.Iterable[global___BlenderExpression]] = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["elements",b"elements"]) -> None: ...
global___BlenderSortKey = BlenderSortKey

class HyperloopConfig(google.protobuf.message.Message):
    """This is only capable of exploring values in simple ways. More complex logic
    description (e.g. conditionals) is left to Blender.

    Next ID = 2.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    class ParametersEntry(google.protobuf.message.Message):
        DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
        KEY_FIELD_NUMBER: builtins.int
        VALUE_FIELD_NUMBER: builtins.int
        key: builtins.int = ...
        @property
        def value(self) -> global___HyperloopParameter: ...
        def __init__(self,
            *,
            key : builtins.int = ...,
            value : typing.Optional[global___HyperloopParameter] = ...,
            ) -> None: ...
        def HasField(self, field_name: typing_extensions.Literal["value",b"value"]) -> builtins.bool: ...
        def ClearField(self, field_name: typing_extensions.Literal["key",b"key","value",b"value"]) -> None: ...

    PARAMETERS_FIELD_NUMBER: builtins.int
    @property
    def parameters(self) -> google.protobuf.internal.containers.MessageMap[builtins.int, global___HyperloopParameter]:
        """Parameter keys in Blender correspond to this map."""
        pass
    def __init__(self,
        *,
        parameters : typing.Optional[typing.Mapping[builtins.int, global___HyperloopParameter]] = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["parameters",b"parameters"]) -> None: ...
global___HyperloopConfig = HyperloopConfig

class HyperloopParameter(google.protobuf.message.Message):
    """A parameter is effectively an experiment. Invalid parameter descriptions are
    skipped.

    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    GROUPS_FIELD_NUMBER: builtins.int
    DEFAULT_FIELD_NUMBER: builtins.int
    @property
    def groups(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___HyperloopGroup]:
        """Each parameter has 1000 buckets, shared among the groups. A parameter is
        considered invalid if:
        - Groups have overlapping bucket ranges
        - Any bucket range starts below 0 or ends above 1000
        """
        pass
    default: builtins.float = ...
    """Any buckets which are not claimed by a group produce this value."""

    def __init__(self,
        *,
        groups : typing.Optional[typing.Iterable[global___HyperloopGroup]] = ...,
        default : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["default",b"default","groups",b"groups"]) -> None: ...
global___HyperloopParameter = HyperloopParameter

class HyperloopGroup(google.protobuf.message.Message):
    """A group is a bucket range and method of value generation.

    Next ID = 4.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LOW_BUCKET_FIELD_NUMBER: builtins.int
    HIGH_BUCKET_FIELD_NUMBER: builtins.int
    EXP_FIELD_NUMBER: builtins.int
    low_bucket: builtins.int = ...
    """[low_bucket, high_bucket]"""

    high_bucket: builtins.int = ...
    @property
    def exp(self) -> global___HyperloopExpression: ...
    def __init__(self,
        *,
        low_bucket : builtins.int = ...,
        high_bucket : builtins.int = ...,
        exp : typing.Optional[global___HyperloopExpression] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["exp",b"exp"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["exp",b"exp","high_bucket",b"high_bucket","low_bucket",b"low_bucket"]) -> None: ...
global___HyperloopGroup = HyperloopGroup

class HyperloopExpression(google.protobuf.message.Message):
    """See the comment for BlenderExpression.

    Next ID = 4.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LEAF_FIELD_NUMBER: builtins.int
    GENERATOR_EXP_FIELD_NUMBER: builtins.int
    CONDITIONAL_EXP_FIELD_NUMBER: builtins.int
    @property
    def leaf(self) -> global___LeafExpression: ...
    @property
    def generator_exp(self) -> global___HyperloopGeneratorExpression: ...
    @property
    def conditional_exp(self) -> global___HyperloopConditionalExpression: ...
    def __init__(self,
        *,
        leaf : typing.Optional[global___LeafExpression] = ...,
        generator_exp : typing.Optional[global___HyperloopGeneratorExpression] = ...,
        conditional_exp : typing.Optional[global___HyperloopConditionalExpression] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["conditional_exp",b"conditional_exp","generator_exp",b"generator_exp","leaf",b"leaf","node_type",b"node_type"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["conditional_exp",b"conditional_exp","generator_exp",b"generator_exp","leaf",b"leaf","node_type",b"node_type"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["node_type",b"node_type"]) -> typing.Optional[typing_extensions.Literal["leaf","generator_exp","conditional_exp"]]: ...
global___HyperloopExpression = HyperloopExpression

class HyperloopGeneratorExpression(google.protobuf.message.Message):
    """This is distinct from leaf in case we ever want to do generation based on
    other expressions.

    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    UNIFORM_FIELD_NUMBER: builtins.int
    UNIFORM_MULTI_FIELD_NUMBER: builtins.int
    @property
    def uniform(self) -> global___HyperloopUniformGenerator: ...
    @property
    def uniform_multi(self) -> global___HyperloopUniformMultiGenerator: ...
    def __init__(self,
        *,
        uniform : typing.Optional[global___HyperloopUniformGenerator] = ...,
        uniform_multi : typing.Optional[global___HyperloopUniformMultiGenerator] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["generator",b"generator","uniform",b"uniform","uniform_multi",b"uniform_multi"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["generator",b"generator","uniform",b"uniform","uniform_multi",b"uniform_multi"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["generator",b"generator"]) -> typing.Optional[typing_extensions.Literal["uniform","uniform_multi"]]: ...
global___HyperloopGeneratorExpression = HyperloopGeneratorExpression

class HyperloopUniformGenerator(google.protobuf.message.Message):
    """Generates a value from a uniform distribution.

    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LOW_BOUND_FIELD_NUMBER: builtins.int
    HIGH_BOUND_FIELD_NUMBER: builtins.int
    low_bound: builtins.float = ...
    """[low_bound, high_bound]"""

    high_bound: builtins.float = ...
    def __init__(self,
        *,
        low_bound : builtins.float = ...,
        high_bound : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["high_bound",b"high_bound","low_bound",b"low_bound"]) -> None: ...
global___HyperloopUniformGenerator = HyperloopUniformGenerator

class HyperloopUniformMultiGenerator(google.protobuf.message.Message):
    """Uses a uniform distribution to choose a multiplier, but not to actually
    generate the final value. The final value is bounded by (base / multi, base *
    multi). There's a 50/50 chance whether multiplication or division is done.

    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    BASE_FIELD_NUMBER: builtins.int
    MULTI_FIELD_NUMBER: builtins.int
    base: builtins.float = ...
    multi: builtins.float = ...
    """A multi of <= 1 is invalid."""

    def __init__(self,
        *,
        base : builtins.float = ...,
        multi : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["base",b"base","multi",b"multi"]) -> None: ...
global___HyperloopUniformMultiGenerator = HyperloopUniformMultiGenerator

class HyperloopConditionalExpression(google.protobuf.message.Message):
    """This is intended to be redundant with BlenderConditionalExpression but for
    Hyperloop messages. Protobuf doesn't have the metaprogramming to reuse that
    definition here without bringing in all Blender expressions. Unlikely our
    definition of conditional expression will ever have to change (outside of
    additional operator support).

    Next ID = 6.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    class Operator(_Operator, metaclass=_OperatorEnumTypeWrapper):
        pass
    class _Operator:
        V = typing.NewType('V', builtins.int)
    class _OperatorEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_Operator.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN = HyperloopConditionalExpression.Operator.V(0)
        EQUAL = HyperloopConditionalExpression.Operator.V(1)
        GREATER_THAN = HyperloopConditionalExpression.Operator.V(2)
        GREATER_THAN_OR_EQUAL = HyperloopConditionalExpression.Operator.V(3)

    UNKNOWN = HyperloopConditionalExpression.Operator.V(0)
    EQUAL = HyperloopConditionalExpression.Operator.V(1)
    GREATER_THAN = HyperloopConditionalExpression.Operator.V(2)
    GREATER_THAN_OR_EQUAL = HyperloopConditionalExpression.Operator.V(3)

    OP_FIELD_NUMBER: builtins.int
    PREDICATE_LHS_FIELD_NUMBER: builtins.int
    PREDICATE_RHS_FIELD_NUMBER: builtins.int
    THEN_BRANCH_FIELD_NUMBER: builtins.int
    ELSE_BRANCH_FIELD_NUMBER: builtins.int
    op: global___HyperloopConditionalExpression.Operator.V = ...
    @property
    def predicate_lhs(self) -> global___HyperloopExpression: ...
    @property
    def predicate_rhs(self) -> global___HyperloopExpression: ...
    @property
    def then_branch(self) -> global___HyperloopExpression: ...
    @property
    def else_branch(self) -> global___HyperloopExpression: ...
    def __init__(self,
        *,
        op : global___HyperloopConditionalExpression.Operator.V = ...,
        predicate_lhs : typing.Optional[global___HyperloopExpression] = ...,
        predicate_rhs : typing.Optional[global___HyperloopExpression] = ...,
        then_branch : typing.Optional[global___HyperloopExpression] = ...,
        else_branch : typing.Optional[global___HyperloopExpression] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["else_branch",b"else_branch","predicate_lhs",b"predicate_lhs","predicate_rhs",b"predicate_rhs","then_branch",b"then_branch"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["else_branch",b"else_branch","op",b"op","predicate_lhs",b"predicate_lhs","predicate_rhs",b"predicate_rhs","then_branch",b"then_branch"]) -> None: ...
global___HyperloopConditionalExpression = HyperloopConditionalExpression

class HyperloopLog(google.protobuf.message.Message):
    """These correspond to the above Hyperloop messages, but group assignment and
    values have been realized.

    Next ID = 2.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    class ParameterLogsEntry(google.protobuf.message.Message):
        DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
        KEY_FIELD_NUMBER: builtins.int
        VALUE_FIELD_NUMBER: builtins.int
        key: builtins.int = ...
        @property
        def value(self) -> global___HyperloopParameterLog: ...
        def __init__(self,
            *,
            key : builtins.int = ...,
            value : typing.Optional[global___HyperloopParameterLog] = ...,
            ) -> None: ...
        def HasField(self, field_name: typing_extensions.Literal["value",b"value"]) -> builtins.bool: ...
        def ClearField(self, field_name: typing_extensions.Literal["key",b"key","value",b"value"]) -> None: ...

    PARAMETER_LOGS_FIELD_NUMBER: builtins.int
    @property
    def parameter_logs(self) -> google.protobuf.internal.containers.MessageMap[builtins.int, global___HyperloopParameterLog]: ...
    def __init__(self,
        *,
        parameter_logs : typing.Optional[typing.Mapping[builtins.int, global___HyperloopParameterLog]] = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["parameter_logs",b"parameter_logs"]) -> None: ...
global___HyperloopLog = HyperloopLog

class HyperloopParameterLog(google.protobuf.message.Message):
    """Next ID = 3."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    BUCKET_FIELD_NUMBER: builtins.int
    VALUE_FIELD_NUMBER: builtins.int
    bucket: builtins.int = ...
    value: builtins.float = ...
    def __init__(self,
        *,
        bucket : builtins.int = ...,
        value : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["bucket",b"bucket","value",b"value"]) -> None: ...
global___HyperloopParameterLog = HyperloopParameterLog