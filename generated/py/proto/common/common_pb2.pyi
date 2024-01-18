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
    """Next ID = 21."""
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


class DeviceType(_DeviceType, metaclass=_DeviceTypeEnumTypeWrapper):
    """Next ID = 4."""
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
    """Next ID = 7."""
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
    def ClearField(self, field_name: typing_extensions.Literal["account_id",b"account_id","campaign_id",b"campaign_id","content_id",b"content_id","customer_id",b"customer_id","platform_id",b"platform_id","promotion_id",b"promotion_id"]) -> None: ...
global___EntityPath = EntityPath

class Money(google.protobuf.message.Message):
    """Represents a money value.  e.g. $1 USD.
    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    CURRENCY_CODE_FIELD_NUMBER: builtins.int
    AMOUNT_MICROS_FIELD_NUMBER: builtins.int
    currency_code: global___CurrencyCode.V = ...
    amount_micros: builtins.int = ...
    """1 million = 1 denomination in the currency.  E.g. 1 USD = 1,000,000 price_micros_per_unit.
    We use micros to avoid double aggregation errors.
    """

    def __init__(self,
        *,
        currency_code : global___CurrencyCode.V = ...,
        amount_micros : builtins.int = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["amount_micros",b"amount_micros","currency_code",b"currency_code"]) -> None: ...
global___Money = Money

class UserInfo(google.protobuf.message.Message):
    """Common submessage that indicates the user for a record.

    Summary of fields:
    - `user_id` = the platform's auth user ID.
    - `retained_user_id` = internal Promoted forgettable version of `user_id`.
    - `anon_user_id` = the platform's anonymous user ID.
    - `log_user_id` = Deprecated.  This was our v1 ~anon_user_id field.
      It's being replaced by a more explicit `anon_user_id` field.

    Next ID = 8.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    USER_ID_FIELD_NUMBER: builtins.int
    LOG_USER_ID_FIELD_NUMBER: builtins.int
    IS_INTERNAL_USER_FIELD_NUMBER: builtins.int
    IGNORE_USAGE_FIELD_NUMBER: builtins.int
    ANON_USER_ID_FIELD_NUMBER: builtins.int
    RETAINED_USER_ID_FIELD_NUMBER: builtins.int
    user_id: typing.Text = ...
    """Optional.  The platform's authenticated user ID.
    This field will be cleared in our long-term transaction logs to
    make it easier to forget `user_id`s.
    Early in ingestion, the auth `user_id` field is cleared and
    `retained_user_id` is set with a pseudoanonymized value for
    longer-term retention.
    """

    log_user_id: typing.Text = ...
    """Internal.  Optional.  The `log_user_id` is another type of user ID.
    It's different than the `anon_user_id` and auth `user_id`.
    The goal is to have a user ID that lives longer than
    anon_user_id but different from the auth `user_id` so we can
    decouple our long-term logs in case the user wants to be forgotten.
    Multiple `anon_user_id`s can be mapped to the same `log_user_id`.
    Most of Promoted's internal systems use `log_user_id`.

    We're planning on deprecating this field.  Details TBD.
    """

    is_internal_user: builtins.bool = ...
    """Optional, defaults to false. Indicates that the user is from the
    marketplace or Promoted team.
    """

    ignore_usage: builtins.bool = ...
    """Optional, defaults to false.  Can be used to suppress traffic.
    One use case is to use this field when debugging specific customer
    experiences by overriding the log_user_id.
    """

    anon_user_id: typing.Text = ...
    """Optional vs Required is complicated.  The platform's anonymous user ID.

    Currently, the field is optional.  Clients need to migrate from setting
    `log_user_id` to setting the `anon_user_id` field.

    After the migration, we'll temporarily treat anon_user_id as required.
    Then we staff another project to not require anon_user_id if user_id is
    specified.  This is useful when there are delayed conversion events.
    """

    retained_user_id: typing.Text = ...
    """Optional.  A retainable version of `user_id`."""

    def __init__(self,
        *,
        user_id : typing.Text = ...,
        log_user_id : typing.Text = ...,
        is_internal_user : builtins.bool = ...,
        ignore_usage : builtins.bool = ...,
        anon_user_id : typing.Text = ...,
        retained_user_id : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["anon_user_id",b"anon_user_id","ignore_usage",b"ignore_usage","is_internal_user",b"is_internal_user","log_user_id",b"log_user_id","retained_user_id",b"retained_user_id","user_id",b"user_id"]) -> None: ...
