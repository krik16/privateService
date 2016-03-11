package com.rongyi.core.framework.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.rongyi.core.framework.mybatis.dao.BaseDao;
import com.rongyi.core.framework.mybatis.service.BaseService;

public class BaseServiceImpl implements BaseService {

  @Autowired(required = false)
  @Qualifier(value = "baseDao")
  private BaseDao baseDao;
  
  @Autowired(required = false)
  @Qualifier(value = "baseDaoBase")
  private BaseDao baseDaoBase;

  @Override
  public BaseDao getBaseDao() {
    return this.baseDao;
  }

  @Override
  public BaseDao getBaseDaoBase() {
	 return this.baseDaoBase;
  }
}
