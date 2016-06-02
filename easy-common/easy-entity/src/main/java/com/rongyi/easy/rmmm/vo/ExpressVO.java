package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

public class ExpressVO implements Serializable{
	private Integer id;

	private String name;
	
	private Integer expressId;//物流公司id

	private String expressName;//物流公司名称
	
	private int num;
	
	private String letter;//首字母

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ExpressVO [id=" + id + ", name=" + name + ", expressId="
				+ expressId + ", expressName=" + expressName + ", num=" + num
				+ ", letter=" + letter + "]";
	}

}
