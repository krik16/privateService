package com.rongyi.core.enumerate.mcmc.new1;

import com.rongyi.core.enumerate.mcmc.CommodityStatusEnum;

/**
 * 商品回滚Map的key键枚举类
 * Created by zhoukunkun on 2017/4/20.
 */
public enum CommodityRollBackEnum {
    COMMODITY_LIST("commodityList", "商品分表旧数据"),
    COMMODITY_ID_LIST_NEW("commodityIdList", "商品分表新增数据的ID集合"),
    TOTAL_COMMODITY("totalCommodity", "商品总表旧数据"),
    TOTAL_COMMODITY_ID_NEW("totalCommodityId", "商品总表新增数据的ID"),
    SPEC_LIST("specList", "商品分表旧数据"),
    SPEC_ID_LIST_NEW("specIdList", "规格表新增数据的ID集合"),
    CATEGORY("category", "分类表旧数据（该分类下的商品数的回滚）"),
    CUSTOM_CATEGORY_ID_LIST_NEW("customCategoryIdList", "自定义分类表新增数据的ID集合");


    private String code;
    private String msg;

    CommodityRollBackEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
