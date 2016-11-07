package com.rongyi.easy.ryoms.param.InternalEmployeeAccount;

import java.io.Serializable;
/**
 * 内部员工帐号列表参数
 * @author user
 *
 */
public class AccountListParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6866889396425638386L;

	private String account;//用户帐号
	private Byte status;//空:全部  1:启用  2:停用
	private Integer currentPage;//当前页  从1开始
	private Integer pageSize;//每页显示的数量
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	@Override
	public String toString() {
		return "AccountListParam [account=" + account + ", status=" + status
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize
				+ "]";
	}
	
}
