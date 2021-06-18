# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/common/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/common/common.proto',
  package='common',
  syntax='proto3',
  serialized_options=b'\n\030ai.promoted.proto.commonB\013CommonProtoP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x19proto/common/common.proto\x12\x06\x63ommon\x1a\x1cgoogle/protobuf/struct.proto\"\x89\x01\n\nEntityPath\x12\x13\n\x0bplatform_id\x18\x01 \x01(\x04\x12\x13\n\x0b\x63ustomer_id\x18\x02 \x01(\x04\x12\x12\n\naccount_id\x18\x04 \x01(\x04\x12\x13\n\x0b\x63\x61mpaign_id\x18\x05 \x01(\x04\x12\x14\n\x0cpromotion_id\x18\x06 \x01(\x04\x12\x12\n\ncontent_id\x18\x03 \x01(\x04\"0\n\x08UserInfo\x12\x0f\n\x07user_id\x18\x01 \x01(\t\x12\x13\n\x0blog_user_id\x18\x02 \x01(\t\"\xa7\x02\n\nClientInfo\x12\x32\n\x0b\x63lient_type\x18\x01 \x01(\x0e\x32\x1d.common.ClientInfo.ClientType\x12\x34\n\x0ctraffic_type\x18\x02 \x01(\x0e\x32\x1e.common.ClientInfo.TrafficType\"X\n\nClientType\x12\x1a\n\x16UNKNOWN_REQUEST_CLIENT\x10\x00\x12\x13\n\x0fPLATFORM_SERVER\x10\x01\x12\x13\n\x0fPLATFORM_CLIENT\x10\x02\"\x04\x08\x03\x10\x04\"U\n\x0bTrafficType\x12\x18\n\x14UNKNOWN_TRAFFIC_TYPE\x10\x00\x12\x0e\n\nPRODUCTION\x10\x01\x12\n\n\x06REPLAY\x10\x02\x12\n\n\x06SHADOW\x10\x04\"\x04\x08\x03\x10\x03\"2\n\x06Timing\x12\x1c\n\x14\x63lient_log_timestamp\x18\x01 \x01(\x04J\x04\x08\x02\x10\x03J\x04\x08\x03\x10\x04\"e\n\nProperties\x12\x16\n\x0cstruct_bytes\x18\x01 \x01(\x0cH\x00\x12)\n\x06struct\x18\x02 \x01(\x0b\x32\x17.google.protobuf.StructH\x00\x42\x0e\n\x0cstruct_fieldJ\x04\x08\x03\x10\x04*\xdd\x01\n\x0c\x43urrencyCode\x12\x19\n\x15UNKNOWN_CURRENCY_CODE\x10\x00\x12\x07\n\x03USD\x10\x01\x12\x07\n\x03\x45UR\x10\x02\x12\x07\n\x03JPY\x10\x03\x12\x07\n\x03GBP\x10\x04\x12\x07\n\x03\x41UD\x10\x05\x12\x07\n\x03\x43\x41\x44\x10\x06\x12\x07\n\x03\x43HF\x10\x07\x12\x07\n\x03\x43NY\x10\x08\x12\x07\n\x03HKD\x10\t\x12\x07\n\x03NZD\x10\n\x12\x07\n\x03SEK\x10\x0b\x12\x07\n\x03KRW\x10\x0c\x12\x07\n\x03SGD\x10\r\x12\x07\n\x03NOK\x10\x0e\x12\x07\n\x03MXN\x10\x0f\x12\x07\n\x03INR\x10\x10\x12\x07\n\x03RUB\x10\x11\x12\x07\n\x03ZAR\x10\x12\x12\x07\n\x03TRY\x10\x13\x12\x07\n\x03\x42RL\x10\x14\x42)\n\x18\x61i.promoted.proto.commonB\x0b\x43ommonProtoP\x01\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,])

_CURRENCYCODE = _descriptor.EnumDescriptor(
  name='CurrencyCode',
  full_name='common.CurrencyCode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN_CURRENCY_CODE', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='USD', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EUR', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='JPY', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GBP', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUD', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAD', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CHF', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CNY', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HKD', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NZD', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SEK', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KRW', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SGD', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NOK', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MXN', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INR', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RUB', index=17, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ZAR', index=18, number=18,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TRY', index=19, number=19,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BRL', index=20, number=20,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=711,
  serialized_end=932,
)
_sym_db.RegisterEnumDescriptor(_CURRENCYCODE)

CurrencyCode = enum_type_wrapper.EnumTypeWrapper(_CURRENCYCODE)
UNKNOWN_CURRENCY_CODE = 0
USD = 1
EUR = 2
JPY = 3
GBP = 4
AUD = 5
CAD = 6
CHF = 7
CNY = 8
HKD = 9
NZD = 10
SEK = 11
KRW = 12
SGD = 13
NOK = 14
MXN = 15
INR = 16
RUB = 17
ZAR = 18
TRY = 19
BRL = 20


_CLIENTINFO_CLIENTTYPE = _descriptor.EnumDescriptor(
  name='ClientType',
  full_name='common.ClientInfo.ClientType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN_REQUEST_CLIENT', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PLATFORM_SERVER', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PLATFORM_CLIENT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=378,
  serialized_end=466,
)
_sym_db.RegisterEnumDescriptor(_CLIENTINFO_CLIENTTYPE)

