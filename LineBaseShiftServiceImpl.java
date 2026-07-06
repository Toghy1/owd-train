package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.LineBaseShiftServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.LineBaseShiftMapper, com.atguigu.tms.mock.bean.LineBaseShift> implements com.atguigu.tms.mock.service.LineBaseShiftService {
  com.atguigu.tms.mock.service.LineBaseInfoService lineBaseInfoService;
  com.atguigu.tms.mock.service.TruckTeamService truckTeamService;
  com.atguigu.tms.mock.service.TruckDriverService truckDriverService;
  com.atguigu.tms.mock.service.TruckInfoService truckInfoService;
  public com.atguigu.tms.mock.service.impl.LineBaseShiftServiceImpl();
  public void initLineBaseShift();
  public com.atguigu.tms.mock.bean.LineBaseShift getNextShiftByLineId(java.lang.Long, java.lang.Integer);
  public java.util.List<com.atguigu.tms.mock.bean.LineBaseShift> getNextShiftList(java.lang.Integer);
  public com.atguigu.tms.mock.bean.LineBaseShift initLineBaseShiftOne(com.atguigu.tms.mock.bean.LineBaseInfo, java.lang.String);
  public com.atguigu.tms.mock.bean.LineBaseShift initLineBaseShiftB(com.atguigu.tms.mock.bean.LineBaseInfo, java.lang.String, com.atguigu.tms.mock.bean.LineBaseShift);
  public void getEstArriveTime();
}
