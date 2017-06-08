package com.rongyi.easy.bdata.enums;

/**
 * Created by WUH on 2017/6/6.
 * 状态枚举
 */
public enum  ValidEnum {
    NORMAL(0, "正常显示"),
    HIDE(1, "隐藏"),
    DELETE(2, "删除"),
    PENDING(3, "待处理");

    ValidEnum(int code, String msg){
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
