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
    VARCHAR("VARCHAR"), DATE("DATE"), TIMESTAMP("TIMESTAMP"), DECIMAL("DECIMAL"), BIGINT("BIGINT"), FLOAT("FLOAT"),TINYINT("TINYINT"),INTEGER("INTEGER");

    public static ValueType toType(String type) {
        for(ValueType valueType:ValueType.values()) {
            if(valueType.getValue().equals(type)){
                return valueType;
            }
        }
        return null;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private ValueType(String str){
        this.value=str;
    }
}
