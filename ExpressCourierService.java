package com.atguigu.tms.mock.service;

/** Auto-decompiled from tms-mock JAR */
public interface com.atguigu.tms.mock.service.ExpressCourierService extends com.atguigu.tms.mock.service.adv.AdvService<com.atguigu.tms.mock.bean.ExpressCourier> {
  public abstract java.util.List<com.atguigu.tms.mock.bean.ExpressCourier> initExpressCourier(java.util.List<com.atguigu.tms.mock.bean.EmployeeInfo>, java.lang.String);
  public abstract com.atguigu.tms.mock.bean.ExpressCourier getCourierByComplex(java.lang.String, java.lang.Long);
  public abstract java.util.Map<java.lang.Long, com.atguigu.tms.mock.bean.ExpressCourier> getComplexCourierMap(java.lang.String);
}
