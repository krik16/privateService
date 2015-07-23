package com.rongyi.easy.page;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:16.
 */
public enum FilterType {

    LIKE,  EQUALS,  GREATETHAN,  GREATEEQUAL,  LESSTHAN,  LESSEQUAL,  NOTEQUAL,  IN,NIN,ISNULL,ISNOTNULL,REGEXP;
    public static FilterType toType(String type)
    {
        if ("LIKE".equals(type)) {
            return LIKE;
        }
        if ("=".equals(type)) {
            return EQUALS;
        }
        if ("&gt;".equals(type)) {
            return GREATETHAN;
        }
        if ("&gt;=".equals(type)) {
            return GREATEEQUAL;
        }
        if ("&lt;".equals(type)) {
            return LESSTHAN;
        }
        if ("&lt;=".equals(type)) {
            return LESSEQUAL;
        }
        if ("!=".equals(type)) {
            return NOTEQUAL;
        }
        if ("IN".equals(type)) {
            return IN;
        }
        if ("NOT IN".equals(type)) {
            return NIN;
        }
        if ("IS NULL".equals(type)) {
            return ISNULL;
        }
        if ("IS NOT NULL".equals(type)) {
            return ISNOTNULL;
        }
        if ("REGEXP".equals(type)) {
            return REGEXP;
        }
        return null;
    }

    public String toString()
    {
        if (this == LIKE) {
            return "LIKE";
        }
        if (this == EQUALS) {
            return "=";
        }
        if (this == GREATETHAN) {
            return "&gt;";
        }
        if (this == GREATEEQUAL) {
            return "&gt;=";
        }
        if (this == LESSTHAN) {
            return "&lt;";
        }
        if (this == LESSEQUAL) {
            return "&lt;=";
        }
        if (this == NOTEQUAL) {
            return "!=";
        }
        if (this == IN) {
            return "in";
        }
        if (this == NIN) {
            return "NOT IN";
        }
        if (this == ISNULL) {
            return "IS NULL";
        }
        if (this == ISNOTNULL) {
            return "IS NOT NULL";
        }
        if (this == REGEXP) {
            return "REGEXP";
        }
        return "";
    }
}
