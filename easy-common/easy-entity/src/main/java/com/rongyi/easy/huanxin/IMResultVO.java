package com.rongyi.easy.huanxin;
import java.io.Serializable;

/**
 * IM返回结果VO
 * @author Lc
 *
 */

public class IMResultVO implements Serializable {

	/** 成功请求TOKEN返回VO*/
	private IMTokenSuccessVO successVO;
	
	/** 请求失败返回VO*/
	private IMResultErrorVO errorVO;
	
	/** 返回Connection 状态码*/
	private Integer statusCode;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public IMTokenSuccessVO getSuccessVO() {
		return successVO;
	}

	public void setSuccessVO(IMTokenSuccessVO successVO) {
		this.successVO = successVO;
	}

	public IMResultErrorVO getErrorVO() {
		return errorVO;
	}

	public void setErrorVO(IMResultErrorVO errorVO) {
		this.errorVO = errorVO;
	}
	
	
	
}
