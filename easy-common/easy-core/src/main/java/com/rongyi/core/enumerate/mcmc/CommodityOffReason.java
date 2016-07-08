package com.rongyi.core.enumerate.mcmc;

/**
 * 商品下架原因枚举
 *
 * @author yaoyiwei
 * @date 2016-06-13
 * @version 1.0
 *
 */
public enum CommodityOffReason {

    OFF_DEFINED(0, "自定义"),
    OFF_PIC(1, "照片不符合要求"),
    OFF_DESC(2, "商品命名/文字描述不符合要求"),
    OFF_SPEC(3, "规格参数错误"),
    OFF_FEE(4, "运费错误"),
    OFF_SHOP(5, "店铺关联错误");

    private Integer code;
    private String msg;

    private CommodityOffReason(Integer code, String msg) {
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

    public static String getMsgByCode(Integer code) {
        for (CommodityOffReason e : CommodityOffReason.values()) {
            if (e.getCode().equals(code)) {
                return e.getMsg();
            }
        }
        return null;
    }


}
