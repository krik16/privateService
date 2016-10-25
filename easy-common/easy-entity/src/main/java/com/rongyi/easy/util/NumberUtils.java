package com.rongyi.easy.util;

/**
 * Created by yaoyiwei on 2016/10/24.
 */
public class NumberUtils {

    public static Double getMaxData(Double b1, Double b2) {
        if(b1.compareTo(new Double(0)) == 0) {
            return b2;
        }
        return (b1.compareTo(b2) >= 0) ? b1 : b2;
    }


}
