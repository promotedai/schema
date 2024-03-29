// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/retained_user.proto

#include "proto/common/retained_user.pb.h"

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
namespace common {
constexpr RetainedUser::RetainedUser(
  ::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized)
  : user_id_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , retained_user_id_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , platform_id_(PROTOBUF_ULONGLONG(0))
  , create_event_api_time_millis_(PROTOBUF_ULONGLONG(0))
  , process_time_millis_(PROTOBUF_ULONGLONG(0))
  , last_forgotten_time_millis_(PROTOBUF_ULONGLONG(0)){}
struct RetainedUserDefaultTypeInternal {
  constexpr RetainedUserDefaultTypeInternal()
    : _instance(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized{}) {}
  ~RetainedUserDefaultTypeInternal() {}
  union {
    RetainedUser _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT RetainedUserDefaultTypeInternal _RetainedUser_default_instance_;
constexpr AnonUserRetainedUser::AnonUserRetainedUser(
  ::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized)
  : anon_user_id_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , retained_user_id_(&::PROTOBUF_NAMESPACE_ID::internal::fixed_address_empty_string)
  , platform_id_(PROTOBUF_ULONGLONG(0))
  , event_time_millis_(PROTOBUF_ULONGLONG(0))
  , process_time_millis_(PROTOBUF_ULONGLONG(0)){}
struct AnonUserRetainedUserDefaultTypeInternal {
  constexpr AnonUserRetainedUserDefaultTypeInternal()
    : _instance(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized{}) {}
  ~AnonUserRetainedUserDefaultTypeInternal() {}
  union {
    AnonUserRetainedUser _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT AnonUserRetainedUserDefaultTypeInternal _AnonUserRetainedUser_default_instance_;
}  // namespace common
static ::PROTOBUF_NAMESPACE_ID::Metadata file_level_metadata_proto_2fcommon_2fretained_5fuser_2eproto[2];
static constexpr ::PROTOBUF_NAMESPACE_ID::EnumDescriptor const** file_level_enum_descriptors_proto_2fcommon_2fretained_5fuser_2eproto = nullptr;
static constexpr ::PROTOBUF_NAMESPACE_ID::ServiceDescriptor const** file_level_service_descriptors_proto_2fcommon_2fretained_5fuser_2eproto = nullptr;

const ::PROTOBUF_NAMESPACE_ID::uint32 TableStruct_proto_2fcommon_2fretained_5fuser_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::common::RetainedUser, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  PROTOBUF_FIELD_OFFSET(::common::RetainedUser, platform_id_),
  PROTOBUF_FIELD_OFFSET(::common::RetainedUser, user_id_),
  PROTOBUF_FIELD_OFFSET(::common::RetainedUser, retained_user_id_),
  PROTOBUF_FIELD_OFFSET(::common::RetainedUser, create_event_api_time_millis_),
  PROTOBUF_FIELD_OFFSET(::common::RetainedUser, process_time_millis_),
  PROTOBUF_FIELD_OFFSET(::common::RetainedUser, last_forgotten_time_millis_),
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::common::AnonUserRetainedUser, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  PROTOBUF_FIELD_OFFSET(::common::AnonUserRetainedUser, platform_id_),
  PROTOBUF_FIELD_OFFSET(::common::AnonUserRetainedUser, anon_user_id_),
  PROTOBUF_FIELD_OFFSET(::common::AnonUserRetainedUser, retained_user_id_),
  PROTOBUF_FIELD_OFFSET(::common::AnonUserRetainedUser, event_time_millis_),
  PROTOBUF_FIELD_OFFSET(::common::AnonUserRetainedUser, process_time_millis_),
};
static const ::PROTOBUF_NAMESPACE_ID::internal::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, sizeof(::common::RetainedUser)},
  { 11, -1, sizeof(::common::AnonUserRetainedUser)},
};

static ::PROTOBUF_NAMESPACE_ID::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::common::_RetainedUser_default_instance_),
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::common::_AnonUserRetainedUser_default_instance_),
};

