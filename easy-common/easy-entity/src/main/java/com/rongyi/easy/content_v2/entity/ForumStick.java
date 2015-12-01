package com.rongyi.easy.content_v2.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: ForumStick 
* @Description: 是否置顶修改
* @author shaozhou 
* @date 2015年11月17日 下午4:23:19 
*
 */
public class ForumStick implements Serializable{
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 1333475809937557149L;
	/**
	 * 主键
	 */
	private int id;
	/**
	 * 修改人
	 */
	private String updateUser;
	/**
	 * 修改时间
	 */
	private Date updateDate;
	/**
	 * 置顶时间
	 */
	private Date stickDate;
	/**
	 * 置顶：1，取消置顶：0
	 */
	private int stick;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}
	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @return the stick
	 */
	public int getStick() {
		return stick;
	}
	/**
	 * @param stick the stick to set
	 */
	public void setStick(int stick) {
		this.stick = stick;
	}
	/**
	 * @return the stickDate
	 */
	public Date getStickDate() {
		return stickDate;
	}
	/**
	 * @param stickDate the stickDate to set
	 */
	public void setStickDate(Date stickDate) {
		this.stickDate = stickDate;
	}
}
