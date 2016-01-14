package com.rongyi.rss.mallshop.order;

import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;

public interface ROAOrderFormService {
	
	/**
	 * 根据父订单id获得父订单
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	public OrderFormEntity getOrderFormByOrderId(Integer orderId) throws Exception;
	
	/**
	 * 把评价状态设置为已评价
	 * @param id
	 * @throws Exception
	 */
	public ResponseResult updateOrderIsCommentById(Integer id)  throws Exception;
	
	/**
	 * 通过父订单号获得
	 * @param OrderNum
	 * @return
	 * @throws Exception
	 */
	public OrderFormEntity getOrderFormByOrderNum(String orderNum) throws Exception;
	
	public PagingVO<OrderManagerVO> searchListByMap(Map<String, Object> paramsMap) throws Exception;
	
public List<OrderFormEntity> selectOrderList(Map param) throws Exception ;
	
	public int selectOrderListCount(String weidianId, String userId) throws Exception;

}
