package com.rongyi.easy.redi.vo;

import java.util.List;

public class BailianCategoryBaseVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resultCode;// 
	private String resultMsg ;
	private List<BailianCategoryVo> list;//
	private List<BailianGoodsVo> product;// 
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public List<BailianCategoryVo> getList() {
		return list;
	}
	public void setList(List<BailianCategoryVo> list) {
		this.list = list;
	}
	public List<BailianGoodsVo> getProduct() {
		return product;
	}
	public void setProduct(List<BailianGoodsVo> product) {
		this.product = product;
	}
	
	
	
}