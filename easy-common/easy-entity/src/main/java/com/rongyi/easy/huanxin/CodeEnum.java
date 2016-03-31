package com.rongyi.easy.huanxin;

/**
 * 错误码常量
 * @author baodk
 */
public enum CodeEnum {
    
    SUCCESS("0", "正常"),

    /** 正常 但没有数据 **/
    SUCCESS_NOINFO("-300","未查询到数据"),

    /** 系统性错误 */
    ERROR_ID_INVALID("-1", "调用者ID不存在或无效"),
    ERROR_PASSWORD("-2", "调用者密码出错"),
    ERROR_ID_ILLEGAL("-3", "调用方ID不合法 "),
    ERROR_VARSION("-4", "版本不匹配"),
    ERROR_SYSTEM("-11", "系统故障"),
    ERROR_DATABASE("-12", "数据库故障"),
    ERROR_PARAM("-13", "必要参数不合法或无效"),
    ERROR_PARAM_CHAR("-78","包含特殊字符"),
    
    /** 注册用户 */
    ERROR_PHONE("-1101", "手机号已注册"),
    ERROR_QQ("-1102", "qq号已注册"),
    ERROR_WECHAT("-1103", "微信号已注册"),
    ERROR_EMAIL("-1104", "邮箱已注册"),
    
    /** 查询 更新 修改累 */
    ERROR_PHONE_INVALID("-1111", "指定手机号不存在或无效"),
    ERROR_QQ_INVALID("-1112", "指定QQ号不不存在或无效"),
    ERROR_WECHAT_INVALID("-1113", "指定微信号不存在或无效"),
    ERROR_EMAIL_INVALID("-1114", "指定邮箱不存在或无效"),
    ERROR_MEMBER_INVALID("-1115", "指定会员编号不存在或无效"),
    ERROR_IDENTITY_INVALID("-1116", "指定身份证不存在或无效"),
    ERROR_CARD_INVALID("-1117", "开卡方编号不正确或无效"),
    ERROR_DATE_INVALID("-1118", "指定时间格式不正确或无效"),
    ERROR_SUGGESTION_INVALID("-1119", "反馈内容不不存在或无效"),
    ERROR_ASSISTANT_INVALID("-1120", "不是未审核的店员"),
    
    ERROR_LOGIN_IN_INVALID("-2000","登录出错"),
    
    /** 密码修改 */
    ERROR_ORIGINAL_PASSOWRD("-1212", "原密码不正确"),
    ERROR_NEW_INVALID("-1213", "新密码无效"),
    ERROR_EXCEED_RESTRICTION("-1214", "同一天找回密码次数超限制"),
    
    /** 版本更新 */
    SUCCESS_UNNECESSARIES_UPDATE("-1310","当前版本不需要更新"),
    
    /** 环信IM 错误提示*/
    ERROR_REGISTER_TOKEN("-1401","注册环信账号获取TOKEN,系统故障"),
    ERROR_REGISTER_SYSTEM("-1402","注册环信账号,系统故障"),
    ERROR_BE_REGISTERED("-1403","此用户已注册过IM账号"),
    ERROR_RESETPWD("-1404","重置IM密码系统故障"),
    ERROR_RESETNICKNAME("-1405","重置IM昵称系统故障"),
    /** 绑定帐户 错误提示  */
    ERROR_UNBOUNDED("-1501","当前用户未绑定银行或支付宝帐户信息"),
    /** 用户地址错误提示 */
    ERROR_NO_ADDRESS("-1602","该用户未设置地址，请重新设置"),
    DEFAULT_ADDRESS_UNBOUNDED("-1601","该用户未设置默认地址"),
    /** 购物车错误提示*/
    ERROR_COMMODITY_EXIST("-1701","购物车中已存在该商品"),
    ERROR_COMMODITY_INEXIST("-1702","购物车中没有该商品"),
    ERROR_COMMODITY_MORE("-1703","库存不足");

    
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
