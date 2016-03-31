package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class UserAddressListVO extends PageVO implements Serializable{
	
	private List<UserAddressVO> list;// 用户地址列表

	public List<UserAddressVO> getList() {
		return list;
	}

	public void setList(List<UserAddressVO> list) {
		this.list = list;
	}
}
