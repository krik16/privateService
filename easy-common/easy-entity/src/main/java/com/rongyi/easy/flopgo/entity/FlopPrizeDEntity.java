package com.rongyi.easy.flopgo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用于保存翻牌购的每日配置奖项的
 * 数据表在mysql 下的ry_crm 中的flop_prize_daily 表
 * @author lijing 2015 07 16
 *
 */
public class FlopPrizeDEntity implements Serializable{
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
    /**创建人*/
    private String createBy;
    /**创建时间*/
    private Date createAt;
    /**关联的翻牌购的id*/
    private String flopActivityId;
    /**每日接收数量*/
    private Integer receivePrizeCount;
    /**每日发放数量*/
    private Integer sendPrizeCount;

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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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
}
