/** 
* @Title: BuyerScoreCommitEvent.java 
* @Package com.rongyi.osm.knowledge 
* @Description: 买家在订单完成时获取积分的事件
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年7月16日 下午1:44:43 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

import com.rongyi.core.constant.Constants;

/**
 * @author ZhengYl
 *
 */
public class BuyerScoreCommitEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 8672126320760767889L;

	/** 积分 */
	private int score;
	
	/** 获取积分的买家Id */
	private String userId;
	
	/** 操作类型（1=加积分、2=减积分） */
	private Integer action;
	
	/** 操作详情（1=下单扣减、2=支付超时恢复积分、3=支付失败恢复积分、4=验券成功加积分、5=交易成功加积分、...） */
	private Integer actionType;
	
	/** 商品/优惠券ID （购买、交易成功、验券时必传，多个时逗号分隔） */
	private String itemId;
	
	/** 1=优惠券 2=商品 （购买、交易成功、验券时必传） */
	private Integer itemType;
	
	/** 防重Id */
	private String eventId;
	

	/**
	 * default : action = 1, actionType = 5, itemType = 2, source = osm, target = ???
	 */
	public BuyerScoreCommitEvent() {
		super();
		
		setAction(1);
		setActionType(5);
		setItemType(2);
		setSource(Constants.MQRequestParam.REQUEST_QUEUENAME_OSM);
		setTarget("???");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getAction() {
		return action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	public Integer getActionType() {
		return actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getItemType() {
		return itemType;
	}

	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void updateBody() {
		super.updateBody();
		
		JSONObject param = getBody();
		param.put("score", getScore());
		param.put("eventId", getEventId());
		param.put("itemType", getItemType());
		param.put("getItemId", getItemId());
		param.put("actionType", getActionType());
		param.put("action", getAction());
		param.put("userId", getUserId());

	}
	
}
