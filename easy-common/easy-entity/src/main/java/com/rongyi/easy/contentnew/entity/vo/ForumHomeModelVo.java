package com.rongyi.easy.contentnew.entity.vo;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户查询内容管理首页信息的返回VO
 * @author lijing
 * @time 2015-08-31
 *
 */
public class ForumHomeModelVo implements Serializable{
	 /**主键id*/
		private Integer id;
		/**模版类型的id  是ForumModel的id*/
	    private Integer modelId;
	    /**内容标题*/
	    private String title;
	    /**状态 0代表启用，1代表关闭*/
	    private Integer status;
	    /**顺序（位置） 从1开始*/
	    private Integer sortIdx;
	    /** 创建人*/
	    private String createUser;
	    /** 创建时间*/
	    private Date createAt;
	    /**修改人*/
	    private String updateUser;
	    /**修改时间*/
	    private Date updateAt;
	    /**子模版个数*/
	    private Integer positionCount;
	    /**分类名字*/
	    private String name;
	    /**图片的格式 如png jpg 如果有多个 用;隔开*/
	    private String imageFormat;
	    /**图片像素大小的限制 如 500*500 */
	    private String imagePixel;
	    /**图片大小的显示 如 30   以K为单位*/
	    private Integer imageSize;
	   
	    
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

		public ForumHomeModelVo(){
	    	
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

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getSortIdx() {
			return sortIdx;
		}

		public void setSortIdx(Integer sortIdx) {
			this.sortIdx = sortIdx;
		}

		public String getCreateUser() {
			return createUser;
		}

		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}

		public Date getCreateAt() {
			return createAt;
		}

		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}

		public String getUpdateUser() {
			return updateUser;
		}

		public void setUpdateUser(String updateUser) {
			this.updateUser = updateUser;
		}

		public Date getUpdateAt() {
			return updateAt;
		}

		public void setUpdateAt(Date updateAt) {
			this.updateAt = updateAt;
		}

		public Integer getPositionCount() {
			return positionCount;
		}

		public void setPositionCount(Integer positionCount) {
			this.positionCount = positionCount;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
}
