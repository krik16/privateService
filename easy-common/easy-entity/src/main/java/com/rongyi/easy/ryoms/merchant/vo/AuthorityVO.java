package com.rongyi.easy.ryoms.merchant.vo;

import java.io.Serializable;

import com.rongyi.easy.bsoms.entity.BAuthorities;

public class AuthorityVO extends BAuthorities implements Serializable {

	private static final long serialVersionUID = 2311905246954678797L;
	
	private boolean isOwn = Boolean.FALSE;//默认不是

	public boolean isOwn() {
		return isOwn;
	}

	public void setOwn(boolean isOwn) {
		this.isOwn = isOwn;
	}
	
}
