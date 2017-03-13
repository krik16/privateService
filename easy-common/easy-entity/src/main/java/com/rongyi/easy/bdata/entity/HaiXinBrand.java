package com.rongyi.easy.bdata.entity;

import java.io.Serializable;

public class HaiXinBrand implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String BRANDCODE;//品牌编码
	private String BRANDNAME;//品牌名称
	private String REMARK;//备注
	
	public String getBRANDCODE() {
		return BRANDCODE;
	}
	public void setBRANDCODE(String bRANDCODE) {
		BRANDCODE = bRANDCODE;
	}
	public String getBRANDNAME() {
		return BRANDNAME;
	}
	public void setBRANDNAME(String bRANDNAME) {
		BRANDNAME = bRANDNAME;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	@Override
	public String toString() {
		return "HaiXinBrand [BRANDCODE=" + BRANDCODE + ", BRANDNAME="
				+ BRANDNAME + ", REMARK=" + REMARK + "]";
	}
	
}
