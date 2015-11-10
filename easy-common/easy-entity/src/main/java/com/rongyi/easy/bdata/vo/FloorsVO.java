package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Desc:
 * User: chris
 * Date: 2015/10/25 12:06
 */
public class FloorsVO implements Serializable {

    private static final long serialVersionUID = 8669421601231133055L;
    private String buildingName;
    private List<FloorVO> floorList;

    public String getBuildingName() {
        return buildingName;
    }
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
    public List<FloorVO> getFloorList() {
        return floorList;
    }
    public void setFloorList(List<FloorVO> floorList) {
        this.floorList = floorList;
    }
}
