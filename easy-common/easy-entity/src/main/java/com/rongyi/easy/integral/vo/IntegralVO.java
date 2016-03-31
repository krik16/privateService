package com.rongyi.easy.integral.vo;

import java.io.Serializable;
import java.util.Date;
/**
 * 积分
* @Title: IntegralVO.java 
* @Package com.rongyi.easy.integral.vo 
* @Description: 
* @author zzq 
* @date 2015-7-21 下午3:46:00
 */
public class IntegralVO implements Serializable{

	private String user_id;
	private int score;
	private int total_score;
	private int level;
	private Date update_time;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTotal_score() {
		return total_score;
	}
	public void setTotal_score(int total_score) {
		this.total_score = total_score;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	} 
	@Override
	public String toString() {
		return "IntegralVO [user_id=" + user_id + ", score=" + score
				+ ", total_score=" + total_score + ", level=" + level
				+ ", update_time=" + update_time + "]";
	}
}
