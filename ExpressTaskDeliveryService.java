package com.atguigu.tms.mock.service;

/** Auto-decompiled from tms-mock JAR */
public interface com.atguigu.tms.mock.service.ExpressTaskDeliveryService extends com.atguigu.tms.mock.service.adv.AdvService<com.atguigu.tms.mock.bean.ExpressTaskDelivery> {
  public abstract void initExpressTaskDelivery(java.util.Date, java.util.List<com.atguigu.tms.mock.bean.OrderOrgBound>);
  public abstract com.atguigu.tms.mock.bean.ExpressTaskDelivery genExpressTaskDelivery(java.util.Date, com.atguigu.tms.mock.bean.OrderOrgBound);
}
