// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/execution.proto

#include "proto/delivery/execution.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>

PROTOBUF_PRAGMA_INIT_SEG
namespace delivery {
constexpr DeliveryLog::DeliveryLog(
  ::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized)
  : request_(nullptr)
  , response_(nullptr)
  , execution_(nullptr)
  , platform_id_(PROTOBUF_ULONGLONG(0)){}
struct DeliveryLogDefaultTypeInternal {
  constexpr DeliveryLogDefaultTypeInternal()
    : _instance(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized{}) {}
  ~DeliveryLogDefaultTypeInternal() {}
  union {
    DeliveryLog _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT DeliveryLogDefaultTypeInternal _DeliveryLog_default_instance_;
constexpr DeliveryExecution::DeliveryExecution(
  ::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized)
  : server_version_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , blender_config_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , hyperloop_log_(nullptr)
  , effective_user_info_(nullptr)
  , execution_server_(0)
{}
struct DeliveryExecutionDefaultTypeInternal {
  constexpr DeliveryExecutionDefaultTypeInternal()
    : _instance(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized{}) {}
  ~DeliveryExecutionDefaultTypeInternal() {}
  union {
    DeliveryExecution _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT DeliveryExecutionDefaultTypeInternal _DeliveryExecution_default_instance_;
}  // namespace delivery
static ::PROTOBUF_NAMESPACE_ID::Metadata file_level_metadata_proto_2fdelivery_2fexecution_2eproto[2];
static const ::PROTOBUF_NAMESPACE_ID::EnumDescriptor* file_level_enum_descriptors_proto_2fdelivery_2fexecution_2eproto[1];
static constexpr ::PROTOBUF_NAMESPACE_ID::ServiceDescriptor const** file_level_service_descriptors_proto_2fdelivery_2fexecution_2eproto = nullptr;

const ::PROTOBUF_NAMESPACE_ID::uint32 TableStruct_proto_2fdelivery_2fexecution_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryLog, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryLog, platform_id_),
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryLog, request_),
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryLog, response_),
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryLog, execution_),
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryExecution, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryExecution, execution_server_),
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryExecution, server_version_),
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryExecution, blender_config_),
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryExecution, hyperloop_log_),
  PROTOBUF_FIELD_OFFSET(::delivery::DeliveryExecution, effective_user_info_),
};
static const ::PROTOBUF_NAMESPACE_ID::internal::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, sizeof(::delivery::DeliveryLog)},
  { 9, -1, sizeof(::delivery::DeliveryExecution)},
};

static ::PROTOBUF_NAMESPACE_ID::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::delivery::_DeliveryLog_default_instance_),
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::delivery::_DeliveryExecution_default_instance_),
};

const char descriptor_table_protodef_proto_2fdelivery_2fexecution_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\036proto/delivery/execution.proto\022\010delive"
  "ry\032\031proto/common/common.proto\032\034proto/del"
  "ivery/blender.proto\032\035proto/delivery/deli"
  "very.proto\"\306\001\n\013DeliveryLog\022\037\n\013platform_i"
  "d\030\001 \001(\004R\nplatformId\022+\n\007request\030\002 \001(\0132\021.d"
  "elivery.RequestR\007request\022.\n\010response\030\003 \001"
  "(\0132\022.delivery.ResponseR\010response\0229\n\texec"
  "ution\030\004 \001(\0132\033.delivery.DeliveryExecution"
  "R\texecution\"\334\002\n\021DeliveryExecution\022D\n\020exe"
  "cution_server\030\002 \001(\0162\031.delivery.Execution"
  "ServerR\017executionServer\022%\n\016server_versio"
  "n\030\007 \001(\tR\rserverVersion\022%\n\016blender_config"
  "\030\014 \001(\tR\rblenderConfig\022;\n\rhyperloop_log\030\r"
  " \001(\0132\026.delivery.HyperloopLogR\014hyperloopL"
  "og\022@\n\023effective_user_info\030\017 \001(\0132\020.common"
  ".UserInfoR\021effectiveUserInfoJ\004\010\001\020\002J\004\010\003\020\004"
  "J\004\010\013\020\014J\004\010\004\020\005J\004\010\005\020\006J\004\010\006\020\007J\004\010\010\020\tJ\004\010\t\020\nJ\004\010\n"
  "\020\013*>\n\017ExecutionServer\022\034\n\030UNKNOWN_EXECUTI"
  "ON_SERVER\020\000\022\007\n\003SDK\020\002\"\004\010\003\020\003B\202\001\n\032ai.promot"
  "ed.proto.deliveryB\024DeliveryExecutionLogP"
  "\001Z8github.com/promotedai/schema/generate"
  "d/go/proto/delivery\252\002\021Promoted.Deliveryb"
  "\006proto3"
  ;
