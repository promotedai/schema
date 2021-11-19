// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.15.3
// source: proto/delivery/delivery.proto

package delivery

import (
	proto "github.com/golang/protobuf/proto"
	common "github.com/promotedai/schema/generated/go/proto/common"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type UseCase int32

const (
	UseCase_UNKNOWN_USE_CASE   UseCase = 0
	UseCase_CUSTOM             UseCase = 1
	UseCase_SEARCH             UseCase = 2
	UseCase_SEARCH_SUGGESTIONS UseCase = 3
	UseCase_FEED               UseCase = 4
	UseCase_RELATED_CONTENT    UseCase = 5
	UseCase_CLOSE_UP           UseCase = 6
	UseCase_CATEGORY_CONTENT   UseCase = 7
	UseCase_MY_CONTENT         UseCase = 8
	UseCase_MY_SAVED_CONTENT   UseCase = 9
	UseCase_SELLER_CONTENT     UseCase = 10
	UseCase_DISCOVER           UseCase = 11
)

// Enum value maps for UseCase.
var (
	UseCase_name = map[int32]string{
		0:  "UNKNOWN_USE_CASE",
		1:  "CUSTOM",
		2:  "SEARCH",
		3:  "SEARCH_SUGGESTIONS",
		4:  "FEED",
		5:  "RELATED_CONTENT",
		6:  "CLOSE_UP",
		7:  "CATEGORY_CONTENT",
		8:  "MY_CONTENT",
		9:  "MY_SAVED_CONTENT",
		10: "SELLER_CONTENT",
		11: "DISCOVER",
	}
	UseCase_value = map[string]int32{
		"UNKNOWN_USE_CASE":   0,
		"CUSTOM":             1,
		"SEARCH":             2,
		"SEARCH_SUGGESTIONS": 3,
		"FEED":               4,
		"RELATED_CONTENT":    5,
		"CLOSE_UP":           6,
		"CATEGORY_CONTENT":   7,
		"MY_CONTENT":         8,
		"MY_SAVED_CONTENT":   9,
		"SELLER_CONTENT":     10,
		"DISCOVER":           11,
	}
)

func (x UseCase) Enum() *UseCase {
	p := new(UseCase)
	*p = x
	return p
}

func (x UseCase) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (UseCase) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_delivery_delivery_proto_enumTypes[0].Descriptor()
}

func (UseCase) Type() protoreflect.EnumType {
	return &file_proto_delivery_delivery_proto_enumTypes[0]
}

func (x UseCase) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use UseCase.Descriptor instead.
func (UseCase) EnumDescriptor() ([]byte, []int) {
	return file_proto_delivery_delivery_proto_rawDescGZIP(), []int{0}
}

