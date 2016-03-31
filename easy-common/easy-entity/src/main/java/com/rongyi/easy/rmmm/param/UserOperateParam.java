/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class UserOperateParam extends MalllifeBaseParam implements Serializable{
	
	private String type;//类型 1 红包 2代金券 3抵扣券

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UserOperateParam [type=" + type + "]";
	}

}
