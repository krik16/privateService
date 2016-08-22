package com.rongyi.settle.service;

import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.easy.settle.vo.ConfigShopVO;

import java.util.List;
import java.util.Map;

/**
 * Created by Ventures on 2015/12/9.
 */
public interface ConfigShopService {

    void insert(ConfigShop configShop);

    List<ConfigShop> getConfigShopsByConfigId(Integer configId);

    List<ConfigShopVO> getConfigShopsPage(Map<String, Object> paramsMap);

    int selectConfigShopsPageCount(Map<String, Object> paramsMap);

    void update(ConfigShop configShop);

    boolean deleteConfigShopByConfigId(Integer configId);

    List<String> getConfigShopIdsByConfigId(Integer configId);
}
