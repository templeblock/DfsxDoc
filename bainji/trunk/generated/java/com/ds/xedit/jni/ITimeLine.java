/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public class ITimeLine {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ITimeLine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ITimeLine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        xeditJNI.delete_ITimeLine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IXEngine getEngine() {
    long cPtr = xeditJNI.ITimeLine_getEngine(swigCPtr, this);
    return (cPtr == 0) ? null : new IXEngine(cPtr, false);
  }

  public int getLastErrorCode() {
    return xeditJNI.ITimeLine_getLastErrorCode(swigCPtr, this);
  }

  public String getLastErrorMessage() {
    return xeditJNI.ITimeLine_getLastErrorMessage(swigCPtr, this);
  }

  public boolean canRedo() {
    return xeditJNI.ITimeLine_canRedo(swigCPtr, this);
  }

  public boolean canUndo() {
    return xeditJNI.ITimeLine_canUndo(swigCPtr, this);
  }

  public IAction redo() {
    long cPtr = xeditJNI.ITimeLine_redo(swigCPtr, this);
    return (cPtr == 0) ? null : new IAction(cPtr, false);
  }

  public IAction undo() {
    long cPtr = xeditJNI.ITimeLine_undo(swigCPtr, this);
    return (cPtr == 0) ? null : new IAction(cPtr, false);
  }

  public Rational getCurrentPos() {
    return new Rational(xeditJNI.ITimeLine_getCurrentPos(swigCPtr, this), true);
  }

  public Rational getDuration() {
    return new Rational(xeditJNI.ITimeLine_getDuration(swigCPtr, this), true);
  }

  public int getMediaCount() {
    return xeditJNI.ITimeLine_getMediaCount(swigCPtr, this);
  }

  public IMedia getMedia(int nIndex) {
    long cPtr = xeditJNI.ITimeLine_getMedia(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new IMedia(cPtr, false);
  }

  public IMedia getMediaById(long mediaId) {
    long cPtr = xeditJNI.ITimeLine_getMediaById(swigCPtr, this, mediaId);
    return (cPtr == 0) ? null : new IMedia(cPtr, false);
  }

  public IMedia addMedia(String path) {
    long cPtr = xeditJNI.ITimeLine_addMedia(swigCPtr, this, path);
    return (cPtr == 0) ? null : new IMedia(cPtr, false);
  }

  public int getTrackCount(ETrackType trackType) {
    return xeditJNI.ITimeLine_getTrackCount(swigCPtr, this, trackType.swigValue());
  }

  public ITrack getTrack(ETrackType trackType, int nIndex) {
    long cPtr = xeditJNI.ITimeLine_getTrack__SWIG_0(swigCPtr, this, trackType.swigValue(), nIndex);
    return (cPtr == 0) ? null : new ITrack(cPtr, false);
  }

  public ITrack getTrack(long trackId) {
    long cPtr = xeditJNI.ITimeLine_getTrack__SWIG_1(swigCPtr, this, trackId);
    return (cPtr == 0) ? null : new ITrack(cPtr, false);
  }

  public ITrack newTrack(ETrackType trackType) {
    long cPtr = xeditJNI.ITimeLine_newTrack(swigCPtr, this, trackType.swigValue());
    return (cPtr == 0) ? null : new ITrack(cPtr, false);
  }

  public void removeTrack(long id) {
    xeditJNI.ITimeLine_removeTrack__SWIG_0(swigCPtr, this, id);
  }

  public void removeTrack(ITrack pTrack) {
    xeditJNI.ITimeLine_removeTrack__SWIG_1(swigCPtr, this, ITrack.getCPtr(pTrack), pTrack);
  }

  public IClip findClip(long clipId) {
    long cPtr = xeditJNI.ITimeLine_findClip(swigCPtr, this, clipId);
    return (cPtr == 0) ? null : new IClip(cPtr, false);
  }

  public int seek(Rational rTime) {
    return xeditJNI.ITimeLine_seek(swigCPtr, this, Rational.getCPtr(rTime), rTime);
  }

  public void play() {
    xeditJNI.ITimeLine_play(swigCPtr, this);
  }

  public void pause() {
    xeditJNI.ITimeLine_pause(swigCPtr, this);
  }

  public void addObserver(ITimeLineObserver pObserver) {
    xeditJNI.ITimeLine_addObserver(swigCPtr, this, ITimeLineObserver.getCPtr(pObserver), pObserver);
  }

  public void removeObserver(ITimeLineObserver pObserver) {
    xeditJNI.ITimeLine_removeObserver(swigCPtr, this, ITimeLineObserver.getCPtr(pObserver), pObserver);
  }

  public void removeAllObservers() {
    xeditJNI.ITimeLine_removeAllObservers(swigCPtr, this);
  }

  public int getRendererCount() {
    return xeditJNI.ITimeLine_getRendererCount(swigCPtr, this);
  }

  public IRenderer getRenderer(int nIndex) {
    long cPtr = xeditJNI.ITimeLine_getRenderer(swigCPtr, this, nIndex);
    return (cPtr == 0) ? null : new IRenderer(cPtr, false);
  }

  public void addRenderer(IRenderer pRenderer) {
    xeditJNI.ITimeLine_addRenderer(swigCPtr, this, IRenderer.getCPtr(pRenderer), pRenderer);
  }

  public void removeRenderer(int nIndex) {
    xeditJNI.ITimeLine_removeRenderer__SWIG_0(swigCPtr, this, nIndex);
  }

  public void removeRenderer(IRenderer pRenderer) {
    xeditJNI.ITimeLine_removeRenderer__SWIG_1(swigCPtr, this, IRenderer.getCPtr(pRenderer), pRenderer);
  }

  public void removeAllRenderers() {
    xeditJNI.ITimeLine_removeAllRenderers(swigCPtr, this);
  }

  public int generate(GenerateSetting param, IGenerateObserver pObserver) {
    return xeditJNI.ITimeLine_generate__SWIG_0(swigCPtr, this, GenerateSetting.getCPtr(param), param, IGenerateObserver.getCPtr(pObserver), pObserver);
  }

  public int generate(GenerateSetting param) {
    return xeditJNI.ITimeLine_generate__SWIG_1(swigCPtr, this, GenerateSetting.getCPtr(param), param);
  }

  public void cancelGenerate() {
    xeditJNI.ITimeLine_cancelGenerate(swigCPtr, this);
  }

  public void clear() {
    xeditJNI.ITimeLine_clear(swigCPtr, this);
  }

}