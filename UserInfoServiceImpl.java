package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.UserInfoServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.UserInfoMapper, com.atguigu.tms.mock.bean.UserInfo> implements com.atguigu.tms.mock.service.UserInfoService {
  private static final org.slf4j.Logger log;
  com.atguigu.tms.mock.service.UserAddressService userAddressService;
  com.atguigu.tms.mock.mapper.UserInfoMapper userInfoMapper;
  java.util.Set<java.lang.Long> hasCourseUserSet;
  public com.atguigu.tms.mock.service.impl.UserInfoServiceImpl();
  public void loadCache();
  protected void resetUser();
  public java.util.List<com.atguigu.tms.mock.bean.UserInfo> genUserInfos(java.lang.Boolean, java.lang.Integer, java.util.Date);
  public com.atguigu.tms.mock.bean.UserInfo initUserInfo(java.util.Date);
  public void fixUserInfo(java.util.List<com.atguigu.tms.mock.bean.UserInfo>);
  public void updateUsers(java.util.Date);
  public void setUserHasCourse(java.lang.Long);
  public void clearUserHasCourse();
  static {};
}
