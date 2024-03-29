// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: proto/common/retained_user.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Common {

  /// <summary>Holder for reflection information generated from proto/common/retained_user.proto</summary>
  public static partial class RetainedUserReflection {

    #region Descriptor
    /// <summary>File descriptor for proto/common/retained_user.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static RetainedUserReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CiBwcm90by9jb21tb24vcmV0YWluZWRfdXNlci5wcm90bxIGY29tbW9uIp8C",
            "CgxSZXRhaW5lZFVzZXISHwoLcGxhdGZvcm1faWQYASABKARSCnBsYXRmb3Jt",
            "SWQSFwoHdXNlcl9pZBgCIAEoCVIGdXNlcklkEigKEHJldGFpbmVkX3VzZXJf",
            "aWQYAyABKAlSDnJldGFpbmVkVXNlcklkEj4KHGNyZWF0ZV9ldmVudF9hcGlf",
            "dGltZV9taWxsaXMYBCABKARSGGNyZWF0ZUV2ZW50QXBpVGltZU1pbGxpcxIu",
            "ChNwcm9jZXNzX3RpbWVfbWlsbGlzGAUgASgEUhFwcm9jZXNzVGltZU1pbGxp",
            "cxI7ChpsYXN0X2ZvcmdvdHRlbl90aW1lX21pbGxpcxgGIAEoBFIXbGFzdEZv",
            "cmdvdHRlblRpbWVNaWxsaXMi3wEKFEFub25Vc2VyUmV0YWluZWRVc2VyEh8K",
            "C3BsYXRmb3JtX2lkGAEgASgEUgpwbGF0Zm9ybUlkEiAKDGFub25fdXNlcl9p",
            "ZBgCIAEoCVIKYW5vblVzZXJJZBIoChByZXRhaW5lZF91c2VyX2lkGAMgASgJ",
            "Ug5yZXRhaW5lZFVzZXJJZBIqChFldmVudF90aW1lX21pbGxpcxgEIAEoBFIP",
            "ZXZlbnRUaW1lTWlsbGlzEi4KE3Byb2Nlc3NfdGltZV9taWxsaXMYBSABKARS",
            "EXByb2Nlc3NUaW1lTWlsbGlzQlQKGGFpLnByb21vdGVkLnByb3RvLmNvbW1v",
            "blABWjZnaXRodWIuY29tL3Byb21vdGVkYWkvc2NoZW1hL2dlbmVyYXRlZC9n",
            "by9wcm90by9jb21tb25iBnByb3RvMw=="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Common.RetainedUser), global::Common.RetainedUser.Parser, new[]{ "PlatformId", "UserId", "RetainedUserId", "CreateEventApiTimeMillis", "ProcessTimeMillis", "LastForgottenTimeMillis" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Common.AnonUserRetainedUser), global::Common.AnonUserRetainedUser.Parser, new[]{ "PlatformId", "AnonUserId", "RetainedUserId", "EventTimeMillis", "ProcessTimeMillis" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class RetainedUser : pb::IMessage<RetainedUser>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<RetainedUser> _parser = new pb::MessageParser<RetainedUser>(() => new RetainedUser());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<RetainedUser> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Common.RetainedUserReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RetainedUser() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RetainedUser(RetainedUser other) : this() {
      platformId_ = other.platformId_;
      userId_ = other.userId_;
      retainedUserId_ = other.retainedUserId_;
      createEventApiTimeMillis_ = other.createEventApiTimeMillis_;
      processTimeMillis_ = other.processTimeMillis_;
      lastForgottenTimeMillis_ = other.lastForgottenTimeMillis_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public RetainedUser Clone() {
      return new RetainedUser(this);
    }

    /// <summary>Field number for the "platform_id" field.</summary>
    public const int PlatformIdFieldNumber = 1;
    private ulong platformId_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong PlatformId {
      get { return platformId_; }
      set {
        platformId_ = value;
      }
    }

    /// <summary>Field number for the "user_id" field.</summary>
    public const int UserIdFieldNumber = 2;
    private string userId_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string UserId {
      get { return userId_; }
      set {
        userId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "retained_user_id" field.</summary>
    public const int RetainedUserIdFieldNumber = 3;
    private string retainedUserId_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string RetainedUserId {
      get { return retainedUserId_; }
      set {
        retainedUserId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "create_event_api_time_millis" field.</summary>
    public const int CreateEventApiTimeMillisFieldNumber = 4;
    private ulong createEventApiTimeMillis_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong CreateEventApiTimeMillis {
      get { return createEventApiTimeMillis_; }
      set {
        createEventApiTimeMillis_ = value;
      }
    }

    /// <summary>Field number for the "process_time_millis" field.</summary>
    public const int ProcessTimeMillisFieldNumber = 5;
    private ulong processTimeMillis_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong ProcessTimeMillis {
      get { return processTimeMillis_; }
      set {
        processTimeMillis_ = value;
      }
    }

    /// <summary>Field number for the "last_forgotten_time_millis" field.</summary>
    public const int LastForgottenTimeMillisFieldNumber = 6;
    private ulong lastForgottenTimeMillis_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong LastForgottenTimeMillis {
      get { return lastForgottenTimeMillis_; }
      set {
        lastForgottenTimeMillis_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as RetainedUser);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(RetainedUser other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (PlatformId != other.PlatformId) return false;
      if (UserId != other.UserId) return false;
      if (RetainedUserId != other.RetainedUserId) return false;
      if (CreateEventApiTimeMillis != other.CreateEventApiTimeMillis) return false;
      if (ProcessTimeMillis != other.ProcessTimeMillis) return false;
      if (LastForgottenTimeMillis != other.LastForgottenTimeMillis) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (PlatformId != 0UL) hash ^= PlatformId.GetHashCode();
      if (UserId.Length != 0) hash ^= UserId.GetHashCode();
      if (RetainedUserId.Length != 0) hash ^= RetainedUserId.GetHashCode();
      if (CreateEventApiTimeMillis != 0UL) hash ^= CreateEventApiTimeMillis.GetHashCode();
      if (ProcessTimeMillis != 0UL) hash ^= ProcessTimeMillis.GetHashCode();
      if (LastForgottenTimeMillis != 0UL) hash ^= LastForgottenTimeMillis.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (PlatformId != 0UL) {
        output.WriteRawTag(8);
        output.WriteUInt64(PlatformId);
      }
      if (UserId.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(UserId);
      }
      if (RetainedUserId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(RetainedUserId);
      }
      if (CreateEventApiTimeMillis != 0UL) {
        output.WriteRawTag(32);
        output.WriteUInt64(CreateEventApiTimeMillis);
      }
      if (ProcessTimeMillis != 0UL) {
        output.WriteRawTag(40);
        output.WriteUInt64(ProcessTimeMillis);
      }
      if (LastForgottenTimeMillis != 0UL) {
        output.WriteRawTag(48);
        output.WriteUInt64(LastForgottenTimeMillis);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (PlatformId != 0UL) {
        output.WriteRawTag(8);
        output.WriteUInt64(PlatformId);
      }
      if (UserId.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(UserId);
      }
      if (RetainedUserId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(RetainedUserId);
      }
      if (CreateEventApiTimeMillis != 0UL) {
        output.WriteRawTag(32);
        output.WriteUInt64(CreateEventApiTimeMillis);
      }
      if (ProcessTimeMillis != 0UL) {
        output.WriteRawTag(40);
        output.WriteUInt64(ProcessTimeMillis);
      }
      if (LastForgottenTimeMillis != 0UL) {
        output.WriteRawTag(48);
        output.WriteUInt64(LastForgottenTimeMillis);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (PlatformId != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(PlatformId);
      }
      if (UserId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(UserId);
      }
      if (RetainedUserId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(RetainedUserId);
      }
      if (CreateEventApiTimeMillis != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(CreateEventApiTimeMillis);
      }
      if (ProcessTimeMillis != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(ProcessTimeMillis);
      }
      if (LastForgottenTimeMillis != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(LastForgottenTimeMillis);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(RetainedUser other) {
      if (other == null) {
        return;
      }
      if (other.PlatformId != 0UL) {
        PlatformId = other.PlatformId;
      }
      if (other.UserId.Length != 0) {
        UserId = other.UserId;
      }
      if (other.RetainedUserId.Length != 0) {
        RetainedUserId = other.RetainedUserId;
      }
      if (other.CreateEventApiTimeMillis != 0UL) {
        CreateEventApiTimeMillis = other.CreateEventApiTimeMillis;
      }
      if (other.ProcessTimeMillis != 0UL) {
        ProcessTimeMillis = other.ProcessTimeMillis;
      }
      if (other.LastForgottenTimeMillis != 0UL) {
        LastForgottenTimeMillis = other.LastForgottenTimeMillis;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            PlatformId = input.ReadUInt64();
            break;
          }
          case 18: {
            UserId = input.ReadString();
            break;
          }
          case 26: {
            RetainedUserId = input.ReadString();
            break;
          }
          case 32: {
            CreateEventApiTimeMillis = input.ReadUInt64();
            break;
          }
          case 40: {
            ProcessTimeMillis = input.ReadUInt64();
            break;
          }
          case 48: {
            LastForgottenTimeMillis = input.ReadUInt64();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            PlatformId = input.ReadUInt64();
            break;
          }
          case 18: {
            UserId = input.ReadString();
            break;
          }
          case 26: {
            RetainedUserId = input.ReadString();
            break;
          }
          case 32: {
            CreateEventApiTimeMillis = input.ReadUInt64();
            break;
          }
          case 40: {
            ProcessTimeMillis = input.ReadUInt64();
            break;
          }
          case 48: {
            LastForgottenTimeMillis = input.ReadUInt64();
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class AnonUserRetainedUser : pb::IMessage<AnonUserRetainedUser>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<AnonUserRetainedUser> _parser = new pb::MessageParser<AnonUserRetainedUser>(() => new AnonUserRetainedUser());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<AnonUserRetainedUser> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Common.RetainedUserReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public AnonUserRetainedUser() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public AnonUserRetainedUser(AnonUserRetainedUser other) : this() {
      platformId_ = other.platformId_;
      anonUserId_ = other.anonUserId_;
      retainedUserId_ = other.retainedUserId_;
      eventTimeMillis_ = other.eventTimeMillis_;
      processTimeMillis_ = other.processTimeMillis_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public AnonUserRetainedUser Clone() {
      return new AnonUserRetainedUser(this);
    }

    /// <summary>Field number for the "platform_id" field.</summary>
    public const int PlatformIdFieldNumber = 1;
    private ulong platformId_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong PlatformId {
      get { return platformId_; }
      set {
        platformId_ = value;
      }
    }

    /// <summary>Field number for the "anon_user_id" field.</summary>
    public const int AnonUserIdFieldNumber = 2;
    private string anonUserId_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string AnonUserId {
      get { return anonUserId_; }
      set {
        anonUserId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "retained_user_id" field.</summary>
    public const int RetainedUserIdFieldNumber = 3;
    private string retainedUserId_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string RetainedUserId {
      get { return retainedUserId_; }
      set {
        retainedUserId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "event_time_millis" field.</summary>
    public const int EventTimeMillisFieldNumber = 4;
    private ulong eventTimeMillis_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong EventTimeMillis {
      get { return eventTimeMillis_; }
      set {
        eventTimeMillis_ = value;
      }
    }

    /// <summary>Field number for the "process_time_millis" field.</summary>
    public const int ProcessTimeMillisFieldNumber = 5;
    private ulong processTimeMillis_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ulong ProcessTimeMillis {
      get { return processTimeMillis_; }
      set {
        processTimeMillis_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as AnonUserRetainedUser);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(AnonUserRetainedUser other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (PlatformId != other.PlatformId) return false;
      if (AnonUserId != other.AnonUserId) return false;
      if (RetainedUserId != other.RetainedUserId) return false;
      if (EventTimeMillis != other.EventTimeMillis) return false;
      if (ProcessTimeMillis != other.ProcessTimeMillis) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (PlatformId != 0UL) hash ^= PlatformId.GetHashCode();
      if (AnonUserId.Length != 0) hash ^= AnonUserId.GetHashCode();
      if (RetainedUserId.Length != 0) hash ^= RetainedUserId.GetHashCode();
      if (EventTimeMillis != 0UL) hash ^= EventTimeMillis.GetHashCode();
      if (ProcessTimeMillis != 0UL) hash ^= ProcessTimeMillis.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (PlatformId != 0UL) {
        output.WriteRawTag(8);
        output.WriteUInt64(PlatformId);
      }
      if (AnonUserId.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(AnonUserId);
      }
      if (RetainedUserId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(RetainedUserId);
      }
      if (EventTimeMillis != 0UL) {
        output.WriteRawTag(32);
        output.WriteUInt64(EventTimeMillis);
      }
      if (ProcessTimeMillis != 0UL) {
        output.WriteRawTag(40);
        output.WriteUInt64(ProcessTimeMillis);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (PlatformId != 0UL) {
        output.WriteRawTag(8);
        output.WriteUInt64(PlatformId);
      }
      if (AnonUserId.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(AnonUserId);
      }
      if (RetainedUserId.Length != 0) {
        output.WriteRawTag(26);
        output.WriteString(RetainedUserId);
      }
      if (EventTimeMillis != 0UL) {
        output.WriteRawTag(32);
        output.WriteUInt64(EventTimeMillis);
      }
      if (ProcessTimeMillis != 0UL) {
        output.WriteRawTag(40);
        output.WriteUInt64(ProcessTimeMillis);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (PlatformId != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(PlatformId);
      }
      if (AnonUserId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(AnonUserId);
      }
      if (RetainedUserId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(RetainedUserId);
      }
      if (EventTimeMillis != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(EventTimeMillis);
      }
      if (ProcessTimeMillis != 0UL) {
        size += 1 + pb::CodedOutputStream.ComputeUInt64Size(ProcessTimeMillis);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(AnonUserRetainedUser other) {
      if (other == null) {
        return;
      }
      if (other.PlatformId != 0UL) {
        PlatformId = other.PlatformId;
      }
      if (other.AnonUserId.Length != 0) {
        AnonUserId = other.AnonUserId;
      }
      if (other.RetainedUserId.Length != 0) {
        RetainedUserId = other.RetainedUserId;
      }
      if (other.EventTimeMillis != 0UL) {
        EventTimeMillis = other.EventTimeMillis;
      }
      if (other.ProcessTimeMillis != 0UL) {
        ProcessTimeMillis = other.ProcessTimeMillis;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            PlatformId = input.ReadUInt64();
            break;
          }
          case 18: {
            AnonUserId = input.ReadString();
            break;
          }
          case 26: {
            RetainedUserId = input.ReadString();
            break;
          }
          case 32: {
            EventTimeMillis = input.ReadUInt64();
            break;
          }
          case 40: {
            ProcessTimeMillis = input.ReadUInt64();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            PlatformId = input.ReadUInt64();
            break;
          }
          case 18: {
            AnonUserId = input.ReadString();
            break;
          }
          case 26: {
            RetainedUserId = input.ReadString();
            break;
          }
          case 32: {
            EventTimeMillis = input.ReadUInt64();
            break;
          }
          case 40: {
            ProcessTimeMillis = input.ReadUInt64();
            break;
          }
        }
      }
    }
    #endif

  }

  #endregion

}

#endregion Designer generated code
