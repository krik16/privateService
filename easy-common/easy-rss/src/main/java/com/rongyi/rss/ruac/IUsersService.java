package com.rongyi.rss.ruac;

import java.util.List;

import com.rongyi.easy.ruac.Users;



public interface IUsersService {
	/**
	 * 获取大运营后台BD账号
	 * @author user
	 *
	 */
	public List<Users> selectUserInfoByUsername(String username) throws Exception;
}
