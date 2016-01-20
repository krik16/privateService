package com.rongyi.easy.malllife.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  张争平
 * Description:  用户与导购聊天最新记录
 * time:  2015/11/18
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 *   张争平                             2015/11/18             1.0            创建文件
 *
 */
public class UserGuideChatParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer userId;//导购id

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
