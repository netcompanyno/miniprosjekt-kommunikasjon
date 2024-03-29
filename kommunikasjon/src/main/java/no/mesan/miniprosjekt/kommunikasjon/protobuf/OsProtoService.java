// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osService.proto

package no.mesan.miniprosjekt.kommunikasjon.protobuf;

public final class OsProtoService {
  private OsProtoService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static abstract class GetOssService
      implements com.google.protobuf.Service {
    protected GetOssService() {}
    
    public interface Interface {
      public abstract void getOss(
          com.google.protobuf.RpcController controller,
          no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request request,
          com.google.protobuf.RpcCallback<no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages> done);
      
    }
    
    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new GetOssService() {
        @java.lang.Override
        public  void getOss(
            com.google.protobuf.RpcController controller,
            no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request request,
            com.google.protobuf.RpcCallback<no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages> done) {
          impl.getOss(controller, request, done);
        }
        
      };
    }
    
    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }
        
        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.getOss(controller, (no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }
        
      };
    }
    
    public abstract void getOss(
        com.google.protobuf.RpcController controller,
        no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request request,
        com.google.protobuf.RpcCallback<no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages> done);
    
    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProtoService.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    
    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.getOss(controller, (no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request)request,
            com.google.protobuf.RpcUtil.<no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }
    
    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }
    
    public static final class Stub extends no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProtoService.GetOssService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.RpcChannel channel;
      
      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }
      
      public  void getOss(
          com.google.protobuf.RpcController controller,
          no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request request,
          com.google.protobuf.RpcCallback<no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages.class,
            no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages.getDefaultInstance()));
      }
    }
    
    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }
    
    public interface BlockingInterface {
      public no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages getOss(
          com.google.protobuf.RpcController controller,
          no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request request)
          throws com.google.protobuf.ServiceException;
    }
    
    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }
      
      private final com.google.protobuf.BlockingRpcChannel channel;
      
      public no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages getOss(
          com.google.protobuf.RpcController controller,
          no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.Request request)
          throws com.google.protobuf.ServiceException {
        return (no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.OsMessages.getDefaultInstance());
      }
      
    }
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017osService.proto\022\010protobuf\032\010os.proto2B\n" +
      "\rGetOssService\0221\n\006getOss\022\021.protobuf.Requ" +
      "est\032\024.protobuf.OsMessagesBA\n,no.mesan.mi" +
      "niprosjekt.kommunikasjon.protobufB\016OsPro" +
      "toService\210\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          no.mesan.miniprosjekt.kommunikasjon.protobuf.OsProto.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
