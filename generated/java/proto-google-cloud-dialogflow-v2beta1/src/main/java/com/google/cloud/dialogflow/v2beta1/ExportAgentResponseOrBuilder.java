// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ExportAgentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ExportAgentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri`
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   */
  java.lang.String getAgentUri();
  /**
   * <pre>
   * The URI to a file containing the exported agent. This field is populated
   * only if `agent_uri`
   * </pre>
   *
   * <code>string agent_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getAgentUriBytes();

  /**
   * <pre>
   * The exported agent.
   * </pre>
   *
   * <code>bytes agent_content = 2;</code>
   */
  com.google.protobuf.ByteString getAgentContent();

  public com.google.cloud.dialogflow.v2beta1.ExportAgentResponse.AgentCase getAgentCase();
}