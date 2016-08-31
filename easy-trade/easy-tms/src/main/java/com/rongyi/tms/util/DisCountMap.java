package com.rongyi.tms.util;

/**
 * Description:
 *
 * @author liuhao
 * @version 2015/8/19
 */
public class DisCountMap {

    //使用红包
    static byte hb = 1;
    //使用积分
    static byte score = 2;
    //使用抵扣券
    static byte dikou = 4;


    public static byte getDiscountMap(boolean useHb, boolean useScore, boolean useDikou) {
        byte r = 0;
        if (useHb) {
            r += hb;
        }
        if (useScore) {
            r += score;
        }
        if (useDikou) {
            r += dikou;
        }
        return r;
    }

    public static boolean hasUsedScore(byte x) {
        return (x & score) == score;
    }

    public static boolean hasUsedHb(byte x) {
        return (x & hb) == hb;
    }

    public static boolean hasRebate(byte x) {
        return (x & dikou) == dikou;

    }


}
