package com.rongyi.easy.page;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/7/21 17:29.
 */
public class QueryFilter {
    /**
     * 要查询的字段名
     */
    private String name;
    private FilterType type;
    private ValueType valueType;
    private Object value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FilterType getType() {
        return type;
    }

    public void setType(FilterType type) {
        this.type = type;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
