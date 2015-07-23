package com.rongyi.core.search;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 查询条件
 * Created by Breggor on 2015/7/20.
 */
public class Condition {

    public String key;

    public String operator;

    public Object value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("key", key)
                .append("operator", operator)
                .append("value", value)
                .toString();
    }
}
