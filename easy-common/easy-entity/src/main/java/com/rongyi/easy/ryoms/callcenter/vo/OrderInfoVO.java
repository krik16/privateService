package com.rongyi.easy.ryoms.callcenter.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.ryoms.callcenter.entity.OrderDetailEntity;
import com.rongyi.easy.ryoms.callcenter.entity.OrderResultEntity;

/**
 * 客服工单详细信息（包含回复内容）
 * 
 * @author wangjianhua
 *
 */
public class OrderInfoVO extends OrderResultEntity implements Serializable {

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}

	public List<OrderDetailEntity> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<OrderDetailEntity> replyList) {
		this.replyList = replyList;
	}

	@Override
	public String toString() {
		return "OrderInfoVO [replyCnt=" + replyCnt + ", replyList=" + replyList + ", toString()=" + super.toString()
				+ "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8071691535175377519L;

	// 回复数
	private int replyCnt = 0;

	// 回复列表
	private List<OrderDetailEntity> replyList = null;

}
