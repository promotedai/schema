# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/delivery/delivery.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from proto.common import common_pb2 as proto_dot_common_dot_common__pb2
from proto.delivery import blender_pb2 as proto_dot_delivery_dot_blender__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/delivery/delivery.proto',
  package='delivery',
  syntax='proto3',
  serialized_options=b'\n\032ai.promoted.proto.deliveryB\010DeliveryP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1dproto/delivery/delivery.proto\x12\x08\x64\x65livery\x1a\x1cgoogle/protobuf/struct.proto\x1a\x19proto/common/common.proto\x1a\x1cproto/delivery/blender.proto\"\x88\x03\n\x07Request\x12\x13\n\x0bplatform_id\x18\x01 \x01(\x04\x12#\n\tuser_info\x18\x02 \x01(\x0b\x32\x10.common.UserInfo\x12\x1e\n\x06timing\x18\x03 \x01(\x0b\x32\x0e.common.Timing\x12\x12\n\nrequest_id\x18\x06 \x01(\t\x12\x0f\n\x07view_id\x18\x07 \x01(\t\x12\x12\n\nsession_id\x18\x08 \x01(\t\x12\x19\n\x11\x63lient_request_id\x18\x0e \x01(\t\x12#\n\x08use_case\x18\t \x01(\x0e\x32\x11.delivery.UseCase\x12\x14\n\x0csearch_query\x18\n \x01(\t\x12\r\n\x05limit\x18\x0f \x01(\x05\x12&\n\tinsertion\x18\x0b \x03(\x0b\x32\x13.delivery.Insertion\x12/\n\x0e\x62lender_config\x18\x0c \x01(\x0b\x32\x17.delivery.BlenderConfig\x12&\n\nproperties\x18\r \x01(\x0b\x32\x12.common.PropertiesJ\x04\x08\x04\x10\x06\"8\n\x08Response\x12&\n\tinsertion\x18\x02 \x03(\x0b\x32\x13.delivery.InsertionJ\x04\x08\x01\x10\x02\"\xa0\x02\n\tInsertion\x12\x13\n\x0bplatform_id\x18\x01 \x01(\x04\x12#\n\tuser_info\x18\x02 \x01(\x0b\x32\x10.common.UserInfo\x12\x1e\n\x06timing\x18\x03 \x01(\x0b\x32\x0e.common.Timing\x12\x14\n\x0cinsertion_id\x18\x06 \x01(\t\x12\x12\n\nrequest_id\x18\x07 \x01(\t\x12\x0f\n\x07view_id\x18\t \x01(\t\x12\x12\n\nsession_id\x18\x08 \x01(\t\x12\x12\n\ncontent_id\x18\n \x01(\t\x12\x10\n\x08position\x18\x0c \x01(\x04\x12&\n\nproperties\x18\r \x01(\x0b\x32\x12.common.PropertiesJ\x04\x08\x04\x10\x06J\x04\x08\x0b\x10\x0cJ\x04\x08\x0e\x10\x0fJ\x04\x08\x0f\x10\x10J\x04\x08\x10\x10\x11*\xcc\x01\n\x07UseCase\x12\x14\n\x10UNKNOWN_USE_CASE\x10\x00\x12\n\n\x06\x43USTOM\x10\x01\x12\n\n\x06SEARCH\x10\x02\x12\x16\n\x12SEARCH_SUGGESTIONS\x10\x03\x12\x08\n\x04\x46\x45\x45\x44\x10\x04\x12\x13\n\x0fRELATED_CONTENT\x10\x05\x12\x0c\n\x08\x43LOSE_UP\x10\x06\x12\x14\n\x10\x43\x41TEGORY_CONTENT\x10\x07\x12\x0e\n\nMY_CONTENT\x10\x08\x12\x14\n\x10MY_SAVED_CONTENT\x10\t\x12\x12\n\x0eSELLER_CONTENT\x10\nB(\n\x1a\x61i.promoted.proto.deliveryB\x08\x44\x65liveryP\x01\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,proto_dot_common_dot_common__pb2.DESCRIPTOR,proto_dot_delivery_dot_blender__pb2.DESCRIPTOR,])

_USECASE = _descriptor.EnumDescriptor(
  name='UseCase',
  full_name='delivery.UseCase',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN_USE_CASE', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CUSTOM', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SEARCH', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SEARCH_SUGGESTIONS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RELATED_CONTENT', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLOSE_UP', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CATEGORY_CONTENT', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MY_CONTENT', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MY_SAVED_CONTENT', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SELLER_CONTENT', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=875,
  serialized_end=1079,
)
_sym_db.RegisterEnumDescriptor(_USECASE)