_CLIENTINFO_TRAFFICTYPE = _descriptor.EnumDescriptor(
  name='TrafficType',
  full_name='common.ClientInfo.TrafficType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN_TRAFFIC_TYPE', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PRODUCTION', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REPLAY', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SHADOW', index=3, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=468,
  serialized_end=553,
)
_sym_db.RegisterEnumDescriptor(_CLIENTINFO_TRAFFICTYPE)


_ENTITYPATH = _descriptor.Descriptor(
  name='EntityPath',
  full_name='common.EntityPath',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='platform_id', full_name='common.EntityPath.platform_id', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='customer_id', full_name='common.EntityPath.customer_id', index=1,
      number=2, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='account_id', full_name='common.EntityPath.account_id', index=2,
      number=4, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign_id', full_name='common.EntityPath.campaign_id', index=3,
      number=5, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='promotion_id', full_name='common.EntityPath.promotion_id', index=4,
      number=6, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content_id', full_name='common.EntityPath.content_id', index=5,
      number=3, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=68,
  serialized_end=205,
)


_USERINFO = _descriptor.Descriptor(
  name='UserInfo',
  full_name='common.UserInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='common.UserInfo.user_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='log_user_id', full_name='common.UserInfo.log_user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=207,
  serialized_end=255,
)


_CLIENTINFO = _descriptor.Descriptor(
  name='ClientInfo',
  full_name='common.ClientInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='client_type', full_name='common.ClientInfo.client_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='traffic_type', full_name='common.ClientInfo.traffic_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CLIENTINFO_CLIENTTYPE,
    _CLIENTINFO_TRAFFICTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=258,
  serialized_end=553,
)


_TIMING = _descriptor.Descriptor(
  name='Timing',
  full_name='common.Timing',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='client_log_timestamp', full_name='common.Timing.client_log_timestamp', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=555,
  serialized_end=605,
)


_PROPERTIES = _descriptor.Descriptor(
  name='Properties',
  full_name='common.Properties',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='struct_bytes', full_name='common.Properties.struct_bytes', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='struct', full_name='common.Properties.struct', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='struct_field', full_name='common.Properties.struct_field',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=607,
  serialized_end=708,
)

_CLIENTINFO.fields_by_name['client_type'].enum_type = _CLIENTINFO_CLIENTTYPE
_CLIENTINFO.fields_by_name['traffic_type'].enum_type = _CLIENTINFO_TRAFFICTYPE
_CLIENTINFO_CLIENTTYPE.containing_type = _CLIENTINFO
_CLIENTINFO_TRAFFICTYPE.containing_type = _CLIENTINFO
_PROPERTIES.fields_by_name['struct'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_PROPERTIES.oneofs_by_name['struct_field'].fields.append(
  _PROPERTIES.fields_by_name['struct_bytes'])
_PROPERTIES.fields_by_name['struct_bytes'].containing_oneof = _PROPERTIES.oneofs_by_name['struct_field']
_PROPERTIES.oneofs_by_name['struct_field'].fields.append(
  _PROPERTIES.fields_by_name['struct'])
_PROPERTIES.fields_by_name['struct'].containing_oneof = _PROPERTIES.oneofs_by_name['struct_field']
DESCRIPTOR.message_types_by_name['EntityPath'] = _ENTITYPATH
DESCRIPTOR.message_types_by_name['UserInfo'] = _USERINFO
DESCRIPTOR.message_types_by_name['ClientInfo'] = _CLIENTINFO
DESCRIPTOR.message_types_by_name['Timing'] = _TIMING
DESCRIPTOR.message_types_by_name['Properties'] = _PROPERTIES
DESCRIPTOR.enum_types_by_name['CurrencyCode'] = _CURRENCYCODE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

EntityPath = _reflection.GeneratedProtocolMessageType('EntityPath', (_message.Message,), {
  'DESCRIPTOR' : _ENTITYPATH,
  '__module__' : 'proto.common.common_pb2'
  # @@protoc_insertion_point(class_scope:common.EntityPath)
  })
_sym_db.RegisterMessage(EntityPath)

UserInfo = _reflection.GeneratedProtocolMessageType('UserInfo', (_message.Message,), {
  'DESCRIPTOR' : _USERINFO,
  '__module__' : 'proto.common.common_pb2'
  # @@protoc_insertion_point(class_scope:common.UserInfo)
  })
_sym_db.RegisterMessage(UserInfo)

ClientInfo = _reflection.GeneratedProtocolMessageType('ClientInfo', (_message.Message,), {
  'DESCRIPTOR' : _CLIENTINFO,
  '__module__' : 'proto.common.common_pb2'
  # @@protoc_insertion_point(class_scope:common.ClientInfo)
  })
_sym_db.RegisterMessage(ClientInfo)

Timing = _reflection.GeneratedProtocolMessageType('Timing', (_message.Message,), {
  'DESCRIPTOR' : _TIMING,
  '__module__' : 'proto.common.common_pb2'
  # @@protoc_insertion_point(class_scope:common.Timing)
  })
_sym_db.RegisterMessage(Timing)

Properties = _reflection.GeneratedProtocolMessageType('Properties', (_message.Message,), {
  'DESCRIPTOR' : _PROPERTIES,
  '__module__' : 'proto.common.common_pb2'
  # @@protoc_insertion_point(class_scope:common.Properties)
  })
_sym_db.RegisterMessage(Properties)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
