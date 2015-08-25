package com.rongyi.easy.page;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:17.
 */
public  enum ValueType implements Serializable {
    VARCHAR, DATE, TIMESTAMP, DECIMAL, BIGINT, FLOAT,TINYINT,INTEGER;

    public static ValueType toType(String type) {
        if ("VARCHAR".equals(type)) {
            return VARCHAR;
        }
        if ("DATE".equals(type)) {
            return DATE;
        }
        if ("TIMESTAMP".equals(type)) {
            return TIMESTAMP;
        }
        if ("DECIMAL".equals(type)) {
            return DECIMAL;
        }
        if ("BIGINT".equals(type)) {
            return BIGINT;
        }
        if ("FLOAT".equals(type)) {
            return FLOAT;
        }
        if ("TINYINT".equals(type)) {
            return TINYINT;
        }
        if ("INTEGER".equals(type)) {
            return INTEGER;
        }
        return null;
    }

    public String toString() {
        if (this == VARCHAR) {
            return "VARCHAR";
        }
        if (this == DATE) {
            return "DATE";
        }
        if (this == TIMESTAMP) {
            return "TIMESTAMP";
        }
        if (this == DECIMAL) {
            return "DECIMAL";
        }
        if (this == BIGINT) {
            return "BIGINT";
        }
        if (this == FLOAT) {
            return "FLOAT";
        }
        if (this == TINYINT) {
            return "TINYINT";
        }
        if (this == INTEGER) {
            return "INTEGER";
        }
        return "VARCHAR";
    }
}
