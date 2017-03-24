package com.rongyi.easy.bdata.entity;

import java.io.Serializable;

public class HaiXinCategory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String CLSCODE;   //品类编码
	private String CLSNAME;   //品类名称
	private String UPPERCODE; //上级品类编码
	private Integer CLSLEVEL; //品类级别
	
	public String getCLSCODE() {
		return CLSCODE;
	}
	public void setCLSCODE(String cLSCODE) {
		CLSCODE = cLSCODE;
	}
	public String getCLSNAME() {
		return CLSNAME;
	}
	public void setCLSNAME(String cLSNAME) {
		CLSNAME = cLSNAME;
	}
	public String getUPPERCODE() {
		return UPPERCODE;
	}
	public void setUPPERCODE(String uPPERCODE) {
		UPPERCODE = uPPERCODE;
	}
	public Integer getCLSLEVEL() {
		return CLSLEVEL;
	}
	public void setCLSLEVEL(Integer cLSLEVEL) {
		CLSLEVEL = cLSLEVEL;
	}
	@Override
	public String toString() {
		return "HaiXinCategory [CLSCODE=" + CLSCODE + ", CLSNAME=" + CLSNAME
				+ ", UPPERCODE=" + UPPERCODE + ", CLSLEVEL=" + CLSLEVEL + "]";
	}
	
}
