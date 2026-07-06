package com.atguigu.tms.mock.service;

/** Auto-decompiled from tms-mock JAR */
public interface com.atguigu.tms.mock.service.LineBaseShiftService extends com.atguigu.tms.mock.service.adv.AdvService<com.atguigu.tms.mock.bean.LineBaseShift> {
  public abstract void initLineBaseShift();
  public abstract com.atguigu.tms.mock.bean.LineBaseShift getNextShiftByLineId(java.lang.Long, java.lang.Integer);
  public abstract java.util.List<com.atguigu.tms.mock.bean.LineBaseShift> getNextShiftList(java.lang.Integer);
}
