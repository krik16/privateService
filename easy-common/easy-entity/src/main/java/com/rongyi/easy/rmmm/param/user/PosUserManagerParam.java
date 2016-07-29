package com.rongyi.easy.rmmm.param.user;

import com.rongyi.easy.rmmm.base.BaseParam;

/*
 * Description:  pos用户信息
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2016/7/29    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class PosUserManagerParam  extends BaseParam {


    private String loginAccount;//登录账号

    private String loginPwd;//登录密码

    private String shopId;//商铺Id
    private String mallId;//商场Id
    private String brandId;//品牌Id
    private String groupId;//集团Id

    private Integer type=3;  // 1 导购 2买手 3POS账号


    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
