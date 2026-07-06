package com.atguigu.tms.mock.mapper;

/** Auto-decompiled from tms-mock JAR */
public interface com.atguigu.tms.mock.mapper.ExpressCourierMapper extends com.atguigu.tms.mock.mapper.adv.AdvMapper<com.atguigu.tms.mock.bean.ExpressCourier> {
  public abstract com.atguigu.tms.mock.bean.ExpressCourier selectExpressCourierByComplexId(java.lang.String, java.lang.Long);
  public abstract java.util.List<com.atguigu.tms.mock.bean.ExpressCourier> selectExpressCourierWithComplexId(java.lang.String);
}
