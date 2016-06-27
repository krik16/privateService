package com.rongyi.settle.util;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.exception.BizException;

/**
 * Created by xgq on 2015/9/25.
 */
public class DateUtils {
    public static final String FORMAT_DATE = "yyyy-MM-dd";

    public static final String FORMAT_DATE_SIMPLE = "yyyyMMdd";

    public static final String FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";

    public static final String firstSecond = " 00:00:00";

    public static final String lastSecond = " 23:59:59";

    public static Date getYesterdayFirstSecond() throws Exception {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        instance.add(Calendar.DATE, -1);
        Date yesterday = instance.getTime();
        String yesterdayDateStr = dateFormat.format(yesterday);
        String timeBegin = yesterdayDateStr + firstSecond;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateTimeFormat.parse(timeBegin);
    }

    /**
     * 获取指定日期的第一秒
     *
     * @param date 指定的日期
     * @return 指定日期当天的第一秒的时间
     * @throws Exception
     */
    public static Date getAllocatedDayFirstSecond(Date date) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        String allocDateStr = dateFormat.format(date);
        String timeBegin = allocDateStr + firstSecond;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateTimeFormat.parse(timeBegin);
    }

    /**
     * 获取指定日期的最后一秒
     *
     * @param date 指定的日期
     * @return 指定日期当天的最后一秒的时间
     * @throws Exception
     */
    public static Date getAllocatedDayLastSecond(Date date) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        String allocDateStr = dateFormat.format(date);
        String timeBegin = allocDateStr + lastSecond;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateTimeFormat.parse(timeBegin);
    }

    /**
     * 获取前N天的第一秒
     * 
     * @param offset 日期偏移量（单位：天）
     * @return
     * @throws Exception
     * @author erliang
     * @date 2016年1月11日
     */
    public static Date getSomedayFirstSecond(int offset) throws Exception {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        instance.add(Calendar.DATE, -offset);
        Date someday = instance.getTime();
        String somedayDateStr = dateFormat.format(someday);
        String timeBegin = somedayDateStr + firstSecond;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateTimeFormat.parse(timeBegin);
    }

    public static Date getYesterdayLastSecond() throws Exception {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        instance.add(Calendar.DATE, -1);
        Date yesterday = instance.getTime();
        String yesterdayDateStr = dateFormat.format(yesterday);
        String timeEnd = yesterdayDateStr + lastSecond;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateTimeFormat.parse(timeEnd);
    }

    public static String getYesterdayDateSimpleStr() {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE_SIMPLE);
        instance.add(Calendar.DATE, -1);
        Date yesterday = instance.getTime();
        return dateFormat.format(yesterday);
    }

    public static String getDateTimeStr(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATETIME);
        return dateFormat.format(date);
    }

    public static String getDateStr(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE);
        return dateFormat.format(date);
    }

    public static String getDateSimpleStr() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_DATE_SIMPLE);
        return dateFormat.format(date);
    }
    
    public static Date formatDate(Date date, String format) {
		SimpleDateFormat sf = new SimpleDateFormat(format);
		String formatDate = sf.format(date);
		try {
			return sf.parse(formatDate);
		} catch (ParseException e) {
			throw new BizException(CodeEnum.FAIL_CHANGE_DATE);
		}
	}
	
	public static Date formatDate(Date date) {
		return formatDate(date, FORMAT_DATE);
	}
	
	public static Date formatTime(Time time, String format) {
		return formatDate(time, format);
	}
	
	public static Date getYesterdayDate() {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, -1);
        Date yesterday = instance.getTime();
        return formatDate(yesterday);
    }
}
