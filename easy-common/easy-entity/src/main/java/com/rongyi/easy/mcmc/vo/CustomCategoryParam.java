package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * Created by xuying on 2017/1/19.
 */
public class CustomCategoryParam implements Serializable{

    private String ownerMid;
    private int ownerType;

    public String getOwnerMid() {
        return ownerMid;
    }

    public void setOwnerMid(String ownerMid) {
        this.ownerMid = ownerMid;
    }

    public int getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(int ownerType) {
        this.ownerType = ownerType;
    }

    @Override
    public String toString() {
        return "CustomCategoryParam{" +
                "ownerType=" + ownerType +
                ", ownerMid=" + ownerMid +
                '}';
    }


}
