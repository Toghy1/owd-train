package com.atguigu.tms.mock.bean;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.bean.TransportTaskProcess implements java.io.Serializable {
  private static final long serialVersionUID;
  private java.lang.Long id;
  private java.lang.Long transportTaskId;
  private java.math.BigDecimal curDistance;
  private java.math.BigDecimal lineDistance;
  private java.util.Date createTime;
  private java.util.Date updateTime;
  private java.lang.String isDeleted;
  public com.atguigu.tms.mock.bean.TransportTaskProcess();
  public java.lang.Long getId();
  public java.lang.Long getTransportTaskId();
  public java.math.BigDecimal getCurDistance();
  public java.math.BigDecimal getLineDistance();
  public java.util.Date getCreateTime();
  public java.util.Date getUpdateTime();
  public java.lang.String getIsDeleted();
  public void setId(java.lang.Long);
  public void setTransportTaskId(java.lang.Long);
  public void setCurDistance(java.math.BigDecimal);
  public void setLineDistance(java.math.BigDecimal);
  public void setCreateTime(java.util.Date);
  public void setUpdateTime(java.util.Date);
  public void setIsDeleted(java.lang.String);
  public boolean equals(java.lang.Object);
  protected boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
}
