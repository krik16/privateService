package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/10/27.
 */
public class ControllerViewDownVo implements Serializable{

    private List<ControllerViewDownGroupVo> controllerViewDownGroupVoList;

    private Integer totalCount;

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
