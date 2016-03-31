package com.rongyi.rss.activity.flopgo;

import com.rongyi.easy.flopgo.vo.FlopUserTimeVO;

public interface RoaFlopgoUserTimeService {
		/**
		 * 添加用户翻牌次数
		 * @param jsessionid
		 * @param mallId
		 * @return  1 代表 已经超过最大值100了
		 * @throws Exception
		 */
	  public FlopUserTimeVO addUserTime(String jsessionid,String mallId) throws Exception;
	  
	  /**
	   * 得到用户当前次数
	   * @param userId
	   * @param mallId
	   * @return
	   */
	  public String getUserTotal(String userId,String mallId);
	  
	  /**
	   * 得到用户当前数量
	   * @param userId
	   * @param mallId
	   * @return
	   */
	  public String getUserCurre(String userId,String mallId);
	  
	  /**
	   * 减少当前用户次数
	   * @param userId
	   * @param mallId
	   * @return
	   */
	  public String reduceUserTime(String userId,String mallId);
}
