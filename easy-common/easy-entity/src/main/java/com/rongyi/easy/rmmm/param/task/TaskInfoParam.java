package com.rongyi.easy.rmmm.param.task;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;
/**
 * 任务详情参数
 * @author user
 *
 */
public class TaskInfoParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;//任务id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
