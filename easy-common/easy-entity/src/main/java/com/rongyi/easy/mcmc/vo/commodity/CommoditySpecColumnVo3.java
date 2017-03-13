package com.rongyi.easy.mcmc.vo.commodity;

import java.io.Serializable;

/**
 * Created by xuying on 2017/3/6.
 */
public class CommoditySpecColumnVo3 implements Serializable{

    private String id;
    private String name;
    private Integer status;//-1 删除状态，0正常

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
