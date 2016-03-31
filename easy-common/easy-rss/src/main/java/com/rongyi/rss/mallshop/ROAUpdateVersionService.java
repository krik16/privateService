package com.rongyi.rss.mallshop;

import com.rongyi.easy.rmmm.param.UpdateVersionParam;

public interface ROAUpdateVersionService {
	
	/**
	 * 根据客户端来源，返回最新下载APP地址
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public String getLatestVersion(UpdateVersionParam param) throws Exception;
}
