package com.rongyi.core.enumerate.mcmc;

/**
 * 终端类型枚举类(礼品终端适用)
 *
 * @author yaoyiwei
 * @date 2016-11-16
 * @version 1.0
 *
 */
public enum TerminalTypeEnum {
    WE_CHAT(1, "微信"),
    SCREEN(2, "互动屏");

    private Integer code;
    private String msg;

    TerminalTypeEnum(Integer code, String msg) {
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
        for (TerminalTypeEnum e : TerminalTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getMsg();
            }
        }
        return null;
    }


}
