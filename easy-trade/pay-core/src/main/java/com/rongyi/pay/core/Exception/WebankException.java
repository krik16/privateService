package com.rongyi.pay.core.Exception;

import com.rongyi.pay.core.constants.ConstantEnum;

/**
 * 微众异常定义
 * Created by sujuan on 2017/2/17.
 */
public class WebankException extends TradeException{

    String code;

    public WebankException()
    {
        super();
    }

    public WebankException(String message)
    {
        super(message);
    }

    public WebankException(String code, String message)
    {
        super(message);
        this.code = code;
    }

    public WebankException(ConstantEnum constantEnum)
    {
        super(constantEnum.getValueStr());
        this.code = constantEnum.getCodeStr();
    }

    public WebankException(ConstantEnum constantEnum,String paramName)
    {
        super(constantEnum.getValueStr().replace("{}",paramName));
        this.code = constantEnum.getCodeStr();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
