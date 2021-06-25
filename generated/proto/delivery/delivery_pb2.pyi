"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.containers
import google.protobuf.internal.enum_type_wrapper
import google.protobuf.message
import proto.common.common_pb2
import proto.delivery.blender_pb2
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor = ...

class UseCase(metaclass=_UseCase):
    V = typing.NewType('V', builtins.int)

global___UseCase = UseCase

UNKNOWN_USE_CASE = UseCase.V(0)
CUSTOM = UseCase.V(1)
SEARCH = UseCase.V(2)
SEARCH_SUGGESTIONS = UseCase.V(3)
FEED = UseCase.V(4)
RELATED_CONTENT = UseCase.V(5)
CLOSE_UP = UseCase.V(6)
CATEGORY_CONTENT = UseCase.V(7)
MY_CONTENT = UseCase.V(8)
MY_SAVED_CONTENT = UseCase.V(9)
SELLER_CONTENT = UseCase.V(10)
DISCOVER = UseCase.V(11)

class _UseCase(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[UseCase.V], builtins.type):
    DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
    UNKNOWN_USE_CASE = UseCase.V(0)
    CUSTOM = UseCase.V(1)
    SEARCH = UseCase.V(2)
    SEARCH_SUGGESTIONS = UseCase.V(3)
    FEED = UseCase.V(4)
    RELATED_CONTENT = UseCase.V(5)
    CLOSE_UP = UseCase.V(6)
    CATEGORY_CONTENT = UseCase.V(7)
    MY_CONTENT = UseCase.V(8)
    MY_SAVED_CONTENT = UseCase.V(9)
    SELLER_CONTENT = UseCase.V(10)
    DISCOVER = UseCase.V(11)

class Request(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PLATFORM_ID_FIELD_NUMBER: builtins.int
    USER_INFO_FIELD_NUMBER: builtins.int
    TIMING_FIELD_NUMBER: builtins.int
    CLIENT_INFO_FIELD_NUMBER: builtins.int
    REQUEST_ID_FIELD_NUMBER: builtins.int
    VIEW_ID_FIELD_NUMBER: builtins.int
    SESSION_ID_FIELD_NUMBER: builtins.int
    CLIENT_REQUEST_ID_FIELD_NUMBER: builtins.int
    USE_CASE_FIELD_NUMBER: builtins.int
    SEARCH_QUERY_FIELD_NUMBER: builtins.int
    LIMIT_FIELD_NUMBER: builtins.int
    PAGING_FIELD_NUMBER: builtins.int
    INSERTION_FIELD_NUMBER: builtins.int
    BLENDER_CONFIG_FIELD_NUMBER: builtins.int
    PROPERTIES_FIELD_NUMBER: builtins.int
    platform_id: builtins.int = ...
    request_id: typing.Text = ...
    view_id: typing.Text = ...
    session_id: typing.Text = ...
    client_request_id: typing.Text = ...
    use_case: global___UseCase.V = ...
    search_query: typing.Text = ...
    limit: builtins.int = ...

    @property
    def user_info(self) -> proto.common.common_pb2.UserInfo: ...

    @property
    def timing(self) -> proto.common.common_pb2.Timing: ...

    @property
    def client_info(self) -> proto.common.common_pb2.ClientInfo: ...

    @property
    def paging(self) -> global___Paging: ...

    @property
    def insertion(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___Insertion]: ...

    @property
    def blender_config(self) -> proto.delivery.blender_pb2.BlenderConfig: ...

    @property
    def properties(self) -> proto.common.common_pb2.Properties: ...

    def __init__(self,
        *,
        platform_id : builtins.int = ...,
        user_info : typing.Optional[proto.common.common_pb2.UserInfo] = ...,
        timing : typing.Optional[proto.common.common_pb2.Timing] = ...,
        client_info : typing.Optional[proto.common.common_pb2.ClientInfo] = ...,
        request_id : typing.Text = ...,
        view_id : typing.Text = ...,
        session_id : typing.Text = ...,
        client_request_id : typing.Text = ...,
        use_case : global___UseCase.V = ...,
        search_query : typing.Text = ...,
        limit : builtins.int = ...,
        paging : typing.Optional[global___Paging] = ...,
        insertion : typing.Optional[typing.Iterable[global___Insertion]] = ...,
        blender_config : typing.Optional[proto.delivery.blender_pb2.BlenderConfig] = ...,
        properties : typing.Optional[proto.common.common_pb2.Properties] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"blender_config",b"blender_config",u"client_info",b"client_info",u"paging",b"paging",u"properties",b"properties",u"timing",b"timing",u"user_info",b"user_info"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"blender_config",b"blender_config",u"client_info",b"client_info",u"client_request_id",b"client_request_id",u"insertion",b"insertion",u"limit",b"limit",u"paging",b"paging",u"platform_id",b"platform_id",u"properties",b"properties",u"request_id",b"request_id",u"search_query",b"search_query",u"session_id",b"session_id",u"timing",b"timing",u"use_case",b"use_case",u"user_info",b"user_info",u"view_id",b"view_id"]) -> None: ...
