package com.rongyi.rss.mallshop.user;

import java.util.List;

import com.rongyi.easy.rmmm.entity.BankInfoEntity;


public interface ROABankInfoService{
	/**
	 * 列出银行列表
	 * @return
	 * @throws Exception
	 */
	public List<BankInfoEntity> listAllBank() throws Exception;
	/**
	 * 根据银行卡类型列出对应的列表
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<BankInfoEntity> listCreditOrMemory(Integer type) throws Exception;
	/**
	 * 通过id获取银行信息
	 * @param bankId
	 * @return
	 * @throws Exception
	 */
	public BankInfoEntity getBankInfoById(Integer bankId) throws Exception;
}
	
	
