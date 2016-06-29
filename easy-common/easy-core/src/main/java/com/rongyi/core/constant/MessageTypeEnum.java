package com.rongyi.core.constant;

/**
 *  消息类型枚举
 *
 *  @author yaoyiwei
 *  @date 2016-06-06
 *  @version 1.0
 *
 */
public enum MessageTypeEnum {

    COMMODITY(1, "商品类");

    private Integer code;
    private String msg;

    private MessageTypeEnum(Integer code, String msg) {
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
        for (MessageTypeEnum e : MessageTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getMsg();
            }
        }
        return null;
    }
}
