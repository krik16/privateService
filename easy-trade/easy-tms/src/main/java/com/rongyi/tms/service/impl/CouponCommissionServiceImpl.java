/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月17日下午3:05:08
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.bean.ObjectConvert;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.CouponCommission;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.CouponCommissionService;

/**
 * @Author: 柯军
 * @Description: 优惠券码接口实现类
 * @datetime:2015年7月17日下午3:05:08
 * 
 **/

@Service
public class CouponCommissionServiceImpl extends BaseServiceImpl implements CouponCommissionService {

	private static final String NAMESPACE = "com.rongyi.tms.mapper.xml.CouponCommissionMapper";

	@SuppressWarnings("unchecked")
	@Override
	public void insertByMq(MessageEvent messageEvent) {
		Map<String, Object> bodyMap = JsonUtil.getMapFromJson(messageEvent.getBody().toString());
		CouponCommission couponCommission = (CouponCommission) ObjectConvert.convertFromMap(CouponCommission.class, bodyMap);
		couponCommission.setCreateAt(new Date(messageEvent.getTimestamp()));
		couponCommission.setStatus(ConstantEnum.COUPON_COMMISSION_STATUS0.getCodeInt());
		this.getBaseDao().insertBySql(NAMESPACE + ".insert", couponCommission);
	}

	@Override
	public void sendCommissionToVa() {
		do {

		} while (true);
	}

	@Override
	public List<CouponCommission> selectPageList(Integer currentPage, Integer pageSize, Map<String, Object> map) {
		map.put("currentPage", (currentPage - 1) * pageSize);
		map.put("pageSize", pageSize);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	}

	@Override
	public int selectPageListCount(Map<String, Object> map) {
		return this.getBaseDao().count(NAMESPACE + ".selectPageListCount", map);
	}

	@Override
	public void batchUpdate(List<CouponCommission> list) {
		this.getBaseDao().updateBySql(NAMESPACE + ".batchUpdate", list);
	}
}
