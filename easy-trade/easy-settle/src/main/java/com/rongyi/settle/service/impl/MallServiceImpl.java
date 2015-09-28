package com.rongyi.settle.service.impl;

import com.rongyi.easy.entity.MallEntity;
import com.rongyi.settle.dao.MallDao;
import com.rongyi.settle.service.MallService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xgq on 2015/9/28.
 */
@Service
public class MallServiceImpl implements MallService {

    @Autowired
    private MallDao mallDao;

    @Override
    public MallEntity selectById(String id) {
        return mallDao.get(new ObjectId(id));
    }
}
