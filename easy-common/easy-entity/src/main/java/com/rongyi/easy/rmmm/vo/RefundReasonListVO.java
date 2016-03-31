package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class RefundReasonListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<RefundReasonVO> list;

	public List<RefundReasonVO> getList() {
		return list;
	}

	public void setList(List<RefundReasonVO> list) {
		this.list = list;
	}

}
