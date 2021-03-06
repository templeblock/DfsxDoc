/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public class IVFrame extends IFrame {
  private transient long swigCPtr;

  protected IVFrame(long cPtr, boolean cMemoryOwn) {
    super(xeditJNI.IVFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IVFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xeditJNI.delete_IVFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean Interlaced() {
    return xeditJNI.IVFrame_Interlaced(swigCPtr, this);
  }

  public boolean TopFieldFirst() {
    return xeditJNI.IVFrame_TopFieldFirst(swigCPtr, this);
  }

  public EPictureType GetPictureType() {
    return EPictureType.swigToEnum(xeditJNI.IVFrame_GetPictureType(swigCPtr, this));
  }

  public boolean Telecined() {
    return xeditJNI.IVFrame_Telecined(swigCPtr, this);
  }

  public void SetInterlaced(boolean bInterlaced) {
    xeditJNI.IVFrame_SetInterlaced(swigCPtr, this, bInterlaced);
  }

  public void SetTopFieldFirst(boolean bTopFieldFirst) {
    xeditJNI.IVFrame_SetTopFieldFirst(swigCPtr, this, bTopFieldFirst);
  }

  public void SetPictureType(EPictureType eType) {
    xeditJNI.IVFrame_SetPictureType(swigCPtr, this, eType.swigValue());
  }

  public void SetTelecined(boolean bTelecined) {
    xeditJNI.IVFrame_SetTelecined(swigCPtr, this, bTelecined);
  }

}
