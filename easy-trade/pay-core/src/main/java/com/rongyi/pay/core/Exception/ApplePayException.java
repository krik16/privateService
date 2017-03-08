package com.rongyi.pay.core.Exception;

/**
 * Created by kejun on 2015/11/25.
 */
public class ApplePayException extends TradeException{
    public ApplePayException(String code, String message)
    {
        super(message);
        this.code = code;
    }

}
