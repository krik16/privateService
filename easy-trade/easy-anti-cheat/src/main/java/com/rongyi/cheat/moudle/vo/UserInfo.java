package com.rongyi.cheat.moudle.vo;

import java.io.Serializable;

import com.rongyi.cheat.constants.Constant;

/**
 * 用户信息vo
 * @author baodk
 */
public class UserInfo implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String username;
    
    private String password;
    
    private String mallId;
    
    private String mallName;
    
    /** 超级管理员：superAdmin || 商场管理员：mallAdmin */
    private String type;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getMallId() {
        return mallId;
    }
    
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }
    
    public String getMallName() {
        return mallName;
    }
    
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getTypeSuper() {
		return Constant.USERINFO.TYPE_SUPER_ADMIN;
	}

	public String getTypeMall() {
		return Constant.USERINFO.TYPE_MALL_ADMIN;
	}
}
