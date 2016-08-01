package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

/**
 * Desc: parking vo
 * User: chris
 * Date: 2015/10/24 20:16
 */
public class ParkingVO implements Serializable {
    private String name;//停车场
    private String charge;//收费(小时)
    @Override
	public String toString() {
		return "ParkingVO [name=" + name + ", charge=" + charge + ", capacity=" + capacity + ", remark=" + remark + "]";
	}
	private String capacity;//车位容量
    private String remark;//备注
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCharge() {
        return charge;
    }
    public void setCharge(String charge) {
        this.charge = charge;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

}

