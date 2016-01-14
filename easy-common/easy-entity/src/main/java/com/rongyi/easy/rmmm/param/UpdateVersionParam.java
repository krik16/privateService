package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * 版本更新参数
 * @author Lc
 *
 */
public class UpdateVersionParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer version;
	private String source; // 0003 移动微商城卖家版
	private String device; // (设备号1：安卓，2 ：IOS)

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

}
