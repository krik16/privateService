/**
 * 
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.rmmm.param.AfterSaleParam;
import com.rongyi.easy.rmmm.vo.RefundVO;

import java.util.Map;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：查询订单退款
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface IOrderRefundQueryService {
	
	/**
	 * 买家查看退款详情
	 * 
	 * @return
	 * @throws Exception
	 */
	public RefundVO getRefundVOById(AfterSaleParam param) throws Exception;
	
	/**
	 * 根据主键查询
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ApplicationFormEntity selectById(Integer id) throws Exception;

	/**
	 * 获取退款原因和退款类型列表
	 * 待发货状态只有仅退款选项，已发货状态需要根据订单快递方式展示
	 * @param orderNo
	 * @return
	 */
	public DubboVO<Map<String, Object>> listRefundReasonAndType(String orderNo);

	/**
	 * 判断此店铺是否支持退款
	 * @param shopId
	 * @return
	 */
	public boolean refundSupportByShopId(String shopId);

}
