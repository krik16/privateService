package com.rongyi.settle.web.controller.params;

import java.io.Serializable;

/**
 * Created by hebo on 2015/12/3.
 * 查询账户参数
 */
public class FindAccountParam implements Serializable{
    private String id;//当前行获取到的对象id
    private Integer type;//类型（0:店铺，1:商场，2:品牌，3:分公司，4:集团公司）,当前选项id的类型
    private Integer guideType;//关联角色(0：全部，1：导购，2：买手)
    private Integer isOneself;//0：不是  1：是

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    public Integer getIsOneself() {
        return isOneself;
    }

    public void setIsOneself(Integer isOneself) {
        this.isOneself = isOneself;
    }

    @Override
    public String toString() {
        return "FindAccountParam{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", guideType=" + guideType +
                ", isOneself=" + isOneself +
                '}';
    }
}
