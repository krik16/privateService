package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ExpressPushVO  implements Serializable{
	
	private String state;//已签收，在途中
	
	private List<ExpressDataVO> expressList;
	
	private boolean ifSupportByKuaidi100 = false;// true快递100订阅成功 false没成功
	
	private String expressBillId;// 物流单号ID

	private String expressName;// 物流名称

	public String getExpressBillId() {
		return expressBillId;
	}

	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public boolean isIfSupportByKuaidi100() {
		return ifSupportByKuaidi100;
	}

	public void setIfSupportByKuaidi100(boolean ifSupportByKuaidi100) {
		this.ifSupportByKuaidi100 = ifSupportByKuaidi100;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<ExpressDataVO> getExpressList() {
		return expressList;
	}

	public void setExpressList(List<ExpressDataVO> expressList) {
		this.expressList = expressList;
	}

	@Override
	public String toString() {
		return "ExpressPushVO [state=" + state + ", expressList=" + expressList
				+ ", ifSupportByKuaidi100=" + ifSupportByKuaidi100 
				+ ", expressBillId=" + expressBillId
				+ ", expressName=" + expressName
				+ "]";
	}

}
