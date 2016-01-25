package com.rongyi.easy.redi.vo;

public class MdmCategoryVo  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer sid ;
	
	private String mdmCategorySid ;

	private String mdmCategoryName ;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getMdmCategorySid() {
		return mdmCategorySid;
	}

	public void setMdmCategorySid(String mdmCategorySid) {
		this.mdmCategorySid = mdmCategorySid;
	}

	public String getMdmCategoryName() {
		return mdmCategoryName;
	}

	public void setMdmCategoryName(String mdmCategoryName) {
		this.mdmCategoryName = mdmCategoryName;
	}
	
	
}
