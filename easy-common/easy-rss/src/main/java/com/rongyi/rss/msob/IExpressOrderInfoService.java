/**
 * 
 */
package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.ExpressOrderInfoEntity;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：商品订单物流接口
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface IExpressOrderInfoService {
	
	/**
	 * 根据主键查询物流单信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ExpressOrderInfoEntity selectInfoById(Integer id) throws Exception;

	/**
	 * 添加物流信息，返回主键
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer insertExpressInfo(ExpressOrderInfoEntity entity);

}
