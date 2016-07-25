package com.rongyi.easy.malllife.red;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * 根据密码获取红包参数
 * @author user
 *
 */
public class PwdRedParam extends MalllifeBaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String redPwd;//红包密码  10位数字
	public String getRedPwd() {
		return redPwd;
	}
	public void setRedPwd(String redPwd) {
		this.redPwd = redPwd;
	}
	@Override
	public String toString() {
		return "PwdRedParam [redPwd=" + redPwd + "]";
	}
	
}
