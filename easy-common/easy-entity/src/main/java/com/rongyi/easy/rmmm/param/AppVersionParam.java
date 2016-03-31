/**
 * 
 */
package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年6月8日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年6月8日 1.0 创建文件
 */
public class AppVersionParam implements Serializable {

	private String deviceType;// 设备（Android/IOS）

	private String appVersion;// 版本号（数字）27.0

	private String appName;// 需要更新的App（MDC2C/RYG/MDB2C）

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

}
