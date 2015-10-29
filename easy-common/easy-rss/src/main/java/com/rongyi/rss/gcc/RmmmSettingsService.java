package com.rongyi.rss.gcc;

import com.rongyi.easy.gcc.Configurations;
import com.rongyi.easy.gcc.TransConfigurations;

public interface RmmmSettingsService {

	
	public Configurations getLatestConfigurations();
	public TransConfigurations getLatestTransConfigurations(int type);
	//public TransConfigurations getLatestTransConfigurations();
	/**
	 * 获取买手微商城参数配置
	 * @return
	 */
	public Configurations getLatestBuyerConfigurations();
}
