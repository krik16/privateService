package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.Date;

public class ExpressDataVO  implements Serializable{
	
	private String context;//如：上海分拨中心/装件入车扫描
	private Date time;//时间，原始格式
	private String ftime;//如：2012-08-28 16:33:19
	public ExpressDataVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpressDataVO(String context, Date time, String ftime) {
		super();
		this.context = context;
		this.time = time;
		this.ftime = ftime;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	@Override
	public String toString() {
		return "ExpressDataVO [context=" + context + ", time=" + time
				+ ", ftime=" + ftime + "]";
	}

}