static const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable*const descriptor_table_proto_2fdelivery_2fexecution_2eproto_deps[3] = {
  &::descriptor_table_proto_2fcommon_2fcommon_2eproto,
  &::descriptor_table_proto_2fdelivery_2fblender_2eproto,
  &::descriptor_table_proto_2fdelivery_2fdelivery_2eproto,
};
static ::PROTOBUF_NAMESPACE_ID::internal::once_flag descriptor_table_proto_2fdelivery_2fexecution_2eproto_once;
const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_proto_2fdelivery_2fexecution_2eproto = {
  false, false, 887, descriptor_table_protodef_proto_2fdelivery_2fexecution_2eproto, "proto/delivery/execution.proto", 
  &descriptor_table_proto_2fdelivery_2fexecution_2eproto_once, descriptor_table_proto_2fdelivery_2fexecution_2eproto_deps, 3, 2,
  schemas, file_default_instances, TableStruct_proto_2fdelivery_2fexecution_2eproto::offsets,
  file_level_metadata_proto_2fdelivery_2fexecution_2eproto, file_level_enum_descriptors_proto_2fdelivery_2fexecution_2eproto, file_level_service_descriptors_proto_2fdelivery_2fexecution_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK ::PROTOBUF_NAMESPACE_ID::Metadata
descriptor_table_proto_2fdelivery_2fexecution_2eproto_metadata_getter(int index) {
  ::PROTOBUF_NAMESPACE_ID::internal::AssignDescriptors(&descriptor_table_proto_2fdelivery_2fexecution_2eproto);
  return descriptor_table_proto_2fdelivery_2fexecution_2eproto.file_level_metadata[index];
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY static ::PROTOBUF_NAMESPACE_ID::internal::AddDescriptorsRunner dynamic_init_dummy_proto_2fdelivery_2fexecution_2eproto(&descriptor_table_proto_2fdelivery_2fexecution_2eproto);
namespace delivery {
const ::PROTOBUF_NAMESPACE_ID::EnumDescriptor* ExecutionServer_descriptor() {
  ::PROTOBUF_NAMESPACE_ID::internal::AssignDescriptors(&descriptor_table_proto_2fdelivery_2fexecution_2eproto);
  return file_level_enum_descriptors_proto_2fdelivery_2fexecution_2eproto[0];
}
bool ExecutionServer_IsValid(int value) {
  switch (value) {
    case 0:
    case 2:
      return true;
    default:
      return false;
  }
}


// ===================================================================

class DeliveryLog::_Internal {
 public:
  static const ::delivery::Request& request(const DeliveryLog* msg);
  static const ::delivery::Response& response(const DeliveryLog* msg);
  static const ::delivery::DeliveryExecution& execution(const DeliveryLog* msg);
};

const ::delivery::Request&
DeliveryLog::_Internal::request(const DeliveryLog* msg) {
  return *msg->request_;
}
const ::delivery::Response&
DeliveryLog::_Internal::response(const DeliveryLog* msg) {
  return *msg->response_;
}
const ::delivery::DeliveryExecution&
DeliveryLog::_Internal::execution(const DeliveryLog* msg) {
  return *msg->execution_;
}
void DeliveryLog::clear_request() {
  if (GetArena() == nullptr && request_ != nullptr) {
    delete request_;
  }
  request_ = nullptr;
}
void DeliveryLog::clear_response() {
  if (GetArena() == nullptr && response_ != nullptr) {
    delete response_;
  }
  response_ = nullptr;
}
DeliveryLog::DeliveryLog(::PROTOBUF_NAMESPACE_ID::Arena* arena)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena) {
  SharedCtor();
  RegisterArenaDtor(arena);
  // @@protoc_insertion_point(arena_constructor:delivery.DeliveryLog)
}
DeliveryLog::DeliveryLog(const DeliveryLog& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  if (from._internal_has_request()) {
    request_ = new ::delivery::Request(*from.request_);
  } else {
    request_ = nullptr;
  }
  if (from._internal_has_response()) {
    response_ = new ::delivery::Response(*from.response_);
  } else {
    response_ = nullptr;
  }
  if (from._internal_has_execution()) {
    execution_ = new ::delivery::DeliveryExecution(*from.execution_);
  } else {
    execution_ = nullptr;
  }
  platform_id_ = from.platform_id_;
  // @@protoc_insertion_point(copy_constructor:delivery.DeliveryLog)
}

void DeliveryLog::SharedCtor() {
::memset(reinterpret_cast<char*>(this) + static_cast<size_t>(
    reinterpret_cast<char*>(&request_) - reinterpret_cast<char*>(this)),
    0, static_cast<size_t>(reinterpret_cast<char*>(&platform_id_) -
    reinterpret_cast<char*>(&request_)) + sizeof(platform_id_));
}

DeliveryLog::~DeliveryLog() {
  // @@protoc_insertion_point(destructor:delivery.DeliveryLog)
  SharedDtor();
  _internal_metadata_.Delete<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

void DeliveryLog::SharedDtor() {
  GOOGLE_DCHECK(GetArena() == nullptr);
  if (this != internal_default_instance()) delete request_;
  if (this != internal_default_instance()) delete response_;
  if (this != internal_default_instance()) delete execution_;
}

void DeliveryLog::ArenaDtor(void* object) {
  DeliveryLog* _this = reinterpret_cast< DeliveryLog* >(object);
  (void)_this;
}
void DeliveryLog::RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena*) {
}
void DeliveryLog::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}

void DeliveryLog::Clear() {
// @@protoc_insertion_point(message_clear_start:delivery.DeliveryLog)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  if (GetArena() == nullptr && request_ != nullptr) {
    delete request_;
  }
  request_ = nullptr;
  if (GetArena() == nullptr && response_ != nullptr) {
    delete response_;
  }
  response_ = nullptr;
  if (GetArena() == nullptr && execution_ != nullptr) {
    delete execution_;
  }
  execution_ = nullptr;
  platform_id_ = PROTOBUF_ULONGLONG(0);
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* DeliveryLog::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    ::PROTOBUF_NAMESPACE_ID::uint32 tag;
    ptr = ::PROTOBUF_NAMESPACE_ID::internal::ReadTag(ptr, &tag);
    CHK_(ptr);
    switch (tag >> 3) {
      // uint64 platform_id = 1 [json_name = "platformId"];
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 8)) {
          platform_id_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // .delivery.Request request = 2 [json_name = "request"];
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 18)) {
          ptr = ctx->ParseMessage(_internal_mutable_request(), ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // .delivery.Response response = 3 [json_name = "response"];
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 26)) {
          ptr = ctx->ParseMessage(_internal_mutable_response(), ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // .delivery.DeliveryExecution execution = 4 [json_name = "execution"];
      case 4:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 34)) {
          ptr = ctx->ParseMessage(_internal_mutable_execution(), ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      default: {
      handle_unusual:
        if ((tag & 7) == 4 || tag == 0) {
          ctx->SetLastTag(tag);
          goto success;
        }
        ptr = UnknownFieldParse(tag,
            _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
            ptr, ctx);
        CHK_(ptr != nullptr);
        continue;
      }
    }  // switch
  }  // while
