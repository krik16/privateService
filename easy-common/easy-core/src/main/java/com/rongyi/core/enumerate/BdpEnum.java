package com.rongyi.core.enumerate;

import java.util.HashMap;


/**
 * 
 * @author kenny
 *
 */
public enum BdpEnum {
    
    SUCCESS(0, "success"),
    
    ERROR_SYSTEM(1080001, "系统错误"),
    ERROR_SIGN_ERROR(1080002, "签名错误"),
    ERROR_PARAM_ERROR(1080003, "请求参数错误"),
    ERROR_ST_EMPTY(1080004, "[st]参数为空"),
    ERROR_ST_ERROR(1080005, "[st]参数错误"),
    ERROR_CHANNEL_EMPTY(1080006, "[channel]参数为空"),
    ERROR_USER_UNFOUND(1080007, "用户不存在或未登录"),
    ERROR_CHANNEL_ERROR(1080008, "[channel]参数错误"),
    ERROR_SIGN_EMPTY(1080009, "[sign]参数为空")
	;
   

    private Integer code;
    private String message; 
    private BdpEnum(Integer code, String message) {
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
    private static HashMap<Integer, BdpEnum> codeEnumDic = new HashMap<Integer, BdpEnum>();
    static {
	    for (BdpEnum ce : BdpEnum.values()) {
	    	codeEnumDic.put(ce.getCode(), ce);
	    }
    }
    
    /**
     * 根据Code获取CodeEnum对象
     * @param code
     * @return
     */
    public static BdpEnum getCodeEnum(Integer code) {
    	return codeEnumDic.get(code);
    }
}
