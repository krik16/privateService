package com.rongyi.core.Exception;

/**
 * Created by kejun on 2015/11/25.
 */
public class TradePayException extends RuntimeException{
    String code;

    public TradePayException()
    {
        super();
    }

    public TradePayException(String message)
    {
        super(message);
    }

    public TradePayException(String code, String message)
    {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