success:
  return ptr;
failure:
  ptr = nullptr;
  goto success;
#undef CHK_
}

::PROTOBUF_NAMESPACE_ID::uint8* DeliveryLog::_InternalSerialize(
    ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:delivery.DeliveryLog)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // uint64 platform_id = 1 [json_name = "platformId"];
  if (this->platform_id() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(1, this->_internal_platform_id(), target);
  }

  // .delivery.Request request = 2 [json_name = "request"];
  if (this->has_request()) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(
        2, _Internal::request(this), target, stream);
  }

  // .delivery.Response response = 3 [json_name = "response"];
  if (this->has_response()) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(
        3, _Internal::response(this), target, stream);
  }

  // .delivery.DeliveryExecution execution = 4 [json_name = "execution"];
  if (this->has_execution()) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(
        4, _Internal::execution(this), target, stream);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:delivery.DeliveryLog)
  return target;
}

size_t DeliveryLog::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:delivery.DeliveryLog)
  size_t total_size = 0;

  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // .delivery.Request request = 2 [json_name = "request"];
  if (this->has_request()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
        *request_);
  }

  // .delivery.Response response = 3 [json_name = "response"];
  if (this->has_response()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
        *response_);
  }

  // .delivery.DeliveryExecution execution = 4 [json_name = "execution"];
  if (this->has_execution()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
        *execution_);
  }

  // uint64 platform_id = 1 [json_name = "platformId"];
  if (this->platform_id() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_platform_id());
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    return ::PROTOBUF_NAMESPACE_ID::internal::ComputeUnknownFieldsSize(
        _internal_metadata_, total_size, &_cached_size_);
  }
  int cached_size = ::PROTOBUF_NAMESPACE_ID::internal::ToCachedSize(total_size);
  SetCachedSize(cached_size);
  return total_size;
}