const char descriptor_table_protodef_proto_2fcommon_2fretained_5fuser_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n proto/common/retained_user.proto\022\006comm"
  "on\"\237\002\n\014RetainedUser\022\037\n\013platform_id\030\001 \001(\004"
  "R\nplatformId\022\027\n\007user_id\030\002 \001(\tR\006userId\022(\n"
  "\020retained_user_id\030\003 \001(\tR\016retainedUserId\022"
  ">\n\034create_event_api_time_millis\030\004 \001(\004R\030c"
  "reateEventApiTimeMillis\022.\n\023process_time_"
  "millis\030\005 \001(\004R\021processTimeMillis\022;\n\032last_"
  "forgotten_time_millis\030\006 \001(\004R\027lastForgott"
  "enTimeMillis\"\337\001\n\024AnonUserRetainedUser\022\037\n"
  "\013platform_id\030\001 \001(\004R\nplatformId\022 \n\014anon_u"
  "ser_id\030\002 \001(\tR\nanonUserId\022(\n\020retained_use"
  "r_id\030\003 \001(\tR\016retainedUserId\022*\n\021event_time"
  "_millis\030\004 \001(\004R\017eventTimeMillis\022.\n\023proces"
  "s_time_millis\030\005 \001(\004R\021processTimeMillisBT"
  "\n\030ai.promoted.proto.commonP\001Z6github.com"
  "/promotedai/schema/generated/go/proto/co"
  "mmonb\006proto3"
  ;
static ::PROTOBUF_NAMESPACE_ID::internal::once_flag descriptor_table_proto_2fcommon_2fretained_5fuser_2eproto_once;
const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_proto_2fcommon_2fretained_5fuser_2eproto = {
  false, false, 652, descriptor_table_protodef_proto_2fcommon_2fretained_5fuser_2eproto, "proto/common/retained_user.proto", 
  &descriptor_table_proto_2fcommon_2fretained_5fuser_2eproto_once, nullptr, 0, 2,
  schemas, file_default_instances, TableStruct_proto_2fcommon_2fretained_5fuser_2eproto::offsets,
  file_level_metadata_proto_2fcommon_2fretained_5fuser_2eproto, file_level_enum_descriptors_proto_2fcommon_2fretained_5fuser_2eproto, file_level_service_descriptors_proto_2fcommon_2fretained_5fuser_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK ::PROTOBUF_NAMESPACE_ID::Metadata
descriptor_table_proto_2fcommon_2fretained_5fuser_2eproto_metadata_getter(int index) {
  ::PROTOBUF_NAMESPACE_ID::internal::AssignDescriptors(&descriptor_table_proto_2fcommon_2fretained_5fuser_2eproto);
  return descriptor_table_proto_2fcommon_2fretained_5fuser_2eproto.file_level_metadata[index];
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY static ::PROTOBUF_NAMESPACE_ID::internal::AddDescriptorsRunner dynamic_init_dummy_proto_2fcommon_2fretained_5fuser_2eproto(&descriptor_table_proto_2fcommon_2fretained_5fuser_2eproto);
namespace common {

// ===================================================================

class RetainedUser::_Internal {
 public:
};

RetainedUser::RetainedUser(::PROTOBUF_NAMESPACE_ID::Arena* arena)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena) {
  SharedCtor();
  RegisterArenaDtor(arena);
  // @@protoc_insertion_point(arena_constructor:common.RetainedUser)
}
RetainedUser::RetainedUser(const RetainedUser& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_user_id().empty()) {
    user_id_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_user_id(), 
      GetArena());
  }
  retained_user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_retained_user_id().empty()) {
    retained_user_id_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_retained_user_id(), 
      GetArena());
  }
  ::memcpy(&platform_id_, &from.platform_id_,
    static_cast<size_t>(reinterpret_cast<char*>(&last_forgotten_time_millis_) -
    reinterpret_cast<char*>(&platform_id_)) + sizeof(last_forgotten_time_millis_));
  // @@protoc_insertion_point(copy_constructor:common.RetainedUser)
}

void RetainedUser::SharedCtor() {
user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
retained_user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
::memset(reinterpret_cast<char*>(this) + static_cast<size_t>(
    reinterpret_cast<char*>(&platform_id_) - reinterpret_cast<char*>(this)),
    0, static_cast<size_t>(reinterpret_cast<char*>(&last_forgotten_time_millis_) -
    reinterpret_cast<char*>(&platform_id_)) + sizeof(last_forgotten_time_millis_));
}

