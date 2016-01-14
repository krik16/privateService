package com.rongyi.easy.redi.vo;

import java.util.HashMap;

import com.rongyi.core.common.util.JsonUtil;

public class BailianBaseVo<T>  implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 接口返回结果编码，00100000表示成功，其他编码表示失败
	 */
	public final static String RESPONSE_CODE = "00100000";
	public final static String RESPONSE_OVER_CODE = "04111003";
	private String resCode;
	private String msg;
	private T obj;

	public BailianBaseVo(){}
	public BailianBaseVo(String resCode, String msg, T obj) {
		super();
		this.resCode = resCode;
		this.msg = msg;
		this.obj = obj;
	}

	public static void main(String[] args) {
		StringBuilder json = new StringBuilder();
		json.append("{");
		json.append("	   \"resCode\":\"00100000\",");
		json.append("	   \"msg\":\"\",");
		json.append("	   \"obj\":{");
		json.append("	   \"member_token\":\"token_string\",");
		json.append("	   \"expire_in\":\"7200\",");
		json.append("	   \"member_id\":\"1201\",  "); 
		json.append("	   \"member_name\":\"郭煜华\",");
		json.append("	   \"need_complete\":\"false\",");
		json.append("	   \"black_account\":\"false\",");
		json.append("	   \"high_risk\":\"false\",");
		json.append("	   \"usable_stat\":\"0\",");
		json.append("	   \"locked_reason\":\"\",");
		json.append("	   \"error_times\":\"0\",");
		json.append("	   \"remain_times\":\"3\"");
		json.append("	  }                         ");                                                                                                                               
		json.append("	}");
		HashMap<String, Object> classMap = new HashMap<String, Object>();
		classMap.put("obj", BailianCouponVo.class);//   
		
		BailianBaseVo vo = (BailianBaseVo)JsonUtil.getDTO(json.toString(), BailianBaseVo.class, classMap);
	}

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