void DeliveryLog::MergeFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:delivery.DeliveryLog)
  GOOGLE_DCHECK_NE(&from, this);
  const DeliveryLog* source =
      ::PROTOBUF_NAMESPACE_ID::DynamicCastToGenerated<DeliveryLog>(
          &from);
  if (source == nullptr) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:delivery.DeliveryLog)
    ::PROTOBUF_NAMESPACE_ID::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:delivery.DeliveryLog)
    MergeFrom(*source);
  }
}

void DeliveryLog::MergeFrom(const DeliveryLog& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:delivery.DeliveryLog)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (from.has_request()) {
    _internal_mutable_request()->::delivery::Request::MergeFrom(from._internal_request());
  }
  if (from.has_response()) {
    _internal_mutable_response()->::delivery::Response::MergeFrom(from._internal_response());
  }
  if (from.has_execution()) {
    _internal_mutable_execution()->::delivery::DeliveryExecution::MergeFrom(from._internal_execution());
  }
  if (from.platform_id() != 0) {
    _internal_set_platform_id(from._internal_platform_id());
  }
}

void DeliveryLog::CopyFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:delivery.DeliveryLog)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void DeliveryLog::CopyFrom(const DeliveryLog& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:delivery.DeliveryLog)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool DeliveryLog::IsInitialized() const {
  return true;
}

