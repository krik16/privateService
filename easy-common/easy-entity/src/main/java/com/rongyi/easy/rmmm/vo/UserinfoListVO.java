package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.content.entity.vo.PageVO;

/**
 * 
 * @author WZH
 * 
 *         导购列表
 *
 */
public class UserinfoListVO extends PageVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<UserinfoVO> list;
	
	public List<UserinfoVO> getList() {
		return list;
	}
	public void setList(List<UserinfoVO> list) {
		this.list = list;
	}
}
