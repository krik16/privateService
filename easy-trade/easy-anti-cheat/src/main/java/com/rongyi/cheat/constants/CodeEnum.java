package com.rongyi.cheat.constants;

/**
 * 错误码常量
 * @author baodk
 */
public enum CodeEnum {
    
    SUCCESS("0", "正常"),

    /** 正常 但没有数据 **/
    SUCCESS_NOINFO("-300","未查询到数据"),

    /** 系统性错误 */
    ERROR_UPDATE("-1", "更新失败！"),
    ERROR_VARSION("-4", "版本不匹配"),
    ERROR_SYSTEM("-11", "系统故障"),
    ERROR_DATABASE("-12", "数据库故障"),
    ERROR_PARAM("-13", "必要参数不合法或无效"),
    ERROR_DUBBO("-14","dubbo远程调用出错"),
    
    
    ERROR_DATA("-17", "数据更新异常"),
    ERROR_ACCOUNT_STOP("-18", "卖家的账号已被停用，无法对该账户进行操作"),
    
    ERROR_ORDER_NOT_MATCH("-19", "输入的用户与订单不符，无法操作"),
    ERROR_ORDER_NOT_FOUND("-20", "输入的订单不存在"),
    
    ERROR_PARAM_CHAR("-78","包含特殊字符"),
    
    ERROR_EXCEL("-30","读取Excel出错，请检查excel是否正确！"),
    /**
     * 账号相关的
     */
    ERROR_ACCOUNT("-20", "您输入的账号有误，请重新输入"),
    ERROR_ACCOUNT_TINGYONG("-22", "该账号已经被停用，无法对该账户进行操作！"),
    ERROR_VITURAL_ACCOUNT("-21", "该账号的虚拟账户不存在"),
    ERROR_ACCOUNT_DONGJIE("-26", "卖家的提现账户已被停用，无法对该账户进行操作"),
    ERROR_LOGIN("-100","登陆异常！");
    private String code; 
    private String message;
    private CodeEnum(String code, String message) {
        this.code = code; 
        this.message = message;
    }
    
    public String getActionCode(){
        return code; 
    }
    
    public String getMessage(){
        return message;
    }
}
