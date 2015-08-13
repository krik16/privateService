package com.rongyi.osm.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.osm.constant.OrderFormStatus;

/**
 * 订单service
 * 
 * @author baodk
 */
@Service
public class OrderFormService extends BaseServiceImpl {

	@Autowired
	private OrderDetailFormService orderDetailService;

	private static final String MAPPER_NAMESPACE = "com.rongyi.easy.osm.entity.OrderFormMapper";

	/**
	 * 根据大订单号，返回指定的订单
	 * 
	 * @param orderNo
	 * @return
	 */
	public OrderFormEntity selectByOrderNum(String orderNo) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderNo", orderNo);
		return this.getBaseDao().selectOneBySql(MAPPER_NAMESPACE + ".selectByOrderNum", params);
	}

	public List<OrderFormEntity> selectNonClosedOrder(int start, int range) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("status", OrderFormStatus.CLOSED);
		params.put("start", start);
		params.put("range", range);
		return this.getBaseDao().selectListBySql(MAPPER_NAMESPACE + ".selectNonClosedOrder", params);
	}

	/**
	 * 插入订单，包括订单明细
	 * 
	 * @param order
	 * @param orderDetailEntitys
	 */
	@Transactional
	public boolean insert(OrderFormEntity order, OrderDetailFormEntity[] orderDetailEntitys) {
		boolean result = true;
		if (orderDetailEntitys.length == 0) {
			throw new RuntimeException("子订单不能为空！");
		}

		int rowCount = this.getBaseDao().insertBySql(MAPPER_NAMESPACE + ".insert", order);
		if (rowCount == 0) {
			// 订单号重复或其他未插入成功的情况
			result = false;
		} else {
			orderDetailService.insert(orderDetailEntitys);
			result = true;
		}

		return result;
	}

	/**
	 * 更新订单价格（同时更新折扣价）
	 * 
	 * @param orderFormEntity
	 */
	public void updateTotalPrice(OrderFormEntity orderFormEntity) {
		this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateTotalPrice", orderFormEntity);
	}

	/**
	 * 更新订单状态（包括订单状态，状态路径）
	 * 
	 * @param orderFormEntity
	 */
	public void updateStatus(OrderFormEntity orderFormEntity) {
		this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateStatus", orderFormEntity);
	}

	/**
	 * 更新订单状态（包括订单状态，状态路径，状态保持时间，预计进入下一状态时间）
	 * 
	 * @param orderFormEntity
	 */
	public void updateStatusWithTime(OrderFormEntity orderFormEntity) {
		this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateStatusWithTime", orderFormEntity);
	}

	/**
	 * 更新订单状态和付款ID（包括订单状态，状态路径，状态保持时间，预计进入下一状态时间）
	 * 
	 * @param orderFormEntity
	 */
	public void updateStatusAndPaymentIdWithTime(OrderFormEntity orderFormEntity) {
		JSONObject jsonObject = new JSONObject();
		if (!StringUtils.isEmpty(orderFormEntity.getDiscountInfo())) {
			jsonObject = JSONObject.fromObject(orderFormEntity.getDiscountInfo());
			if (jsonObject.get("returnScore") != null && Integer.parseInt(jsonObject.get("returnScore").toString()) > 0) {
				//实际使用的积分
				jsonObject.put("score", Integer.parseInt(jsonObject.get("score").toString())-Integer.parseInt(jsonObject.get("returnScore").toString()));
				//修改价格前积分对应的积分抵用金额
				double scoreDeduction=Double.valueOf(jsonObject.get("scoreDeduction").toString());
				//修改价格后积分对应的积分抵用金额
				double returnScoreDeduction=Double.valueOf(jsonObject.get("returnScoreDeduction").toString());
				//实际使用的积分对应的积分抵用金额
				jsonObject.put("scoreDeduction", sub(scoreDeduction,returnScoreDeduction));
				orderFormEntity.setDiscountInfo(jsonObject.toString());
			}
		}
		this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateStatusAndPaymentIdWithTime", orderFormEntity);
	}
	public static double sub(double value1,double value2){
		BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
		BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
		return b1.subtract(b2).doubleValue();
	}
	/**
	 * 更新订单状态和物流ID（包括订单状态，状态路径，状态保持时间，预计进入下一状态时间）
	 * 
	 * @param orderFormEntity
	 */
	public void updateStatusAndLogisticsBillIdWithTime(OrderFormEntity orderFormEntity) {
		this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateStatusAndLogisticsBillIdWithTime", orderFormEntity);
	}

	/**
	 * 更新订单PaymentId
	 */
	public void updatePaymentIdByOrderNum(String orderNo, String paymentId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderNo", orderNo);
		params.put("paymentIdList", paymentId);
		this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updatePaymentIdByOrderNum", params);
	}

	/**
	 * 更新已评价状态
	 */
	public void updateIsComment(OrderFormEntity orderFormEntity) {
		this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateIsComment", orderFormEntity);
	}
}
