package com.rongyi.core.util;


import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.CouponConst;
import org.springframework.util.StringUtils;

/**
 * Created by xgq on 2015/8/26.
 */
public class TradeUtil {

    public static boolean isTradeUserCode(String code) {
        return !StringUtils.isEmpty(code) && code.startsWith(CouponConst.COUPON_TYPE.COUPON);

    }
}
