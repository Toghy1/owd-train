package com.atguigu.tms.mock.service;

/** Auto-decompiled from tms-mock JAR */
public interface com.atguigu.tms.mock.service.EmployeeInfoService extends com.atguigu.tms.mock.service.adv.AdvService<com.atguigu.tms.mock.bean.EmployeeInfo> {
  public abstract java.util.List<com.atguigu.tms.mock.bean.EmployeeInfo> initEmployeeInfo(java.lang.Integer, java.lang.String);
  public abstract java.util.List<com.atguigu.tms.mock.bean.EmployeeInfo> initEmployeeInfo(java.util.List<com.atguigu.tms.mock.bean.BaseOrgan>, java.lang.String);
  public abstract com.atguigu.tms.mock.bean.EmployeeInfo initEmployeeInfo(java.lang.Long, java.lang.String);
}
