package com.rongyi.pay.core.Exception;

/**
 * Created by kejun on 2015/11/25.
 */
public class WeChatException extends TradeException{

    public WeChatException(String code, String message)
    {
        super(message);
        this.code = code;
    }


}
