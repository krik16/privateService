package com.rongyi.easy.page;

import java.io.Serializable;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:16.
 */
public enum FilterType implements Serializable {

    LIKE("LIKE","LIKE"),  EQUALS("EQ","="),  GREATETHAN("GH","&gt;"),  GREATEEQUAL("GE","&gt;="),  LESSTHAN("LH","&lt;"),  LESSEQUAL("LE","&lt;="),  NOTEQUAL("NEQ","!="),
    IN("IN","IN"),NIN("NIN","NOT IN"),ISNULL("NULL","IS NULL"),ISNOTNULL("NNULL","IS NOT NULL"),
    REGEXP("REGEXP","REGEXP"),BEQ("BEQ","beq") ,EXISTS("EXISTS","EXISTS"),NOTEXISTS("NOTEXISTS","NOT EXISTS");

    public static FilterType toType(String type) {
        for(FilterType filterType:FilterType.values()) {
            if(filterType.getValue().equals(type)){
                return filterType;
            }
        }
        return null;
    }

    public String toString(){
      return this.getSymbol();
    }
    private String value;

    private String symbol;

    FilterType(String value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public String getSymbol() {

        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
