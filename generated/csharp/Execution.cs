// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: proto/delivery/execution.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Promoted.Delivery {

  /// <summary>Holder for reflection information generated from proto/delivery/execution.proto</summary>
  public static partial class ExecutionReflection {

    #region Descriptor
    /// <summary>File descriptor for proto/delivery/execution.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static ExecutionReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Ch5wcm90by9kZWxpdmVyeS9leGVjdXRpb24ucHJvdG8SCGRlbGl2ZXJ5Ghlw",
            "cm90by9jb21tb24vY29tbW9uLnByb3RvGhxwcm90by9kZWxpdmVyeS9ibGVu",
            "ZGVyLnByb3RvGh1wcm90by9kZWxpdmVyeS9kZWxpdmVyeS5wcm90byLGAQoL",
            "RGVsaXZlcnlMb2cSHwoLcGxhdGZvcm1faWQYASABKARSCnBsYXRmb3JtSWQS",
            "KwoHcmVxdWVzdBgCIAEoCzIRLmRlbGl2ZXJ5LlJlcXVlc3RSB3JlcXVlc3QS",
            "LgoIcmVzcG9uc2UYAyABKAsyEi5kZWxpdmVyeS5SZXNwb25zZVIIcmVzcG9u",
            "c2USOQoJZXhlY3V0aW9uGAQgASgLMhsuZGVsaXZlcnkuRGVsaXZlcnlFeGVj",
            "dXRpb25SCWV4ZWN1dGlvbiLcAgoRRGVsaXZlcnlFeGVjdXRpb24SRAoQZXhl",
            "Y3V0aW9uX3NlcnZlchgCIAEoDjIZLmRlbGl2ZXJ5LkV4ZWN1dGlvblNlcnZl",
            "clIPZXhlY3V0aW9uU2VydmVyEiUKDnNlcnZlcl92ZXJzaW9uGAcgASgJUg1z",
            "ZXJ2ZXJWZXJzaW9uEiUKDmJsZW5kZXJfY29uZmlnGAwgASgJUg1ibGVuZGVy",
            "Q29uZmlnEjsKDWh5cGVybG9vcF9sb2cYDSABKAsyFi5kZWxpdmVyeS5IeXBl",
            "cmxvb3BMb2dSDGh5cGVybG9vcExvZxJAChNlZmZlY3RpdmVfdXNlcl9pbmZv",
            "GA8gASgLMhAuY29tbW9uLlVzZXJJbmZvUhFlZmZlY3RpdmVVc2VySW5mb0oE",
            "CAEQAkoECAMQBEoECAsQDEoECAQQBUoECAUQBkoECAYQB0oECAgQCUoECAkQ",
            "CkoECAoQCypHCg9FeGVjdXRpb25TZXJ2ZXISHAoYVU5LTk9XTl9FWEVDVVRJ",
            "T05fU0VSVkVSEAASBwoDQVBJEAESBwoDU0RLEAIiBAgDEANCggEKGmFpLnBy",
            "b21vdGVkLnByb3RvLmRlbGl2ZXJ5QhREZWxpdmVyeUV4ZWN1dGlvbkxvZ1AB",
            "WjhnaXRodWIuY29tL3Byb21vdGVkYWkvc2NoZW1hL2dlbmVyYXRlZC9nby9w",
            "cm90by9kZWxpdmVyeaoCEVByb21vdGVkLkRlbGl2ZXJ5YgZwcm90bzM="));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Promoted.Common.CommonReflection.Descriptor, global::Promoted.Delivery.BlenderReflection.Descriptor, global::Promoted.Delivery.DeliveryReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(new[] {typeof(global::Promoted.Delivery.ExecutionServer), }, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Promoted.Delivery.DeliveryLog), global::Promoted.Delivery.DeliveryLog.Parser, new[]{ "PlatformId", "Request", "Response", "Execution" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Promoted.Delivery.DeliveryExecution), global::Promoted.Delivery.DeliveryExecution.Parser, new[]{ "ExecutionServer", "ServerVersion", "BlenderConfig", "HyperloopLog", "EffectiveUserInfo" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Enums
  public enum ExecutionServer {
    [pbr::OriginalName("UNKNOWN_EXECUTION_SERVER")] UnknownExecutionServer = 0,
    [pbr::OriginalName("API")] Api = 1,
    [pbr::OriginalName("SDK")] Sdk = 2,
  }

  #endregion

  #region Messages
  public sealed partial class DeliveryLog : pb::IMessage<DeliveryLog>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<DeliveryLog> _parser = new pb::MessageParser<DeliveryLog>(() => new DeliveryLog());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<DeliveryLog> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Promoted.Delivery.ExecutionReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeliveryLog() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeliveryLog(DeliveryLog other) : this() {
      platformId_ = other.platformId_;
      request_ = other.request_ != null ? other.request_.Clone() : null;
      response_ = other.response_ != null ? other.response_.Clone() : null;
      execution_ = other.execution_ != null ? other.execution_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeliveryLog Clone() {
      return new DeliveryLog(this);
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

    /// <summary>Field number for the "request" field.</summary>
    public const int RequestFieldNumber = 2;
    private global::Promoted.Delivery.Request request_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Promoted.Delivery.Request Request {
      get { return request_; }
      set {
        request_ = value;
      }
    }

    /// <summary>Field number for the "response" field.</summary>
    public const int ResponseFieldNumber = 3;
    private global::Promoted.Delivery.Response response_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Promoted.Delivery.Response Response {
      get { return response_; }
      set {
        response_ = value;
      }
    }

    /// <summary>Field number for the "execution" field.</summary>
    public const int ExecutionFieldNumber = 4;
    private global::Promoted.Delivery.DeliveryExecution execution_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Promoted.Delivery.DeliveryExecution Execution {
      get { return execution_; }
      set {
        execution_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as DeliveryLog);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(DeliveryLog other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (PlatformId != other.PlatformId) return false;
      if (!object.Equals(Request, other.Request)) return false;
      if (!object.Equals(Response, other.Response)) return false;
      if (!object.Equals(Execution, other.Execution)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (PlatformId != 0UL) hash ^= PlatformId.GetHashCode();
      if (request_ != null) hash ^= Request.GetHashCode();
      if (response_ != null) hash ^= Response.GetHashCode();
      if (execution_ != null) hash ^= Execution.GetHashCode();
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
      if (request_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Request);
      }
      if (response_ != null) {
        output.WriteRawTag(26);
        output.WriteMessage(Response);
      }
      if (execution_ != null) {
        output.WriteRawTag(34);
        output.WriteMessage(Execution);
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
      if (request_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(Request);
      }
      if (response_ != null) {
        output.WriteRawTag(26);
        output.WriteMessage(Response);
      }
      if (execution_ != null) {
        output.WriteRawTag(34);
        output.WriteMessage(Execution);
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
      if (request_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Request);
      }
      if (response_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Response);
      }
      if (execution_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Execution);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(DeliveryLog other) {
      if (other == null) {
        return;
      }
      if (other.PlatformId != 0UL) {
        PlatformId = other.PlatformId;
      }
      if (other.request_ != null) {
        if (request_ == null) {
          Request = new global::Promoted.Delivery.Request();
        }
        Request.MergeFrom(other.Request);
      }
      if (other.response_ != null) {
        if (response_ == null) {
          Response = new global::Promoted.Delivery.Response();
        }
        Response.MergeFrom(other.Response);
      }
      if (other.execution_ != null) {
        if (execution_ == null) {
          Execution = new global::Promoted.Delivery.DeliveryExecution();
        }
        Execution.MergeFrom(other.Execution);
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
            if (request_ == null) {
              Request = new global::Promoted.Delivery.Request();
            }
            input.ReadMessage(Request);
            break;
          }
          case 26: {
            if (response_ == null) {
              Response = new global::Promoted.Delivery.Response();
            }
            input.ReadMessage(Response);
            break;
          }
          case 34: {
            if (execution_ == null) {
              Execution = new global::Promoted.Delivery.DeliveryExecution();
            }
            input.ReadMessage(Execution);
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
            if (request_ == null) {
              Request = new global::Promoted.Delivery.Request();
            }
            input.ReadMessage(Request);
            break;
          }
          case 26: {
            if (response_ == null) {
              Response = new global::Promoted.Delivery.Response();
            }
            input.ReadMessage(Response);
            break;
          }
          case 34: {
            if (execution_ == null) {
              Execution = new global::Promoted.Delivery.DeliveryExecution();
            }
            input.ReadMessage(Execution);
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class DeliveryExecution : pb::IMessage<DeliveryExecution>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<DeliveryExecution> _parser = new pb::MessageParser<DeliveryExecution>(() => new DeliveryExecution());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<DeliveryExecution> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Promoted.Delivery.ExecutionReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeliveryExecution() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeliveryExecution(DeliveryExecution other) : this() {
      executionServer_ = other.executionServer_;
      serverVersion_ = other.serverVersion_;
      blenderConfig_ = other.blenderConfig_;
      hyperloopLog_ = other.hyperloopLog_ != null ? other.hyperloopLog_.Clone() : null;
      effectiveUserInfo_ = other.effectiveUserInfo_ != null ? other.effectiveUserInfo_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public DeliveryExecution Clone() {
      return new DeliveryExecution(this);
    }

    /// <summary>Field number for the "execution_server" field.</summary>
    public const int ExecutionServerFieldNumber = 2;
    private global::Promoted.Delivery.ExecutionServer executionServer_ = global::Promoted.Delivery.ExecutionServer.UnknownExecutionServer;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Promoted.Delivery.ExecutionServer ExecutionServer {
      get { return executionServer_; }
      set {
        executionServer_ = value;
      }
    }

    /// <summary>Field number for the "server_version" field.</summary>
    public const int ServerVersionFieldNumber = 7;
    private string serverVersion_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ServerVersion {
      get { return serverVersion_; }
      set {
        serverVersion_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "blender_config" field.</summary>
    public const int BlenderConfigFieldNumber = 12;
    private string blenderConfig_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string BlenderConfig {
      get { return blenderConfig_; }
      set {
        blenderConfig_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "hyperloop_log" field.</summary>
    public const int HyperloopLogFieldNumber = 13;
    private global::Promoted.Delivery.HyperloopLog hyperloopLog_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Promoted.Delivery.HyperloopLog HyperloopLog {
      get { return hyperloopLog_; }
      set {
        hyperloopLog_ = value;
      }
    }

    /// <summary>Field number for the "effective_user_info" field.</summary>
    public const int EffectiveUserInfoFieldNumber = 15;
    private global::Promoted.Common.UserInfo effectiveUserInfo_;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Promoted.Common.UserInfo EffectiveUserInfo {
      get { return effectiveUserInfo_; }
      set {
        effectiveUserInfo_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as DeliveryExecution);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(DeliveryExecution other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (ExecutionServer != other.ExecutionServer) return false;
      if (ServerVersion != other.ServerVersion) return false;
      if (BlenderConfig != other.BlenderConfig) return false;
      if (!object.Equals(HyperloopLog, other.HyperloopLog)) return false;
      if (!object.Equals(EffectiveUserInfo, other.EffectiveUserInfo)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (ExecutionServer != global::Promoted.Delivery.ExecutionServer.UnknownExecutionServer) hash ^= ExecutionServer.GetHashCode();
      if (ServerVersion.Length != 0) hash ^= ServerVersion.GetHashCode();
      if (BlenderConfig.Length != 0) hash ^= BlenderConfig.GetHashCode();
      if (hyperloopLog_ != null) hash ^= HyperloopLog.GetHashCode();
      if (effectiveUserInfo_ != null) hash ^= EffectiveUserInfo.GetHashCode();
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
      if (ExecutionServer != global::Promoted.Delivery.ExecutionServer.UnknownExecutionServer) {
        output.WriteRawTag(16);
        output.WriteEnum((int) ExecutionServer);
      }
      if (ServerVersion.Length != 0) {
        output.WriteRawTag(58);
        output.WriteString(ServerVersion);
      }
      if (BlenderConfig.Length != 0) {
        output.WriteRawTag(98);
        output.WriteString(BlenderConfig);
      }
      if (hyperloopLog_ != null) {
        output.WriteRawTag(106);
        output.WriteMessage(HyperloopLog);
      }
      if (effectiveUserInfo_ != null) {
        output.WriteRawTag(122);
        output.WriteMessage(EffectiveUserInfo);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (ExecutionServer != global::Promoted.Delivery.ExecutionServer.UnknownExecutionServer) {
        output.WriteRawTag(16);
        output.WriteEnum((int) ExecutionServer);
      }
      if (ServerVersion.Length != 0) {
        output.WriteRawTag(58);
        output.WriteString(ServerVersion);
      }
      if (BlenderConfig.Length != 0) {
        output.WriteRawTag(98);
        output.WriteString(BlenderConfig);
      }
      if (hyperloopLog_ != null) {
        output.WriteRawTag(106);
        output.WriteMessage(HyperloopLog);
      }
      if (effectiveUserInfo_ != null) {
        output.WriteRawTag(122);
        output.WriteMessage(EffectiveUserInfo);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (ExecutionServer != global::Promoted.Delivery.ExecutionServer.UnknownExecutionServer) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) ExecutionServer);
      }
      if (ServerVersion.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ServerVersion);
      }
      if (BlenderConfig.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(BlenderConfig);
      }
      if (hyperloopLog_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(HyperloopLog);
      }
      if (effectiveUserInfo_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(EffectiveUserInfo);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(DeliveryExecution other) {
      if (other == null) {
        return;
      }
      if (other.ExecutionServer != global::Promoted.Delivery.ExecutionServer.UnknownExecutionServer) {
        ExecutionServer = other.ExecutionServer;
      }
      if (other.ServerVersion.Length != 0) {
        ServerVersion = other.ServerVersion;
      }
      if (other.BlenderConfig.Length != 0) {
        BlenderConfig = other.BlenderConfig;
      }
      if (other.hyperloopLog_ != null) {
        if (hyperloopLog_ == null) {
          HyperloopLog = new global::Promoted.Delivery.HyperloopLog();
        }
        HyperloopLog.MergeFrom(other.HyperloopLog);
      }
      if (other.effectiveUserInfo_ != null) {
        if (effectiveUserInfo_ == null) {
          EffectiveUserInfo = new global::Promoted.Common.UserInfo();
        }
        EffectiveUserInfo.MergeFrom(other.EffectiveUserInfo);
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
          case 16: {
            ExecutionServer = (global::Promoted.Delivery.ExecutionServer) input.ReadEnum();
            break;
          }
          case 58: {
            ServerVersion = input.ReadString();
            break;
          }
          case 98: {
            BlenderConfig = input.ReadString();
            break;
          }
          case 106: {
            if (hyperloopLog_ == null) {
              HyperloopLog = new global::Promoted.Delivery.HyperloopLog();
            }
            input.ReadMessage(HyperloopLog);
            break;
          }
          case 122: {
            if (effectiveUserInfo_ == null) {
              EffectiveUserInfo = new global::Promoted.Common.UserInfo();
            }
            input.ReadMessage(EffectiveUserInfo);
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
          case 16: {
            ExecutionServer = (global::Promoted.Delivery.ExecutionServer) input.ReadEnum();
            break;
          }
          case 58: {
            ServerVersion = input.ReadString();
            break;
          }
          case 98: {
            BlenderConfig = input.ReadString();
            break;
          }
          case 106: {
            if (hyperloopLog_ == null) {
              HyperloopLog = new global::Promoted.Delivery.HyperloopLog();
            }
            input.ReadMessage(HyperloopLog);
            break;
          }
          case 122: {
            if (effectiveUserInfo_ == null) {
              EffectiveUserInfo = new global::Promoted.Common.UserInfo();
            }
            input.ReadMessage(EffectiveUserInfo);
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
