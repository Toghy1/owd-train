package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.ChronoTrigger {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.task.ExpressCollectMockTask expressCollectMockTask;
  com.atguigu.tms.mock.task.SortingMockTask sortingMockTask;
  com.atguigu.tms.mock.task.TransportMockTask transportMockTask;
  com.atguigu.tms.mock.task.ExpressDeliveryTask expressDeliveryTask;
  com.atguigu.tms.mock.task.SignOrderTask signOrderTask;
  com.atguigu.tms.mock.task.OrderMockTask orderMockTask;
  com.atguigu.tms.mock.task.PaymentMockTask paymentMockTask;
  com.atguigu.tms.mock.service.AReportService aReportService;
  public com.atguigu.tms.mock.task.ChronoTrigger();
  public void runTime();
  private void runEveryMinute(java.util.Date, int, int);
  static {};
}
