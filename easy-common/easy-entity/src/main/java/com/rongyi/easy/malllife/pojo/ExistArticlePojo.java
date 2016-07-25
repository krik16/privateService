package com.rongyi.easy.malllife.pojo;

import java.io.Serializable;

/**
 * Created by yangyang on 2016/7/7.
 */
public class ExistArticlePojo implements Serializable {

    private boolean isWonderFulAct; //精彩活动
    private boolean isDishcountAct; //优惠资讯
    private boolean isRaiders;//潮人攻略

    public boolean isWonderFulAct() {
        return isWonderFulAct;
    }

    public void setWonderFulAct(boolean isWonderFulAct) {
        this.isWonderFulAct = isWonderFulAct;
    }

    public boolean isDishcountAct() {
        return isDishcountAct;
    }

    public void setDishcountAct(boolean isDishcountAct) {
        this.isDishcountAct = isDishcountAct;
    }

    public boolean isRaiders() {
        return isRaiders;
    }

    public void setRaiders(boolean isRaiders) {
        this.isRaiders = isRaiders;
    }

    @Override
    public String toString() {
        return "ExistArticlePojo{" +
                "isWonderFulAct=" + isWonderFulAct +
                ", isDishcountAct=" + isDishcountAct +
                ", isRaiders='" + isRaiders + '\'' +
                '}';
    }
}
