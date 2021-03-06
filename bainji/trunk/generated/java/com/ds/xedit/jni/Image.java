/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public class Image {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Image(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Image obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xeditJNI.delete_Image(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(EImageType value) {
    xeditJNI.Image_type_set(swigCPtr, this, value.swigValue());
  }

  public EImageType getType() {
    return EImageType.swigToEnum(xeditJNI.Image_type_get(swigCPtr, this));
  }

  public void setPath(String value) {
    xeditJNI.Image_path_set(swigCPtr, this, value);
  }

  public String getPath() {
    return xeditJNI.Image_path_get(swigCPtr, this);
  }

  public void setSize(GSize value) {
    xeditJNI.Image_size_set(swigCPtr, this, GSize.getCPtr(value), value);
  }

  public GSize getSize() {
    long cPtr = xeditJNI.Image_size_get(swigCPtr, this);
    return (cPtr == 0) ? null : new GSize(cPtr, false);
  }

  public Image() {
    this(xeditJNI.new_Image(), true);
  }

}
