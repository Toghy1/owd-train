package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.LineBaseInfoServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.LineBaseInfoMapper, com.atguigu.tms.mock.bean.LineBaseInfo> implements com.atguigu.tms.mock.service.LineBaseInfoService {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.BaseOrganService baseOrganService;
  com.atguigu.tms.mock.service.ATemplateCityDistanceService aTemplateCityDistanceService;
  java.util.ArrayList<com.atguigu.mock.util.LineInfo> lineInfoDistanceList;
  java.util.ArrayList<com.atguigu.mock.util.LineInfo> lineInfoTimeList;
  java.util.ArrayList<com.atguigu.mock.util.LineInfo> lineInfoCostList;
  public com.atguigu.tms.mock.service.impl.LineBaseInfoServiceImpl();
  public void initLineInfoList();
  public void loadCache();
  public java.lang.Long caleLineInfoDistance(java.lang.Long, java.lang.Long);
  public java.util.List<com.atguigu.mock.util.LineInfo> calcLineInfo(java.lang.Long, java.lang.Long);
  public void initLineBaseInfo();
  static {};
}