RetainedUser::~RetainedUser() {
  // @@protoc_insertion_point(destructor:common.RetainedUser)
  SharedDtor();
  _internal_metadata_.Delete<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

void RetainedUser::SharedDtor() {
  GOOGLE_DCHECK(GetArena() == nullptr);
  user_id_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  retained_user_id_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
}

void RetainedUser::ArenaDtor(void* object) {
  RetainedUser* _this = reinterpret_cast< RetainedUser* >(object);
  (void)_this;
}
void RetainedUser::RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena*) {
}
void RetainedUser::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}

void RetainedUser::Clear() {
// @@protoc_insertion_point(message_clear_start:common.RetainedUser)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  user_id_.ClearToEmpty();
  retained_user_id_.ClearToEmpty();
  ::memset(&platform_id_, 0, static_cast<size_t>(
      reinterpret_cast<char*>(&last_forgotten_time_millis_) -
      reinterpret_cast<char*>(&platform_id_)) + sizeof(last_forgotten_time_millis_));
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* RetainedUser::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
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
      // string user_id = 2 [json_name = "userId"];
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 18)) {
          auto str = _internal_mutable_user_id();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "common.RetainedUser.user_id"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // string retained_user_id = 3 [json_name = "retainedUserId"];
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 26)) {
          auto str = _internal_mutable_retained_user_id();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "common.RetainedUser.retained_user_id"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];
      case 4:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 32)) {
          create_event_api_time_millis_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // uint64 process_time_millis = 5 [json_name = "processTimeMillis"];
      case 5:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 40)) {
          process_time_millis_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];
      case 6:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 48)) {
          last_forgotten_time_millis_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
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

::PROTOBUF_NAMESPACE_ID::uint8* RetainedUser::_InternalSerialize(
    ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:common.RetainedUser)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // uint64 platform_id = 1 [json_name = "platformId"];
  if (this->platform_id() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(1, this->_internal_platform_id(), target);
  }

  // string user_id = 2 [json_name = "userId"];
  if (this->user_id().size() > 0) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_user_id().data(), static_cast<int>(this->_internal_user_id().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "common.RetainedUser.user_id");
    target = stream->WriteStringMaybeAliased(
        2, this->_internal_user_id(), target);
  }

  // string retained_user_id = 3 [json_name = "retainedUserId"];
  if (this->retained_user_id().size() > 0) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_retained_user_id().data(), static_cast<int>(this->_internal_retained_user_id().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "common.RetainedUser.retained_user_id");
    target = stream->WriteStringMaybeAliased(
        3, this->_internal_retained_user_id(), target);
  }

  // uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];
  if (this->create_event_api_time_millis() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(4, this->_internal_create_event_api_time_millis(), target);
  }

  // uint64 process_time_millis = 5 [json_name = "processTimeMillis"];
  if (this->process_time_millis() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(5, this->_internal_process_time_millis(), target);
  }

  // uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];
  if (this->last_forgotten_time_millis() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(6, this->_internal_last_forgotten_time_millis(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:common.RetainedUser)
  return target;
}

size_t RetainedUser::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:common.RetainedUser)
  size_t total_size = 0;

  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string user_id = 2 [json_name = "userId"];
  if (this->user_id().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_user_id());
  }

  // string retained_user_id = 3 [json_name = "retainedUserId"];
  if (this->retained_user_id().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_retained_user_id());
  }

  // uint64 platform_id = 1 [json_name = "platformId"];
  if (this->platform_id() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_platform_id());
  }

  // uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];
  if (this->create_event_api_time_millis() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_create_event_api_time_millis());
  }

  // uint64 process_time_millis = 5 [json_name = "processTimeMillis"];
  if (this->process_time_millis() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_process_time_millis());
  }

  // uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];
  if (this->last_forgotten_time_millis() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_last_forgotten_time_millis());
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    return ::PROTOBUF_NAMESPACE_ID::internal::ComputeUnknownFieldsSize(
        _internal_metadata_, total_size, &_cached_size_);
  }
  int cached_size = ::PROTOBUF_NAMESPACE_ID::internal::ToCachedSize(total_size);
  SetCachedSize(cached_size);
  return total_size;
}

