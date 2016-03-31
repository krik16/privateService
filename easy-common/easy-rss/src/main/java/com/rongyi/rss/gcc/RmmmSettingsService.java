package com.rongyi.rss.gcc;

import com.rongyi.easy.gcc.Configurations;
import com.rongyi.easy.gcc.TransConfigurations;

public interface RmmmSettingsService {

	
	public Configurations getLatestConfigurations();

	/**
	 * 读取交易配置信息
	 * @param type 2商家导购交易配置  3 买手交易配置
	 * @return
	 */
	public TransConfigurations getLatestTransConfigurations(int type);
	//public TransConfigurations getLatestTransConfigurations();
	/**
	 * 获取买手微商城参数配置
	 * @return
	 */
	public Configurations getLatestBuyerConfigurations();
}
