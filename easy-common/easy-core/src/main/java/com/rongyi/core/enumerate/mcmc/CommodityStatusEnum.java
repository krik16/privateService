package com.rongyi.core.enumerate.mcmc;

/**
 * 商品状态枚举类
 *
 * @author yaoyiwei
 * @date 2016-11-16
 * @version 1.0
 *
 */
public enum CommodityStatusEnum {
    NOT_SPORT_CONTRACT(-1, "非现货"),
    OFF_SHELVE(0, "下架"),
    ON_SHELVE(1, "上架"),
    DELETED(2, "删除"),
    WAITING_ON_SHELVE(3, "待上架"),
    PENDING(4, "待处理"),
    PENDING_CHECK(5, "待审核"),
    CHECK_FAIL(6, "审核失败");

    private Integer code;
    private String msg;

    CommodityStatusEnum(Integer code, String msg) {
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