void RetainedUser::MergeFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:common.RetainedUser)
  GOOGLE_DCHECK_NE(&from, this);
  const RetainedUser* source =
      ::PROTOBUF_NAMESPACE_ID::DynamicCastToGenerated<RetainedUser>(
          &from);
  if (source == nullptr) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:common.RetainedUser)
    ::PROTOBUF_NAMESPACE_ID::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:common.RetainedUser)
    MergeFrom(*source);
  }
}

void RetainedUser::MergeFrom(const RetainedUser& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:common.RetainedUser)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (from.user_id().size() > 0) {
    _internal_set_user_id(from._internal_user_id());
  }
  if (from.retained_user_id().size() > 0) {
    _internal_set_retained_user_id(from._internal_retained_user_id());
  }
  if (from.platform_id() != 0) {
    _internal_set_platform_id(from._internal_platform_id());
  }
  if (from.create_event_api_time_millis() != 0) {
    _internal_set_create_event_api_time_millis(from._internal_create_event_api_time_millis());
  }
  if (from.process_time_millis() != 0) {
    _internal_set_process_time_millis(from._internal_process_time_millis());
  }
  if (from.last_forgotten_time_millis() != 0) {
    _internal_set_last_forgotten_time_millis(from._internal_last_forgotten_time_millis());
  }
}

void RetainedUser::CopyFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:common.RetainedUser)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void RetainedUser::CopyFrom(const RetainedUser& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:common.RetainedUser)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool RetainedUser::IsInitialized() const {
  return true;
}

void RetainedUser::InternalSwap(RetainedUser* other) {
  using std::swap;
  _internal_metadata_.Swap<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(&other->_internal_metadata_);
  user_id_.Swap(&other->user_id_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArena());
  retained_user_id_.Swap(&other->retained_user_id_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArena());
  ::PROTOBUF_NAMESPACE_ID::internal::memswap<
      PROTOBUF_FIELD_OFFSET(RetainedUser, last_forgotten_time_millis_)
      + sizeof(RetainedUser::last_forgotten_time_millis_)
      - PROTOBUF_FIELD_OFFSET(RetainedUser, platform_id_)>(
          reinterpret_cast<char*>(&platform_id_),
          reinterpret_cast<char*>(&other->platform_id_));
}

::PROTOBUF_NAMESPACE_ID::Metadata RetainedUser::GetMetadata() const {
  return GetMetadataStatic();
}


// ===================================================================

class AnonUserRetainedUser::_Internal {
 public:
};

AnonUserRetainedUser::AnonUserRetainedUser(::PROTOBUF_NAMESPACE_ID::Arena* arena)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena) {
  SharedCtor();
  RegisterArenaDtor(arena);
  // @@protoc_insertion_point(arena_constructor:common.AnonUserRetainedUser)
}
AnonUserRetainedUser::AnonUserRetainedUser(const AnonUserRetainedUser& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  anon_user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_anon_user_id().empty()) {
    anon_user_id_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_anon_user_id(), 
      GetArena());
  }
  retained_user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  if (!from._internal_retained_user_id().empty()) {
    retained_user_id_.Set(::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::EmptyDefault{}, from._internal_retained_user_id(), 
      GetArena());
  }
  ::memcpy(&platform_id_, &from.platform_id_,
    static_cast<size_t>(reinterpret_cast<char*>(&process_time_millis_) -
    reinterpret_cast<char*>(&platform_id_)) + sizeof(process_time_millis_));
  // @@protoc_insertion_point(copy_constructor:common.AnonUserRetainedUser)
}

