package com.atguigu.tms.mock.task;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.task.SortingMockTask {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.BaseComplexService baseComplexService;
  com.atguigu.tms.mock.service.OrderInfoService orderInfoService;
  com.atguigu.tms.mock.service.EmployeeInfoService employeeInfoService;
  com.atguigu.tms.mock.service.ExpressCourierService expressCourierService;
  com.atguigu.tms.mock.service.ExpressCourierComplexService expressCourierComplexService;
  com.atguigu.tms.mock.service.ExpressTaskCollectService expressTaskCollectService;
  com.atguigu.tms.mock.service.OrderOrgBoundService orderOrgBoundService;
  com.atguigu.tms.mock.service.LineBaseShiftService lineBaseShiftService;
  com.atguigu.tms.mock.service.TransportPlanLineDetailService transportPlanLineDetailService;
  com.atguigu.tms.mock.service.TransportTaskService transportTaskService;
  com.atguigu.tms.mock.service.TransportTaskDetailService transportTaskDetailService;
  com.atguigu.tms.mock.service.SorterInfoService sorterInfoService;
  com.atguigu.tms.mock.service.OrderTraceLogService orderTraceLogService;
  public com.atguigu.tms.mock.task.SortingMockTask();
  public void executeTask();
  public void mainBatchTask();
  public void doTask(java.util.Date, java.lang.Integer, java.lang.Integer);
  public void doSort(java.util.Date, java.lang.Integer);
  private java.util.List checkSortedTaskList(java.util.Set<java.lang.Long>, java.util.Map<java.lang.Long, java.util.Date>);
  private void genOrderTraceLogSorted(java.util.List<com.atguigu.tms.mock.bean.TransportTaskDetail>);
  static {};
}
