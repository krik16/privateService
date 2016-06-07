package com.rongyi.core.constant;

/**
 *  推送类型枚举
 *
 *  @author yaoyiwei
 *  @date 2016-06-06
 *  @version 1.0
 *
 */
public enum PushTypeEnum {

    SYSTEM(1, "系统推送"),
    ARTIFACT(2, "人工推送");

    private Integer code;
    private String msg;

    private PushTypeEnum(Integer code, String msg) {
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
        for (PushTypeEnum e : PushTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getMsg();
            }
        }
        return null;
    }
}
