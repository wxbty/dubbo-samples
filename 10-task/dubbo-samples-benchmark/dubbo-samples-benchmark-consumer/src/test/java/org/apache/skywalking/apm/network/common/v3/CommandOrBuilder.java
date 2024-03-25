// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/Command.proto

package org.apache.skywalking.apm.network.common.v3;

public interface CommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.Command)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Use command name to distinguish different data type.
   * </pre>
   *
   * <code>string command = 1;</code>
   * @return The command.
   */
  String getCommand();
  /**
   * <pre>
   * Use command name to distinguish different data type.
   * </pre>
   *
   * <code>string command = 1;</code>
   * @return The bytes for command.
   */
  com.google.protobuf.ByteString
      getCommandBytes();

  /**
   * <pre>
   * Data content in command.
   * The value of content needs to be serialized as string for transmission.
   * Basic data type: convert as string.
   * The list of basic data: multiple data are split by ",".
   * Complex data: serialize string through json.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair args = 2;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.common.v3.KeyStringValuePair>
      getArgsList();
  /**
   * <pre>
   * Data content in command.
   * The value of content needs to be serialized as string for transmission.
   * Basic data type: convert as string.
   * The list of basic data: multiple data are split by ",".
   * Complex data: serialize string through json.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair args = 2;</code>
   */
  org.apache.skywalking.apm.network.common.v3.KeyStringValuePair getArgs(int index);
  /**
   * <pre>
   * Data content in command.
   * The value of content needs to be serialized as string for transmission.
   * Basic data type: convert as string.
   * The list of basic data: multiple data are split by ",".
   * Complex data: serialize string through json.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair args = 2;</code>
   */
  int getArgsCount();
  /**
   * <pre>
   * Data content in command.
   * The value of content needs to be serialized as string for transmission.
   * Basic data type: convert as string.
   * The list of basic data: multiple data are split by ",".
   * Complex data: serialize string through json.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair args = 2;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.common.v3.KeyStringValuePairOrBuilder>
      getArgsOrBuilderList();
  /**
   * <pre>
   * Data content in command.
   * The value of content needs to be serialized as string for transmission.
   * Basic data type: convert as string.
   * The list of basic data: multiple data are split by ",".
   * Complex data: serialize string through json.
   * </pre>
   *
   * <code>repeated .skywalking.v3.KeyStringValuePair args = 2;</code>
   */
  org.apache.skywalking.apm.network.common.v3.KeyStringValuePairOrBuilder getArgsOrBuilder(
      int index);
}