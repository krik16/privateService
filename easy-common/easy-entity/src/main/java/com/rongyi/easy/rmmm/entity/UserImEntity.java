package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

public class UserImEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 环信账户 */
    private String imUser;

    /** 关联user表ID */
    private Integer userId;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 环信账户
     * @return imUser
     */
    public String getImUser() {
        return imUser;
    }

    /**
     * 环信账户
     * @param imUser
     */
    public void setImUser(String imUser) {
        this.imUser = imUser;
    }

    /**
     * 关联user表ID
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 关联user表ID
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public UserImEntity(){
    	
    }
    
    public UserImEntity(String imUser,Integer userId){
    	this.imUser = imUser;
    	this.userId = userId;
    }
}