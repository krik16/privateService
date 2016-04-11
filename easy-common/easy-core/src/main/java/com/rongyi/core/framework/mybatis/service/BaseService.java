package com.rongyi.core.framework.mybatis.service;

import com.rongyi.core.framework.mybatis.dao.BaseDao;

public interface BaseService {

    public BaseDao getBaseDao();
    
    public BaseDao getBaseDaoBase();
}
