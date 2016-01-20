package com.rongyi.easy.malllife.domain;

import java.io.Serializable;

public class BaseEntity implements Serializable{

    public Class<?> getEntityMapperClass() {
        throw new RuntimeException(this.getClass().getName() + "not implement getEntityMapperClass method!");
    }
    
}
