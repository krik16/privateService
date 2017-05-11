package com.rongyi.core.enumerate.mcmc.new1;

import com.rongyi.core.enumerate.mcmc.CommodityStatusEnum;

/**
 * 商品回滚Map的key键枚举类
 * Created by zhoukunkun on 2017/4/20.
 */
public enum CommodityFilterEnum {
    CATEGORY_SHOP(1, "分类-店铺的对应关系，此处为shopId"),
    CATEGORY_BRAND(2, "分类-品牌的对应关系，此处为brandId"),
    CATEGORY_MALL(3, "分类-商场的对应关系，此处为mallId");

    private Integer code;
    private String msg;

    CommodityFilterEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String getMsgByCode(String code) {
        if(null != code) {
            for (CommodityStatusEnum e : CommodityStatusEnum.values()) {
                if (e.getCode().equals(code)) {
                    return e.getMsg();
                }
            }
        }
        return null;
    }
}
