/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年6月8日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年6月8日 1.0 创建文件
 */
public class AppVersionVO implements Serializable {

	private Boolean ifUpdate = false;// 是否需要更新

	private String appAddres;// 更新地址

	private Boolean ifForceUpdate = false;// 是否强制更新

	private Boolean alisdk = false;// false不支持支付宝sdk,true支持

	private Boolean aliweb = false;// false不支持支付宝web支付,true支持

	private String instruction;// 升级说明

	private String updatePic; //背景图片


	public Boolean getIfUpdate() {
		return ifUpdate;
	}

	public void setIfUpdate(Boolean ifUpdate) {
		this.ifUpdate = ifUpdate;
	}

	public String getAppAddres() {
		return appAddres;
	}

	public void setAppAddres(String appAddres) {
		this.appAddres = appAddres;
	}

	public Boolean getIfForceUpdate() {
		return ifForceUpdate;
	}

	public void setIfForceUpdate(Boolean ifForceUpdate) {
		this.ifForceUpdate = ifForceUpdate;
	}

	public Boolean getAlisdk() {
		return alisdk;
	}

	public void setAlisdk(Boolean alisdk) {
		this.alisdk = alisdk;
	}

	public Boolean getAliweb() {
		return aliweb;
	}

	public void setAliweb(Boolean aliweb) {
		this.aliweb = aliweb;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public String getUpdatePic() {
		return updatePic;
	}

	public void setUpdatePic(String updatePic) {
		this.updatePic = updatePic;
	}
}
