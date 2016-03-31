package com.rongyi.easy.malllife.common.util;

/**
 * 通过经纬度，获得由近及远
 * 
 * @author jiejie 2014年7月1日 上午11:26:05
 */
public class DistanceUtils {

    private static final double EARTH_RADIUS = 6378137.0;

    /**
     * @param longitude1 经度
     * @param latitude1 纬度
     * @param longitude2 经度
     * @param latitude2 纬度
     * @return
     */
    public static double getDistance(double longitude1, double latitude1, double longitude2, double latitude2) {
        double Lat1 = rad(latitude1);
        double Lat2 = rad(latitude2);
        double a = Lat1 - Lat2;
        double b = rad(longitude1) - rad(longitude2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(Lat1) * Math.cos(Lat2)
                                           * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000;
        return s;
    }

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }
}
