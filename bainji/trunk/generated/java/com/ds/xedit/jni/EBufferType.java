/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public enum EBufferType {
  EBufferType_Invalid,
  EBufferType_Video,
  EBufferType_Audio,
  EBufferType_Title;

  public final int swigValue() {
    return swigValue;
  }

  public static EBufferType swigToEnum(int swigValue) {
    EBufferType[] swigValues = EBufferType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EBufferType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EBufferType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private EBufferType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private EBufferType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private EBufferType(EBufferType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

