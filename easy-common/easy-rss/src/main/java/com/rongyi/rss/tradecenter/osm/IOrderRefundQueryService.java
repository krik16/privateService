/**
 * 
 */
package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.rmmm.param.AfterSaleParam;
import com.rongyi.easy.rmmm.vo.RefundVO;

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

}
