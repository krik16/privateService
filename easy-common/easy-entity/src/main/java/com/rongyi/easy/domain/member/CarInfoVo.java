package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: CarInfoVo 
* @Description: 返回的车位信息
* @author shaozhou 
* @date 2015年12月28日 下午4:43:16
 */
public class CarInfoVo implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 3001804958729807792L;
	private String carCode;
	private String parkingNo;
	private Date start_date;
	private String floor;
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public String getParkingNo() {
		return parkingNo;
	}
	public void setParkingNo(String parkingNo) {
		this.parkingNo = parkingNo;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
}
