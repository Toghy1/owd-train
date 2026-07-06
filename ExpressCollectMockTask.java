package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.ExpressCollectMockTask {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.BaseComplexService baseComplexService;
  com.atguigu.tms.mock.service.OrderInfoService orderInfoService;
  com.atguigu.tms.mock.service.EmployeeInfoService employeeInfoService;
  com.atguigu.tms.mock.service.ExpressCourierService expressCourierService;
  com.atguigu.tms.mock.service.ExpressCourierComplexService expressCourierComplexService;
  com.atguigu.tms.mock.service.ExpressTaskCollectService expressTaskCollectService;
  com.atguigu.tms.mock.service.OrderOrgBoundService orderOrgBoundService;
  com.atguigu.tms.mock.service.LineBaseInfoService lineBaseInfoService;
  com.atguigu.tms.mock.service.TransportPlanLineDetailService transportPlanLineDetailService;
  com.atguigu.tms.mock.service.OrderTraceLogService orderTraceLogService;
  com.atguigu.tms.mock.service.ExpressTaskDeliveryService expressTaskDeliveryService;
  public com.atguigu.tms.mock.task.ExpressCollectMockTask();
  public void executeTask();
  public void mainBatchTask();
  public void doCollect(java.util.Date, java.lang.Integer, java.lang.Integer);
  public void doCommit(java.lang.Integer);
  private void courierDoCollect(com.atguigu.tms.mock.bean.ExpressCourier, java.util.Date);
  private void courierDoCommit(com.atguigu.tms.mock.bean.ExpressTaskCollect, java.util.Date);
  private java.util.List<com.atguigu.tms.mock.bean.ExpressTaskCollect> getExpressTaskCollectList(java.lang.String);
  private java.util.List<com.atguigu.tms.mock.bean.ExpressTaskCollect> getExpressTaskCommitList(java.lang.String);
  private java.util.Map<java.lang.Long, com.atguigu.tms.mock.bean.ExpressCourier> getCourierWithTask(java.util.List<com.atguigu.tms.mock.bean.ExpressTaskCollect>);
  public void genOrderTraceLogCollect(com.atguigu.tms.mock.bean.OrderInfo, com.atguigu.tms.mock.bean.ExpressTaskCollect);
  public void genOrderTraceLogCommit(com.atguigu.tms.mock.bean.OrderInfo, com.atguigu.tms.mock.bean.ExpressTaskCollect);
  static {};
}
