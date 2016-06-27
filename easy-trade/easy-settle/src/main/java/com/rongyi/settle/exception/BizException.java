package com.rongyi.settle.exception;

import java.text.MessageFormat;

import com.rongyi.settle.constants.CodeEnum;

public class BizException extends RuntimeException {

	private static final long serialVersionUID = 1445506680918152459L;
	
	public String code;
	
	public String erroMsg;

	public BizException(String erroMsg) {
		this.erroMsg = erroMsg;
	}

	public BizException(String code, String erroMsg) {
		this.code = code;
		this.erroMsg = erroMsg;
	}

	public BizException(CodeEnum codeEnum) {
		this.code = codeEnum.getCodeStr();
		this.erroMsg = codeEnum.getValueStr();
	}
	
	public BizException(CodeEnum codeEnum, Object ...showMsg) {
		this.code = codeEnum.getCodeStr();
		String msg = MessageFormat.format(codeEnum.getValueStr(), showMsg);
		this.erroMsg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
