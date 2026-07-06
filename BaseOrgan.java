package com.atguigu.tms.mock.bean;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.bean.BaseOrgan implements java.io.Serializable {
  private static final long serialVersionUID;
  private java.lang.Long id;
  private java.lang.String orgName;
  private java.lang.Long orgLevel;
  private java.lang.Long regionId;
  private java.lang.Long orgParentId;
  private java.lang.String points;
  private java.util.Date createTime;
  private java.lang.String districtId;
  private java.util.Date updateTime;
  private java.lang.String isDeleted;
  private java.util.List<com.atguigu.tms.mock.bean.TruckTeam> truckTeamList;
  public com.atguigu.tms.mock.bean.BaseOrgan();
  public java.lang.Long getId();
  public java.lang.String getOrgName();
  public java.lang.Long getOrgLevel();
  public java.lang.Long getRegionId();
  public java.lang.Long getOrgParentId();
  public java.lang.String getPoints();
  public java.util.Date getCreateTime();
  public java.lang.String getDistrictId();
  public java.util.Date getUpdateTime();
  public java.lang.String getIsDeleted();
  public java.util.List<com.atguigu.tms.mock.bean.TruckTeam> getTruckTeamList();
  public void setId(java.lang.Long);
  public void setOrgName(java.lang.String);
  public void setOrgLevel(java.lang.Long);
  public void setRegionId(java.lang.Long);
  public void setOrgParentId(java.lang.Long);
  public void setPoints(java.lang.String);
  public void setCreateTime(java.util.Date);
  public void setDistrictId(java.lang.String);
  public void setUpdateTime(java.util.Date);
  public void setIsDeleted(java.lang.String);
  public void setTruckTeamList(java.util.List<com.atguigu.tms.mock.bean.TruckTeam>);
  public boolean equals(java.lang.Object);
  protected boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
}
