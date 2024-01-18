package ai.promoted.proto.delivery.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: proto/delivery/delivery_grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeliveryGrpc {

  private DeliveryGrpc() {}

  public static final String SERVICE_NAME = "delivery_grpc.Delivery";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.promoted.proto.delivery.Request,
      ai.promoted.proto.delivery.Response> getDeliverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deliver",
      requestType = ai.promoted.proto.delivery.Request.class,
      responseType = ai.promoted.proto.delivery.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.promoted.proto.delivery.Request,
      ai.promoted.proto.delivery.Response> getDeliverMethod() {
    io.grpc.MethodDescriptor<ai.promoted.proto.delivery.Request, ai.promoted.proto.delivery.Response> getDeliverMethod;
    if ((getDeliverMethod = DeliveryGrpc.getDeliverMethod) == null) {
      synchronized (DeliveryGrpc.class) {
        if ((getDeliverMethod = DeliveryGrpc.getDeliverMethod) == null) {
          DeliveryGrpc.getDeliverMethod = getDeliverMethod =
              io.grpc.MethodDescriptor.<ai.promoted.proto.delivery.Request, ai.promoted.proto.delivery.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deliver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.promoted.proto.delivery.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.promoted.proto.delivery.Response.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryMethodDescriptorSupplier("Deliver"))
              .build();
        }
      }
    }
    return getDeliverMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeliveryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryStub>() {
        @java.lang.Override
        public DeliveryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryStub(channel, callOptions);
        }
      };
    return DeliveryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeliveryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryBlockingStub>() {
        @java.lang.Override
        public DeliveryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryBlockingStub(channel, callOptions);
        }
      };
    return DeliveryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeliveryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryFutureStub>() {
        @java.lang.Override
        public DeliveryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryFutureStub(channel, callOptions);
        }
      };
    return DeliveryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DeliveryImplBase implements io.grpc.BindableService {

    /**
     */
    public void deliver(ai.promoted.proto.delivery.Request request,
        io.grpc.stub.StreamObserver<ai.promoted.proto.delivery.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeliverMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeliverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ai.promoted.proto.delivery.Request,
                ai.promoted.proto.delivery.Response>(
                  this, METHODID_DELIVER)))
          .build();
    }
  }

  /**
   */
  public static final class DeliveryStub extends io.grpc.stub.AbstractAsyncStub<DeliveryStub> {
    private DeliveryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryStub(channel, callOptions);
    }

    /**
     */
    public void deliver(ai.promoted.proto.delivery.Request request,
        io.grpc.stub.StreamObserver<ai.promoted.proto.delivery.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeliverMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeliveryBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeliveryBlockingStub> {
    private DeliveryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.promoted.proto.delivery.Response deliver(ai.promoted.proto.delivery.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeliverMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeliveryFutureStub extends io.grpc.stub.AbstractFutureStub<DeliveryFutureStub> {
    private DeliveryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.promoted.proto.delivery.Response> deliver(
        ai.promoted.proto.delivery.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeliverMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELIVER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeliveryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeliveryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELIVER:
          serviceImpl.deliver((ai.promoted.proto.delivery.Request) request,
              (io.grpc.stub.StreamObserver<ai.promoted.proto.delivery.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeliveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeliveryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.promoted.proto.delivery.grpc.DeliveryGrpcProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Delivery");
    }
  }

  private static final class DeliveryFileDescriptorSupplier
      extends DeliveryBaseDescriptorSupplier {
    DeliveryFileDescriptorSupplier() {}
  }

  private static final class DeliveryMethodDescriptorSupplier
      extends DeliveryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeliveryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeliveryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeliveryFileDescriptorSupplier())
              .addMethod(getDeliverMethod())
              .build();
        }
      }
    }
    return result;
  }
}
