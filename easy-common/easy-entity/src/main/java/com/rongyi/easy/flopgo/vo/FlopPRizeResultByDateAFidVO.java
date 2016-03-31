package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.Date;

public class FlopPRizeResultByDateAFidVO implements Serializable{
	private static final long serialVersionUID = 1L;

	/**每日配置奖项的id*/
    private Integer id;
    /**奖品类型  02优惠卷 03现金卷 00代表普照奖*/
    private String prizeType;
    /**奖品名称 */
    private String prizeName;
    /**奖品id 普照奖品的id为AD*/
    private String prizeId;
    /**奖品库存*/
    private Integer prizeStock;
    /**奖品的当天时间*/
    private Date prizeDaily;
  
    /**关联的翻牌购的id*/
    private String flopActivityId;
    /**每日接收数量*/
    private Integer receivePrizeCount;
    /**每日发放数量*/
    private Integer sendPrizeCount;
    
    /**库存*/
    private Integer stock;
    
    public FlopPRizeResultByDateAFidVO(){
    	
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrizeType() {
		return prizeType;
	}

	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getPrizeName() {
		return prizeName;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeId() {
		return prizeId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public Integer getPrizeStock() {
		return prizeStock;
	}

	public void setPrizeStock(Integer prizeStock) {
		this.prizeStock = prizeStock;
	}

	public Date getPrizeDaily() {
		return prizeDaily;
	}

	public void setPrizeDaily(Date prizeDaily) {
		this.prizeDaily = prizeDaily;
	}


	public String getFlopActivityId() {
		return flopActivityId;
	}

	public void setFlopActivityId(String flopActivityId) {
		this.flopActivityId = flopActivityId;
	}

	public Integer getReceivePrizeCount() {
		return receivePrizeCount;
	}

	public void setReceivePrizeCount(Integer receivePrizeCount) {
		this.receivePrizeCount = receivePrizeCount;
	}

	public Integer getSendPrizeCount() {
		return sendPrizeCount;
	}

	public void setSendPrizeCount(Integer sendPrizeCount) {
		this.sendPrizeCount = sendPrizeCount;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
    
    
}
