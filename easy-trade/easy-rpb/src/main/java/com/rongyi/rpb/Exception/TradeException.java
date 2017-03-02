package com.rongyi.rpb.Exception;

import com.rongyi.pay.core.constants.ConstantEnum;

/**
 * Created by kejun on 2015/11/25.
 */
public class TradeException extends RuntimeException{
    String code;

    public TradeException()
    {
        super();
    }

    public TradeException(String message)
    {
        super(message);
    }

    public TradeException(String code, String message)
    {
        super(message);
        this.code = code;
    }
    public TradeException(ConstantEnum constantEnum)
    {
        super(constantEnum.getValueStr());
        this.code = constantEnum.getCodeStr();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
