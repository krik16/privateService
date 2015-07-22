/** 
 * @Title: MQCommissionParam.java 
 * @Package com.rongyi.tms.moudle.vo 
 * @Description: MQ消息佣金参数对应实体
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月22日 下午5:41:55 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.tms.moudle.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * @author ZhengYl
 * 
 */
public class MQCommissionParam implements Serializable {
	/**
     * 
     */
	private static final long serialVersionUID = -7647979818874548559L;
	
	private String guideId;

    private String orderNo;

    private BigDecimal commissionAmount;

    private Integer status;

    private Date createAt;

    private Date picUploadAt;

    private String picUrls;
    
    private String buyerId;

    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getPicUploadAt() {
        return picUploadAt;
    }

    public void setPicUploadAt(Date picUploadAt) {
        this.picUploadAt = picUploadAt;
    }

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls;
    }
     
    public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public static MQCommissionParam mapToEntity(Map<String ,Object> map){
    	MQCommissionParam mqCommissionParam = new MQCommissionParam();
        if(map != null){
            if(map.get("guideId") != null)
            	mqCommissionParam.setGuideId(map.get("guideId").toString());
            if(map.get("commissionAmount") != null)
            	mqCommissionParam.setCommissionAmount(new BigDecimal(map.get("commissionAmount").toString()));
            if(map.get("orderNum") != null)
            	mqCommissionParam.setOrderNo(map.get("orderNum").toString());
            if(map.get("buyerId") != null)
            	mqCommissionParam.setBuyerId(map.get("buyerId").toString());
        }
        return mqCommissionParam;
    }
}
