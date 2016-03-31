///**
// * 
// */
//package com.rongyi.rss.msob;
//
//import com.rongyi.easy.osm.entity.OrderModelEntity;
//import com.rongyi.easy.rmmm.param.OrderModelParam;
//import com.rongyi.easy.rmmm.vo.OrderModelVO;
//
///**
// * Copyright (C),上海容易网电子商务有限公司
// * author chenjun
// * Description ：订单模板相关接口
// * time ：2015年5月19日
// * History: 变更记录
// * <author>           <time>             <version>        <desc>
// * chenjun            2015年5月19日               1.0              创建文件
// */
//public interface IOrderModelService {
//	
//	/**
//	 * 通过父模板id获取
//	 * @param orderModelId
//	 * @return
//	 * @throws Exception
//	 */
//	public OrderModelEntity getOrderModelById(Integer orderModelId)  throws Exception;
//	
//	/**
//	 * 生成订单模板 返回父模板id
//	 * 如果返回结果大于0，表示成功
//	 * @param param
//	 * @return
//	 * @throws Exception
//	 */
//	public Integer createOrderModel(final OrderModelParam param) throws Exception;
//	
//	/**
//	 * 获取订单模板信息 通过父模板id
//	 * @param orderModelId
//	 * @return
//	 * @throws Exception
//	 */
//	public OrderModelVO getOrderModel(Integer orderModelId) throws Exception;
//	
//	/**
//	 * 买家生成订单模板 返回父模板id
//	 * @param param
//	 * @return
//	 * @throws Exception
//	 */
//	public Integer submitOrderModel(final OrderModelParam param) throws Exception;
//
//}
