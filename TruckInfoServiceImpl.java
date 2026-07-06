package com.atguigu.tms.mock.service.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.impl.TruckInfoServiceImpl extends com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<com.atguigu.tms.mock.mapper.TruckInfoMapper, com.atguigu.tms.mock.bean.TruckInfo> implements com.atguigu.tms.mock.service.TruckInfoService {
  com.atguigu.tms.mock.service.TruckModelService truckModelService;
  com.atguigu.tms.mock.service.BaseRegionInfoService baseRegionInfoService;
  com.atguigu.tms.mock.service.BaseOrganService baseOrganService;
  com.atguigu.tms.mock.service.TruckTeamService truckTeamService;
  public com.atguigu.tms.mock.service.impl.TruckInfoServiceImpl();
  public com.atguigu.tms.mock.bean.TruckInfo initTruckInfo(java.lang.Long, java.lang.Integer);
}