UseCase = enum_type_wrapper.EnumTypeWrapper(_USECASE)
UNKNOWN_USE_CASE = 0
CUSTOM = 1
SEARCH = 2
SEARCH_SUGGESTIONS = 3
FEED = 4
RELATED_CONTENT = 5
CLOSE_UP = 6
CATEGORY_CONTENT = 7
MY_CONTENT = 8
MY_SAVED_CONTENT = 9
SELLER_CONTENT = 10



_REQUEST = _descriptor.Descriptor(
  name='Request',
  full_name='delivery.Request',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='platform_id', full_name='delivery.Request.platform_id', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_info', full_name='delivery.Request.user_info', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timing', full_name='delivery.Request.timing', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='delivery.Request.request_id', index=3,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='view_id', full_name='delivery.Request.view_id', index=4,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='session_id', full_name='delivery.Request.session_id', index=5,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='client_request_id', full_name='delivery.Request.client_request_id', index=6,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='use_case', full_name='delivery.Request.use_case', index=7,
      number=9, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search_query', full_name='delivery.Request.search_query', index=8,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='limit', full_name='delivery.Request.limit', index=9,
      number=15, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='insertion', full_name='delivery.Request.insertion', index=10,
      number=11, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='blender_config', full_name='delivery.Request.blender_config', index=11,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='properties', full_name='delivery.Request.properties', index=12,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=131,
  serialized_end=523,
)


_RESPONSE = _descriptor.Descriptor(
  name='Response',
  full_name='delivery.Response',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='insertion', full_name='delivery.Response.insertion', index=0,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=525,
  serialized_end=581,
)


_INSERTION = _descriptor.Descriptor(
  name='Insertion',
  full_name='delivery.Insertion',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='platform_id', full_name='delivery.Insertion.platform_id', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_info', full_name='delivery.Insertion.user_info', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timing', full_name='delivery.Insertion.timing', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='insertion_id', full_name='delivery.Insertion.insertion_id', index=3,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_id', full_name='delivery.Insertion.request_id', index=4,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='view_id', full_name='delivery.Insertion.view_id', index=5,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='session_id', full_name='delivery.Insertion.session_id', index=6,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content_id', full_name='delivery.Insertion.content_id', index=7,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='position', full_name='delivery.Insertion.position', index=8,
      number=12, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='properties', full_name='delivery.Insertion.properties', index=9,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=584,
  serialized_end=872,
)

_REQUEST.fields_by_name['user_info'].message_type = proto_dot_common_dot_common__pb2._USERINFO
_REQUEST.fields_by_name['timing'].message_type = proto_dot_common_dot_common__pb2._TIMING
_REQUEST.fields_by_name['use_case'].enum_type = _USECASE
_REQUEST.fields_by_name['insertion'].message_type = _INSERTION
_REQUEST.fields_by_name['blender_config'].message_type = proto_dot_delivery_dot_blender__pb2._BLENDERCONFIG
_REQUEST.fields_by_name['properties'].message_type = proto_dot_common_dot_common__pb2._PROPERTIES
_RESPONSE.fields_by_name['insertion'].message_type = _INSERTION
_INSERTION.fields_by_name['user_info'].message_type = proto_dot_common_dot_common__pb2._USERINFO
_INSERTION.fields_by_name['timing'].message_type = proto_dot_common_dot_common__pb2._TIMING
_INSERTION.fields_by_name['properties'].message_type = proto_dot_common_dot_common__pb2._PROPERTIES
DESCRIPTOR.message_types_by_name['Request'] = _REQUEST
DESCRIPTOR.message_types_by_name['Response'] = _RESPONSE
DESCRIPTOR.message_types_by_name['Insertion'] = _INSERTION
DESCRIPTOR.enum_types_by_name['UseCase'] = _USECASE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Request = _reflection.GeneratedProtocolMessageType('Request', (_message.Message,), {
  'DESCRIPTOR' : _REQUEST,
  '__module__' : 'proto.delivery.delivery_pb2'
  # @@protoc_insertion_point(class_scope:delivery.Request)
  })
_sym_db.RegisterMessage(Request)

Response = _reflection.GeneratedProtocolMessageType('Response', (_message.Message,), {
  'DESCRIPTOR' : _RESPONSE,
  '__module__' : 'proto.delivery.delivery_pb2'
  # @@protoc_insertion_point(class_scope:delivery.Response)
  })
_sym_db.RegisterMessage(Response)

Insertion = _reflection.GeneratedProtocolMessageType('Insertion', (_message.Message,), {
  'DESCRIPTOR' : _INSERTION,
  '__module__' : 'proto.delivery.delivery_pb2'
  # @@protoc_insertion_point(class_scope:delivery.Insertion)
  })
_sym_db.RegisterMessage(Insertion)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
