package com.atguigu.tms.mock.aspect;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.aspect.LogAspect {
  private static final org.slf4j.Logger log;
  java.util.Map<java.lang.String, com.atguigu.tms.mock.aspect.LogAspect$FuncInfo> funcMap;
  public com.atguigu.tms.mock.aspect.LogAspect();
  public void pointCut();
  public void pointReport();
  public java.lang.Object aroundPoint(org.aspectj.lang.ProceedingJoinPoint) throws java.lang.Throwable;
  public void after(org.aspectj.lang.JoinPoint);
  public void afterReturn();
  public void before();
  public static void main(java.lang.String[]);
  public java.lang.String getActualType(java.lang.Object, int);
  static {};
}