void DeliveryLog::InternalSwap(DeliveryLog* other) {
  using std::swap;
  _internal_metadata_.Swap<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(&other->_internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::internal::memswap<
      PROTOBUF_FIELD_OFFSET(DeliveryLog, platform_id_)
      + sizeof(DeliveryLog::platform_id_)
      - PROTOBUF_FIELD_OFFSET(DeliveryLog, request_)>(
          reinterpret_cast<char*>(&request_),
          reinterpret_cast<char*>(&other->request_));
}

::PROTOBUF_NAMESPACE_ID::Metadata DeliveryLog::GetMetadata() const {
  return GetMetadataStatic();
}


// ===================================================================

class DeliveryExecution::_Internal {
 public:
  static const ::delivery::HyperloopLog& hyperloop_log(const DeliveryExecution* msg);
  static const ::common::UserInfo& effective_user_info(const DeliveryExecution* msg);
};

const ::delivery::HyperloopLog&
DeliveryExecution::_Internal::hyperloop_log(const DeliveryExecution* msg) {
  return *msg->hyperloop_log_;
}
const ::common::UserInfo&
DeliveryExecution::_Internal::effective_user_info(const DeliveryExecution* msg) {
  return *msg->effective_user_info_;
}
void DeliveryExecution::clear_hyperloop_log() {
  if (GetArena() == nullptr && hyperloop_log_ != nullptr) {
    delete hyperloop_log_;
  }
  hyperloop_log_ = nullptr;
}
void DeliveryExecution::clear_effective_user_info() {
  if (GetArena() == nullptr && effective_user_info_ != nullptr) {
    delete effective_user_info_;
  }
  effective_user_info_ = nullptr;
}
DeliveryExecution::DeliveryExecution(::PROTOBUF_NAMESPACE_ID::Arena* arena)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena) {
  SharedCtor();
  RegisterArenaDtor(arena);
  // @@protoc_insertion_point(arena_constructor:delivery.DeliveryExecution)
}
DeliveryExecution::DeliveryExecution(const DeliveryExecution& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  server_version_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_server_version().empty()) {
    server_version_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_server_version(), 
      GetArena());
  }
  blender_config_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_blender_config().empty()) {
    blender_config_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_blender_config(), 
      GetArena());
  }
  if (from._internal_has_hyperloop_log()) {
    hyperloop_log_ = new ::delivery::HyperloopLog(*from.hyperloop_log_);
  } else {
    hyperloop_log_ = nullptr;
  }
  if (from._internal_has_effective_user_info()) {
    effective_user_info_ = new ::common::UserInfo(*from.effective_user_info_);
  } else {
    effective_user_info_ = nullptr;
  }
  execution_server_ = from.execution_server_;
  // @@protoc_insertion_point(copy_constructor:delivery.DeliveryExecution)
}

void DeliveryExecution::SharedCtor() {
server_version_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
blender_config_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
::memset(reinterpret_cast<char*>(this) + static_cast<size_t>(
    reinterpret_cast<char*>(&hyperloop_log_) - reinterpret_cast<char*>(this)),
    0, static_cast<size_t>(reinterpret_cast<char*>(&execution_server_) -
    reinterpret_cast<char*>(&hyperloop_log_)) + sizeof(execution_server_));
}

DeliveryExecution::~DeliveryExecution() {
  // @@protoc_insertion_point(destructor:delivery.DeliveryExecution)
  SharedDtor();
  _internal_metadata_.Delete<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

void DeliveryExecution::SharedDtor() {
  GOOGLE_DCHECK(GetArena() == nullptr);
  server_version_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  blender_config_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (this != internal_default_instance()) delete hyperloop_log_;
  if (this != internal_default_instance()) delete effective_user_info_;
}

void DeliveryExecution::ArenaDtor(void* object) {
  DeliveryExecution* _this = reinterpret_cast< DeliveryExecution* >(object);
  (void)_this;
}
void DeliveryExecution::RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena*) {
}
void DeliveryExecution::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}

