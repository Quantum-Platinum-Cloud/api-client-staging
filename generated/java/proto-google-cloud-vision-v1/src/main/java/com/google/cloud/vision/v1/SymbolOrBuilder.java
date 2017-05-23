// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/text_annotation.proto

package com.google.cloud.vision.v1;

public interface SymbolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.Symbol)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  boolean hasProperty();
  /**
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1.TextAnnotation.TextProperty getProperty();
  /**
   * <pre>
   * Additional information detected for the symbol.
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder();

  /**
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  boolean hasBoundingBox();
  /**
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  com.google.cloud.vision.v1.BoundingPoly getBoundingBox();
  /**
   * <pre>
   * The bounding box for the symbol.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   *   * when the text is horizontal it might look like:
   *      0----1
   *      |    |
   *      3----2
   *   * when it's rotated 180 degrees around the top-left corner it becomes:
   *      2----3
   *      |    |
   *      1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>optional .google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();

  /**
   * <pre>
   * The actual UTF-8 representation of the symbol.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   * The actual UTF-8 representation of the symbol.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();
}