package com.rongyi.easy.bdata.enums;

/**
 * Created by WUH on 2017/6/6.
 * 店铺营业状态枚举
 */
public enum  ShopBusinessStatusEnum {
    NORMAL(0, "正常营业"),
    WAITING(1, "即将营业"),
    SUSPEND(2, "暂停营业"),
    STOP(3, "停止营业"),
    @Deprecated //目前在使用ValidEnum.PENDING
    PENDING(4, "待处理");

    ShopBusinessStatusEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
