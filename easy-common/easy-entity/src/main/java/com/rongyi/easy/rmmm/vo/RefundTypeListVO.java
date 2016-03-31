package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author WZH
 * 
 *         退款类型列表
 *
 */
public class RefundTypeListVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<RefundTypeVO> list;

	public List<RefundTypeVO> getList() {
		return list;
	}

	public void setList(List<RefundTypeVO> list) {
		this.list = list;
	}

}
