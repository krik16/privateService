package com.rongyi.easy.flopgo.vo;

import java.util.List;

import com.rongyi.easy.flopgo.entity.FlopPrizeDEntity;

/**
 * 这是用于每日奖品的VO
 * @author lijing
 * @since 2015 07 20 13.28
 *
 */
public class PrizeDailysVO {
	 /**当前的时间*/
	  private String dataCu;
	  
	  private List<FlopPrizeDEntity> flopPrizes;
	  /**每天的分发总数量*/
	  private int sumcount;
	public String getDataCu() {
		return dataCu;
	}
	
	public void setDataCu(String dataCu) {
		this.dataCu = dataCu;
	}
	
	public List<FlopPrizeDEntity> getFlopPrizes() {
		return flopPrizes;
	}
	
	public void setFlopPrizes(List<FlopPrizeDEntity> flopPrizes) {
		this.flopPrizes = flopPrizes;
	}

	public int getSumcount() {
		return sumcount;
	}

	public void setSumcount(int sumcount) {
		this.sumcount = sumcount;
	}
  
  
	
}
