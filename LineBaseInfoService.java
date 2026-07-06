package com.atguigu.tms.mock.service;

/** Auto-decompiled from tms-mock JAR */
public interface com.atguigu.tms.mock.service.LineBaseInfoService extends com.atguigu.tms.mock.service.adv.AdvService<com.atguigu.tms.mock.bean.LineBaseInfo> {
  public abstract void initLineBaseInfo();
  public abstract java.lang.Long caleLineInfoDistance(java.lang.Long, java.lang.Long);
  public abstract java.util.List<com.atguigu.mock.util.LineInfo> calcLineInfo(java.lang.Long, java.lang.Long);
}
