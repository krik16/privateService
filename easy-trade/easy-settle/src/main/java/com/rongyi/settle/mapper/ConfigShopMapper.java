package com.rongyi.settle.mapper;

import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.easy.settle.vo.ConfigShopVO;

import java.util.List;
import java.util.Map;

public interface ConfigShopMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(ConfigShop
					   record);

	int insertSelective(ConfigShop record);

	ConfigShop selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(ConfigShop record);

	int updateByPrimaryKey(ConfigShop record);


	List<ConfigShop> getConfigShopsByConfigId(Integer configId);

	List<ConfigShopVO> getConfigShopsPage(Map<String, Object> paramsMap);

	int selectConfigShopsPageCount(Map<String, Object> paramsMap);

	int deleteConfigShopByConfigId(Integer configId);
}
