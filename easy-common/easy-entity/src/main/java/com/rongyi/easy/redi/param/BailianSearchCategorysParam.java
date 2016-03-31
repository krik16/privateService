package com.rongyi.easy.redi.param;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.base.param.BaseParam;

/**
 * 商品
 * @author 
 */
public class BailianSearchCategorysParam extends BaseParam{

    private String clientIp; //请求IP地址
    
    private String systemNo; //请求的系统编号
    
    private String clientRequestTime; //请求的时间
    
    private String role;//角色
    
    private String token;//指令
    
    private BailianCategoryOptionParam requestData;//请求参数

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getSystemNo() {
		return systemNo;
	}

	public void setSystemNo(String systemNo) {
		this.systemNo = systemNo;
	}

	public String getClientRequestTime() {
		return clientRequestTime;
	}

	public void setClientRequestTime(String clientRequestTime) {
		this.clientRequestTime = clientRequestTime;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public BailianCategoryOptionParam getRequestData() {
		return requestData;
	}

	public void setRequestData(BailianCategoryOptionParam requestData) {
		this.requestData = requestData;
	}
    

    public static void main(String[] args) {
		
    	BailianSearchCategorysParam bsc = new BailianSearchCategorysParam();
    	BailianCategoryOptionParam bco = new BailianCategoryOptionParam();
    	bco.setCategoryType("1");
    	bco.setChannelSid("1");
    	bco.setLev("3");
    	bco.setParentSid("4");
    	bsc.setClientIp("");
    	bsc.setClientRequestTime("12324343");
    	bsc.setRole("rongyiwang");
    	bsc.setToken("666");
    	bsc.setRequestData(bco);
    	String s = JsonUtil.getJSONString(bsc);
    	System.out.println(s);
	}
}
