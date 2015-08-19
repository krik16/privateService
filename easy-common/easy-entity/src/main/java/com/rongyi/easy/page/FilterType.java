package com.rongyi.easy.page;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:16.
 */
public enum FilterType {

    LIKE,  EQUALS,  GREATETHAN,  GREATEEQUAL,  LESSTHAN,  LESSEQUAL,  NOTEQUAL,  IN,NIN,ISNULL,ISNOTNULL,REGEXP,BEQ;
    public static FilterType toType(String type)
    {
        if ("LIKE".equals(type)) {
            return LIKE;
        }
        if ("EQ".equals(type)) {
            return EQUALS;
        }
        if ("GH".equals(type)) {
            return GREATETHAN;
        }
        if ("GE".equals(type)) {
            return GREATEEQUAL;
        }
        if ("LH".equals(type)) {
            return LESSTHAN;
        }
        if ("LE".equals(type)) {
            return LESSEQUAL;
        }
        if ("NEQ".equals(type)) {
            return NOTEQUAL;
        }
        if ("BEQ".equals(type)) {
            return BEQ;
        }
        if ("IN".equals(type)) {
            return IN;
        }
        if ("NIN".equals(type)) {
            return NIN;
        }
        if ("NULL".equals(type)) {
            return ISNULL;
        }
        if ("NNULL".equals(type)) {
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
        if (this == BEQ) {
            return "beq";
        }
        return "";
    }
}
