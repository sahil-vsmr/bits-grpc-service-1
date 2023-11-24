package io.grpc.examples.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterDownStreamGrpc {

  private GreeterDownStreamGrpc() {}

  public static final java.lang.String SERVICE_NAME = "helloworld.GreeterDownStream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = io.grpc.examples.helloworld.HelloRequest.class,
      responseType = io.grpc.examples.helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      io.grpc.examples.helloworld.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterDownStreamGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterDownStreamGrpc.class) {
        if ((getSayHelloMethod = GreeterDownStreamGrpc.getSayHelloMethod) == null) {
          GreeterDownStreamGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.HelloRequest, io.grpc.examples.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterDownStreamMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.CalculateSquareRequest,
      io.grpc.examples.helloworld.CalculateSquareResponse> getCalculateSquareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateSquare",
      requestType = io.grpc.examples.helloworld.CalculateSquareRequest.class,
      responseType = io.grpc.examples.helloworld.CalculateSquareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.CalculateSquareRequest,
      io.grpc.examples.helloworld.CalculateSquareResponse> getCalculateSquareMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.CalculateSquareRequest, io.grpc.examples.helloworld.CalculateSquareResponse> getCalculateSquareMethod;
    if ((getCalculateSquareMethod = GreeterDownStreamGrpc.getCalculateSquareMethod) == null) {
      synchronized (GreeterDownStreamGrpc.class) {
        if ((getCalculateSquareMethod = GreeterDownStreamGrpc.getCalculateSquareMethod) == null) {
          GreeterDownStreamGrpc.getCalculateSquareMethod = getCalculateSquareMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.CalculateSquareRequest, io.grpc.examples.helloworld.CalculateSquareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateSquare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.CalculateSquareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.CalculateSquareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterDownStreamMethodDescriptorSupplier("CalculateSquare"))
              .build();
        }
      }
    }
    return getCalculateSquareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.EmptyRequest,
      io.grpc.examples.helloworld.EmptyResponse> getEmptyRequestRpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmptyRequestRpc",
      requestType = io.grpc.examples.helloworld.EmptyRequest.class,
      responseType = io.grpc.examples.helloworld.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.EmptyRequest,
      io.grpc.examples.helloworld.EmptyResponse> getEmptyRequestRpcMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.EmptyRequest, io.grpc.examples.helloworld.EmptyResponse> getEmptyRequestRpcMethod;
    if ((getEmptyRequestRpcMethod = GreeterDownStreamGrpc.getEmptyRequestRpcMethod) == null) {
      synchronized (GreeterDownStreamGrpc.class) {
        if ((getEmptyRequestRpcMethod = GreeterDownStreamGrpc.getEmptyRequestRpcMethod) == null) {
          GreeterDownStreamGrpc.getEmptyRequestRpcMethod = getEmptyRequestRpcMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.EmptyRequest, io.grpc.examples.helloworld.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmptyRequestRpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterDownStreamMethodDescriptorSupplier("EmptyRequestRpc"))
              .build();
        }
      }
    }
    return getEmptyRequestRpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.PostRequest,
      io.grpc.examples.helloworld.PostResponse> getPostRequestRpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostRequestRpc",
      requestType = io.grpc.examples.helloworld.PostRequest.class,
      responseType = io.grpc.examples.helloworld.PostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.PostRequest,
      io.grpc.examples.helloworld.PostResponse> getPostRequestRpcMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.PostRequest, io.grpc.examples.helloworld.PostResponse> getPostRequestRpcMethod;
    if ((getPostRequestRpcMethod = GreeterDownStreamGrpc.getPostRequestRpcMethod) == null) {
      synchronized (GreeterDownStreamGrpc.class) {
        if ((getPostRequestRpcMethod = GreeterDownStreamGrpc.getPostRequestRpcMethod) == null) {
          GreeterDownStreamGrpc.getPostRequestRpcMethod = getPostRequestRpcMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.PostRequest, io.grpc.examples.helloworld.PostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostRequestRpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.PostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.PostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterDownStreamMethodDescriptorSupplier("PostRequestRpc"))
              .build();
        }
      }
    }
    return getPostRequestRpcMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterDownStreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterDownStreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterDownStreamStub>() {
        @java.lang.Override
        public GreeterDownStreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterDownStreamStub(channel, callOptions);
        }
      };
    return GreeterDownStreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterDownStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterDownStreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterDownStreamBlockingStub>() {
        @java.lang.Override
        public GreeterDownStreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterDownStreamBlockingStub(channel, callOptions);
        }
      };
    return GreeterDownStreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterDownStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterDownStreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterDownStreamFutureStub>() {
        @java.lang.Override
        public GreeterDownStreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterDownStreamFutureStub(channel, callOptions);
        }
      };
    return GreeterDownStreamFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default void sayHello(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    default void calculateSquare(io.grpc.examples.helloworld.CalculateSquareRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.CalculateSquareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateSquareMethod(), responseObserver);
    }

    /**
     */
    default void emptyRequestRpc(io.grpc.examples.helloworld.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmptyRequestRpcMethod(), responseObserver);
    }

    /**
     */
    default void postRequestRpc(io.grpc.examples.helloworld.PostRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.PostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostRequestRpcMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GreeterDownStream.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterDownStreamImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GreeterDownStreamGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GreeterDownStream.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterDownStreamStub
      extends io.grpc.stub.AbstractAsyncStub<GreeterDownStreamStub> {
    private GreeterDownStreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterDownStreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterDownStreamStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateSquare(io.grpc.examples.helloworld.CalculateSquareRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.CalculateSquareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateSquareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emptyRequestRpc(io.grpc.examples.helloworld.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmptyRequestRpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postRequestRpc(io.grpc.examples.helloworld.PostRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.PostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostRequestRpcMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GreeterDownStream.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterDownStreamBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GreeterDownStreamBlockingStub> {
    private GreeterDownStreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterDownStreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterDownStreamBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.examples.helloworld.HelloReply sayHello(io.grpc.examples.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.helloworld.CalculateSquareResponse calculateSquare(io.grpc.examples.helloworld.CalculateSquareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateSquareMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.helloworld.EmptyResponse emptyRequestRpc(io.grpc.examples.helloworld.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmptyRequestRpcMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.helloworld.PostResponse postRequestRpc(io.grpc.examples.helloworld.PostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostRequestRpcMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GreeterDownStream.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterDownStreamFutureStub
      extends io.grpc.stub.AbstractFutureStub<GreeterDownStreamFutureStub> {
    private GreeterDownStreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterDownStreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterDownStreamFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.HelloReply> sayHello(
        io.grpc.examples.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.CalculateSquareResponse> calculateSquare(
        io.grpc.examples.helloworld.CalculateSquareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateSquareMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.EmptyResponse> emptyRequestRpc(
        io.grpc.examples.helloworld.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmptyRequestRpcMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.PostResponse> postRequestRpc(
        io.grpc.examples.helloworld.PostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostRequestRpcMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_CALCULATE_SQUARE = 1;
  private static final int METHODID_EMPTY_REQUEST_RPC = 2;
  private static final int METHODID_POST_REQUEST_RPC = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.examples.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.HelloReply>) responseObserver);
          break;
        case METHODID_CALCULATE_SQUARE:
          serviceImpl.calculateSquare((io.grpc.examples.helloworld.CalculateSquareRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.CalculateSquareResponse>) responseObserver);
          break;
        case METHODID_EMPTY_REQUEST_RPC:
          serviceImpl.emptyRequestRpc((io.grpc.examples.helloworld.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.EmptyResponse>) responseObserver);
          break;
        case METHODID_POST_REQUEST_RPC:
          serviceImpl.postRequestRpc((io.grpc.examples.helloworld.PostRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.PostResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.helloworld.HelloRequest,
              io.grpc.examples.helloworld.HelloReply>(
                service, METHODID_SAY_HELLO)))
        .addMethod(
          getCalculateSquareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.helloworld.CalculateSquareRequest,
              io.grpc.examples.helloworld.CalculateSquareResponse>(
                service, METHODID_CALCULATE_SQUARE)))
        .addMethod(
          getEmptyRequestRpcMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.helloworld.EmptyRequest,
              io.grpc.examples.helloworld.EmptyResponse>(
                service, METHODID_EMPTY_REQUEST_RPC)))
        .addMethod(
          getPostRequestRpcMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.helloworld.PostRequest,
              io.grpc.examples.helloworld.PostResponse>(
                service, METHODID_POST_REQUEST_RPC)))
        .build();
  }

  private static abstract class GreeterDownStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterDownStreamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreeterDownStream");
    }
  }

  private static final class GreeterDownStreamFileDescriptorSupplier
      extends GreeterDownStreamBaseDescriptorSupplier {
    GreeterDownStreamFileDescriptorSupplier() {}
  }

  private static final class GreeterDownStreamMethodDescriptorSupplier
      extends GreeterDownStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GreeterDownStreamMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GreeterDownStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterDownStreamFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getCalculateSquareMethod())
              .addMethod(getEmptyRequestRpcMethod())
              .addMethod(getPostRequestRpcMethod())
              .build();
        }
      }
    }
    return result;
  }
}
