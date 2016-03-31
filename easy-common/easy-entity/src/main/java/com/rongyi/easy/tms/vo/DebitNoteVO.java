/** 
* @Title: DebitNoteVO.java 
* @Package com.rongyi.easy.tms.vo 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月25日 下午2:18:43 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.tms.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhengYl
 *
 */
public class DebitNoteVO implements Serializable {
    private static final long serialVersionUID = -1736356668329781965L;

	/** 订单号 */
	private String OrderNo;
	
	/** 小票状态   0: 小票未上传, 1: 待审核, 2:审核通过, 3: 审核不通过 */
	private Integer ticketStatus;
	
	/** 小票URL集合 */
	private List<String> ticketPicList;
	
	/** 审核失败理由 */
	private String refuseReason;

	public String getOrderNo() {
		return OrderNo;
	}

	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}

	public Integer getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(Integer ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public List<String> getTicketPicList() {
		return ticketPicList;
	}

	public void setTicketPicList(List<String> ticketPicList) {
		this.ticketPicList = ticketPicList;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

}
