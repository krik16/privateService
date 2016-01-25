package com.rongyi.easy.coupon.old_vo;

import java.io.Serializable;

public class OldFavVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer vistedNum;//浏览次数
    private Integer shareNum;//分享次数（暂未用到）
    
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
