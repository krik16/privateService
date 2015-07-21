package com.rongyi.easy.page;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:16.
 */
public enum FilterType {
    LIKE,  EQUALS,  GREATETHAN,  GREATEEQUAL,  LESSTHAN,  LESSEQUAL,  NOTEQUAL,  IN,NIN,EXISTS,ALL,SIZE;
    public static FilterType toType(String type)
    {
        if ("elem".equals(type)) {
            return LIKE;
        }
        if ("=".equals(type)) {
            return EQUALS;
        }
        if (">".equals(type)) {
            return GREATETHAN;
        }
        if (">=".equals(type)) {
            return GREATEEQUAL;
        }
        if ("<".equals(type)) {
            return LESSTHAN;
        }
        if ("<=".equals(type)) {
            return LESSEQUAL;
        }
        if ("!=".equals(type)) {
            return NOTEQUAL;
        }
        if ("in".equals(type)) {
            return IN;
        }
        if ("nin".equals(type)) {
            return NIN;
        }
        if ("exists".equals(type)) {
            return EXISTS;
        }
        if ("all".equals(type)) {
            return ALL;
        }
        if ("size".equals(type)) {
            return SIZE;
        }
        return null;
    }

    public String toString()
    {
        if (this == LIKE) {
            return "elem";
        }
        if (this == EQUALS) {
            return "=";
        }
        if (this == GREATETHAN) {
            return ">";
        }
        if (this == GREATEEQUAL) {
            return ">=";
        }
        if (this == LESSTHAN) {
            return "<";
        }
        if (this == LESSEQUAL) {
            return "<=";
        }
        if (this == NOTEQUAL) {
            return "!=";
        }
        if (this == IN) {
            return "in";
        }
        if (this == NIN) {
            return "nin";
        }
        if (this == EXISTS) {
            return "exists";
        }
        if (this == ALL) {
            return "all";
        }
        if (this == SIZE) {
            return "size";
        }
        return "";
    }
}
