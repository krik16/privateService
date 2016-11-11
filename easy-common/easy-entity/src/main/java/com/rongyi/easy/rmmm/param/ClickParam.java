package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class ClickParam extends MalllifeBaseParam implements Serializable{
	
	/** 点赞活动id */
    private String id;

    /** 类型 */
    private Integer type;

    /** 0:点赞 1:取消点赞 */
    private Integer status;

    /** 设备号 */
    private String devId;
    
    private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	@Override
	public String toString() {
		return "ClickParam [id=" + id + ", type=" + type + ", status=" + status
				+ ", devId=" + devId 
				+ ", userId=" + userId 
				+ "]";
	}

}
