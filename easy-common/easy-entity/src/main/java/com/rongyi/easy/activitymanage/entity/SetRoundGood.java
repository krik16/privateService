package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;
import java.util.List;

public class SetRoundGood  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1334716913507705802L;
	List<RoundGood> roundGoods;

	public List<RoundGood> getRoundGoods() {
		return roundGoods;
	}

	public void setRoundGoods(List<RoundGood> roundGoods) {
		this.roundGoods = roundGoods;
	}
	
	
	
	
}
