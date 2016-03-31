/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class RebateListVO implements Serializable{
	
	private List<RebateVO> available;// 可使用
	
	private List<RebateVO> unAvailable;// 不可使用

	public List<RebateVO> getAvailable() {
		return available;
	}

	public void setAvailable(List<RebateVO> available) {
		this.available = available;
	}

	public List<RebateVO> getUnAvailable() {
		return unAvailable;
	}

	public void setUnAvailable(List<RebateVO> unAvailable) {
		this.unAvailable = unAvailable;
	}

	@Override
	public String toString() {
		return "RebateListVO [available=" + available + ", unAvailable=" + unAvailable + "]";
	}

}
