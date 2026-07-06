package com.atguigu.tms.mock.service.adv.impl;

/** Auto-decompiled from tms-mock JAR */
public class com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl<M extends com.atguigu.tms.mock.mapper.adv.AdvMapper<T>, T> extends com.baomidou.mybatisplus.extension.service.impl.ServiceImpl<M, T> implements com.atguigu.tms.mock.service.adv.AdvService<T> {
  protected java.util.Map<java.lang.Long, T> cache;
  public com.atguigu.tms.mock.service.adv.impl.AdvServiceImpl();
  public void truncateTable();
  public void removeWithCache();
  public void loadCache();
  protected void loadCache(java.util.List<T>);
  public java.util.Map<java.lang.Long, T> all(boolean);
  protected java.lang.Long getId(T);
  protected java.lang.String getIdName();
  public boolean saveOrUpdate(T, java.lang.Boolean);
  public boolean saveOrUpdateBatch(java.util.List<T>, int, java.lang.Boolean);
  public T getById(java.lang.Long, java.lang.Boolean);
  public T getOneByRandom();
}
