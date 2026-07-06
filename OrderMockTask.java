package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.OrderMockTask {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.OrderInfoService orderInfoService;
  com.atguigu.tms.mock.service.BaseComplexService baseComplexService;
  com.atguigu.tms.mock.service.OrderCargoService orderCargoService;
  com.atguigu.tms.mock.service.LineBaseInfoService lineBaseInfoService;
  com.atguigu.tms.mock.service.UserInfoService userInfoService;
  java.util.concurrent.atomic.AtomicInteger orderFlowId;
  java.lang.Long batchNo;
  public com.atguigu.tms.mock.task.OrderMockTask();
  public void doOrder(java.util.Date, java.lang.Integer, java.lang.Integer);
  public com.atguigu.tms.mock.bean.OrderInfo userOrder(com.atguigu.tms.mock.bean.UserInfo, java.util.Date);
  public com.atguigu.tms.mock.bean.OrderCargo genOrderCargo(com.atguigu.tms.mock.bean.OrderInfo);
  private java.util.Date estimateArriveTime(java.util.Date, java.math.BigDecimal);
  private java.math.BigDecimal estimatePrice(java.math.BigDecimal, com.atguigu.tms.mock.bean.OrderCargo);
  public static void main(java.lang.String[]);
  static {};
}