global___UserInfo = UserInfo

class ClientInfo(google.protobuf.message.Message):
    """Info about the client.
    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    class ClientType(_ClientType, metaclass=_ClientTypeEnumTypeWrapper):
        """Next ID = 5;"""
        pass
    class _ClientType:
        V = typing.NewType('V', builtins.int)
    class _ClientTypeEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_ClientType.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN_REQUEST_CLIENT = ClientInfo.ClientType.V(0)
        PLATFORM_SERVER = ClientInfo.ClientType.V(1)
        """Your (customer) server."""

        PLATFORM_CLIENT = ClientInfo.ClientType.V(2)
        """Your (customer) client."""


    UNKNOWN_REQUEST_CLIENT = ClientInfo.ClientType.V(0)
    PLATFORM_SERVER = ClientInfo.ClientType.V(1)
    """Your (customer) server."""

    PLATFORM_CLIENT = ClientInfo.ClientType.V(2)
    """Your (customer) client."""


    class TrafficType(_TrafficType, metaclass=_TrafficTypeEnumTypeWrapper):
        """Used to indicate the type of traffic.  We can use this to prioritize resources.
        Next ID = 6.
        """
        pass
    class _TrafficType:
        V = typing.NewType('V', builtins.int)
    class _TrafficTypeEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_TrafficType.V], builtins.type):
        DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
        UNKNOWN_TRAFFIC_TYPE = ClientInfo.TrafficType.V(0)
        PRODUCTION = ClientInfo.TrafficType.V(1)
        """Live traffic."""

        REPLAY = ClientInfo.TrafficType.V(2)
        """Replayed traffic.  We'd like similar to PRODUCTION level."""

        SHADOW = ClientInfo.TrafficType.V(4)
        """Shadow traffic to delivery during logging."""


    UNKNOWN_TRAFFIC_TYPE = ClientInfo.TrafficType.V(0)
    PRODUCTION = ClientInfo.TrafficType.V(1)
    """Live traffic."""

    REPLAY = ClientInfo.TrafficType.V(2)
    """Replayed traffic.  We'd like similar to PRODUCTION level."""

    SHADOW = ClientInfo.TrafficType.V(4)
    """Shadow traffic to delivery during logging."""


    CLIENT_TYPE_FIELD_NUMBER: builtins.int
    TRAFFIC_TYPE_FIELD_NUMBER: builtins.int
    client_type: global___ClientInfo.ClientType.V = ...
    traffic_type: global___ClientInfo.TrafficType.V = ...
    def __init__(self,
        *,
        client_type : global___ClientInfo.ClientType.V = ...,
        traffic_type : global___ClientInfo.TrafficType.V = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["client_type",b"client_type","traffic_type",b"traffic_type"]) -> None: ...
global___ClientInfo = ClientInfo

