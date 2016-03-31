package com.rongyi.easy.domain.member;

import java.io.Serializable;


public class ReportBasicResult implements Serializable{
    private String name;
    private Integer count;
    String UNKNOW = "unknow";

    public ReportBasicResult() {
    }

    public ReportBasicResult(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return this.name == null ? UNKNOW: this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return this.count == null ? 0 : this.count;
    }
    public void setCount(int count) {
        this.count = count;
    }

	@Override
	public String toString() {
		return "ReportBasicResult [name=" + name + ", count=" + count + "]";
	}
    
}