type Request struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PlatformId      uint64             `protobuf:"varint,1,opt,name=platform_id,json=platformId,proto3" json:"platform_id,omitempty"`
	UserInfo        *common.UserInfo   `protobuf:"bytes,2,opt,name=user_info,json=userInfo,proto3" json:"user_info,omitempty"`
	Timing          *common.Timing     `protobuf:"bytes,3,opt,name=timing,proto3" json:"timing,omitempty"`
	ClientInfo      *common.ClientInfo `protobuf:"bytes,4,opt,name=client_info,json=clientInfo,proto3" json:"client_info,omitempty"`
	Device          *common.Device     `protobuf:"bytes,18,opt,name=device,proto3" json:"device,omitempty"`
	RequestId       string             `protobuf:"bytes,6,opt,name=request_id,json=requestId,proto3" json:"request_id,omitempty"`
	ViewId          string             `protobuf:"bytes,7,opt,name=view_id,json=viewId,proto3" json:"view_id,omitempty"`
	AutoViewId      string             `protobuf:"bytes,19,opt,name=auto_view_id,json=autoViewId,proto3" json:"auto_view_id,omitempty"`
	SessionId       string             `protobuf:"bytes,8,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
	ClientRequestId string             `protobuf:"bytes,14,opt,name=client_request_id,json=clientRequestId,proto3" json:"client_request_id,omitempty"`
	UseCase         UseCase            `protobuf:"varint,9,opt,name=use_case,json=useCase,proto3,enum=delivery.UseCase" json:"use_case,omitempty"`
	SearchQuery     string             `protobuf:"bytes,10,opt,name=search_query,json=searchQuery,proto3" json:"search_query,omitempty"`
	Paging          *Paging            `protobuf:"bytes,17,opt,name=paging,proto3" json:"paging,omitempty"`
	Insertion       []*Insertion       `protobuf:"bytes,11,rep,name=insertion,proto3" json:"insertion,omitempty"`
	BlenderConfig   *BlenderConfig     `protobuf:"bytes,12,opt,name=blender_config,json=blenderConfig,proto3" json:"blender_config,omitempty"`
	Properties      *common.Properties `protobuf:"bytes,13,opt,name=properties,proto3" json:"properties,omitempty"`
}

func (x *Request) Reset() {
	*x = Request{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_delivery_delivery_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Request) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Request) ProtoMessage() {}

func (x *Request) ProtoReflect() protoreflect.Message {
	mi := &file_proto_delivery_delivery_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Request.ProtoReflect.Descriptor instead.
func (*Request) Descriptor() ([]byte, []int) {
	return file_proto_delivery_delivery_proto_rawDescGZIP(), []int{0}
}

func (x *Request) GetPlatformId() uint64 {
	if x != nil {
		return x.PlatformId
	}
	return 0
}

func (x *Request) GetUserInfo() *common.UserInfo {
	if x != nil {
		return x.UserInfo
	}
	return nil
}

func (x *Request) GetTiming() *common.Timing {
	if x != nil {
		return x.Timing
	}
	return nil
}

func (x *Request) GetClientInfo() *common.ClientInfo {
	if x != nil {
		return x.ClientInfo
	}
	return nil
}

func (x *Request) GetDevice() *common.Device {
	if x != nil {
		return x.Device
	}
	return nil
}

func (x *Request) GetRequestId() string {
	if x != nil {
		return x.RequestId
	}
	return ""
}

func (x *Request) GetViewId() string {
	if x != nil {
		return x.ViewId
	}
	return ""
}

func (x *Request) GetAutoViewId() string {
	if x != nil {
		return x.AutoViewId
	}
	return ""
}

func (x *Request) GetSessionId() string {
	if x != nil {
		return x.SessionId
	}
	return ""
}

func (x *Request) GetClientRequestId() string {
	if x != nil {
		return x.ClientRequestId
	}
	return ""
}

func (x *Request) GetUseCase() UseCase {
	if x != nil {
		return x.UseCase
	}
	return UseCase_UNKNOWN_USE_CASE
}

func (x *Request) GetSearchQuery() string {
	if x != nil {
		return x.SearchQuery
	}
	return ""
}

func (x *Request) GetPaging() *Paging {
	if x != nil {
		return x.Paging
	}
	return nil
}

func (x *Request) GetInsertion() []*Insertion {
	if x != nil {
		return x.Insertion
	}
	return nil
}

func (x *Request) GetBlenderConfig() *BlenderConfig {
	if x != nil {
		return x.BlenderConfig
	}
	return nil
}

func (x *Request) GetProperties() *common.Properties {
	if x != nil {
		return x.Properties
	}
	return nil
}

type Paging struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PagingId string `protobuf:"bytes,1,opt,name=paging_id,json=pagingId,proto3" json:"paging_id,omitempty"`
	Size     int32  `protobuf:"varint,2,opt,name=size,proto3" json:"size,omitempty"`
	// Types that are assignable to Starting:
	//	*Paging_Cursor
	//	*Paging_Offset
	Starting isPaging_Starting `protobuf_oneof:"starting"`
}

func (x *Paging) Reset() {
	*x = Paging{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_delivery_delivery_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Paging) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Paging) ProtoMessage() {}

func (x *Paging) ProtoReflect() protoreflect.Message {
	mi := &file_proto_delivery_delivery_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Paging.ProtoReflect.Descriptor instead.
func (*Paging) Descriptor() ([]byte, []int) {
	return file_proto_delivery_delivery_proto_rawDescGZIP(), []int{1}
}

func (x *Paging) GetPagingId() string {
	if x != nil {
		return x.PagingId
	}
	return ""
}

func (x *Paging) GetSize() int32 {
	if x != nil {
		return x.Size
	}
	return 0
}

func (m *Paging) GetStarting() isPaging_Starting {
	if m != nil {
		return m.Starting
	}
	return nil
}

func (x *Paging) GetCursor() string {
	if x, ok := x.GetStarting().(*Paging_Cursor); ok {
		return x.Cursor
	}
	return ""
}

func (x *Paging) GetOffset() int32 {
	if x, ok := x.GetStarting().(*Paging_Offset); ok {
		return x.Offset
	}
	return 0
}

type isPaging_Starting interface {
	isPaging_Starting()
}

type Paging_Cursor struct {
	Cursor string `protobuf:"bytes,3,opt,name=cursor,proto3,oneof"`
}

type Paging_Offset struct {
	Offset int32 `protobuf:"varint,4,opt,name=offset,proto3,oneof"`
}

func (*Paging_Cursor) isPaging_Starting() {}

func (*Paging_Offset) isPaging_Starting() {}

type Response struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Insertion  []*Insertion `protobuf:"bytes,2,rep,name=insertion,proto3" json:"insertion,omitempty"`
	PagingInfo *PagingInfo  `protobuf:"bytes,3,opt,name=paging_info,json=pagingInfo,proto3" json:"paging_info,omitempty"`
}

func (x *Response) Reset() {
	*x = Response{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_delivery_delivery_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Response) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Response) ProtoMessage() {}

func (x *Response) ProtoReflect() protoreflect.Message {
	mi := &file_proto_delivery_delivery_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Response.ProtoReflect.Descriptor instead.
func (*Response) Descriptor() ([]byte, []int) {
	return file_proto_delivery_delivery_proto_rawDescGZIP(), []int{2}
}

func (x *Response) GetInsertion() []*Insertion {
	if x != nil {
		return x.Insertion
	}
	return nil
}

func (x *Response) GetPagingInfo() *PagingInfo {
	if x != nil {
		return x.PagingInfo
	}
	return nil
}

type PagingInfo struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PagingId string `protobuf:"bytes,1,opt,name=paging_id,json=pagingId,proto3" json:"paging_id,omitempty"`
	Cursor   string `protobuf:"bytes,2,opt,name=cursor,proto3" json:"cursor,omitempty"`
}

func (x *PagingInfo) Reset() {
	*x = PagingInfo{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_delivery_delivery_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PagingInfo) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PagingInfo) ProtoMessage() {}

func (x *PagingInfo) ProtoReflect() protoreflect.Message {
	mi := &file_proto_delivery_delivery_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PagingInfo.ProtoReflect.Descriptor instead.
func (*PagingInfo) Descriptor() ([]byte, []int) {
	return file_proto_delivery_delivery_proto_rawDescGZIP(), []int{3}
}

func (x *PagingInfo) GetPagingId() string {
	if x != nil {
		return x.PagingId
	}
	return ""
}

func (x *PagingInfo) GetCursor() string {
	if x != nil {
		return x.Cursor
	}
	return ""
}

type Insertion struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PlatformId     uint64             `protobuf:"varint,1,opt,name=platform_id,json=platformId,proto3" json:"platform_id,omitempty"`
	UserInfo       *common.UserInfo   `protobuf:"bytes,2,opt,name=user_info,json=userInfo,proto3" json:"user_info,omitempty"`
	Timing         *common.Timing     `protobuf:"bytes,3,opt,name=timing,proto3" json:"timing,omitempty"`
	ClientInfo     *common.ClientInfo `protobuf:"bytes,4,opt,name=client_info,json=clientInfo,proto3" json:"client_info,omitempty"`
	InsertionId    string             `protobuf:"bytes,6,opt,name=insertion_id,json=insertionId,proto3" json:"insertion_id,omitempty"`
	RequestId      string             `protobuf:"bytes,7,opt,name=request_id,json=requestId,proto3" json:"request_id,omitempty"`
	ViewId         string             `protobuf:"bytes,9,opt,name=view_id,json=viewId,proto3" json:"view_id,omitempty"`
	AutoViewId     string             `protobuf:"bytes,21,opt,name=auto_view_id,json=autoViewId,proto3" json:"auto_view_id,omitempty"`
	SessionId      string             `protobuf:"bytes,8,opt,name=session_id,json=sessionId,proto3" json:"session_id,omitempty"`
	ContentId      string             `protobuf:"bytes,10,opt,name=content_id,json=contentId,proto3" json:"content_id,omitempty"`
	Position       *uint64            `protobuf:"varint,12,opt,name=position,proto3,oneof" json:"position,omitempty"`
	Properties     *common.Properties `protobuf:"bytes,13,opt,name=properties,proto3" json:"properties,omitempty"`
	RetrievalRank  *uint64            `protobuf:"varint,19,opt,name=retrieval_rank,json=retrievalRank,proto3,oneof" json:"retrieval_rank,omitempty"`
	RetrievalScore *float32           `protobuf:"fixed32,20,opt,name=retrieval_score,json=retrievalScore,proto3,oneof" json:"retrieval_score,omitempty"`
}

func (x *Insertion) Reset() {
	*x = Insertion{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_delivery_delivery_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Insertion) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Insertion) ProtoMessage() {}

func (x *Insertion) ProtoReflect() protoreflect.Message {
	mi := &file_proto_delivery_delivery_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Insertion.ProtoReflect.Descriptor instead.
func (*Insertion) Descriptor() ([]byte, []int) {
	return file_proto_delivery_delivery_proto_rawDescGZIP(), []int{4}
}

func (x *Insertion) GetPlatformId() uint64 {
	if x != nil {
		return x.PlatformId
	}
	return 0
}

func (x *Insertion) GetUserInfo() *common.UserInfo {
	if x != nil {
		return x.UserInfo
	}
	return nil
}

func (x *Insertion) GetTiming() *common.Timing {
	if x != nil {
		return x.Timing
	}
	return nil
}

func (x *Insertion) GetClientInfo() *common.ClientInfo {
	if x != nil {
		return x.ClientInfo
	}
	return nil
}

func (x *Insertion) GetInsertionId() string {
	if x != nil {
		return x.InsertionId
	}
	return ""
}

func (x *Insertion) GetRequestId() string {
	if x != nil {
		return x.RequestId
	}
	return ""
}

func (x *Insertion) GetViewId() string {
	if x != nil {
		return x.ViewId
	}
	return ""
}

func (x *Insertion) GetAutoViewId() string {
	if x != nil {
		return x.AutoViewId
	}
	return ""
}

func (x *Insertion) GetSessionId() string {
	if x != nil {
		return x.SessionId
	}
	return ""
}

func (x *Insertion) GetContentId() string {
	if x != nil {
		return x.ContentId
	}
	return ""
}

func (x *Insertion) GetPosition() uint64 {
	if x != nil && x.Position != nil {
		return *x.Position
	}
	return 0
}

func (x *Insertion) GetProperties() *common.Properties {
	if x != nil {
		return x.Properties
	}
	return nil
}

func (x *Insertion) GetRetrievalRank() uint64 {
	if x != nil && x.RetrievalRank != nil {
		return *x.RetrievalRank
	}
	return 0
}

func (x *Insertion) GetRetrievalScore() float32 {
	if x != nil && x.RetrievalScore != nil {
		return *x.RetrievalScore
	}
	return 0
}

var File_proto_delivery_delivery_proto protoreflect.FileDescriptor

var file_proto_delivery_delivery_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79,
	0x2f, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x08, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79, 0x1a, 0x19, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2f, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x6c, 0x69,
	0x76, 0x65, 0x72, 0x79, 0x2f, 0x62, 0x6c, 0x65, 0x6e, 0x64, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0xb1, 0x05, 0x0a, 0x07, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f,
	0x0a, 0x0b, 0x70, 0x6c, 0x61, 0x74, 0x66, 0x6f, 0x72, 0x6d, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x04, 0x52, 0x0a, 0x70, 0x6c, 0x61, 0x74, 0x66, 0x6f, 0x72, 0x6d, 0x49, 0x64, 0x12,
	0x2d, 0x0a, 0x09, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x10, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72,
	0x49, 0x6e, 0x66, 0x6f, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x26,
	0x0a, 0x06, 0x74, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e,
	0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x54, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x52, 0x06,
	0x74, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x12, 0x33, 0x0a, 0x0b, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74,
	0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52,
	0x0a, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x26, 0x0a, 0x06, 0x64,
	0x65, 0x76, 0x69, 0x63, 0x65, 0x18, 0x12, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x44, 0x65, 0x76, 0x69, 0x63, 0x65, 0x52, 0x06, 0x64, 0x65, 0x76,
	0x69, 0x63, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x69,
	0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x49, 0x64, 0x12, 0x17, 0x0a, 0x07, 0x76, 0x69, 0x65, 0x77, 0x5f, 0x69, 0x64, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x06, 0x76, 0x69, 0x65, 0x77, 0x49, 0x64, 0x12, 0x20, 0x0a, 0x0c, 0x61,
	0x75, 0x74, 0x6f, 0x5f, 0x76, 0x69, 0x65, 0x77, 0x5f, 0x69, 0x64, 0x18, 0x13, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0a, 0x61, 0x75, 0x74, 0x6f, 0x56, 0x69, 0x65, 0x77, 0x49, 0x64, 0x12, 0x1d, 0x0a,
	0x0a, 0x73, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x09, 0x73, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x2a, 0x0a, 0x11,
	0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x5f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x69,
	0x64, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x49, 0x64, 0x12, 0x2c, 0x0a, 0x08, 0x75, 0x73, 0x65, 0x5f,
	0x63, 0x61, 0x73, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x11, 0x2e, 0x64, 0x65, 0x6c,
	0x69, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x55, 0x73, 0x65, 0x43, 0x61, 0x73, 0x65, 0x52, 0x07, 0x75,
	0x73, 0x65, 0x43, 0x61, 0x73, 0x65, 0x12, 0x21, 0x0a, 0x0c, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68,
	0x5f, 0x71, 0x75, 0x65, 0x72, 0x79, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x73, 0x65,
	0x61, 0x72, 0x63, 0x68, 0x51, 0x75, 0x65, 0x72, 0x79, 0x12, 0x28, 0x0a, 0x06, 0x70, 0x61, 0x67,
	0x69, 0x6e, 0x67, 0x18, 0x11, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x64, 0x65, 0x6c, 0x69,
	0x76, 0x65, 0x72, 0x79, 0x2e, 0x50, 0x61, 0x67, 0x69, 0x6e, 0x67, 0x52, 0x06, 0x70, 0x61, 0x67,
	0x69, 0x6e, 0x67, 0x12, 0x31, 0x0a, 0x09, 0x69, 0x6e, 0x73, 0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e,
	0x18, 0x0b, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72,
	0x79, 0x2e, 0x49, 0x6e, 0x73, 0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x09, 0x69, 0x6e, 0x73,
	0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x3e, 0x0a, 0x0e, 0x62, 0x6c, 0x65, 0x6e, 0x64, 0x65,
	0x72, 0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17,
	0x2e, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x42, 0x6c, 0x65, 0x6e, 0x64, 0x65,
	0x72, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x52, 0x0d, 0x62, 0x6c, 0x65, 0x6e, 0x64, 0x65, 0x72,
	0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x32, 0x0a, 0x0a, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72,
	0x74, 0x69, 0x65, 0x73, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x63, 0x6f, 0x6d,
	0x6d, 0x6f, 0x6e, 0x2e, 0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x69, 0x65, 0x73, 0x52, 0x0a,
	0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x69, 0x65, 0x73, 0x4a, 0x04, 0x08, 0x05, 0x10, 0x06,
	0x4a, 0x04, 0x08, 0x0f, 0x10, 0x10, 0x22, 0x79, 0x0a, 0x06, 0x50, 0x61, 0x67, 0x69, 0x6e, 0x67,
	0x12, 0x1b, 0x0a, 0x09, 0x70, 0x61, 0x67, 0x69, 0x6e, 0x67, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x61, 0x67, 0x69, 0x6e, 0x67, 0x49, 0x64, 0x12, 0x12, 0x0a,
	0x04, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x04, 0x73, 0x69, 0x7a,
	0x65, 0x12, 0x18, 0x0a, 0x06, 0x63, 0x75, 0x72, 0x73, 0x6f, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x48, 0x00, 0x52, 0x06, 0x63, 0x75, 0x72, 0x73, 0x6f, 0x72, 0x12, 0x18, 0x0a, 0x06, 0x6f,
	0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x48, 0x00, 0x52, 0x06, 0x6f,
	0x66, 0x66, 0x73, 0x65, 0x74, 0x42, 0x0a, 0x0a, 0x08, 0x73, 0x74, 0x61, 0x72, 0x74, 0x69, 0x6e,
	0x67, 0x22, 0x7a, 0x0a, 0x08, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x31, 0x0a,
	0x09, 0x69, 0x6e, 0x73, 0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x13, 0x2e, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79, 0x2e, 0x49, 0x6e, 0x73, 0x65,
	0x72, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x09, 0x69, 0x6e, 0x73, 0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x35, 0x0a, 0x0b, 0x70, 0x61, 0x67, 0x69, 0x6e, 0x67, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79,
	0x2e, 0x50, 0x61, 0x67, 0x69, 0x6e, 0x67, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x0a, 0x70, 0x61, 0x67,
	0x69, 0x6e, 0x67, 0x49, 0x6e, 0x66, 0x6f, 0x4a, 0x04, 0x08, 0x01, 0x10, 0x02, 0x22, 0x41, 0x0a,
	0x0a, 0x50, 0x61, 0x67, 0x69, 0x6e, 0x67, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x1b, 0x0a, 0x09, 0x70,
	0x61, 0x67, 0x69, 0x6e, 0x67, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08,
	0x70, 0x61, 0x67, 0x69, 0x6e, 0x67, 0x49, 0x64, 0x12, 0x16, 0x0a, 0x06, 0x63, 0x75, 0x72, 0x73,
	0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x63, 0x75, 0x72, 0x73, 0x6f, 0x72,
	0x22, 0x86, 0x05, 0x0a, 0x09, 0x49, 0x6e, 0x73, 0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1f,
	0x0a, 0x0b, 0x70, 0x6c, 0x61, 0x74, 0x66, 0x6f, 0x72, 0x6d, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x04, 0x52, 0x0a, 0x70, 0x6c, 0x61, 0x74, 0x66, 0x6f, 0x72, 0x6d, 0x49, 0x64, 0x12,
	0x2d, 0x0a, 0x09, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x10, 0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x55, 0x73, 0x65, 0x72,
	0x49, 0x6e, 0x66, 0x6f, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x26,
	0x0a, 0x06, 0x74, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e,
	0x2e, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x54, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x52, 0x06,
	0x74, 0x69, 0x6d, 0x69, 0x6e, 0x67, 0x12, 0x33, 0x0a, 0x0b, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74,
	0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x43, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x52,
	0x0a, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x21, 0x0a, 0x0c, 0x69,
	0x6e, 0x73, 0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x69, 0x6e, 0x73, 0x65, 0x72, 0x74, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x1d,
	0x0a, 0x0a, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x07, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x09, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x49, 0x64, 0x12, 0x17, 0x0a,
	0x07, 0x76, 0x69, 0x65, 0x77, 0x5f, 0x69, 0x64, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06,
	0x76, 0x69, 0x65, 0x77, 0x49, 0x64, 0x12, 0x20, 0x0a, 0x0c, 0x61, 0x75, 0x74, 0x6f, 0x5f, 0x76,
	0x69, 0x65, 0x77, 0x5f, 0x69, 0x64, 0x18, 0x15, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x61, 0x75,
	0x74, 0x6f, 0x56, 0x69, 0x65, 0x77, 0x49, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x73, 0x65, 0x73, 0x73,
	0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x73, 0x65,
	0x73, 0x73, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x63, 0x6f, 0x6e, 0x74, 0x65,
	0x6e, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x63, 0x6f, 0x6e,
	0x74, 0x65, 0x6e, 0x74, 0x49, 0x64, 0x12, 0x1f, 0x0a, 0x08, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x04, 0x48, 0x00, 0x52, 0x08, 0x70, 0x6f, 0x73, 0x69,
	0x74, 0x69, 0x6f, 0x6e, 0x88, 0x01, 0x01, 0x12, 0x32, 0x0a, 0x0a, 0x70, 0x72, 0x6f, 0x70, 0x65,
	0x72, 0x74, 0x69, 0x65, 0x73, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x63, 0x6f,
	0x6d, 0x6d, 0x6f, 0x6e, 0x2e, 0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x69, 0x65, 0x73, 0x52,
	0x0a, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x69, 0x65, 0x73, 0x12, 0x2a, 0x0a, 0x0e, 0x72,
	0x65, 0x74, 0x72, 0x69, 0x65, 0x76, 0x61, 0x6c, 0x5f, 0x72, 0x61, 0x6e, 0x6b, 0x18, 0x13, 0x20,
	0x01, 0x28, 0x04, 0x48, 0x01, 0x52, 0x0d, 0x72, 0x65, 0x74, 0x72, 0x69, 0x65, 0x76, 0x61, 0x6c,
	0x52, 0x61, 0x6e, 0x6b, 0x88, 0x01, 0x01, 0x12, 0x2c, 0x0a, 0x0f, 0x72, 0x65, 0x74, 0x72, 0x69,
	0x65, 0x76, 0x61, 0x6c, 0x5f, 0x73, 0x63, 0x6f, 0x72, 0x65, 0x18, 0x14, 0x20, 0x01, 0x28, 0x02,
	0x48, 0x02, 0x52, 0x0e, 0x72, 0x65, 0x74, 0x72, 0x69, 0x65, 0x76, 0x61, 0x6c, 0x53, 0x63, 0x6f,
	0x72, 0x65, 0x88, 0x01, 0x01, 0x42, 0x0b, 0x0a, 0x09, 0x5f, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69,
	0x6f, 0x6e, 0x42, 0x11, 0x0a, 0x0f, 0x5f, 0x72, 0x65, 0x74, 0x72, 0x69, 0x65, 0x76, 0x61, 0x6c,
	0x5f, 0x72, 0x61, 0x6e, 0x6b, 0x42, 0x12, 0x0a, 0x10, 0x5f, 0x72, 0x65, 0x74, 0x72, 0x69, 0x65,
	0x76, 0x61, 0x6c, 0x5f, 0x73, 0x63, 0x6f, 0x72, 0x65, 0x4a, 0x04, 0x08, 0x05, 0x10, 0x06, 0x4a,
	0x04, 0x08, 0x0b, 0x10, 0x0c, 0x4a, 0x04, 0x08, 0x0e, 0x10, 0x0f, 0x4a, 0x04, 0x08, 0x0f, 0x10,
	0x10, 0x4a, 0x04, 0x08, 0x10, 0x10, 0x11, 0x4a, 0x04, 0x08, 0x11, 0x10, 0x12, 0x4a, 0x04, 0x08,
	0x12, 0x10, 0x13, 0x4a, 0x04, 0x08, 0x16, 0x10, 0x17, 0x2a, 0xda, 0x01, 0x0a, 0x07, 0x55, 0x73,
	0x65, 0x43, 0x61, 0x73, 0x65, 0x12, 0x14, 0x0a, 0x10, 0x55, 0x4e, 0x4b, 0x4e, 0x4f, 0x57, 0x4e,
	0x5f, 0x55, 0x53, 0x45, 0x5f, 0x43, 0x41, 0x53, 0x45, 0x10, 0x00, 0x12, 0x0a, 0x0a, 0x06, 0x43,
	0x55, 0x53, 0x54, 0x4f, 0x4d, 0x10, 0x01, 0x12, 0x0a, 0x0a, 0x06, 0x53, 0x45, 0x41, 0x52, 0x43,
	0x48, 0x10, 0x02, 0x12, 0x16, 0x0a, 0x12, 0x53, 0x45, 0x41, 0x52, 0x43, 0x48, 0x5f, 0x53, 0x55,
	0x47, 0x47, 0x45, 0x53, 0x54, 0x49, 0x4f, 0x4e, 0x53, 0x10, 0x03, 0x12, 0x08, 0x0a, 0x04, 0x46,
	0x45, 0x45, 0x44, 0x10, 0x04, 0x12, 0x13, 0x0a, 0x0f, 0x52, 0x45, 0x4c, 0x41, 0x54, 0x45, 0x44,
	0x5f, 0x43, 0x4f, 0x4e, 0x54, 0x45, 0x4e, 0x54, 0x10, 0x05, 0x12, 0x0c, 0x0a, 0x08, 0x43, 0x4c,
	0x4f, 0x53, 0x45, 0x5f, 0x55, 0x50, 0x10, 0x06, 0x12, 0x14, 0x0a, 0x10, 0x43, 0x41, 0x54, 0x45,
	0x47, 0x4f, 0x52, 0x59, 0x5f, 0x43, 0x4f, 0x4e, 0x54, 0x45, 0x4e, 0x54, 0x10, 0x07, 0x12, 0x0e,
	0x0a, 0x0a, 0x4d, 0x59, 0x5f, 0x43, 0x4f, 0x4e, 0x54, 0x45, 0x4e, 0x54, 0x10, 0x08, 0x12, 0x14,
	0x0a, 0x10, 0x4d, 0x59, 0x5f, 0x53, 0x41, 0x56, 0x45, 0x44, 0x5f, 0x43, 0x4f, 0x4e, 0x54, 0x45,
	0x4e, 0x54, 0x10, 0x09, 0x12, 0x12, 0x0a, 0x0e, 0x53, 0x45, 0x4c, 0x4c, 0x45, 0x52, 0x5f, 0x43,
	0x4f, 0x4e, 0x54, 0x45, 0x4e, 0x54, 0x10, 0x0a, 0x12, 0x0c, 0x0a, 0x08, 0x44, 0x49, 0x53, 0x43,
	0x4f, 0x56, 0x45, 0x52, 0x10, 0x0b, 0x42, 0x62, 0x0a, 0x1a, 0x61, 0x69, 0x2e, 0x70, 0x72, 0x6f,
	0x6d, 0x6f, 0x74, 0x65, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x64, 0x65, 0x6c, 0x69,
	0x76, 0x65, 0x72, 0x79, 0x42, 0x08, 0x44, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79, 0x50, 0x01,
	0x5a, 0x38, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x70, 0x72, 0x6f,
	0x6d, 0x6f, 0x74, 0x65, 0x64, 0x61, 0x69, 0x2f, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2f, 0x67,
	0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x64, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x64, 0x65, 0x6c, 0x69, 0x76, 0x65, 0x72, 0x79, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_proto_delivery_delivery_proto_rawDescOnce sync.Once
	file_proto_delivery_delivery_proto_rawDescData = file_proto_delivery_delivery_proto_rawDesc
)

func file_proto_delivery_delivery_proto_rawDescGZIP() []byte {
	file_proto_delivery_delivery_proto_rawDescOnce.Do(func() {
		file_proto_delivery_delivery_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_delivery_delivery_proto_rawDescData)
	})
	return file_proto_delivery_delivery_proto_rawDescData
}

var file_proto_delivery_delivery_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_proto_delivery_delivery_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_proto_delivery_delivery_proto_goTypes = []interface{}{
	(UseCase)(0),              // 0: delivery.UseCase
	(*Request)(nil),           // 1: delivery.Request
	(*Paging)(nil),            // 2: delivery.Paging
	(*Response)(nil),          // 3: delivery.Response
	(*PagingInfo)(nil),        // 4: delivery.PagingInfo
	(*Insertion)(nil),         // 5: delivery.Insertion
	(*common.UserInfo)(nil),   // 6: common.UserInfo
	(*common.Timing)(nil),     // 7: common.Timing
	(*common.ClientInfo)(nil), // 8: common.ClientInfo
	(*common.Device)(nil),     // 9: common.Device
	(*BlenderConfig)(nil),     // 10: delivery.BlenderConfig
	(*common.Properties)(nil), // 11: common.Properties
}
var file_proto_delivery_delivery_proto_depIdxs = []int32{
	6,  // 0: delivery.Request.user_info:type_name -> common.UserInfo
	7,  // 1: delivery.Request.timing:type_name -> common.Timing
	8,  // 2: delivery.Request.client_info:type_name -> common.ClientInfo
	9,  // 3: delivery.Request.device:type_name -> common.Device
	0,  // 4: delivery.Request.use_case:type_name -> delivery.UseCase
	2,  // 5: delivery.Request.paging:type_name -> delivery.Paging
	5,  // 6: delivery.Request.insertion:type_name -> delivery.Insertion
	10, // 7: delivery.Request.blender_config:type_name -> delivery.BlenderConfig
	11, // 8: delivery.Request.properties:type_name -> common.Properties
	5,  // 9: delivery.Response.insertion:type_name -> delivery.Insertion
	4,  // 10: delivery.Response.paging_info:type_name -> delivery.PagingInfo
	6,  // 11: delivery.Insertion.user_info:type_name -> common.UserInfo
	7,  // 12: delivery.Insertion.timing:type_name -> common.Timing
	8,  // 13: delivery.Insertion.client_info:type_name -> common.ClientInfo
	11, // 14: delivery.Insertion.properties:type_name -> common.Properties
	15, // [15:15] is the sub-list for method output_type
	15, // [15:15] is the sub-list for method input_type
	15, // [15:15] is the sub-list for extension type_name
	15, // [15:15] is the sub-list for extension extendee
	0,  // [0:15] is the sub-list for field type_name
}

func init() { file_proto_delivery_delivery_proto_init() }
func file_proto_delivery_delivery_proto_init() {
	if File_proto_delivery_delivery_proto != nil {
		return
	}
	file_proto_delivery_blender_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_proto_delivery_delivery_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Request); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_delivery_delivery_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Paging); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_delivery_delivery_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Response); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_delivery_delivery_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PagingInfo); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_proto_delivery_delivery_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Insertion); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	file_proto_delivery_delivery_proto_msgTypes[1].OneofWrappers = []interface{}{
		(*Paging_Cursor)(nil),
		(*Paging_Offset)(nil),
	}
	file_proto_delivery_delivery_proto_msgTypes[4].OneofWrappers = []interface{}{}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_delivery_delivery_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_delivery_delivery_proto_goTypes,
		DependencyIndexes: file_proto_delivery_delivery_proto_depIdxs,
		EnumInfos:         file_proto_delivery_delivery_proto_enumTypes,
		MessageInfos:      file_proto_delivery_delivery_proto_msgTypes,
	}.Build()
	File_proto_delivery_delivery_proto = out.File
	file_proto_delivery_delivery_proto_rawDesc = nil
	file_proto_delivery_delivery_proto_goTypes = nil
	file_proto_delivery_delivery_proto_depIdxs = nil
}