class Locale(google.protobuf.message.Message):
    """Locale for session
    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LANGUAGE_CODE_FIELD_NUMBER: builtins.int
    REGION_CODE_FIELD_NUMBER: builtins.int
    language_code: typing.Text = ...
    """CodeReview - Which ISO code is this?  ISO 639-1? 2? 3?
    "en", "zh_Hant", "fr"
    """

    region_code: typing.Text = ...
    """CodeReview - Which ISO code?  ISO 3166-1?
    "US", "CA", "FR"
    """

    def __init__(self,
        *,
        language_code : typing.Text = ...,
        region_code : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["language_code",b"language_code","region_code",b"region_code"]) -> None: ...
global___Locale = Locale

class Size(google.protobuf.message.Message):
    """Rectangle size in pixels
    Next ID = 3.
    """
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
    def ClearField(self, field_name: typing_extensions.Literal["height",b"height","width",b"width"]) -> None: ...
global___Size = Size

class Screen(google.protobuf.message.Message):
    """Device screen
    Next ID = 3.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    SIZE_FIELD_NUMBER: builtins.int
    SCALE_FIELD_NUMBER: builtins.int
    @property
    def size(self) -> global___Size:
        """Android: DisplayMetrics.widthPixels/heightPixels
        iOS: UIScreen.nativeBounds.width/height
        """
        pass
    scale: builtins.float = ...
    """Natural scale factor.
    Android: DisplayMetrics.density
    iOS: UIScreen.scale
    """

    def __init__(self,
        *,
        size : typing.Optional[global___Size] = ...,
        scale : builtins.float = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["size",b"size"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["scale",b"scale","size",b"size"]) -> None: ...
global___Screen = Screen

class Device(google.protobuf.message.Message):
    """A sub-message containing Device info.
    Next ID = 13.
    """
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
    PLATFORM_APP_VERSION_FIELD_NUMBER: builtins.int
    PROMOTED_MOBILE_SDK_VERSION_FIELD_NUMBER: builtins.int
    device_type: global___DeviceType.V = ...
    brand: typing.Text = ...
    """Android: android.os.Build.BRAND
             (eg. "google", "verizon", "tmobile", "Samsung")
    iOS: "Apple"
    """

    manufacturer: typing.Text = ...
    """Android: android.os.Build.MANUFACTURER
             (eg. "HTC", "Motorola", "HUAWEI")
    iOS: "Apple"
    """

    identifier: typing.Text = ...
    """Android: android.os.Build.MODEL
             (eg. "GT-S5830L", "MB860")
    iOS: "iPhoneXX,YY" or "iPadXX,YY"
    """

    os_version: typing.Text = ...
    """Android: android.os.Build.VERSION.RELEASE
    iOS: "14.4.1"
    """

    @property
    def locale(self) -> global___Locale:
        """Deprecated."""
        pass
    @property
    def screen(self) -> global___Screen: ...
    ip_address: typing.Text = ...
    """Optional.  We'll use IP Address to guess the user's
    location when necessary and possible on desktop.
    Most likely in a server integration this should be the value
    of the X-Forwarded-For header.
    """

    @property
    def location(self) -> global___Location:
        """Optional. User device's actual geolocation if available."""
        pass
    @property
    def browser(self) -> global___Browser:
        """Optional. Information about the user's web client (on web or mobile browser)."""
        pass
    platform_app_version: typing.Text = ...
    """Optional. Version string for platform app."""

    promoted_mobile_sdk_version: typing.Text = ...
    """Optional. Version string for mobile SDK."""

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
        platform_app_version : typing.Text = ...,
        promoted_mobile_sdk_version : typing.Text = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["browser",b"browser","locale",b"locale","location",b"location","screen",b"screen"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["brand",b"brand","browser",b"browser","device_type",b"device_type","identifier",b"identifier","ip_address",b"ip_address","locale",b"locale","location",b"location","manufacturer",b"manufacturer","os_version",b"os_version","platform_app_version",b"platform_app_version","promoted_mobile_sdk_version",b"promoted_mobile_sdk_version","screen",b"screen"]) -> None: ...
global___Device = Device

class ClientHints(google.protobuf.message.Message):
    """https://raw.githubusercontent.com/snowplow/iglu-central/master/schemas/org.ietf/http_client_hints/jsonschema/1-0-0
    A newer alternative to user agent strings.
    Next ID = 8.
    """
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
    def ClearField(self, field_name: typing_extensions.Literal["architecture",b"architecture","brand",b"brand","is_mobile",b"is_mobile","model",b"model","platform",b"platform","platform_version",b"platform_version","ua_full_version",b"ua_full_version"]) -> None: ...
global___ClientHints = ClientHints

class ClientHintBrand(google.protobuf.message.Message):
    """https://raw.githubusercontent.com/snowplow/iglu-central/master/schemas/org.ietf/http_client_hints/jsonschema/1-0-0
    a part of ClientHints.
    Next ID = 3.
    """
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
    def ClearField(self, field_name: typing_extensions.Literal["brand",b"brand","version",b"version"]) -> None: ...
global___ClientHintBrand = ClientHintBrand

class Browser(google.protobuf.message.Message):
    """A sub-message containing Browser info.
    Next ID = 5.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    USER_AGENT_FIELD_NUMBER: builtins.int
    VIEWPORT_SIZE_FIELD_NUMBER: builtins.int
    CLIENT_HINTS_FIELD_NUMBER: builtins.int
    REFERRER_FIELD_NUMBER: builtins.int
    user_agent: typing.Text = ...
    @property
    def viewport_size(self) -> global___Size: ...
    @property
    def client_hints(self) -> global___ClientHints: ...
    referrer: typing.Text = ...
    def __init__(self,
        *,
        user_agent : typing.Text = ...,
        viewport_size : typing.Optional[global___Size] = ...,
        client_hints : typing.Optional[global___ClientHints] = ...,
        referrer : typing.Text = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["client_hints",b"client_hints","viewport_size",b"viewport_size"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["client_hints",b"client_hints","referrer",b"referrer","user_agent",b"user_agent","viewport_size",b"viewport_size"]) -> None: ...
global___Browser = Browser

class Location(google.protobuf.message.Message):
    """Next ID = 4."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    LATITUDE_FIELD_NUMBER: builtins.int
    LONGITUDE_FIELD_NUMBER: builtins.int
    ACCURACY_IN_METERS_FIELD_NUMBER: builtins.int
    latitude: builtins.float = ...
    """[-90, 90]"""

    longitude: builtins.float = ...
    """[-180, 180]"""

    accuracy_in_meters: builtins.float = ...
    """Optional. Accuracy of location if known."""

    def __init__(self,
        *,
        latitude : builtins.float = ...,
        longitude : builtins.float = ...,
        accuracy_in_meters : builtins.float = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["accuracy_in_meters",b"accuracy_in_meters","latitude",b"latitude","longitude",b"longitude"]) -> None: ...
global___Location = Location

class Timing(google.protobuf.message.Message):
    """A message containing timing information.

    We can add common timing info to this message.  Down the road, we might
    make more specific Timing messages (e.g. MetricsTiming).  We can reuse
    the field numbers.

    Next ID = 5.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    CLIENT_LOG_TIMESTAMP_FIELD_NUMBER: builtins.int
    client_log_timestamp: builtins.int = ...
    """Optional.  Client timestamp when event was created."""

    def __init__(self,
        *,
        client_log_timestamp : builtins.int = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["client_log_timestamp",b"client_log_timestamp"]) -> None: ...
global___Timing = Timing

class Properties(google.protobuf.message.Message):
    """Supports custom properties per platform.
    Next ID = 4.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    STRUCT_BYTES_FIELD_NUMBER: builtins.int
    STRUCT_FIELD_NUMBER: builtins.int
    struct_bytes: builtins.bytes = ...
    """Optional.  Contains protobuf serialized bytes."""

    @property
    def struct(self) -> google.protobuf.struct_pb2.Struct:
        """Optional.  Can be converted to/from JSON."""
        pass
    def __init__(self,
        *,
        struct_bytes : builtins.bytes = ...,
        struct : typing.Optional[google.protobuf.struct_pb2.Struct] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["struct",b"struct","struct_bytes",b"struct_bytes","struct_field",b"struct_field"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["struct",b"struct","struct_bytes",b"struct_bytes","struct_field",b"struct_field"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["struct_field",b"struct_field"]) -> typing.Optional[typing_extensions.Literal["struct_bytes","struct"]]: ...
global___Properties = Properties
