"""
@generated by mypy-protobuf.  Do not edit manually!
isort:skip_file
"""
import builtins
import google.protobuf.descriptor
import google.protobuf.internal.enum_type_wrapper
import google.protobuf.message
import proto.delivery.delivery_pb2
import typing
import typing_extensions

DESCRIPTOR: google.protobuf.descriptor.FileDescriptor = ...

class ExecutionServer(_ExecutionServer, metaclass=_ExecutionServerEnumTypeWrapper):
    """The system repsonsible for doing delivery.
    Next ID = 4
    """
    pass
class _ExecutionServer:
    V = typing.NewType('V', builtins.int)
class _ExecutionServerEnumTypeWrapper(google.protobuf.internal.enum_type_wrapper._EnumTypeWrapper[_ExecutionServer.V], builtins.type):
    DESCRIPTOR: google.protobuf.descriptor.EnumDescriptor = ...
    UNKNOWN_EXECUTION_SERVER = ExecutionServer.V(0)
    SDK = ExecutionServer.V(2)
    """The SDK did delivery because the API failed or was not called for any reason."""


UNKNOWN_EXECUTION_SERVER = ExecutionServer.V(0)
SDK = ExecutionServer.V(2)
"""The SDK did delivery because the API failed or was not called for any reason."""

global___ExecutionServer = ExecutionServer


class DeliveryLog(google.protobuf.message.Message):
    """Full execution details of a single Delivery hit: Request->Execution->Response.
    Next ID = 5.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    PLATFORM_ID_FIELD_NUMBER: builtins.int
    REQUEST_FIELD_NUMBER: builtins.int
    RESPONSE_FIELD_NUMBER: builtins.int
    EXECUTION_FIELD_NUMBER: builtins.int
    platform_id: builtins.int = ...
    """As used by Delivery. May be set by Delivery per server environment."""

    @property
    def request(self) -> proto.delivery.delivery_pb2.Request:
        """Should be exactly what Delivery API received as input.
        request.insertion will be filled in if client does retrieval.
        """
        pass
    @property
    def response(self) -> proto.delivery.delivery_pb2.Response:
        """Should be exactly what Delivery API sent as output.
        response.insertion will be filled in with the paged response.
        """
        pass
    @property
    def execution(self) -> global___DeliveryExecution: ...
    def __init__(self,
        *,
        platform_id : builtins.int = ...,
        request : typing.Optional[proto.delivery.delivery_pb2.Request] = ...,
        response : typing.Optional[proto.delivery.delivery_pb2.Response] = ...,
        execution : typing.Optional[global___DeliveryExecution] = ...,
        ) -> None: ...
    def HasField(self, field_name: typing_extensions.Literal["execution",b"execution","request",b"request","response",b"response"]) -> builtins.bool: ...
    def ClearField(self, field_name: typing_extensions.Literal["execution",b"execution","platform_id",b"platform_id","request",b"request","response",b"response"]) -> None: ...
global___DeliveryLog = DeliveryLog

class DeliveryExecution(google.protobuf.message.Message):
    """Contains the inner execution details for a Delivery call.
    Next ID = 7.
    """
    DESCRIPTOR: google.protobuf.descriptor.Descriptor = ...
    EXECUTION_SERVER_FIELD_NUMBER: builtins.int
    execution_server: global___ExecutionServer.V = ...
    """Where delivery happened, i.e. via the SDK or some approach on the API side."""

    def __init__(self,
        *,
        execution_server : global___ExecutionServer.V = ...,
        ) -> None: ...
    def ClearField(self, field_name: typing_extensions.Literal["execution_server",b"execution_server"]) -> None: ...
global___DeliveryExecution = DeliveryExecution
