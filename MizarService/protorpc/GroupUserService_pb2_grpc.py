# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc



class GroupUserServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """


class GroupUserServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass


def add_GroupUserServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'com.dipper.proto.rpc.GroupUserService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))