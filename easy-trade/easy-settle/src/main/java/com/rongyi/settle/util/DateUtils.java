package com.rongyi.settle.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by xgq on 2015/9/25.
 */
public class DateUtils {
    public static final String FORMAT_DATE = "yyyy-MM-dd";

    public static final String FORMAT_DATE_SIMPLE = "yyyyMMdd";

    public static final String FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";

    public static final String firstSecond = " 00:00:00";

    public static final String lastSecond = " 23:59:59";

    public static Date getYesterdayFirstSecond(Calendar instance) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        instance.add(Calendar.DATE, -1);
        Date yesterday = instance.getTime();
        String yesterdayDateStr = dateFormat.format(yesterday);
        String timeBegin = yesterdayDateStr + firstSecond;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateTimeFormat.parse(timeBegin);
    }

    public static Date getYesterdayLastSecond(Calendar instance) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        instance.add(Calendar.DATE, -1);
        Date yesterday = instance.getTime();
        String yesterdayDateStr = dateFormat.format(yesterday);
        String timeEnd = yesterdayDateStr + lastSecond;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateTimeFormat.parse(timeEnd);
    }

    public static String getYesterdayDateSimpleStr(Calendar instance) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE_SIMPLE);
        instance.add(Calendar.DATE, -1);
        Date yesterday = instance.getTime();
        return dateFormat.format(yesterday);
    }

    public static void main(String[] args) {
        try {
            System.out.println(DateUtils.getYesterdayFirstSecond(Calendar.getInstance()));
            System.out.println(DateUtils.getYesterdayLastSecond(Calendar.getInstance()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
