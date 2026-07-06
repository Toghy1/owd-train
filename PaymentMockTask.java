package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.PaymentMockTask {
  com.atguigu.tms.mock.service.OrderInfoService orderInfoService;
  com.atguigu.tms.mock.service.ExpressTaskCollectService expressTaskCollectService;
  com.atguigu.tms.mock.service.ExpressCourierService expressCourierService;
  com.atguigu.tms.mock.service.OrderTraceLogService orderTraceLogService;
  com.atguigu.tms.mock.service.EmployeeInfoService employeeInfoService;
  com.atguigu.tms.mock.service.BaseOrganService baseOrganService;
  public com.atguigu.tms.mock.task.PaymentMockTask();
  public void doPayment(java.util.Date);
  private void cancelOrder(com.atguigu.tms.mock.bean.OrderInfo, java.util.Date);
  private void userPay(java.util.Date, com.atguigu.tms.mock.bean.OrderInfo);
  public com.atguigu.tms.mock.bean.ExpressTaskCollect genExpressTaskCollect(com.atguigu.tms.mock.bean.OrderInfo);
  public void genOrderTraceLog(com.atguigu.tms.mock.bean.OrderInfo, com.atguigu.tms.mock.bean.ExpressTaskCollect);
}