global___Request = Request

class Paging(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PAGING_ID_FIELD_NUMBER: builtins.int
    SIZE_FIELD_NUMBER: builtins.int
    CURSOR_FIELD_NUMBER: builtins.int
    OFFSET_FIELD_NUMBER: builtins.int
    paging_id: typing.Text = ...
    size: builtins.int = ...
    cursor: typing.Text = ...
    offset: builtins.int = ...

    def __init__(self,
        *,
        paging_id : typing.Text = ...,
        size : builtins.int = ...,
        cursor : typing.Text = ...,
        offset : builtins.int = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"cursor",b"cursor",u"offset",b"offset",u"starting",b"starting"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"cursor",b"cursor",u"offset",b"offset",u"paging_id",b"paging_id",u"size",b"size",u"starting",b"starting"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal[u"starting",b"starting"]) -> typing_extensions.Literal["cursor","offset"]: ...
global___Paging = Paging

class Response(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    INSERTION_FIELD_NUMBER: builtins.int
    PAGING_INFO_FIELD_NUMBER: builtins.int

    @property
    def insertion(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___Insertion]: ...

    @property
    def paging_info(self) -> global___PagingInfo: ...

    def __init__(self,
        *,
        insertion : typing.Optional[typing.Iterable[global___Insertion]] = ...,
        paging_info : typing.Optional[global___PagingInfo] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"paging_info",b"paging_info"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"insertion",b"insertion",u"paging_info",b"paging_info"]) -> None: ...
global___Response = Response

class PagingInfo(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PAGING_ID_FIELD_NUMBER: builtins.int
    CURSOR_FIELD_NUMBER: builtins.int
    paging_id: typing.Text = ...
    cursor: typing.Text = ...

    def __init__(self,
        *,
        paging_id : typing.Text = ...,
        cursor : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"cursor",b"cursor",u"paging_id",b"paging_id"]) -> None: ...
global___PagingInfo = PagingInfo

class Insertion(google.protobuf.message.Message):
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PLATFORM_ID_FIELD_NUMBER: builtins.int
    USER_INFO_FIELD_NUMBER: builtins.int
    TIMING_FIELD_NUMBER: builtins.int
    CLIENT_INFO_FIELD_NUMBER: builtins.int
    INSERTION_ID_FIELD_NUMBER: builtins.int
    REQUEST_ID_FIELD_NUMBER: builtins.int
    VIEW_ID_FIELD_NUMBER: builtins.int
    SESSION_ID_FIELD_NUMBER: builtins.int
    CONTENT_ID_FIELD_NUMBER: builtins.int
    POSITION_FIELD_NUMBER: builtins.int
    PROPERTIES_FIELD_NUMBER: builtins.int
    platform_id: builtins.int = ...
    insertion_id: typing.Text = ...
    request_id: typing.Text = ...
    view_id: typing.Text = ...
    session_id: typing.Text = ...
    content_id: typing.Text = ...
    position: builtins.int = ...

    @property
    def user_info(self) -> proto.common.common_pb2.UserInfo: ...

    @property
    def timing(self) -> proto.common.common_pb2.Timing: ...

    @property
    def client_info(self) -> proto.common.common_pb2.ClientInfo: ...

    @property
    def properties(self) -> proto.common.common_pb2.Properties: ...

    def __init__(self,
        *,
        platform_id : builtins.int = ...,
        user_info : typing.Optional[proto.common.common_pb2.UserInfo] = ...,
        timing : typing.Optional[proto.common.common_pb2.Timing] = ...,
        client_info : typing.Optional[proto.common.common_pb2.ClientInfo] = ...,
        insertion_id : typing.Text = ...,
        request_id : typing.Text = ...,
        view_id : typing.Text = ...,
        session_id : typing.Text = ...,
        content_id : typing.Text = ...,
        position : builtins.int = ...,
        properties : typing.Optional[proto.common.common_pb2.Properties] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal[u"client_info",b"client_info",u"properties",b"properties",u"timing",b"timing",u"user_info",b"user_info"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal[u"client_info",b"client_info",u"content_id",b"content_id",u"insertion_id",b"insertion_id",u"platform_id",b"platform_id",u"position",b"position",u"properties",b"properties",u"request_id",b"request_id",u"session_id",b"session_id",u"timing",b"timing",u"user_info",b"user_info",u"view_id",b"view_id"]) -> None: ...
global___Insertion = Insertion
