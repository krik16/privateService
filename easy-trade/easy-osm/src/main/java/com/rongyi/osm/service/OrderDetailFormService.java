package com.rongyi.osm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;

/**
 * 订单明细service
 * @author baodk
 */
@Service
public class OrderDetailFormService extends BaseServiceImpl{

    private static final String MAPPER_NAMESPACE = "com.rongyi.easy.osm.entity.OrderDetailFormMapper";
    
    /**
     * 获取子订单列表
     */
    public List<OrderDetailFormEntity> selectOrderDetailListByParentNum(String orderNo) {
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("orderNo", orderNo);
    	return this.getBaseDao().selectListBySql(
    			MAPPER_NAMESPACE + ".selectOrderDetailListByParentNum",
    			param);
    }
    
    public OrderDetailFormEntity selectByOrderNum(String orderItemNo) {
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("orderItemNo", orderItemNo);
    	return this.getBaseDao().selectOneBySql(
    			MAPPER_NAMESPACE + ".selectOrderDetailByOrderNum",
    			param);
    }
    
    /**
     * 批量插入子订单
     * @param orderDetailEntitys
     */
    public void insert(OrderDetailFormEntity[] orderDetailEntitys){
    	List<OrderDetailFormEntity> list = new ArrayList<OrderDetailFormEntity>();
    	for (OrderDetailFormEntity orderDetail: orderDetailEntitys) {
    		list.add(orderDetail);
    	}
        this.getBaseDao().insertBySql(MAPPER_NAMESPACE + ".insert", list);
    }
    
    /**
     * 更新子订单状态
     * @param orderNum, status
     */
    public void updateStatus(OrderDetailFormEntity orderDetailEntity){
        this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateStatus", orderDetailEntity);
    }
    
    /**
     * 更新子订单状态,退款次数,退款金额
     * @param orderNum, status
     */
    public void updateStatusRefundAdult(OrderDetailFormEntity orderDetailEntity){

        this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateStatusRefundAdult", orderDetailEntity);
    }
    
    /**
     * 更新子订单支付款ID列表
     * @param orderNum
     * @param paymentId
     */
    public void updatePaymentIdByOrderNum(String orderItemNo, String paymentIdList) {
    	Map<String, String>params = new HashMap<String, String>();
    	params.put("orderItemNo", orderItemNo);
    	params.put("paymentIdList", paymentIdList);
    	this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updatePaymentIdByOrderNum", params);
    }

}
