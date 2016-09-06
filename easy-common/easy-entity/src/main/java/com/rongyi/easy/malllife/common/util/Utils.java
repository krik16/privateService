package com.rongyi.easy.malllife.common.util;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Author:    ZhuWenWu
 * Version    V1.0
 * Date:      2014/6/16  17:55.
 * Description:
 * Modification  History:
 * Date         	Author        		Version        	Description
 * -----------------------------------------------------------------------------------
 * 2014/6/16        ZhuWenWu            1.0                    1.0
 * Why & What is modified:
 */
public class Utils {
    private static final double EARTH_RADIUS = 6378137.0;

    public static double getDistance(double longitude1, double latitude1,
                                     double longitude2, double latitude2) {
        double Lat1 = rad(latitude1);
        double Lat2 = rad(latitude2);
        double a = Lat1 - Lat2;
        double b = rad(longitude1) - rad(longitude2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(Lat1) * Math.cos(Lat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        return s;
    }

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    public static String getDistanceStr(double longitude1, double latitude1, double longitude2, double latitude2) {
        double distance = getDistance(longitude1, latitude1, longitude2, latitude2);
        distance = Math.floor(distance);
        DecimalFormat df = new DecimalFormat("#");
        if (distance <= 1000) {
            return df.format(distance) + "m";
        } else {
            distance = Math.floor(distance / 1000);
            return df.format(distance) + "km";
        }
    }


    /**
     * replace shop name contains "(" ;
     *
     * @param resultStr 返回字符串
     * @return String
     */
    public static String replaceStr(String resultStr) {
        return resultStr.replace("（", "").replace("(", "")
                .replace("）", "").replace(")", "");
    }

    /**
     * 计算商品折扣
     *
     * @param originalPrice
     * @param currentPrice
     *
     * @return discount
     */
    public static Double calculateDiscount(Double originalPrice, Double currentPrice) {
        try {
            if (null != originalPrice && null != currentPrice) {
                BigDecimal currentPriceBig = new BigDecimal(currentPrice);
                BigDecimal originalPriceBig = new BigDecimal(originalPrice);
                if (originalPriceBig.compareTo(new BigDecimal(0)) > 0) {
                    return currentPriceBig.divide(originalPriceBig, 2, BigDecimal.ROUND_HALF_UP)
                            .multiply(new BigDecimal(10)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
            }
            return 10.0;
        } catch (Exception e) {
            return 10.0;
        }
    }
}
