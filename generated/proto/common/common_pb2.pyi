"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.containers
import google.protobuf.internal.enum_type_wrapper
import google.protobuf.message
import google.protobuf.struct_pb2
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor = ...

class CurrencyCode(_CurrencyCode, metaclass=_CurrencyCodeEnumTypeWrapper):
    pass
class _CurrencyCode:
    V = typing.NewType('V', builtins.int)
class _CurrencyCodeEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_CurrencyCode.V], builtins.type):
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
global___CurrencyCode = CurrencyCode


# Next ID = 4.
class DeviceType(_DeviceType, metaclass=_DeviceTypeEnumTypeWrapper):
    pass
class _DeviceType:
    V = typing.NewType('V', builtins.int)
class _DeviceTypeEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_DeviceType.V], builtins.type):
    DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
    UNKNOWN_DEVICE_TYPE = DeviceType.V(0)
    DESKTOP = DeviceType.V(1)
    MOBILE = DeviceType.V(2)
    TABLET = DeviceType.V(3)

UNKNOWN_DEVICE_TYPE = DeviceType.V(0)
DESKTOP = DeviceType.V(1)
MOBILE = DeviceType.V(2)
TABLET = DeviceType.V(3)
global___DeviceType = DeviceType


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

# Common submessage that scopes helps scope a request/log to a user.
#
# Next ID = 3.
class UserInfo(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    USER_ID_FIELD_NUMBER: builtins.int
    LOG_USER_ID_FIELD_NUMBER: builtins.int
    # Optional.  The Platform's actual user ID.
    # This field will be cleared from our transaction logs.
    user_id: typing.Text = ...
    # Optional.  This is a user UUID that is different from user_id and
    # can quickly be disassociated from the actual user ID.  This is useful:
    # 1. in case the user wants to be forgotten.
    # 2. logging unauthenticated users.
    # The user UUID is in a different ID space than user_id.
    log_user_id: typing.Text = ...
    def __init__(self,
        *,
        user_id : typing.Text = ...,
        log_user_id : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"log_user_id",b"log_user_id",u"user_id",b"user_id"]) -> None: ...
global___UserInfo = UserInfo

