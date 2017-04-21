package com.rongyi.pay.core.Exception;

import com.rongyi.pay.core.constants.ConstantEnum;

/**
 * Created by yangyang on 2017/4/5.
 */
public class TianyiException extends TradeException{

    String code;

    public TianyiException()
    {
        super();
    }

    public TianyiException(String message)
    {
        super(message);
    }

    public TianyiException(String code, String message)
    {
        super(message);
        this.code = code;
    }

    public TianyiException(ConstantEnum constantEnum)
    {
        super(constantEnum.getValueStr());
        this.code = constantEnum.getCodeStr();
    }

    public TianyiException(ConstantEnum constantEnum,String paramName)
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
