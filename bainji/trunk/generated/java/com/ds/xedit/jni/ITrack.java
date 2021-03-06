/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public class ITrack {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ITrack(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ITrack obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xeditJNI.delete_ITrack(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long getId() {
    return xeditJNI.ITrack_getId(swigCPtr, this);
  }

  public ETrackType getTrackType() {
    return ETrackType.swigToEnum(xeditJNI.ITrack_getTrackType(swigCPtr, this));
  }

  public boolean isDisabled() {
    return xeditJNI.ITrack_isDisabled(swigCPtr, this);
  }

  public int getClipCount() {
    return xeditJNI.ITrack_getClipCount(swigCPtr, this);
  }

  public IClip getClip(int nIndex) {
    long cPtr = xeditJNI.ITrack_getClip(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new IClip(cPtr, false);
  }

  public IClip getClipById(long clipId) {
    long cPtr = xeditJNI.ITrack_getClipById(swigCPtr, this, clipId);
    return (cPtr == 0) ? null : new IClip(cPtr, false);
  }

  public IClip getClipByOffset(Rational rOffsetOnTrack) {
    long cPtr = xeditJNI.ITrack_getClipByOffset(swigCPtr, this, Rational.getCPtr(rOffsetOnTrack), rOffsetOnTrack);
    return (cPtr == 0) ? null : new IClip(cPtr, false);
  }

  public IClip findClip(Rational rTime) {
    long cPtr = xeditJNI.ITrack_findClip(swigCPtr, this, Rational.getCPtr(rTime), rTime);
    return (cPtr == 0) ? null : new IClip(cPtr, false);
  }

  public boolean hasClipOnOffset(Rational rOffsetOnTrack) {
    return xeditJNI.ITrack_hasClipOnOffset(swigCPtr, this, Rational.getCPtr(rOffsetOnTrack), rOffsetOnTrack);
  }

  public IClip addClip(long mediaId, Rational rOffsetOnTrack) {
    long cPtr = xeditJNI.ITrack_addClip(swigCPtr, this, mediaId, Rational.getCPtr(rOffsetOnTrack), rOffsetOnTrack);
    return (cPtr == 0) ? null : new IClip(cPtr, false);
  }

  public int splitClip(long clipId, Rational rSplitOffsetInClip, IClip ppOutLeftClip, IClip ppOutRightClip) {
    return xeditJNI.ITrack_splitClip(swigCPtr, this, clipId, Rational.getCPtr(rSplitOffsetInClip), rSplitOffsetInClip, ppOutLeftClip, ppOutRightClip);
  }

  public int moveClip(long clipId, Rational rOffsetOnTrack, SWIGTYPE_p_long_long pOutSplitClipId, IClip ppOutLeftClip, IClip ppOutRightClip) {
    return xeditJNI.ITrack_moveClip(swigCPtr, this, clipId, Rational.getCPtr(rOffsetOnTrack), rOffsetOnTrack, SWIGTYPE_p_long_long.getCPtr(pOutSplitClipId), ppOutLeftClip, ppOutRightClip);
  }

  public int changeClipDuration(long clipId, Rational rDuration) {
    return xeditJNI.ITrack_changeClipDuration(swigCPtr, this, clipId, Rational.getCPtr(rDuration), rDuration);
  }

  public int changeClipOffsetInMedia(long clipId, Rational rOffsetInMedia) {
    return xeditJNI.ITrack_changeClipOffsetInMedia(swigCPtr, this, clipId, Rational.getCPtr(rOffsetInMedia), rOffsetInMedia);
  }

  public int removeClip(int nIndex) {
    return xeditJNI.ITrack_removeClip(swigCPtr, this, nIndex);
  }

  public int removeClipById(long clipId) {
    return xeditJNI.ITrack_removeClipById(swigCPtr, this, clipId);
  }

  public void removeAllClips() {
    xeditJNI.ITrack_removeAllClips(swigCPtr, this);
  }

}
