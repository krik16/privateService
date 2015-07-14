package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 放所有显示奖品的集合
 * @author lijing
 *
 */
public class FlopgoLookPrizesListVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int currentPage;//当前页
	private int totalPage;//总页数
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	private List<FlopgoLookPrizesVO> floplookprizes;

	public List<FlopgoLookPrizesVO> getFloplookprizes() {
		return floplookprizes;
	}

	public void setFloplookprizes(List<FlopgoLookPrizesVO> floplookprizes) {
		this.floplookprizes = floplookprizes;
	}
	
}
