package com.rongyi.rss.rsi;


public interface IServeService {

	/**
	 * 20150115 lim
	 * 生成自增的会员编号
	 * @return
	 */
	public String getMemberNumber();
	
	/**
	 * 20150227 lim
	 * 调用存储过程获取会员编号
	 * @param map
	 * @return
	 */
	public String getMemberNumber(String name);
}
