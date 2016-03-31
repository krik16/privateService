package com.rongyi.easy.roa.vo;

import java.io.Serializable;
/**
 * 验码接口返回VO
 * @author user
 *
 */
public class CheckCodeVO implements Serializable{

    private static final long serialVersionUID = 1L;
    /** 积分商品名称 */
    private String title;
    
    /** 兑奖码*/
    private String code;
    
    /** 使用方式*/
    private String useMode;
    
    /** 使用地点*/
    private String useAddress;
    
    /** 使用截止日期*/
    private String useDeadLine;
    
    /** 使用商场名称*/
    private String mallName;

	public String getTitle() {
		return title;
	}

	public String getCode() {
		return code;
	}

	public String getUseMode() {
		return useMode;
	}

	public String getUseAddress() {
		return useAddress;
	}

	public String getUseDeadLine() {
		return useDeadLine;
	}

	public String getMallName() {
		return mallName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}

	public void setUseAddress(String useAddress) {
		this.useAddress = useAddress;
	}

	public void setUseDeadLine(String useDeadLine) {
		this.useDeadLine = useDeadLine;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
}
