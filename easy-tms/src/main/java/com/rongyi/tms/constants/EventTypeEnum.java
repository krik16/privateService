package com.rongyi.tms.constants;

/**	
 * @Author:  柯军
 * @Description: MQ消息类型枚举
 * @datetime:2015年5月19日下午3:32:21
 *
 **/
public enum EventTypeEnum {
    
    DRAWAPPLY("0","提现");
    
    private String code; 
    private String value;
    private EventTypeEnum(String code, String value) {
        this.code = code; 
        this.value = value;
    }
    
    public String getCode(){
        return code; 
    }

    public String getValue() {
        return value;
    }
    
    
}
