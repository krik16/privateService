package com.rongyi.rss.roa;

import java.util.List;

import com.rongyi.easy.ruac.Users;

public interface ROARuacUsersService {
	/**
	 * 获取大运营后台BD账号
	 * @author user
	 *
	 */
	public List<Users> selectUserInfoByUsername(String username) throws Exception;
}
