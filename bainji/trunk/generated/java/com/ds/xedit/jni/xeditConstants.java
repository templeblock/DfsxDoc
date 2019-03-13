/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ds.xedit.jni;

public interface xeditConstants {
  public final static int __ANDROID__ = xeditJNI.__ANDROID___get();
  public final static int STATUS_CODE_LOWER_BOUND = 0x81000000;
  public final static int STATUS_CODE_UPPER_BOUND = 0x81FFFFFF;
  public final static int AV_OK = 0;
  public final static int AV_NULL_PTR = 0x81000000;
  public final static int AV_MEMORY_NOT_ENOUGH = 0x81000001;
  public final static int AV_OUT_OF_RANGE = 0x81000002;
  public final static int AV_UNKOWN_VALUE = 0x81000003;
  public final static int AV_LANGUAGE_NOT_SUPPORT = 0x81000004;
  public final static int AV_REINTERPRET_CAST_FAILED = 0x81000005;
  public final static int AV_BUFFER_NOT_ENOUGH = 0x81000006;
  public final static int AV_FUNCTION_SHOULD_NOT_BE_USE = 0x81000007;
  public final static int AV_XML_ERROR = 0x81000008;
  public final static int AV_OTHER_ERROR = 0x81000FFF;
  public final static int AV_MAX_PATH = 1024;
  public final static int MAX_VIDEO_STREAM = 8;
  public final static int MAX_AUDIO_STREAM = 8;
  public final static int NULL = 0;
  public final static long AV_NOPTS_VALUE = 0x8000000000000000L;
  public final static int AVPUB_OTHER_ERROR = 0x810010FF;
  public final static int AVPUB_FILE_NOT_EXIST = 0x81001100;
  public final static int AVPUB_FILE_OPEN_FAILED = 0x81001101;
  public final static int AVPUB_FILE_CLOSE_FAILED = 0x81001102;
  public final static int AVPUB_FILE_NOT_OPENED = 0x81001103;
  public final static int AVPUB_FILE_EOF_REACHED = 0x81001104;
  public final static int AVPUB_FILE_READ_NO_PERMISSION = 0x81001106;
  public final static int AVPUB_FILE_READ_ERROR = 0x81001107;
  public final static int AVPUB_FILE_WRITE_NO_PERMISSION = 0x81001108;
  public final static int AVPUB_FILE_WRITE_ERROR = 0x81001109;
  public final static int AVPUB_FILE_SEEK_FALG_ERROR = 0x8100110A;
  public final static int AVPUB_FILE_SEEK_ERROR = 0x8100110B;
  public final static int AVPUB_FILE_BUFFER_NOT_ENOUGH = 0x8100110C;
  public final static int AVPUB_FILE_FLUSH_FAILED = 0x8100110D;
  public final static int AVPUB_FILE_OTHER_ERROR = 0x810011FF;
  public final static int AVPUB_LIBRARY_LOAD_FAILED = 0x81001200;
  public final static int AVPUB_EVENT_INVOKE_FAIL = 0x81001300;
  public final static int AVPUB_EVENT_WAIT_TIME_OUT = 0x81001301;
  public final static int AVPUB_EVENT_OTHER_ERROR = 0x810013FF;
  public final static int AVPUB_THREAD_START_FAILED = 0x81001400;
  public final static int AVPUB_THREAD_RESUME_FAILED = 0x81001401;
  public final static int AVPUB_THREAD_SUSPEND_FAILED = 0x81001402;
  public final static int AVPUB_THREAD_STOP_FAILED = 0x81001403;
  public final static int AVPUB_THREAD_NOT_RUNNING = 0x81001404;
  public final static int AVPUB_THREAD_NOT_SUSPENDED = 0x81001405;
  public final static int AVPUB_THREAD_NOT_STARTED = 0x81001406;
  public final static int AVPUB_THREAD_ALREADY_STARTED = 0x81001407;
  public final static int AVPUB_THREAD_IS_RUNNING = 0x81001408;
  public final static int AVPUB_THREAD_OTHER_ERROR = 0x810014FF;
  public final static int AVPUB_PLUGIN_TYPE_NOT_FOUND = 0x81001500;
  public final static int EVENT_MSG_NONE = 0xEFFFFFFF;
  public final static String AP_AddMedia_MediaPath = "ap.addMedia.mediaPath";
  public final static String AP_RemoveMedia_MediaId = "ap.removeMedia.mediaId";
  public final static String AP_AddClip_TrackId = "ap.addClip.trackId";
  public final static String AP_AddClip_MediaId = "ap.addClip.mediaId";
  public final static String AP_AddClip_OffsetOnTrack = "ap.addClip.offsetOnTrack";
  public final static String AP_AddClip_OffsetInMedia = "ap.addClip.offsetInMedia";
  public final static String AP_AddClip_Duration = "ap.addClip.duration";
  public final static String AP_AddClip_ClipId = "ap.addClip.clipId";
  public final static String AP_RemoveClip_ClipId = "ap.removeClip.clipId";
  public final static String AP_MoveClip_ClipId = "ap.moveClip.clipId";
  public final static String AP_MoveClip_OldOffsetOnTrack = "ap.moveClip.oldOffsetOnTrack";
  public final static String AP_MoveClip_NewOffsetOnTrack = "ap.moveClip.newOffsetOnTrack";
  public final static String AP_ChangeClipOffsetOnTrack_ClipId = "ap.changeClipOffsetOnTrack.clipId";
  public final static String AP_ChangeClipOffsetOnTrack_OldOffsetOnTrack = "ap.changeClipOffsetOnTrack.oldOffsetOnTrack";
  public final static String AP_ChangeClipOffsetOnTrack_NewOffsetOnTrack = "ap.changeClipOffsetOnTrack.newOffsetOnTrack";
  public final static String AP_ChangeClipDuration_ClipId = "ap.changeClipDuration.clipId";
  public final static String AP_ChangeClipDuration_OldDuration = "ap.changeClipDuration.oldDuration";
  public final static String AP_ChangeClipDuration_NewDuration = "ap.changeClipDuration.newDuration";
  public final static String AP_ChangeClipOffsetInMedia_ClipId = "ap.changeClipOffsetInMedia.clipId";
  public final static String AP_ChangeClipOffsetInMedia_OldOffsetInMedia = "ap.changeClipOffsetInMedia.oldOffsetInMedia";
  public final static String AP_ChangeClipOffsetInMedia_NewOffsetInMedia = "ap.changeClipOffsetInMedia.newOffsetInMedia";
}