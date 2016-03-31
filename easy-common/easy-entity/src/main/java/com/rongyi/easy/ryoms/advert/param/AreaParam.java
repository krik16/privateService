package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;

public class AreaParam implements Serializable {

	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -5210905694751886597L;
	private String type;
	private String id;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年2月24日 下午4:28:08
	* @throws 
	*/
	@Override
	public String toString() {
		return "AreaParam [type=" + type + ", id=" + id + "]";
	}
}
