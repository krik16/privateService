/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月28日上午10:14:24
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.tms.service.PaymentStatementService;

/**	
 * @Author:  柯军
 * @Description: 对账单 
 * @datetime:2015年9月28日上午10:14:24
 *
 **/

@Service
public class PaymentStatementServiceImpl extends BaseServiceImpl implements PaymentStatementService{

	private static final String NAMESPACE = "com.rongyi.tms.mapper.PaymentStatementMapper";
	
	@Override
	    public List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
	        map.put("currentPage", (currentPage-1) * pageSize);
	        map.put("pageSize", pageSize);
	        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	    }

	    @Override
	    public Integer selectPageListCount(Map<String, Object> map) {
	        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
	    }

		@Override
		public void updateByNotify(Map<String,Object> map) {
			map.put("status",12);
			map.put("payTime",DateUtil.getCurrDateTime());
			this.getBaseDao().updateBySql(NAMESPACE+".updateByNotify",map);
		}

		@Override
		public void updateByOffPay(String[] ids, String payMemo, Integer status) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("ids",ids);
			map.put("payMemo",payMemo);
			map.put("payTime",DateUtil.getCurrDateTime());
			map.put("status",status);
			this.getBaseDao().updateBySql(NAMESPACE+".updateByOffPay",map);
			
		}
	    
	    

}
