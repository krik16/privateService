package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

public class FavourableVO implements Serializable{
	private String id;
	private Integer vistedNum;
    private Integer shareNum;
    
	public String getId() {
		return id;
	}

	public Integer getVistedNum() {
		return vistedNum;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setVistedNum(Integer vistedNum) {
		this.vistedNum = vistedNum;
	}

	public Integer getShareNum() {
		return shareNum;
	}

	public void setShareNum(Integer shareNum) {
		this.shareNum = shareNum;
	}
    
}
