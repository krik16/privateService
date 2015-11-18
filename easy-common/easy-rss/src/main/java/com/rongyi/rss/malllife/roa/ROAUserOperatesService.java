/**
 * 
 */
package com.rongyi.rss.malllife.roa;

import com.rongyi.easy.entity.UserOperateEntity;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public interface ROAUserOperatesService {
	
	/**
	 * 更新操作记录
	 * @param userId
	 * @param type
	 */
	public void updateUserOperateEntity(String userId,String type)  throws Exception;

}
