package com.rongyi.settle.util;

import java.math.BigDecimal;


public class AmountUtil {

    /**
     * 元转为分
     * @param yuan 元
     * @return int
     */
    public static int changYuanToFen(Double yuan) {
        return new BigDecimal(yuan).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
    }

    /**
     * 分转为元
     * @param fen 分
     * @return double
     */
    public static double changFenToYuan(Integer fen) {
        return new BigDecimal(fen).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static BigDecimal changFenToYuan(BigDecimal fen) {
        return fen.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
    }
}
