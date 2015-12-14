package com.rongyi.settle.service;

import com.rongyi.easy.settle.entity.ConfigShop;

import java.util.List;

/**
 * Created by Ventures on 2015/12/9.
 */
public interface ConfigShopService {

    void insert(ConfigShop configShop);

    List<ConfigShop> getConfigShopsByConfigId(Integer configId);
}
