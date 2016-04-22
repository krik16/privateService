/**
 * 
 */
package com.rongyi.rss.mallshop.order;

import com.rongyi.easy.rmmm.entity.ExpressOrderInfoEntity;
import com.rongyi.easy.rmmm.param.SalerDeliveryParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：商品订单物流接口
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface ROAExpressOrderInfoService {
	
	/**
	 * 根据主键查询物流单信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ExpressOrderInfoEntity selectInfoById(Integer id) throws Exception;
	
	/**
	 * 商家后台修改订单发货方式
	 * @param param  logisticsBillId(物流单号) expressName(快递公司名称) expressId(物流公司id) userId(卖家id) expressInfoId(主键id,有修改，无添加)，orderNum:订单号
	 * @return 主键id
	 * @throws Exception
	 */
	public String updateExpressInfo(SalerDeliveryParam param) throws Exception;

}
