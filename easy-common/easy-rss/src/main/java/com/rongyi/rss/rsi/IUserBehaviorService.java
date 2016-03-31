package com.rongyi.rss.rsi;

import com.rongyi.easy.rsi.entity.UserBehavior;


public interface IUserBehaviorService {

	/**
	 * 会员登录的时候
	 * @param record
	 * @return
	 */
	public int whenLogin(UserBehavior record);
	/**
	 * 查询会员信息的时候
	 * @param record
	 * @return
	 */
	public int whenQueryMemberInfo(UserBehavior record);
	
	/**
	 * 20150203 lim
	 * 保存
	 * @param record
	 * @return
	 */
	public int insert(UserBehavior record);
}
