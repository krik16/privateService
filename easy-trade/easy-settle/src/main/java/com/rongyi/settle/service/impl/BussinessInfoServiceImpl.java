/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月22日下午4:49:26
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.settle.service.BussinessInfoService;

/**	
 * @Author:  柯军
 * @Description: 对账配置商家信息 
 * @datetime:2015年9月22日下午4:49:26
 *
 **/

@Service
public class BussinessInfoServiceImpl extends BaseServiceImpl implements BussinessInfoService{
	
	private static final String NAMESPACE = "com.rongyi.settle.mapper.xml.BussinessMapper";

	@Override
	public void insert(BussinessInfo bussinessInfo) {
	this.getBaseDao().insertBySql(NAMESPACE+".insert",bussinessInfo);
	}

	@Override
	public void update(BussinessInfo bussinessInfo) {
		this.getBaseDao().updateBySql(NAMESPACE+".update",bussinessInfo);
	}

	@Override
	public BussinessInfo selectByConfigId(Integer configId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("configId", configId);
		return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByConfigId",map);
	}

	@Override
	public void updateByConfigId(BussinessInfo bussinessInfo) {
		this.getBaseDao().updateBySql(NAMESPACE+".updateByConfigId",bussinessInfo);
	}

}
