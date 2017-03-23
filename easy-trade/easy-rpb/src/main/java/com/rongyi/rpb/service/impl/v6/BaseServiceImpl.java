package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.common.util.StringUtil;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.constants.ConstantEnum;
import org.apache.commons.lang.StringUtils;

/**
 * conan
 * 2017/2/27 13:56
 **/
public class BaseServiceImpl {
    /**
     * 检查入住商户参数
     * @param ryMchVo 入住商户信息
     */
    public void checkMchParam(RyMchVo ryMchVo){
        if(StringUtils.isEmpty(ryMchVo.getRyMchId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"ryMchId");
        }
        if(StringUtil.isEmpty(ryMchVo.getRyAppId())){
            throw new ParamNullException(ConstantEnum.EXCEPTION_PARAM_NULL_SPECIFY,"ryAppId");
        }

    }
}
