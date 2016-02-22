package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;

public class FileUploadParam implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = -5709702304605862570L;
	private String maxSize;
	private String width;
	private String height;
	/**
	 * @return the maxSize
	 */
	public String getMaxSize() {
		return maxSize;
	}
	/**
	 * @param maxSize the maxSize to set
	 */
	public void setMaxSize(String maxSize) {
		this.maxSize = maxSize;
	}
	/**
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(String width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}
}