void DeliveryExecution::Clear() {
// @@protoc_insertion_point(message_clear_start:delivery.DeliveryExecution)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  server_version_.ClearToEmpty();
  blender_config_.ClearToEmpty();
  if (GetArena() == nullptr && hyperloop_log_ != nullptr) {
    delete hyperloop_log_;
  }
  hyperloop_log_ = nullptr;
  if (GetArena() == nullptr && effective_user_info_ != nullptr) {
    delete effective_user_info_;
  }
  effective_user_info_ = nullptr;
  execution_server_ = 0;
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* DeliveryExecution::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    ::PROTOBUF_NAMESPACE_ID::uint32 tag;
    ptr = ::PROTOBUF_NAMESPACE_ID::internal::ReadTag(ptr, &tag);
    CHK_(ptr);
    switch (tag >> 3) {
      // .delivery.ExecutionServer execution_server = 2 [json_name = "executionServer"];
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 16)) {
          ::PROTOBUF_NAMESPACE_ID::uint64 val = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
          _internal_set_execution_server(static_cast<::delivery::ExecutionServer>(val));
        } else goto handle_unusual;
        continue;
      // string server_version = 7 [json_name = "serverVersion"];
      case 7:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 58)) {
          auto str = _internal_mutable_server_version();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "delivery.DeliveryExecution.server_version"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // string blender_config = 12 [json_name = "blenderConfig"];
      case 12:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 98)) {
          auto str = _internal_mutable_blender_config();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "delivery.DeliveryExecution.blender_config"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // .delivery.HyperloopLog hyperloop_log = 13 [json_name = "hyperloopLog"];
      case 13:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 106)) {
          ptr = ctx->ParseMessage(_internal_mutable_hyperloop_log(), ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // .common.UserInfo effective_user_info = 15 [json_name = "effectiveUserInfo"];
      case 15:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 122)) {
          ptr = ctx->ParseMessage(_internal_mutable_effective_user_info(), ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      default: {
      handle_unusual:
        if ((tag & 7) == 4 || tag == 0) {
          ctx->SetLastTag(tag);
          goto success;
        }
        ptr = UnknownFieldParse(tag,
            _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
            ptr, ctx);
        CHK_(ptr != nullptr);
        continue;
      }
    }  // switch
  }  // while
success:
  return ptr;
failure:
  ptr = nullptr;
  goto success;
#undef CHK_
}

::PROTOBUF_NAMESPACE_ID::uint8* DeliveryExecution::_InternalSerialize(
    ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:delivery.DeliveryExecution)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // .delivery.ExecutionServer execution_server = 2 [json_name = "executionServer"];
  if (this->execution_server() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteEnumToArray(
      2, this->_internal_execution_server(), target);
  }

  // string server_version = 7 [json_name = "serverVersion"];
  if (this->server_version().size() > 0) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_server_version().data(), static_cast<int>(this->_internal_server_version().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "delivery.DeliveryExecution.server_version");
    target = stream->WriteStringMaybeAliased(
        7, this->_internal_server_version(), target);
  }

  // string blender_config = 12 [json_name = "blenderConfig"];
  if (this->blender_config().size() > 0) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_blender_config().data(), static_cast<int>(this->_internal_blender_config().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "delivery.DeliveryExecution.blender_config");
    target = stream->WriteStringMaybeAliased(
        12, this->_internal_blender_config(), target);
  }

  // .delivery.HyperloopLog hyperloop_log = 13 [json_name = "hyperloopLog"];
  if (this->has_hyperloop_log()) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(
        13, _Internal::hyperloop_log(this), target, stream);
  }

  // .common.UserInfo effective_user_info = 15 [json_name = "effectiveUserInfo"];
  if (this->has_effective_user_info()) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::
      InternalWriteMessage(
        15, _Internal::effective_user_info(this), target, stream);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:delivery.DeliveryExecution)
  return target;
}

