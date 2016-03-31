/**
 * 
 */
package com.rongyi.easy.entity;

/**
 * @author pingkang
 * @time  2014年11月25日 下午3:14:51
 */
public class ParkingEntity implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;//停车场
	private String charge;//收费(小时)
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
