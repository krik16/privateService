package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class Express2VO implements Serializable{
	
	private Integer expressId;//物流公司id

	private String expressName;//物流公司名称
	
	private int num;
	
	private String letter;//首字母
	
	private String ename;//物流公司的汉语拼音

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getExpressId() {
		return expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	@Override
	public String toString() {
		return "Express2VO [expressId=" + expressId + ", expressName="
				+ expressName + ", num=" + num + ", letter=" + letter
				+ ", ename=" + ename + "]";
	}

}
