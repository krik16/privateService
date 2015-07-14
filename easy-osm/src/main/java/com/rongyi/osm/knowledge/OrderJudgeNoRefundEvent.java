package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

public class OrderJudgeNoRefundEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = -2333957784945937615L;
	
	private String appealResult;
	private String agentComment;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		JSONObject param = getBody();
		
		setAppealResult(param.get("conclusion").toString());
		setAgentComment(param.get("officialDescribe").toString());
	}
	
	@Override
	public String getName() {
		return "客服判定不退款";
	}
	
	
	public String getAppealResult() {
		return appealResult;
	}
	public void setAppealResult(String appealResult) {
		this.appealResult = appealResult;
	}
	public String getAgentComment() {
		return agentComment;
	}
	public void setAgentComment(String agentComment) {
		this.agentComment = agentComment;
	}
	
	
}
