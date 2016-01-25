package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import com.rongyi.easy.flopgo.entity.FlopgoRecordEntity;
/**
 * 这个是返回给roa用的   用于存放用户翻牌记录的信息他会封装成一个list
 * 、上层是FlopRecordUserInfoVO.java
 * @author lijing
 *
 */

public class FlopGORecordInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;//用户翻牌记录的id
	private Date created_at;//用户翻牌记录的时间
	private String title;//用户的名称
	public FlopGORecordInfoVO(){
		
	}
	public FlopGORecordInfoVO(FlopgoRecordEntity fl){
		this._id=fl.getId().toString();
		this.created_at=fl.getFlopTime();
		this.title=fl.getPrizeName();
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
