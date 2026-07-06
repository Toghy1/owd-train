package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.ExpressTaskDeliveryServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.ExpressTaskDeliveryMapper, com.atguigu.tms.mock.bean.ExpressTaskDelivery> implements com.atguigu.tms.mock.service.ExpressTaskDeliveryService {
  com.atguigu.tms.mock.service.BaseOrganService baseOrganService;
  com.atguigu.tms.mock.service.OrderTraceLogService orderTraceLogService;
  public com.atguigu.tms.mock.service.impl.ExpressTaskDeliveryServiceImpl();
  public void initExpressTaskDelivery(java.util.Date, java.util.List<com.atguigu.tms.mock.bean.OrderOrgBound>);
  public com.atguigu.tms.mock.bean.ExpressTaskDelivery genExpressTaskDelivery(java.util.Date, com.atguigu.tms.mock.bean.OrderOrgBound);
  private java.util.Date estimateHandleTime(java.util.Date, java.lang.Integer);
  public void genOrderTraceLogDelivery(com.atguigu.tms.mock.bean.ExpressTaskDelivery);
}
