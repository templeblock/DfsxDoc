/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public class CThread extends IThread {
  private transient long swigCPtr;

  protected CThread(long cPtr, boolean cMemoryOwn) {
    super(xeditJNI.CThread_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThread obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xeditJNI.delete_CThread(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int TStart() {
    return xeditJNI.CThread_TStart(swigCPtr, this);
  }

  public int TStop() {
    return xeditJNI.CThread_TStop(swigCPtr, this);
  }

  public int TSuspend() {
    return xeditJNI.CThread_TSuspend(swigCPtr, this);
  }

  public int TResume() {
    return xeditJNI.CThread_TResume(swigCPtr, this);
  }

  public EThreadStatus GetThreadStatus() {
    return EThreadStatus.swigToEnum(xeditJNI.CThread_GetThreadStatus(swigCPtr, this));
  }

}