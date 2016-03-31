package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class AssistantListVO extends PageVO implements Serializable{

	private List<AssistantVO> list;// 负责人账户下属店员列表

	public List<AssistantVO> getList() {
		return list;
	}

	public void setList(List<AssistantVO> list) {
		this.list = list;
	}

}
