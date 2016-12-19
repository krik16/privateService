package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/10/27.
 */
public class ControllerViewDownVo implements Serializable{

    private List<ControllerViewDownGroupVo> controllerViewDownGroupVoList;

    private Integer totalCount;

    private Integer type;//8普通团，10超级团

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<ControllerViewDownGroupVo> getControllerViewDownGroupVoList() {
        return controllerViewDownGroupVoList;
    }

    public void setControllerViewDownGroupVoList(List<ControllerViewDownGroupVo> controllerViewDownGroupVoList) {
        this.controllerViewDownGroupVoList = controllerViewDownGroupVoList;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
