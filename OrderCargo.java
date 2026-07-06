package com.atguigu.tms.mock.bean;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.bean.OrderCargo implements java.io.Serializable {
  private static final long serialVersionUID;
  private java.lang.Long id;
  private java.lang.Long orderId;
  private java.lang.String cargoType;
  private java.lang.Integer volumeLength;
  private java.lang.Integer volumeWidth;
  private java.lang.Integer volumeHeight;
  private java.math.BigDecimal weight;
  private java.lang.String remark;
  private java.util.Date createTime;
  private java.util.Date updateTime;
  private java.lang.String isDeleted;
  public com.atguigu.tms.mock.bean.OrderCargo();
  public java.lang.Long getId();
  public java.lang.Long getOrderId();
  public java.lang.String getCargoType();
  public java.lang.Integer getVolumeLength();
  public java.lang.Integer getVolumeWidth();
  public java.lang.Integer getVolumeHeight();
  public java.math.BigDecimal getWeight();
  public java.lang.String getRemark();
  public java.util.Date getCreateTime();
  public java.util.Date getUpdateTime();
  public java.lang.String getIsDeleted();
  public void setId(java.lang.Long);
  public void setOrderId(java.lang.Long);
  public void setCargoType(java.lang.String);
  public void setVolumeLength(java.lang.Integer);
  public void setVolumeWidth(java.lang.Integer);
  public void setVolumeHeight(java.lang.Integer);
  public void setWeight(java.math.BigDecimal);
  public void setRemark(java.lang.String);
  public void setCreateTime(java.util.Date);
  public void setUpdateTime(java.util.Date);
  public void setIsDeleted(java.lang.String);
  public boolean equals(java.lang.Object);
  protected boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
}
