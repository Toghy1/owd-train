package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.BaseOrganServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.BaseOrganMapper, com.atguigu.tms.mock.bean.BaseOrgan> implements com.atguigu.tms.mock.service.BaseOrganService {
  com.atguigu.tms.mock.service.BaseComplexService baseComplexService;
  java.util.Map<java.lang.Long, com.atguigu.tms.mock.bean.BaseOrgan> regionOrganMap;
  public com.atguigu.tms.mock.service.impl.BaseOrganServiceImpl();
  public java.util.List<com.atguigu.tms.mock.bean.BaseOrgan> getBaseOrganL1List();
  public void initBaseOrgan(java.lang.String);
  protected void loadCache(java.util.List<com.atguigu.tms.mock.bean.BaseOrgan>);
  public com.atguigu.tms.mock.bean.BaseOrgan getOrganByRegionId(java.lang.Long);
}
