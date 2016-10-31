package com.rongyi.core.enumerate;

import java.util.HashMap;


/**
 * 账号相关错误码常量
 * @ClassName: AccountEnum 
 * @Description: 
 * @author Kenny
 * @date 2016年10月31日 下午2:49:06 
 *
 */
public enum AccountEnum {
    
    SUCCESS(0, "正常"),
    
    /** 系统性错误 */
    ERROR_SYSTEM(1090001, "系统错误"),
    ERROR_PARAM(1090002, "必要参数不合法或无效"),
    //ERROR_SYSTEM("-11", "网络正在打瞌睡，请稍后再试"),

    /** 业务错误**/
    ERROR_MERACC_EMPTY(1090010, "账号不能为空"),
	ERROR_MERACC_REGISTERED(1090011, "账号已被注册");
	
    
   

    private Integer code;
    private String message; 
    private AccountEnum(Integer code, String message) {
        this.code = code; 
        this.message = message;
    }
    
    public Integer getCode(){
        return code; 
    }

    public String getMessage(){
        return message;
    }
    
    /**
     * Code枚举字典
     */
    private static HashMap<Integer, AccountEnum> codeEnumDic = new HashMap<Integer, AccountEnum>();
    static {
	    for (AccountEnum ce : AccountEnum.values()) {
	    	codeEnumDic.put(ce.getCode(), ce);
	    }
    }
    
    /**
     * 根据Code获取CodeEnum对象
     * @param code
     * @return
     */
    public static AccountEnum getCodeEnum(Integer code) {
    	return codeEnumDic.get(code);
    }
}