size_t DeliveryExecution::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:delivery.DeliveryExecution)
  size_t total_size = 0;

  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string server_version = 7 [json_name = "serverVersion"];
  if (this->server_version().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_server_version());
  }

  // string blender_config = 12 [json_name = "blenderConfig"];
  if (this->blender_config().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_blender_config());
  }

  // .delivery.HyperloopLog hyperloop_log = 13 [json_name = "hyperloopLog"];
  if (this->has_hyperloop_log()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
        *hyperloop_log_);
  }

  // .common.UserInfo effective_user_info = 15 [json_name = "effectiveUserInfo"];
  if (this->has_effective_user_info()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::MessageSize(
        *effective_user_info_);
  }

  // .delivery.ExecutionServer execution_server = 2 [json_name = "executionServer"];
  if (this->execution_server() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::EnumSize(this->_internal_execution_server());
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    return ::PROTOBUF_NAMESPACE_ID::internal::ComputeUnknownFieldsSize(
        _internal_metadata_, total_size, &_cached_size_);
  }
  int cached_size = ::PROTOBUF_NAMESPACE_ID::internal::ToCachedSize(total_size);
  SetCachedSize(cached_size);
  return total_size;
}

void DeliveryExecution::MergeFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:delivery.DeliveryExecution)
  GOOGLE_DCHECK_NE(&from, this);
  const DeliveryExecution* source =
      ::PROTOBUF_NAMESPACE_ID::DynamicCastToGenerated<DeliveryExecution>(
          &from);
  if (source == nullptr) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:delivery.DeliveryExecution)
    ::PROTOBUF_NAMESPACE_ID::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:delivery.DeliveryExecution)
    MergeFrom(*source);
  }
}

void DeliveryExecution::MergeFrom(const DeliveryExecution& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:delivery.DeliveryExecution)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (from.server_version().size() > 0) {
    _internal_set_server_version(from._internal_server_version());
  }
  if (from.blender_config().size() > 0) {
    _internal_set_blender_config(from._internal_blender_config());
  }
  if (from.has_hyperloop_log()) {
    _internal_mutable_hyperloop_log()->::delivery::HyperloopLog::MergeFrom(from._internal_hyperloop_log());
  }
  if (from.has_effective_user_info()) {
    _internal_mutable_effective_user_info()->::common::UserInfo::MergeFrom(from._internal_effective_user_info());
  }
  if (from.execution_server() != 0) {
    _internal_set_execution_server(from._internal_execution_server());
  }
}

void DeliveryExecution::CopyFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:delivery.DeliveryExecution)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void DeliveryExecution::CopyFrom(const DeliveryExecution& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:delivery.DeliveryExecution)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool DeliveryExecution::IsInitialized() const {
  return true;
}

void DeliveryExecution::InternalSwap(DeliveryExecution* other) {
  using std::swap;
  _internal_metadata_.Swap<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(&other->_internal_metadata_);
  server_version_.Swap(&other->server_version_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArena());
  blender_config_.Swap(&other->blender_config_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArena());
  ::PROTOBUF_NAMESPACE_ID::internal::memswap<
      PROTOBUF_FIELD_OFFSET(DeliveryExecution, execution_server_)
      + sizeof(DeliveryExecution::execution_server_)
      - PROTOBUF_FIELD_OFFSET(DeliveryExecution, hyperloop_log_)>(
          reinterpret_cast<char*>(&hyperloop_log_),
          reinterpret_cast<char*>(&other->hyperloop_log_));
}

::PROTOBUF_NAMESPACE_ID::Metadata DeliveryExecution::GetMetadata() const {
  return GetMetadataStatic();
}


// @@protoc_insertion_point(namespace_scope)
}  // namespace delivery
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::delivery::DeliveryLog* Arena::CreateMaybeMessage< ::delivery::DeliveryLog >(Arena* arena) {
  return Arena::CreateMessageInternal< ::delivery::DeliveryLog >(arena);
}
template<> PROTOBUF_NOINLINE ::delivery::DeliveryExecution* Arena::CreateMaybeMessage< ::delivery::DeliveryExecution >(Arena* arena) {
  return Arena::CreateMessageInternal< ::delivery::DeliveryExecution >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
