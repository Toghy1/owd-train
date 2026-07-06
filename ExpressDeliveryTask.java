package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.ExpressDeliveryTask {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.ExpressTaskDeliveryService expressTaskDeliveryService;
  com.atguigu.tms.mock.service.ExpressCourierService expressCourierService;
  com.atguigu.tms.mock.service.OrderInfoService orderInfoService;
  com.atguigu.tms.mock.service.OrderTraceLogService orderTraceLogService;
  com.atguigu.tms.mock.service.BaseComplexService baseComplexService;
  com.atguigu.tms.mock.service.EmployeeInfoService employeeInfoService;
  public com.atguigu.tms.mock.task.ExpressDeliveryTask();
  public void startDelivery(java.util.Date);
  private void courierGetTask(java.util.Map<java.lang.Long, com.atguigu.tms.mock.bean.ExpressCourier>, com.atguigu.tms.mock.bean.ExpressTaskDelivery);
  public void doDelivery(java.util.Date);
  public void genOrderTraceLogDelivering(com.atguigu.tms.mock.bean.OrderInfo, com.atguigu.tms.mock.bean.ExpressTaskDelivery);
  public void genOrderTraceLogDelivered(com.atguigu.tms.mock.bean.OrderInfo, com.atguigu.tms.mock.bean.ExpressTaskDelivery);
  private java.util.Date estimateHandleTime(java.util.Date, java.lang.Integer);
  static {};
}
