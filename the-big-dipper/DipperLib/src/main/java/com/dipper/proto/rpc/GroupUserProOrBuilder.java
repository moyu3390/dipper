// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupUserService.proto

package com.dipper.proto.rpc;

public interface GroupUserProOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.dipper.proto.rpc.GroupUserPro)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>int32 user_id = 2;</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>int32 group_id = 3;</code>
   * @return The groupId.
   */
  int getGroupId();

  /**
   * <code>string join_time = 4;</code>
   * @return The joinTime.
   */
  java.lang.String getJoinTime();
  /**
   * <code>string join_time = 4;</code>
   * @return The bytes for joinTime.
   */
  com.google.protobuf.ByteString
      getJoinTimeBytes();
}
