package com.atguigu.tms.mock.service;

/** Auto-decompiled from tms-mock JAR */
public interface com.atguigu.tms.mock.service.BaseOrganService extends com.atguigu.tms.mock.service.adv.AdvService<com.atguigu.tms.mock.bean.BaseOrgan> {
  public abstract void initBaseOrgan(java.lang.String);
  public abstract com.atguigu.tms.mock.bean.BaseOrgan getOrganByRegionId(java.lang.Long);
  public abstract java.util.List<com.atguigu.tms.mock.bean.BaseOrgan> getBaseOrganL1List();
}
