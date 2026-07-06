package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.TransportTaskServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.TransportTaskMapper, com.atguigu.tms.mock.bean.TransportTask> implements com.atguigu.tms.mock.service.TransportTaskService {
  com.atguigu.tms.mock.service.EmployeeInfoService employeeInfoService;
  com.atguigu.tms.mock.service.LineBaseInfoService lineBaseInfoService;
  com.atguigu.tms.mock.service.TransportTaskDetailService transportTaskDetailService;
  com.atguigu.tms.mock.service.TruckInfoService truckInfoService;
  public com.atguigu.tms.mock.service.impl.TransportTaskServiceImpl();
  public void initTransportTask(com.atguigu.tms.mock.bean.LineBaseShift, java.util.List<java.lang.Long>, java.util.Date);
  private java.util.List<com.atguigu.tms.mock.bean.TransportTaskDetail> genTransportTaskDetailList(java.util.List<java.lang.Long>);
  public void loadCache();
}
