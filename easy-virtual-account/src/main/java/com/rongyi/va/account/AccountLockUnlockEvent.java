/** 
* @Title: AccountLockUnlockEvent.java 
* @Package com.rongyi.va.account 
* @Description: 账号冻结/解冻事件
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午4:54:30 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.account;

import net.sf.json.JSONObject;

/**
 * @author ZhengYl
 *
 */
public class AccountLockUnlockEvent extends BaseEvent{
	private String userId;
	private boolean authenticated;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		JSONObject param = getBody();
		
		setUserId(param.get("userId").toString());
		setAuthenticated((boolean)param.get("authenticated"));
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

}