void AnonUserRetainedUser::SharedCtor() {
anon_user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
retained_user_id_.UnsafeSetDefault(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
::memset(reinterpret_cast<char*>(this) + static_cast<size_t>(
    reinterpret_cast<char*>(&platform_id_) - reinterpret_cast<char*>(this)),
    0, static_cast<size_t>(reinterpret_cast<char*>(&process_time_millis_) -
    reinterpret_cast<char*>(&platform_id_)) + sizeof(process_time_millis_));
}

AnonUserRetainedUser::~AnonUserRetainedUser() {
  // @@protoc_insertion_point(destructor:common.AnonUserRetainedUser)
  SharedDtor();
  _internal_metadata_.Delete<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

void AnonUserRetainedUser::SharedDtor() {
  GOOGLE_DCHECK(GetArena() == nullptr);
  anon_user_id_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
  retained_user_id_.DestroyNoArena(&::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited());
}

void AnonUserRetainedUser::ArenaDtor(void* object) {
  AnonUserRetainedUser* _this = reinterpret_cast< AnonUserRetainedUser* >(object);
  (void)_this;
}
void AnonUserRetainedUser::RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena*) {
}
void AnonUserRetainedUser::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}

void AnonUserRetainedUser::Clear() {
// @@protoc_insertion_point(message_clear_start:common.AnonUserRetainedUser)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  anon_user_id_.ClearToEmpty();
  retained_user_id_.ClearToEmpty();
  ::memset(&platform_id_, 0, static_cast<size_t>(
      reinterpret_cast<char*>(&process_time_millis_) -
      reinterpret_cast<char*>(&platform_id_)) + sizeof(process_time_millis_));
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* AnonUserRetainedUser::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
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
      // string anon_user_id = 2 [json_name = "anonUserId"];
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 18)) {
          auto str = _internal_mutable_anon_user_id();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "common.AnonUserRetainedUser.anon_user_id"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // string retained_user_id = 3 [json_name = "retainedUserId"];
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 26)) {
          auto str = _internal_mutable_retained_user_id();
          ptr = ::PROTOBUF_NAMESPACE_ID::internal::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(::PROTOBUF_NAMESPACE_ID::internal::VerifyUTF8(str, "common.AnonUserRetainedUser.retained_user_id"));
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // uint64 event_time_millis = 4 [json_name = "eventTimeMillis"];
      case 4:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 32)) {
          event_time_millis_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
        } else goto handle_unusual;
        continue;
      // uint64 process_time_millis = 5 [json_name = "processTimeMillis"];
      case 5:
        if (PROTOBUF_PREDICT_TRUE(static_cast<::PROTOBUF_NAMESPACE_ID::uint8>(tag) == 40)) {
          process_time_millis_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
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

::PROTOBUF_NAMESPACE_ID::uint8* AnonUserRetainedUser::_InternalSerialize(
    ::PROTOBUF_NAMESPACE_ID::uint8* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:common.AnonUserRetainedUser)
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // uint64 platform_id = 1 [json_name = "platformId"];
  if (this->platform_id() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(1, this->_internal_platform_id(), target);
  }

  // string anon_user_id = 2 [json_name = "anonUserId"];
  if (this->anon_user_id().size() > 0) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_anon_user_id().data(), static_cast<int>(this->_internal_anon_user_id().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "common.AnonUserRetainedUser.anon_user_id");
    target = stream->WriteStringMaybeAliased(
        2, this->_internal_anon_user_id(), target);
  }

  // string retained_user_id = 3 [json_name = "retainedUserId"];
  if (this->retained_user_id().size() > 0) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_retained_user_id().data(), static_cast<int>(this->_internal_retained_user_id().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "common.AnonUserRetainedUser.retained_user_id");
    target = stream->WriteStringMaybeAliased(
        3, this->_internal_retained_user_id(), target);
  }

  // uint64 event_time_millis = 4 [json_name = "eventTimeMillis"];
  if (this->event_time_millis() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(4, this->_internal_event_time_millis(), target);
  }

  // uint64 process_time_millis = 5 [json_name = "processTimeMillis"];
  if (this->process_time_millis() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt64ToArray(5, this->_internal_process_time_millis(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:common.AnonUserRetainedUser)
  return target;
}

size_t AnonUserRetainedUser::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:common.AnonUserRetainedUser)
  size_t total_size = 0;

  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string anon_user_id = 2 [json_name = "anonUserId"];
  if (this->anon_user_id().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_anon_user_id());
  }

  // string retained_user_id = 3 [json_name = "retainedUserId"];
  if (this->retained_user_id().size() > 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_retained_user_id());
  }

  // uint64 platform_id = 1 [json_name = "platformId"];
  if (this->platform_id() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_platform_id());
  }

  // uint64 event_time_millis = 4 [json_name = "eventTimeMillis"];
  if (this->event_time_millis() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_event_time_millis());
  }

  // uint64 process_time_millis = 5 [json_name = "processTimeMillis"];
  if (this->process_time_millis() != 0) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt64Size(
        this->_internal_process_time_millis());
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    return ::PROTOBUF_NAMESPACE_ID::internal::ComputeUnknownFieldsSize(
        _internal_metadata_, total_size, &_cached_size_);
  }
  int cached_size = ::PROTOBUF_NAMESPACE_ID::internal::ToCachedSize(total_size);
  SetCachedSize(cached_size);
  return total_size;
}

