package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 
 * @author rongyi
 */
public class InvoiceInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String invBit;// 是否需要发票，0-否,1-是
	
	private String invType;// 发票类型，0-普通，1-增值税
	
	private String invoice_tt;// 发票抬头类型,0-个人,1-单位
	
	private String invName;// 发票抬头（单位时，不可空）
	
	private String invDesc;// 发票描述
	
	private String invoiceCompany;// 公司名称（增值税发票时，不可空）
	
	private String invoiceTaxpayer;// 识  别  号（增值税发票时，不可空）
	
	private String registryAddress ; //注册地址（增值税发票时，不可空）
	
	private String invoiceTelephone ;//注册电话（增值税发票时，不可空）
	
	private String invoiceBankNname ;//开户银行（增值税发票时，不可空）
	
	private String invoiceBankAccount ;//银行账户（增值税发票时，不可空）

	public String getInvBit() {
		return invBit;
	}

	public void setInvBit(String invBit) {
		this.invBit = invBit;
	}

	public String getInvType() {
		return invType;
	}

	public void setInvType(String invType) {
		this.invType = invType;
	}

	public String getInvoice_tt() {
		return invoice_tt;
	}

	public void setInvoice_tt(String invoice_tt) {
		this.invoice_tt = invoice_tt;
	}

	public String getInvName() {
		return invName;
	}

	public void setInvName(String invName) {
		this.invName = invName;
	}

	public String getInvDesc() {
		return invDesc;
	}

	public void setInvDesc(String invDesc) {
		this.invDesc = invDesc;
	}

	public String getInvoiceCompany() {
		return invoiceCompany;
	}

	public void setInvoiceCompany(String invoiceCompany) {
		this.invoiceCompany = invoiceCompany;
	}

	public String getInvoiceTaxpayer() {
		return invoiceTaxpayer;
	}

	public void setInvoiceTaxpayer(String invoiceTaxpayer) {
		this.invoiceTaxpayer = invoiceTaxpayer;
	}

	public String getRegistryAddress() {
		return registryAddress;
	}

	public void setRegistryAddress(String registryAddress) {
		this.registryAddress = registryAddress;
	}

	public String getInvoiceTelephone() {
		return invoiceTelephone;
	}

	public void setInvoiceTelephone(String invoiceTelephone) {
		this.invoiceTelephone = invoiceTelephone;
	}

	public String getInvoiceBankNname() {
		return invoiceBankNname;
	}

	public void setInvoiceBankNname(String invoiceBankNname) {
		this.invoiceBankNname = invoiceBankNname;
	}

	public String getInvoiceBankAccount() {
		return invoiceBankAccount;
	}

	public void setInvoiceBankAccount(String invoiceBankAccount) {
		this.invoiceBankAccount = invoiceBankAccount;
	}
	

	
}
