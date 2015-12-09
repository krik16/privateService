package com.rongyi.settle.mapper;

import com.rongyi.easy.settle.entity.ConfigShop;

public interface ConfigShopMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(ConfigShop
					   record);

	int insertSelective(ConfigShop record);

	ConfigShop selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(ConfigShop record);

	int updateByPrimaryKey(ConfigShop record);


}
