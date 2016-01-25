/**
 * 
 */
package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2016年1月7日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年1月7日               1.0              创建文件
 */
public class KillVO implements Serializable{
	
	private String key;//
	
	private String currentTime;//格式 2015-12-14 11:00:00
	
	private String displayType;//页面显示样式  hour day 默认hour
	
	private String hdRule;//活动规则
	 
	private List<KillActivityListVO> list;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getHdRule() {
		return hdRule;
	}

	public void setHdRule(String hdRule) {
		this.hdRule = hdRule;
	}

	public List<KillActivityListVO> getList() {
		return list;
	}

	public void setList(List<KillActivityListVO> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "KillVO [key=" + key + ", currentTime=" + currentTime + ", displayType=" + displayType + ", hdRule=" + hdRule
				+ ", list=" + list + "]";
	}

}
