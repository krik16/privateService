package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

/**
 * 查询模版的信息
 * @author lijing
 * @time 2015-09-06
 *
 */
public class ForumPostiomModelVo implements Serializable{
    /**位置id*/
	private Integer id;
	/**模版id*/
	private Integer modelId;
	/**模版名字*/
	private String modelName;
	/**图片格式*/
	private String imageFormat;
	/**图片像素*/
	private String imagePixel;
	/**图片大小*/
	private  Integer imageSize;
	
	
	public ForumPostiomModelVo(){
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getModelId() {
		return modelId;
	}


	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getImageFormat() {
		return imageFormat;
	}


	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
	}


	public String getImagePixel() {
		return imagePixel;
	}


	public void setImagePixel(String imagePixel) {
		this.imagePixel = imagePixel;
	}


	public Integer getImageSize() {
		return imageSize;
	}


	public void setImageSize(Integer imageSize) {
		this.imageSize = imageSize;
	}
	
	
	
}
