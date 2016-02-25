package com.rongyi.settle.service.impl;

import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.easy.settle.vo.ConfigShopVO;
import com.rongyi.settle.mapper.ConfigShopMapper;
import com.rongyi.settle.service.ConfigShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<ConfigShop> getConfigShopsByConfigId(Integer configId) {
        return mapper.getConfigShopsByConfigId(configId);
    }

    @Override
    public List<ConfigShopVO> getConfigShopsPage(Map<String, Object> paramsMap) {
        return mapper.getConfigShopsPage(paramsMap);
    }

    @Override
    public int selectConfigShopsPageCount(Map<String, Object> paramsMap) {
        return mapper.selectConfigShopsPageCount(paramsMap);
    }

    @Override
    public void update(ConfigShop configShop) {
         mapper.updateByPrimaryKeySelective(configShop);
    }

    @Override
    public boolean deleteConfigShopByConfigId(Integer configId) {
        if (configId==null)
            return false;
        return mapper.deleteConfigShopByConfigId(configId)>0;
    }
}
