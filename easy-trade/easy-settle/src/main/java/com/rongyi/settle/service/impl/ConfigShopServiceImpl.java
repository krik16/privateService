package com.rongyi.settle.service.impl;

import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.settle.mapper.ConfigShopMapper;
import com.rongyi.settle.service.ConfigShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ventures on 2015/12/9.
 * hebo
 */
@Service("ConfigShopService")
public class ConfigShopServiceImpl implements ConfigShopService{
//    private static final String NAMESPACE = "com.rongyi.settle.mapper.ConfigShopMapper";

    @Autowired
    ConfigShopMapper mapper;

    @Override
    public void insert(ConfigShop configShop) {
        mapper.insert(configShop);
    }
}
