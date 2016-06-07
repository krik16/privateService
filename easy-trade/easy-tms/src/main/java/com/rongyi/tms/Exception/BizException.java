package com.rongyi.tms.Exception;

import com.rongyi.tms.constants.ConstantEnum;

/**
 * Created by wudi on 2016/5/09.
 */
public class BizException extends RuntimeException {

	private static final long serialVersionUID = -8676149954110387399L;

	String code;

	public BizException() {
		super();
	}

	public BizException(String message) {
		super(message);
	}

	public BizException(String code, String message) {
		super(message);
		this.code = code;
	}

	public BizException(ConstantEnum cost) {
		super(cost.getValueStr());
		this.code = cost.getCodeStr();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
