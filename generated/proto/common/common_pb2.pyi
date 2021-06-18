"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.enum_type_wrapper
import google.protobuf.message
import google.protobuf.struct_pb2
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor = ...

global___CurrencyCode = CurrencyCode
class _CurrencyCode(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[CurrencyCode.V], builtins.type):
    DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
    UNKNOWN_CURRENCY_CODE = CurrencyCode.V(0)
    USD = CurrencyCode.V(1)
    EUR = CurrencyCode.V(2)
    JPY = CurrencyCode.V(3)
    GBP = CurrencyCode.V(4)
    AUD = CurrencyCode.V(5)
    CAD = CurrencyCode.V(6)
    CHF = CurrencyCode.V(7)
    CNY = CurrencyCode.V(8)
    HKD = CurrencyCode.V(9)
    NZD = CurrencyCode.V(10)
    SEK = CurrencyCode.V(11)
    KRW = CurrencyCode.V(12)
    SGD = CurrencyCode.V(13)
    NOK = CurrencyCode.V(14)
    MXN = CurrencyCode.V(15)
    INR = CurrencyCode.V(16)
    RUB = CurrencyCode.V(17)
    ZAR = CurrencyCode.V(18)
    TRY = CurrencyCode.V(19)
    BRL = CurrencyCode.V(20)
class CurrencyCode(metaclass=_CurrencyCode):
    V = typing.NewType('V', builtins.int)
UNKNOWN_CURRENCY_CODE = CurrencyCode.V(0)
USD = CurrencyCode.V(1)
EUR = CurrencyCode.V(2)
JPY = CurrencyCode.V(3)
GBP = CurrencyCode.V(4)
AUD = CurrencyCode.V(5)
CAD = CurrencyCode.V(6)
CHF = CurrencyCode.V(7)
CNY = CurrencyCode.V(8)
HKD = CurrencyCode.V(9)
NZD = CurrencyCode.V(10)
SEK = CurrencyCode.V(11)
KRW = CurrencyCode.V(12)
SGD = CurrencyCode.V(13)
NOK = CurrencyCode.V(14)
MXN = CurrencyCode.V(15)
INR = CurrencyCode.V(16)
RUB = CurrencyCode.V(17)
ZAR = CurrencyCode.V(18)
TRY = CurrencyCode.V(19)
BRL = CurrencyCode.V(20)

class EntityPath(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PLATFORM_ID_FIELD_NUMBER: builtins.int
    CUSTOMER_ID_FIELD_NUMBER: builtins.int
    ACCOUNT_ID_FIELD_NUMBER: builtins.int
    CAMPAIGN_ID_FIELD_NUMBER: builtins.int
    PROMOTION_ID_FIELD_NUMBER: builtins.int
    CONTENT_ID_FIELD_NUMBER: builtins.int
    platform_id: builtins.int = ...
    customer_id: builtins.int = ...
    account_id: builtins.int = ...
    campaign_id: builtins.int = ...
    promotion_id: builtins.int = ...
    content_id: builtins.int = ...

    def __init__(self,
        *,
        platform_id : builtins.int = ...,
        customer_id : builtins.int = ...,
        account_id : builtins.int = ...,
        campaign_id : builtins.int = ...,
        promotion_id : builtins.int = ...,
        content_id : builtins.int = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"account_id",b"account_id",u"campaign_id",b"campaign_id",u"content_id",b"content_id",u"customer_id",b"customer_id",u"platform_id",b"platform_id",u"promotion_id",b"promotion_id"]) -> None: ...
global___EntityPath = EntityPath

class UserInfo(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    USER_ID_FIELD_NUMBER: builtins.int
    LOG_USER_ID_FIELD_NUMBER: builtins.int
    user_id: typing.Text = ...
    log_user_id: typing.Text = ...

    def __init__(self,
        *,
        user_id : typing.Text = ...,
        log_user_id : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"log_user_id",b"log_user_id",u"user_id",b"user_id"]) -> None: ...
global___UserInfo = UserInfo

class ClientInfo(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    class _ClientType(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[ClientType.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN_REQUEST_CLIENT = ClientInfo.ClientType.V(0)
        PLATFORM_SERVER = ClientInfo.ClientType.V(1)
        PLATFORM_CLIENT = ClientInfo.ClientType.V(2)
    class ClientType(metaclass=_ClientType):
        V = typing.NewType('V', builtins.int)
    UNKNOWN_REQUEST_CLIENT = ClientInfo.ClientType.V(0)
    PLATFORM_SERVER = ClientInfo.ClientType.V(1)
    PLATFORM_CLIENT = ClientInfo.ClientType.V(2)

    class _TrafficType(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[TrafficType.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN_TRAFFIC_TYPE = ClientInfo.TrafficType.V(0)
        PRODUCTION = ClientInfo.TrafficType.V(1)
        REPLAY = ClientInfo.TrafficType.V(2)
        SHADOW = ClientInfo.TrafficType.V(4)
    class TrafficType(metaclass=_TrafficType):
        V = typing.NewType('V', builtins.int)
    UNKNOWN_TRAFFIC_TYPE = ClientInfo.TrafficType.V(0)
    PRODUCTION = ClientInfo.TrafficType.V(1)
    REPLAY = ClientInfo.TrafficType.V(2)
    SHADOW = ClientInfo.TrafficType.V(4)

    CLIENT_TYPE_FIELD_NUMBER: builtins.int
    TRAFFIC_TYPE_FIELD_NUMBER: builtins.int
    client_type: global___ClientInfo.ClientType.V = ...
    traffic_type: global___ClientInfo.TrafficType.V = ...

    def __init__(self,
        *,
        client_type : global___ClientInfo.ClientType.V = ...,
        traffic_type : global___ClientInfo.TrafficType.V = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"client_type",b"client_type",u"traffic_type",b"traffic_type"]) -> None: ...
global___ClientInfo = ClientInfo

class Timing(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    CLIENT_LOG_TIMESTAMP_FIELD_NUMBER: builtins.int
    client_log_timestamp: builtins.int = ...

    def __init__(self,
        *,
        client_log_timestamp : builtins.int = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"client_log_timestamp",b"client_log_timestamp"]) -> None: ...
global___Timing = Timing

class Properties(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    STRUCT_BYTES_FIELD_NUMBER: builtins.int
    STRUCT_FIELD_NUMBER: builtins.int
    struct_bytes: builtins.bytes = ...

    @property
    def struct(self) -> google.protobuf.struct_pb2.Struct: ...

    def __init__(self,
        *,
        struct_bytes : builtins.bytes = ...,
        struct : typing.Optional[google.protobuf.struct_pb2.Struct] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"struct",b"struct",u"struct_bytes",b"struct_bytes",u"struct_field",b"struct_field"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"struct",b"struct",u"struct_bytes",b"struct_bytes",u"struct_field",b"struct_field"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal[u"struct_field",b"struct_field"]) -> typing_extensions.Literal["struct_bytes","struct"]: ...
global___Properties = Properties
