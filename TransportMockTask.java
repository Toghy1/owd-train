package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.TransportMockTask {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.TransportTaskService transportTaskService;
  com.atguigu.tms.mock.service.OrderOrgBoundService orderOrgBoundService;
  com.atguigu.tms.mock.service.TransportTaskProcessService transportTaskProcessService;
  com.atguigu.tms.mock.service.TransportTaskDetailService transportTaskDetailService;
  com.atguigu.tms.mock.service.TruckInfoService truckInfoService;
  com.atguigu.tms.mock.service.OrderInfoService orderInfoService;
  com.atguigu.tms.mock.service.ExpressTaskDeliveryService expressTaskDeliveryService;
  com.atguigu.tms.mock.service.OrderTraceLogService orderTraceLogService;
  com.atguigu.tms.mock.service.BaseOrganService baseOrganService;
  com.atguigu.tms.mock.service.LineBaseInfoService lineBaseInfoService;
  public com.atguigu.tms.mock.task.TransportMockTask();
  public void executeTask();
  public void doTransportTaskStart(java.util.Date, java.lang.Integer);
  private void genTransportProcess(com.atguigu.tms.mock.bean.TransportTask);
  public void doDrive(java.util.Date, java.lang.Integer, java.lang.Integer, java.lang.Integer);
  private void checkIfEnd(java.util.Date, com.atguigu.tms.mock.bean.TransportTask, com.atguigu.tms.mock.bean.TransportTaskProcess);
  private void checkIfFinalEnd(com.atguigu.tms.mock.bean.TransportTask, java.util.List<com.atguigu.tms.mock.bean.OrderOrgBound>);
  private void genOrderTraceLogTransportOut(com.atguigu.tms.mock.bean.TransportTask);
  private void genOrderTraceLogTransportIn(com.atguigu.tms.mock.bean.TransportTask);
  public static void main(java.lang.String[]);
  static {};
}
