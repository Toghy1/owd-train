package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.ExpressCourierServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.ExpressCourierMapper, com.atguigu.tms.mock.bean.ExpressCourier> implements com.atguigu.tms.mock.service.ExpressCourierService {
  com.atguigu.tms.mock.service.ExpressCourierComplexService expressCourierComplexService;
  com.atguigu.tms.mock.service.BaseComplexService baseComplexService;
  com.atguigu.tms.mock.service.EmployeeInfoService employeeInfoService;
  public com.atguigu.tms.mock.service.impl.ExpressCourierServiceImpl();
  public java.util.List<com.atguigu.tms.mock.bean.ExpressCourier> initExpressCourier(java.util.List<com.atguigu.tms.mock.bean.EmployeeInfo>, java.lang.String);
  public com.atguigu.tms.mock.bean.ExpressCourier genExpressCourier(com.atguigu.tms.mock.bean.EmployeeInfo, java.lang.String);
  public java.util.Map<java.lang.Long, com.atguigu.tms.mock.bean.ExpressCourier> getComplexCourierMap(java.lang.String);
  public void loadCache();
  public com.atguigu.tms.mock.bean.ExpressCourier getCourierByComplex(java.lang.String, java.lang.Long);
  protected java.lang.Long getId(com.atguigu.tms.mock.bean.ExpressCourier);
  protected java.lang.Long getId(java.lang.Object);
}
