package com.atguigu.tms.mock.bean;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.bean.SorterInfo implements java.io.Serializable {
  private static final long serialVersionUID;
  private java.lang.Long id;
  private java.lang.Long empId;
  private java.lang.Long orgId;
  private java.util.Date createTime;
  private java.util.Date updateTime;
  private java.lang.String isDeleted;
  private com.atguigu.tms.mock.bean.EmployeeInfo employeeInfo;
  public com.atguigu.tms.mock.bean.SorterInfo();
  public java.lang.Long getId();
  public java.lang.Long getEmpId();
  public java.lang.Long getOrgId();
  public java.util.Date getCreateTime();
  public java.util.Date getUpdateTime();
  public java.lang.String getIsDeleted();
  public com.atguigu.tms.mock.bean.EmployeeInfo getEmployeeInfo();
  public void setId(java.lang.Long);
  public void setEmpId(java.lang.Long);
  public void setOrgId(java.lang.Long);
  public void setCreateTime(java.util.Date);
  public void setUpdateTime(java.util.Date);
  public void setIsDeleted(java.lang.String);
  public void setEmployeeInfo(com.atguigu.tms.mock.bean.EmployeeInfo);
  public boolean equals(java.lang.Object);
  protected boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
}
