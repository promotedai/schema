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
import proto.common.common_pb2
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor = ...

class UseCase(_UseCase, metaclass=_UseCaseEnumTypeWrapper):
    """Used to indicate the client's use case.  Used on both View and Request.

    Next ID = 12.
    """
    pass
class _UseCase:
    V = typing.NewType('V', builtins.int)
class _UseCaseEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_UseCase.V], builtins.type):
    DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
    UNKNOWN_USE_CASE = UseCase.V(0)
    CUSTOM = UseCase.V(1)
    """Need to handle in wrapper proto."""

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

UNKNOWN_USE_CASE = UseCase.V(0)
CUSTOM = UseCase.V(1)
"""Need to handle in wrapper proto."""

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
global___UseCase = UseCase


class Request(google.protobuf.message.Message):
    """Represents a Request for Insertions (Content).
    Can be used to log existing ranking (not Promoted) or Promoted's Delivery
    API requests.

    Next ID = 23.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PLATFORM_ID_FIELD_NUMBER: builtins.int
    USER_INFO_FIELD_NUMBER: builtins.int
    TIMING_FIELD_NUMBER: builtins.int
    CLIENT_INFO_FIELD_NUMBER: builtins.int
    DEVICE_FIELD_NUMBER: builtins.int
    REQUEST_ID_FIELD_NUMBER: builtins.int
    VIEW_ID_FIELD_NUMBER: builtins.int
    AUTO_VIEW_ID_FIELD_NUMBER: builtins.int
    SESSION_ID_FIELD_NUMBER: builtins.int
    CLIENT_REQUEST_ID_FIELD_NUMBER: builtins.int
    USE_CASE_FIELD_NUMBER: builtins.int
    SEARCH_QUERY_FIELD_NUMBER: builtins.int
    PAGING_FIELD_NUMBER: builtins.int
    INSERTION_FIELD_NUMBER: builtins.int
    INSERTION_MATRIX_HEADERS_FIELD_NUMBER: builtins.int
    INSERTION_MATRIX_FIELD_NUMBER: builtins.int
    PROPERTIES_FIELD_NUMBER: builtins.int
    DISABLE_PERSONALIZATION_FIELD_NUMBER: builtins.int
    platform_id: builtins.int = ...
    """Optional.  If not set, set by API servers.
    If not set, API server uses LogRequest.platform_id.
    """

    @property
    def user_info(self) -> proto.common.common_pb2.UserInfo:
        """Optional.  Must be set on LogRequest or here."""
        pass
    @property
    def timing(self) -> proto.common.common_pb2.Timing:
        """Optional.  If not set, set by API servers.
        If not set, API server uses LogRequest.timing.
        """
        pass
    @property
    def client_info(self) -> proto.common.common_pb2.ClientInfo:
        """Optional.  If not set, API server uses LogRequest.client_info."""
        pass
    @property
    def device(self) -> proto.common.common_pb2.Device:
        """Optional. Information about the user's device."""
        pass
    request_id: typing.Text = ...
    """Optional.  Primary key.
    Delivery sets this automatically. For details, see
    https://github.com/promotedai/schema#setting-primary-keys
    """

    view_id: typing.Text = ...
    """Required."""

    auto_view_id: typing.Text = ...
    """Required."""

    session_id: typing.Text = ...
    """Optional."""

    client_request_id: typing.Text = ...
    """Optional.
    An ID indicating the client's version of a request_id.  This field
    matters when a single Request from the client could cause multiple
    request executions (e.g. backups from retries or timeouts).  Each of those
    request executions should have separate request_ids.
    This should be a UUID.  If not set on a Request, the SDKs or Promoted
    servers will set it.
    """

    use_case: global___UseCase.V = ...
    """Optional."""

    search_query: typing.Text = ...
    """Optional."""

    @property
    def paging(self) -> global___Paging:
        """Optional. Set to request a specific "page" of results."""
        pass
    @property
    def insertion(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___Insertion]:
        """Optional.
        If set in Delivery API, Promoted will re-rank this list of Content.
        This list can be used to pass in a list of Content (or Content IDs).
        If set in Metrics API, Promoted will separate this list of Insertions
        into separate log records.
        """
        pass
    @property
    def insertion_matrix_headers(self) -> google.protobuf.internal.containers.RepeatedScalarFieldContainer[typing.Text]:
        """Optional. Used to produce smaller requests alongside JSON serialization.
        An alternative representation of the `insertion` field. For example,
          insertion_matrix_headers: [a, b.c]
          insertion_matrix: [1, 3.0]
        becomes
          insertion: {
            a: 1,
            b: {
              c: 3.0
            }
          }
        If present, these fields override `insertion`.
        """
        pass
    @property
    def insertion_matrix(self) -> google.protobuf.struct_pb2.ListValue: ...
    @property
    def properties(self) -> proto.common.common_pb2.Properties:
        """Optional.  Custom properties per platform."""
        pass
    disable_personalization: builtins.bool = ...
    """Optional.  Can be used to disable personalization."""

    def __init__(self,
        *,
        platform_id : builtins.int = ...,
        user_info : typing.Optional[proto.common.common_pb2.UserInfo] = ...,
        timing : typing.Optional[proto.common.common_pb2.Timing] = ...,
        client_info : typing.Optional[proto.common.common_pb2.ClientInfo] = ...,
        device : typing.Optional[proto.common.common_pb2.Device] = ...,
        request_id : typing.Text = ...,
        view_id : typing.Text = ...,
        auto_view_id : typing.Text = ...,
        session_id : typing.Text = ...,
        client_request_id : typing.Text = ...,
        use_case : global___UseCase.V = ...,
        search_query : typing.Text = ...,
        paging : typing.Optional[global___Paging] = ...,
        insertion : typing.Optional[typing.Iterable[global___Insertion]] = ...,
        insertion_matrix_headers : typing.Optional[typing.Iterable[typing.Text]] = ...,
        insertion_matrix : typing.Optional[google.protobuf.struct_pb2.ListValue] = ...,
        properties : typing.Optional[proto.common.common_pb2.Properties] = ...,
        disable_personalization : builtins.bool = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["client_info",b"client_info","device",b"device","insertion_matrix",b"insertion_matrix","paging",b"paging","properties",b"properties","timing",b"timing","user_info",b"user_info"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["auto_view_id",b"auto_view_id","client_info",b"client_info","client_request_id",b"client_request_id","device",b"device","disable_personalization",b"disable_personalization","insertion",b"insertion","insertion_matrix",b"insertion_matrix","insertion_matrix_headers",b"insertion_matrix_headers","paging",b"paging","platform_id",b"platform_id","properties",b"properties","request_id",b"request_id","search_query",b"search_query","session_id",b"session_id","timing",b"timing","use_case",b"use_case","user_info",b"user_info","view_id",b"view_id"]) -> None: ...
global___Request = Request

class Paging(google.protobuf.message.Message):
    """Next ID = 5."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PAGING_ID_FIELD_NUMBER: builtins.int
    SIZE_FIELD_NUMBER: builtins.int
    CURSOR_FIELD_NUMBER: builtins.int
    OFFSET_FIELD_NUMBER: builtins.int
    paging_id: typing.Text = ...
    """Identity for the paging request (opaque token).
    A single paging_id will have many associated requests to get the fully
    paged response set (hence, many request_id's and client_request_id's).

    Required if using the cursor for the last_index; optional if using offset.
    Setting this value provides better paging consistency/stability.  Ideally,
    it should be set from the initial paging response
    (Response.paging_info.paging_id).

    An external value can be used when *not* using promoted.ai's item
    datastore.  The value must be specific enough to be globally unique, yet
    general enough to ignore paging parameters.  A good example of a useful,
    externally set paging_id is to use the paging token or identifiers returned
    by your item datastore retrieval while passing the eligible insertions in
    the Request.  If in doubt, rely on the Response.paging_info.paging_id or
    contact us.
    """

    size: builtins.int = ...
    """Required.  The number of items (insertions) to return."""

    cursor: typing.Text = ...
    offset: builtins.int = ...
    def __init__(self,
        *,
        paging_id : typing.Text = ...,
        size : builtins.int = ...,
        cursor : typing.Text = ...,
        offset : builtins.int = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["cursor",b"cursor","offset",b"offset","starting",b"starting"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["cursor",b"cursor","offset",b"offset","paging_id",b"paging_id","size",b"size","starting",b"starting"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["starting",b"starting"]) -> typing.Optional[typing_extensions.Literal["cursor","offset"]]: ...
global___Paging = Paging

class Response(google.protobuf.message.Message):
    """Next ID = 6."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    INSERTION_FIELD_NUMBER: builtins.int
    PAGING_INFO_FIELD_NUMBER: builtins.int
    INTROSPECTION_DATA_FIELD_NUMBER: builtins.int
    REQUEST_ID_FIELD_NUMBER: builtins.int
    @property
    def insertion(self) -> google.protobuf.internal.containers.RepeatedCompositeFieldContainer[global___Insertion]:
        """List of content."""
        pass
    @property
    def paging_info(self) -> global___PagingInfo:
        """Paging information of this response.  Only returned on paging requests."""
        pass
    introspection_data: typing.Text = ...
    """Optionally included support data on the response for use in introspection."""

    request_id: typing.Text = ...
    """This is the `request_id` from the corresponding `Request` message."""

    def __init__(self,
        *,
        insertion : typing.Optional[typing.Iterable[global___Insertion]] = ...,
        paging_info : typing.Optional[global___PagingInfo] = ...,
        introspection_data : typing.Text = ...,
        request_id : typing.Text = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["_introspection_data",b"_introspection_data","introspection_data",b"introspection_data","paging_info",b"paging_info"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["_introspection_data",b"_introspection_data","insertion",b"insertion","introspection_data",b"introspection_data","paging_info",b"paging_info","request_id",b"request_id"]) -> None: ...
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_introspection_data",b"_introspection_data"]) -> typing.Optional[typing_extensions.Literal["introspection_data"]]: ...
global___Response = Response

class PagingInfo(google.protobuf.message.Message):
    """Next ID = 3."""
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PAGING_ID_FIELD_NUMBER: builtins.int
    CURSOR_FIELD_NUMBER: builtins.int
    paging_id: typing.Text = ...
    """Opaque identifier to be used in subsequent paging requests for a specific
    paged repsonse set.
    """

    cursor: typing.Text = ...
    """Opaque token that represents the last item index of this response."""

    def __init__(self,
        *,
        paging_id : typing.Text = ...,
        cursor : typing.Text = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["cursor",b"cursor","paging_id",b"paging_id"]) -> None: ...
global___PagingInfo = PagingInfo

class Insertion(google.protobuf.message.Message):
    """Next ID = 11

    Define Prediction Type
    Next ID = 8

    This Event represents a Content being served at a certain position regardless
    of it was views by a user. Insertions are immutable.
    Next ID = 24.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PLATFORM_ID_FIELD_NUMBER: builtins.int
    USER_INFO_FIELD_NUMBER: builtins.int
    TIMING_FIELD_NUMBER: builtins.int
    CLIENT_INFO_FIELD_NUMBER: builtins.int
    INSERTION_ID_FIELD_NUMBER: builtins.int
    REQUEST_ID_FIELD_NUMBER: builtins.int
    VIEW_ID_FIELD_NUMBER: builtins.int
    AUTO_VIEW_ID_FIELD_NUMBER: builtins.int
    SESSION_ID_FIELD_NUMBER: builtins.int
    CONTENT_ID_FIELD_NUMBER: builtins.int
    POSITION_FIELD_NUMBER: builtins.int
    PROPERTIES_FIELD_NUMBER: builtins.int
    RETRIEVAL_RANK_FIELD_NUMBER: builtins.int
    RETRIEVAL_SCORE_FIELD_NUMBER: builtins.int
    platform_id: builtins.int = ...
    """Optional.  If not set, set by API servers."""

    @property
    def user_info(self) -> proto.common.common_pb2.UserInfo:
        """Required."""
        pass
    @property
    def timing(self) -> proto.common.common_pb2.Timing:
        """Optional.  If not set, set by API servers."""
        pass
    @property
    def client_info(self) -> proto.common.common_pb2.ClientInfo:
        """Optional.  If not set, API server uses LogRequest.client_info."""
        pass
    insertion_id: typing.Text = ...
    """Optional.  Primary key.
    SDKs usually handles this automatically. For details, see
    https://github.com/promotedai/schema#setting-primary-keys
    """

    request_id: typing.Text = ...
    """Optional."""

    view_id: typing.Text = ...
    """Optional."""

    auto_view_id: typing.Text = ...
    """Optional."""

    session_id: typing.Text = ...
    """Optional."""

    content_id: typing.Text = ...
    """Optional.  We'll look this up using the external_content_id."""

    position: builtins.int = ...
    """Optional. 0-based.  Position is the global position across pages.
    E.g. the first item on the 4th page where page_size=10 is position=40.
    Do not set this on request insertions.  Instead, set retrieval_rank.
    """

    @property
    def properties(self) -> proto.common.common_pb2.Properties:
        """Optional. Custom item attributes and features set by customers."""
        pass
    retrieval_rank: builtins.int = ...
    """Optional. Ranking (if known) of this insertion from the retrieval system."""

    retrieval_score: builtins.float = ...
    """Optional. Score (if any) of this insertion from the retrieval system."""

    def __init__(self,
        *,
        platform_id : builtins.int = ...,
        user_info : typing.Optional[proto.common.common_pb2.UserInfo] = ...,
        timing : typing.Optional[proto.common.common_pb2.Timing] = ...,
        client_info : typing.Optional[proto.common.common_pb2.ClientInfo] = ...,
        insertion_id : typing.Text = ...,
        request_id : typing.Text = ...,
        view_id : typing.Text = ...,
        auto_view_id : typing.Text = ...,
        session_id : typing.Text = ...,
        content_id : typing.Text = ...,
        position : builtins.int = ...,
        properties : typing.Optional[proto.common.common_pb2.Properties] = ...,
        retrieval_rank : builtins.int = ...,
        retrieval_score : builtins.float = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["_position",b"_position","_retrieval_rank",b"_retrieval_rank","_retrieval_score",b"_retrieval_score","client_info",b"client_info","position",b"position","properties",b"properties","retrieval_rank",b"retrieval_rank","retrieval_score",b"retrieval_score","timing",b"timing","user_info",b"user_info"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["_position",b"_position","_retrieval_rank",b"_retrieval_rank","_retrieval_score",b"_retrieval_score","auto_view_id",b"auto_view_id","client_info",b"client_info","content_id",b"content_id","insertion_id",b"insertion_id","platform_id",b"platform_id","position",b"position","properties",b"properties","request_id",b"request_id","retrieval_rank",b"retrieval_rank","retrieval_score",b"retrieval_score","session_id",b"session_id","timing",b"timing","user_info",b"user_info","view_id",b"view_id"]) -> None: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_position",b"_position"]) -> typing.Optional[typing_extensions.Literal["position"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_retrieval_rank",b"_retrieval_rank"]) -> typing.Optional[typing_extensions.Literal["retrieval_rank"]]: ...
    @typing.overload
    def WhichOneof(self, oneof_group: typing_extensions.Literal["_retrieval_score",b"_retrieval_score"]) -> typing.Optional[typing_extensions.Literal["retrieval_score"]]: ...
global___Insertion = Insertion
