package com.rongyi.settle.mapper;

import com.rongyi.easy.settle.entity.ConfigShop;

import java.util.List;

public interface ConfigShopMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(ConfigShop
					   record);

	int insertSelective(ConfigShop record);

	ConfigShop selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(ConfigShop record);

	int updateByPrimaryKey(ConfigShop record);


	List<ConfigShop> getConfigShopsByConfigId(Integer configId);
}
