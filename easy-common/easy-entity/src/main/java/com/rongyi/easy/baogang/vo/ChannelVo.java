package com.rongyi.easy.baogang.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/12/14.
 */
public class ChannelVo implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChannelVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