# Info about the client.
# Next ID = 3.
class ClientInfo(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    # Next ID = 5;
    class ClientType(_ClientType, metaclass=_ClientTypeEnumTypeWrapper):
        pass
    class _ClientType:
        V = typing.NewType('V', builtins.int)
    class _ClientTypeEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_ClientType.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN_REQUEST_CLIENT = ClientInfo.ClientType.V(0)
        # Your (customer) server.
        PLATFORM_SERVER = ClientInfo.ClientType.V(1)
        # Your (customer) client.
        PLATFORM_CLIENT = ClientInfo.ClientType.V(2)

    UNKNOWN_REQUEST_CLIENT = ClientInfo.ClientType.V(0)
    # Your (customer) server.
    PLATFORM_SERVER = ClientInfo.ClientType.V(1)
    # Your (customer) client.
    PLATFORM_CLIENT = ClientInfo.ClientType.V(2)

    # Used to indicate the type of traffic.  We can use this to prioritize resources.
    # Next ID = 5.
    class TrafficType(_TrafficType, metaclass=_TrafficTypeEnumTypeWrapper):
        pass
    class _TrafficType:
        V = typing.NewType('V', builtins.int)
    class _TrafficTypeEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_TrafficType.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN_TRAFFIC_TYPE = ClientInfo.TrafficType.V(0)
        # Live traffic.
        PRODUCTION = ClientInfo.TrafficType.V(1)
        # Replayed traffic.  We'd like similar to PRODUCTION level.
        REPLAY = ClientInfo.TrafficType.V(2)
        # Shadow traffic to delivery during logging.
        SHADOW = ClientInfo.TrafficType.V(4)

    UNKNOWN_TRAFFIC_TYPE = ClientInfo.TrafficType.V(0)
    # Live traffic.
    PRODUCTION = ClientInfo.TrafficType.V(1)
    # Replayed traffic.  We'd like similar to PRODUCTION level.
    REPLAY = ClientInfo.TrafficType.V(2)
    # Shadow traffic to delivery during logging.
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

# Locale for session
# Next ID = 3.
class Locale(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LANGUAGE_CODE_FIELD_NUMBER: builtins.int
    REGION_CODE_FIELD_NUMBER: builtins.int
    # CodeReview - Which ISO code is this?  ISO 639-1? 2? 3?
    # "en", "zh_Hant", "fr"
    language_code: typing.Text = ...
    # CodeReview - Which ISO code?  ISO 3166-1?
    # "US", "CA", "FR"
    region_code: typing.Text = ...
    def __init__(self,
        *,
        language_code : typing.Text = ...,
        region_code : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"language_code",b"language_code",u"region_code",b"region_code"]) -> None: ...
global___Locale = Locale

# Rectangle size in pixels
# Next ID = 3.
class Size(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    WIDTH_FIELD_NUMBER: builtins.int
    HEIGHT_FIELD_NUMBER: builtins.int
    width: builtins.int = ...
    height: builtins.int = ...
    def __init__(self,
        *,
        width : builtins.int = ...,
        height : builtins.int = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"height",b"height",u"width",b"width"]) -> None: ...
global___Size = Size

# Device screen
# Next ID = 3.
class Screen(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    SIZE_FIELD_NUMBER: builtins.int
    SCALE_FIELD_NUMBER: builtins.int
    # Android: DisplayMetrics.widthPixels/heightPixels
    # iOS: UIScreen.nativeBounds.width/height
    @property
    def size(self) -> global___Size: ...
    # Natural scale factor.
    # Android: DisplayMetrics.density
    # iOS: UIScreen.scale
    scale: builtins.float = ...
    def __init__(self,
        *,
        size : typing.Optional[global___Size] = ...,
        scale : builtins.float = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"size",b"size"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"scale",b"scale",u"size",b"size"]) -> None: ...
global___Screen = Screen

# A sub-message containing Device info.
# Next ID = 11.
class Device(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    DEVICE_TYPE_FIELD_NUMBER: builtins.int
    BRAND_FIELD_NUMBER: builtins.int
    MANUFACTURER_FIELD_NUMBER: builtins.int
    IDENTIFIER_FIELD_NUMBER: builtins.int
    OS_VERSION_FIELD_NUMBER: builtins.int
    LOCALE_FIELD_NUMBER: builtins.int
    SCREEN_FIELD_NUMBER: builtins.int
    IP_ADDRESS_FIELD_NUMBER: builtins.int
    LOCATION_FIELD_NUMBER: builtins.int
    BROWSER_FIELD_NUMBER: builtins.int
    device_type: global___DeviceType.V = ...
    # Android: android.os.Build.BRAND
    #          (eg. "google", "verizon", "tmobile", "Samsung")
    # iOS: "Apple"
    brand: typing.Text = ...
    # Android: android.os.Build.MANUFACTURER
    #          (eg. "HTC", "Motorola", "HUAWEI")
    # iOS: "Apple"
    manufacturer: typing.Text = ...
    # Android: android.os.Build.MODEL
    #          (eg. "GT-S5830L", "MB860")
    # iOS: "iPhoneXX,YY" or "iPadXX,YY"
    identifier: typing.Text = ...
    # Android: android.os.Build.VERSION.RELEASE
    # iOS: "14.4.1"
    os_version: typing.Text = ...
    # Deprecated.
    @property
    def locale(self) -> global___Locale: ...
    @property
    def screen(self) -> global___Screen: ...
    # Optional.  We'll use IP Address to guess the user's
    # location when necessary and possible on desktop.
    # Most likely in a server integration this should be the value
    # of the X-Forwarded-For header.
    ip_address: typing.Text = ...
    # Optional. User device's actual geolocation if available.
    @property
    def location(self) -> global___Location: ...
    # Optional. Information about the user's web client (on web or mobile browser).
    @property
    def browser(self) -> global___Browser: ...
    def __init__(self,
        *,
        device_type : global___DeviceType.V = ...,
        brand : typing.Text = ...,
        manufacturer : typing.Text = ...,
        identifier : typing.Text = ...,
        os_version : typing.Text = ...,
        locale : typing.Optional[global___Locale] = ...,
        screen : typing.Optional[global___Screen] = ...,
        ip_address : typing.Text = ...,
        location : typing.Optional[global___Location] = ...,
        browser : typing.Optional[global___Browser] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"browser",b"browser",u"locale",b"locale",u"location",b"location",u"screen",b"screen"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"brand",b"brand",u"browser",b"browser",u"device_type",b"device_type",u"identifier",b"identifier",u"ip_address",b"ip_address",u"locale",b"locale",u"location",b"location",u"manufacturer",b"manufacturer",u"os_version",b"os_version",u"screen",b"screen"]) -> None: ...
global___Device = Device

# https://raw.githubusercontent.com/snowplow/iglu-central/master/schemas/org.ietf/http_client_hints/jsonschema/1-0-0
# A newer alternative to user agent strings.
class ClientHints(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    IS_MOBILE_FIELD_NUMBER: builtins.int
    BRAND_FIELD_NUMBER: builtins.int
    ARCHITECTURE_FIELD_NUMBER: builtins.int
    MODEL_FIELD_NUMBER: builtins.int
    PLATFORM_FIELD_NUMBER: builtins.int
    PLATFORM_VERSION_FIELD_NUMBER: builtins.int
    UA_FULL_VERSION_FIELD_NUMBER: builtins.int
    is_mobile: builtins.bool = ...
    @property
    def brand(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___ClientHintBrand]: ...
    architecture: typing.Text = ...
    model: typing.Text = ...
    platform: typing.Text = ...
    platform_version: typing.Text = ...
    ua_full_version: typing.Text = ...
    def __init__(self,
        *,
        is_mobile : builtins.bool = ...,
        brand : typing.Optional[typing.Iterable[global___ClientHintBrand]] = ...,
        architecture : typing.Text = ...,
        model : typing.Text = ...,
        platform : typing.Text = ...,
        platform_version : typing.Text = ...,
        ua_full_version : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"architecture",b"architecture",u"brand",b"brand",u"is_mobile",b"is_mobile",u"model",b"model",u"platform",b"platform",u"platform_version",b"platform_version",u"ua_full_version",b"ua_full_version"]) -> None: ...
global___ClientHints = ClientHints

# https://raw.githubusercontent.com/snowplow/iglu-central/master/schemas/org.ietf/http_client_hints/jsonschema/1-0-0
# a part of ClientHints.
class ClientHintBrand(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    BRAND_FIELD_NUMBER: builtins.int
    VERSION_FIELD_NUMBER: builtins.int
    brand: typing.Text = ...
    version: typing.Text = ...
    def __init__(self,
        *,
        brand : typing.Text = ...,
        version : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"brand",b"brand",u"version",b"version"]) -> None: ...
global___ClientHintBrand = ClientHintBrand

# A sub-message containing Browser info.
# Next ID = 4.
class Browser(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    USER_AGENT_FIELD_NUMBER: builtins.int
    VIEWPORT_SIZE_FIELD_NUMBER: builtins.int
    CLIENT_HINTS_FIELD_NUMBER: builtins.int
    user_agent: typing.Text = ...
    @property
    def viewport_size(self) -> global___Size: ...
    @property
    def client_hints(self) -> global___ClientHints: ...
    def __init__(self,
        *,
        user_agent : typing.Text = ...,
        viewport_size : typing.Optional[global___Size] = ...,
        client_hints : typing.Optional[global___ClientHints] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"client_hints",b"client_hints",u"viewport_size",b"viewport_size"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"client_hints",b"client_hints",u"user_agent",b"user_agent",u"viewport_size",b"viewport_size"]) -> None: ...
global___Browser = Browser

# Next ID = 4.
class Location(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LATITUDE_FIELD_NUMBER: builtins.int
    LONGITUDE_FIELD_NUMBER: builtins.int
    ACCURACY_IN_METERS_FIELD_NUMBER: builtins.int
    # [-90, 90]
    latitude: builtins.float = ...
    # [-180, 180]
    longitude: builtins.float = ...
    # Optional. Accuracy of location if known.
    accuracy_in_meters: builtins.float = ...
    def __init__(self,
        *,
        latitude : builtins.float = ...,
        longitude : builtins.float = ...,
        accuracy_in_meters : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"accuracy_in_meters",b"accuracy_in_meters",u"latitude",b"latitude",u"longitude",b"longitude"]) -> None: ...
global___Location = Location

# A message containing timing information.
#
# We can add common timing info to this message.  Down the road, we might
# make more specific Timing messages (e.g. MetricsTiming).  We can reuse
# the field numbers.
#
# Next ID = 4.
class Timing(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    CLIENT_LOG_TIMESTAMP_FIELD_NUMBER: builtins.int
    # Optional.  Client timestamp when event was created.
    client_log_timestamp: builtins.int = ...
    def __init__(self,
        *,
        client_log_timestamp : builtins.int = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"client_log_timestamp",b"client_log_timestamp"]) -> None: ...
global___Timing = Timing

# Supports custom properties per platform.
# Next ID = 4.
class Properties(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    STRUCT_BYTES_FIELD_NUMBER: builtins.int
    STRUCT_FIELD_NUMBER: builtins.int
    # Optional.  Contains protobuf serialized bytes.
    struct_bytes: builtins.bytes = ...
    # Optional.  Can be converted to/from JSON.
    @property
    def struct(self) -> google.protobuf.struct_pb2.Struct: ...
    def __init__(self,
        *,
        struct_bytes : builtins.bytes = ...,
        struct : typing.Optional[google.protobuf.struct_pb2.Struct] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"struct",b"struct",u"struct_bytes",b"struct_bytes",u"struct_field",b"struct_field"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"struct",b"struct",u"struct_bytes",b"struct_bytes",u"struct_field",b"struct_field"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal[u"struct_field",b"struct_field"]) -> typing.Optional[typing_extensions.Literal["struct_bytes","struct"]]: ...
global___Properties = Properties