void AnonUserRetainedUser::MergeFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:common.AnonUserRetainedUser)
  GOOGLE_DCHECK_NE(&from, this);
  const AnonUserRetainedUser* source =
      ::PROTOBUF_NAMESPACE_ID::DynamicCastToGenerated<AnonUserRetainedUser>(
          &from);
  if (source == nullptr) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:common.AnonUserRetainedUser)
    ::PROTOBUF_NAMESPACE_ID::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:common.AnonUserRetainedUser)
    MergeFrom(*source);
  }
}

void AnonUserRetainedUser::MergeFrom(const AnonUserRetainedUser& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:common.AnonUserRetainedUser)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (from.anon_user_id().size() > 0) {
    _internal_set_anon_user_id(from._internal_anon_user_id());
  }
  if (from.retained_user_id().size() > 0) {
    _internal_set_retained_user_id(from._internal_retained_user_id());
  }
  if (from.platform_id() != 0) {
    _internal_set_platform_id(from._internal_platform_id());
  }
  if (from.event_time_millis() != 0) {
    _internal_set_event_time_millis(from._internal_event_time_millis());
  }
  if (from.process_time_millis() != 0) {
    _internal_set_process_time_millis(from._internal_process_time_millis());
  }
}

void AnonUserRetainedUser::CopyFrom(const ::PROTOBUF_NAMESPACE_ID::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:common.AnonUserRetainedUser)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void AnonUserRetainedUser::CopyFrom(const AnonUserRetainedUser& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:common.AnonUserRetainedUser)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool AnonUserRetainedUser::IsInitialized() const {
  return true;
}

void AnonUserRetainedUser::InternalSwap(AnonUserRetainedUser* other) {
  using std::swap;
  _internal_metadata_.Swap<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(&other->_internal_metadata_);
  anon_user_id_.Swap(&other->anon_user_id_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArena());
  retained_user_id_.Swap(&other->retained_user_id_, &::PROTOBUF_NAMESPACE_ID::internal::GetEmptyStringAlreadyInited(), GetArena());
  ::PROTOBUF_NAMESPACE_ID::internal::memswap<
      PROTOBUF_FIELD_OFFSET(AnonUserRetainedUser, process_time_millis_)
      + sizeof(AnonUserRetainedUser::process_time_millis_)
      - PROTOBUF_FIELD_OFFSET(AnonUserRetainedUser, platform_id_)>(
          reinterpret_cast<char*>(&platform_id_),
          reinterpret_cast<char*>(&other->platform_id_));
}

::PROTOBUF_NAMESPACE_ID::Metadata AnonUserRetainedUser::GetMetadata() const {
  return GetMetadataStatic();
}


// @@protoc_insertion_point(namespace_scope)
}  // namespace common
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::common::RetainedUser* Arena::CreateMaybeMessage< ::common::RetainedUser >(Arena* arena) {
  return Arena::CreateMessageInternal< ::common::RetainedUser >(arena);
}
template<> PROTOBUF_NOINLINE ::common::AnonUserRetainedUser* Arena::CreateMaybeMessage< ::common::AnonUserRetainedUser >(Arena* arena) {
  return Arena::CreateMessageInternal< ::common::AnonUserRetainedUser >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
