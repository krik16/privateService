package com.rongyi.easy.page;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:17.
 */
public  enum ValueType {
    String, DateTime, Integer, Float, Boolean, Date;

    public static ValueType toType(String type) {
        if ("1".equals(type)) {
            return String;
        }
        if ("2".equals(type)) {
            return DateTime;
        }
        if ("3".equals(type)) {
            return Integer;
        }
        if ("4".equals(type)) {
            return Float;
        }
        if ("5".equals(type)) {
            return Boolean;
        }
        if ("6".equals(type)) {
            return Date;
        }
        return null;
    }

    public static ValueType toValueType(Object type) {
        if ((type instanceof String)) {
            return String;
        }
        if ((type instanceof Timestamp)) {
            return DateTime;
        }
        if ((type instanceof Integer)) {
            return Integer;
        }
        if ((type instanceof Float)) {
            return Float;
        }
        if ((type instanceof Boolean)) {
            return Boolean;
        }
        if ((type instanceof Date)) {
            return Date;
        }
        return null;
    }

    public String toString() {
        if (this == String) {
            return "1";
        }
        if (this == DateTime) {
            return "2";
        }
        if (this == Integer) {
            return "3";
        }
        if (this == Float) {
            return "4";
        }
        if (this == Boolean) {
            return "5";
        }
        if (this == Date) {
            return "6";
        }
        return "1";
    }
}
