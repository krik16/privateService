/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年10月15日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月15日               1.0              创建文件
 */
public class BullParam extends BaseParam implements Serializable{
	
	private Integer bullId;//买手id

	public Integer getBullId() {
		return bullId;
	}

	public void setBullId(Integer bullId) {
		this.bullId = bullId;
	}

}
