package com.rongyi.easy.content_v2.param;

import java.io.Serializable;
import java.util.Date;
/**
 * 用于内容详情中的删除关闭发布的一些参数
 * @author lijing
 * @time 2015-08-31
 *
 */
@SuppressWarnings("serial")
public class ForumContentStatusDelParam implements Serializable{
	/**查询id*/
	private Integer id;
	/**修改人*/
	private String updateUser;
	/**修改日期*/
	private Date updateAt;
	
	/**状态  0待发布、1已发布、2已关闭*/
	private Integer status;
	/**是否删除*/
	private Boolean isDeleted;
	
	public ForumContentStatusDelParam(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	
}
