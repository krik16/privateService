package com.rongyi.core.Exception;

/**
 * Created by kejun on 2015/11/25.
 */
public class ParamNullException extends TradeException {

    public ParamNullException(String code, String message)
    {
        super(message);
        this.code = code;
    }

    public ParamNullException(){
       throw new TradeException("-1","参数不合法");
   }
}
