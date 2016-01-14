package com.rongyi.easy.content.entity.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 推荐版块内容列表
 * @author WZH
 *
 */
public class ContentInfo1ListVO extends PageVO implements Serializable { 
	public static final long serialVersionUID = 1L;
	private List<ContentInfo1VO> list;
	
	public List<ContentInfo1VO> getList() {
		return list;
	}

	public void setList(List<ContentInfo1VO> list) {
		this.list = list;
	}
}