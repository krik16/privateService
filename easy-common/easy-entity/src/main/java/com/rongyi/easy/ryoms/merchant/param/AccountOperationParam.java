package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;

/** 
 * @ClassName: AccountOperationParam 
 * @Description: 
 * @author Kenny
 * @date 2016年11月22日 下午2:29:30 
 *  
 */
public class AccountOperationParam implements Serializable {
	
	private static final long serialVersionUID = -4855305307781509440L;
	
	private Integer id;
	private Integer accountStatus;
	private String reason;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "AccountOperationParam [id=" + id + ", accountStatus=" + accountStatus + ", reason=" + reason + "]";
	}
	
}
