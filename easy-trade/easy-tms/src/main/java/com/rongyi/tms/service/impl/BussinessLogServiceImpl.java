/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月20日下午4:37:07
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.entity.BussinessLog;
import com.rongyi.tms.service.BussinessLogService;

/**
 * @Author: 柯军
 * @Description: 业务日志接口实现
 * @Datetime:2015年7月20日下午4:37:07
 * 
 **/
@Service
public class BussinessLogServiceImpl extends BaseServiceImpl implements BussinessLogService {

	private static final String NAMESPACE = "com.rongyi.tms.mapper.xml.BussinessLogMapper";

	@Override
	public void insert(BussinessLog bussinessLog) {
		this.getBaseDao().insertBySql(NAMESPACE + ".insert", bussinessLog);
	}

	@Override
	public BussinessLog selectByBussinessIdAndType(Integer bussinessId, Integer bussinessType) {
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("bussinessId", bussinessId);
//		map.put("bussinessType", bussinessType);
//		return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByBussinessIdAndType",map);
		return null;

	}

}
