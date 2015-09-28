package com.rongyi.settle.service.impl;

import com.rongyi.easy.entity.ShopEntity;
import com.rongyi.settle.dao.ShopDao;
import com.rongyi.settle.service.ShopService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xgq on 2015/9/28.
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    public ShopEntity selectById(String id) {
        return shopDao.get(new ObjectId(id));
    }
}
