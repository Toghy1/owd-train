package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.SignOrderTask {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.OrderInfoService orderInfoService;
  com.atguigu.tms.mock.service.OrderTraceLogService orderTraceLogService;
  public com.atguigu.tms.mock.task.SignOrderTask();
  public void doSign(java.util.Date);
  private void signOrder(com.atguigu.tms.mock.bean.OrderInfo, java.util.Date);
  public void genOrderTraceLogDelivered(com.atguigu.tms.mock.bean.OrderInfo);
  static {};
}
