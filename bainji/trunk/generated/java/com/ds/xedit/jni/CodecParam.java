/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public class CodecParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CodecParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CodecParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xeditJNI.delete_CodecParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setECodecID(ECodecID value) {
    xeditJNI.CodecParam_eCodecID_set(swigCPtr, this, value.swigValue());
  }

  public ECodecID getECodecID() {
    return ECodecID.swigToEnum(xeditJNI.CodecParam_eCodecID_get(swigCPtr, this));
  }

  public void setECodecProfile(ECodecProfile value) {
    xeditJNI.CodecParam_eCodecProfile_set(swigCPtr, this, value.swigValue());
  }

  public ECodecProfile getECodecProfile() {
    return ECodecProfile.swigToEnum(xeditJNI.CodecParam_eCodecProfile_get(swigCPtr, this));
  }

  public void setECodecLevel(ECodecLevel value) {
    xeditJNI.CodecParam_eCodecLevel_set(swigCPtr, this, value.swigValue());
  }

  public ECodecLevel getECodecLevel() {
    return ECodecLevel.swigToEnum(xeditJNI.CodecParam_eCodecLevel_get(swigCPtr, this));
  }

  public void setEBitrateMode(EBitrateMode value) {
    xeditJNI.CodecParam_eBitrateMode_set(swigCPtr, this, value.swigValue());
  }

  public EBitrateMode getEBitrateMode() {
    return EBitrateMode.swigToEnum(xeditJNI.CodecParam_eBitrateMode_get(swigCPtr, this));
  }

  public void setNBitrate(int value) {
    xeditJNI.CodecParam_nBitrate_set(swigCPtr, this, value);
  }

  public int getNBitrate() {
    return xeditJNI.CodecParam_nBitrate_get(swigCPtr, this);
  }

  public void setReserved(short[] value) {
    xeditJNI.CodecParam_reserved_set(swigCPtr, this, value);
  }

  public short[] getReserved() {
    return xeditJNI.CodecParam_reserved_get(swigCPtr, this);
  }

  public CodecParam() {
    this(xeditJNI.new_CodecParam(), true);
  }

}