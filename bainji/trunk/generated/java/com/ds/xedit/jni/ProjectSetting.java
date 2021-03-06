/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public class ProjectSetting {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ProjectSetting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProjectSetting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xeditJNI.delete_ProjectSetting(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setESampleFormat(ESampleFormat value) {
    xeditJNI.ProjectSetting_eSampleFormat_set(swigCPtr, this, value.swigValue());
  }

  public ESampleFormat getESampleFormat() {
    return ESampleFormat.swigToEnum(xeditJNI.ProjectSetting_eSampleFormat_get(swigCPtr, this));
  }

  public void setNBitsPerSample(int value) {
    xeditJNI.ProjectSetting_nBitsPerSample_set(swigCPtr, this, value);
  }

  public int getNBitsPerSample() {
    return xeditJNI.ProjectSetting_nBitsPerSample_get(swigCPtr, this);
  }

  public void setNSampleRate(int value) {
    xeditJNI.ProjectSetting_nSampleRate_set(swigCPtr, this, value);
  }

  public int getNSampleRate() {
    return xeditJNI.ProjectSetting_nSampleRate_get(swigCPtr, this);
  }

  public void setNChannelCount(int value) {
    xeditJNI.ProjectSetting_nChannelCount_set(swigCPtr, this, value);
  }

  public int getNChannelCount() {
    return xeditJNI.ProjectSetting_nChannelCount_get(swigCPtr, this);
  }

  public void setNChannelLayout(int value) {
    xeditJNI.ProjectSetting_nChannelLayout_set(swigCPtr, this, value);
  }

  public int getNChannelLayout() {
    return xeditJNI.ProjectSetting_nChannelLayout_get(swigCPtr, this);
  }

  public void setNWidth(int value) {
    xeditJNI.ProjectSetting_nWidth_set(swigCPtr, this, value);
  }

  public int getNWidth() {
    return xeditJNI.ProjectSetting_nWidth_get(swigCPtr, this);
  }

  public void setNHeight(int value) {
    xeditJNI.ProjectSetting_nHeight_set(swigCPtr, this, value);
  }

  public int getNHeight() {
    return xeditJNI.ProjectSetting_nHeight_get(swigCPtr, this);
  }

  public void setRAspectRatio(Rational value) {
    xeditJNI.ProjectSetting_rAspectRatio_set(swigCPtr, this, Rational.getCPtr(value), value);
  }

  public Rational getRAspectRatio() {
    long cPtr = xeditJNI.ProjectSetting_rAspectRatio_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Rational(cPtr, false);
  }

  public void setBInterlaced(boolean value) {
    xeditJNI.ProjectSetting_bInterlaced_set(swigCPtr, this, value);
  }

  public boolean getBInterlaced() {
    return xeditJNI.ProjectSetting_bInterlaced_get(swigCPtr, this);
  }

  public void setBTopFieldFirst(boolean value) {
    xeditJNI.ProjectSetting_bTopFieldFirst_set(swigCPtr, this, value);
  }

  public boolean getBTopFieldFirst() {
    return xeditJNI.ProjectSetting_bTopFieldFirst_get(swigCPtr, this);
  }

  public void setEPixFormat(EPixFormat value) {
    xeditJNI.ProjectSetting_ePixFormat_set(swigCPtr, this, value.swigValue());
  }

  public EPixFormat getEPixFormat() {
    return EPixFormat.swigToEnum(xeditJNI.ProjectSetting_ePixFormat_get(swigCPtr, this));
  }

  public void setRFrameRate(Rational value) {
    xeditJNI.ProjectSetting_rFrameRate_set(swigCPtr, this, Rational.getCPtr(value), value);
  }

  public Rational getRFrameRate() {
    long cPtr = xeditJNI.ProjectSetting_rFrameRate_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Rational(cPtr, false);
  }

  public ProjectSetting() {
    this(xeditJNI.new_ProjectSetting(), true);
  }

}
