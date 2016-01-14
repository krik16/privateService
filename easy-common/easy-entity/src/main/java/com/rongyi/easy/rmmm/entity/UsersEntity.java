package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class UsersEntity implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    /** 用户头像logo*/
    private String logo;
    
    /** 角色ID*/
    private Long userrole;
    
    /** 电话号码*/
    private Long phone;
    
    /** 密码*/
    private String password;
    
    /** 姓名*/
    private String name;
    
    /** 昵称*/
    private String nickname;

    /** 1:通过，2：审核中，3：删除*/
    private Integer status; 
    
    /** 对应用户账户表ID*/
    private Long accountId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Long getUserrole() {
        return userrole;
    }

    public void setUserrole(Long userrole) {
        this.userrole = userrole;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}