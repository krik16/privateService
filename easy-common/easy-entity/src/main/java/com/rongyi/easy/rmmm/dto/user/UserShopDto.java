package com.rongyi.easy.rmmm.dto.user;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  店员审核dto
 * time:  2015/4/17
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/4/17              1.0            创建文件
 *
 */
public class UserShopDto implements Serializable {

    private static final long serialVersionUID = 1L;


    /** 主键 */
    private Integer id;

    /** 用户头像logo */
    private String userLogo;


    /** 电话号码 */
    private String userPhone;


    /** 姓名 */
    private String userName;

    /** 1:通过，2：审核中，3：删除 */
    private Integer userStatus;

    /** 店铺Id **/
    private Integer shopId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}
