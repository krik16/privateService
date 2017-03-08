package com.rongyi.pay.core.Exception;

import com.rongyi.pay.core.constants.ConstantEnum;

/**
 * Created by kejun on 2015/11/25.
 */
public class ParamNullException extends TradeException {

    public ParamNullException(String code, String message)
    {
        super(message);
        this.code = code;
    }

    public ParamNullException(ConstantEnum constantEnum,String paramName)
    {
        super(constantEnum.getValueStr().replace("{}",paramName));
        this.code = constantEnum.getCodeStr();
    }

    public ParamNullException(){
       throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL.getCodeStr(), ConstantEnum.EXCEPTION_PARAM_NULL.getValueStr());
   }
}
