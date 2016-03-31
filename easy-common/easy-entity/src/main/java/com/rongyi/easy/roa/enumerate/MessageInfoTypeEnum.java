package com.rongyi.easy.roa.enumerate;

/**
 * 请求会员信息方式枚举
 * @author baodk
 */
public enum MessageInfoTypeEnum {
    
    /** 身份证 */
    IDENTITY_NO("0", "getMemberInfoByIdNo"),
    
    MEMBER_NO("1", "getMemberInfoByCardNo"),
    
    TELEPHONE("2", "getMemberInfoByTel");
    
    private String code;
    
    private String method;

    private MessageInfoTypeEnum(String code, String method) {
        this.code = code;
        this.method = method;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getMethod() {
        return method;
    }
    
}
