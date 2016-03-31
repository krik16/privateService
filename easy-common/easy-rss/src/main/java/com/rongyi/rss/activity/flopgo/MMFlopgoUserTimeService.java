package com.rongyi.rss.activity.flopgo;

import com.rongyi.easy.flopgo.vo.FlopUserTimeVO;

public interface MMFlopgoUserTimeService {
	/**
	 * 添加用户翻牌次数
	 * @param jsessionid
	 * @param mallId
	 * @return  1 代表 已经超过最大值100了
	 * @throws Exception
	 */
  public FlopUserTimeVO addUserTime(String jsessionid,String mallId) throws Exception;
}
