/**
 * 
 */
package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.RefundTypeEntity;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：商品订单退款类型
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface IRefundTypeService {
	
	/**
	 * 通过主键获取
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public RefundTypeEntity selectById(Long id) throws Exception;

}
