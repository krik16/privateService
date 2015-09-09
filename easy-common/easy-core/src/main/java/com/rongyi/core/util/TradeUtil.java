package com.rongyi.core.util;


import org.springframework.util.StringUtils;

/**
 * Created by xgq on 2015/8/26.
 */
public class TradeUtil {

    public static boolean isTradeUserCode(String code) {
        return !StringUtils.isEmpty(code) && code.startsWith("02");

    }
}
