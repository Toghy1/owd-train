package com.atguigu.tms.mock.bean;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.bean.OrderTraceLog implements java.io.Serializable {
  private static final long serialVersionUID;
  private java.lang.Long id;
  private java.lang.Long orderId;
  private java.lang.String traceDesc;
  private java.lang.Long curTaskId;
  private java.lang.String taskType;
  private java.lang.Long chargeEmpId;
  private java.lang.String remark;
  private java.lang.String isRollback;
  private java.util.Date createTime;
  private java.util.Date updateTime;
  private java.lang.String isDeleted;
  public com.atguigu.tms.mock.bean.OrderTraceLog();
  public java.lang.Long getId();
  public java.lang.Long getOrderId();
  public java.lang.String getTraceDesc();
  public java.lang.Long getCurTaskId();
  public java.lang.String getTaskType();
  public java.lang.Long getChargeEmpId();
  public java.lang.String getRemark();
  public java.lang.String getIsRollback();
  public java.util.Date getCreateTime();
  public java.util.Date getUpdateTime();
  public java.lang.String getIsDeleted();
  public void setId(java.lang.Long);
  public void setOrderId(java.lang.Long);
  public void setTraceDesc(java.lang.String);
  public void setCurTaskId(java.lang.Long);
  public void setTaskType(java.lang.String);
  public void setChargeEmpId(java.lang.Long);
  public void setRemark(java.lang.String);
  public void setIsRollback(java.lang.String);
  public void setCreateTime(java.util.Date);
  public void setUpdateTime(java.util.Date);
  public void setIsDeleted(java.lang.String);
  public boolean equals(java.lang.Object);
  protected boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
}
