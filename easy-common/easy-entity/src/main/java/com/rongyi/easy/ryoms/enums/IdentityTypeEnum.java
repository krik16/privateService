package com.rongyi.easy.ryoms.enums;

/**
 * Created by WUH on 2017/5/4.
 * 身份类型枚举
 */
public enum  IdentityTypeEnum {
    GROUP_ADMIN(0, "集团管理员"),
    MALL_ADMIN(1, "商场管理员"),
    BRAND_ADMIN(2, "品牌管理员"),
    BRANCH_OFFICE(3, "分公司"),
    SHOP_MANAGER(4, "店长"),
    SHOPPING_GUIDE(5, "导购"),
    CHAIN_SHOP(8, "连锁总店");


    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    IdentityTypeEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
