package com.rongyi.settle.constants;

import java.util.ArrayList;
import java.util.List;

public class UserInfoConstant {

	/**
	 * 商户身份：0-集团，1-商场
	 */
	public static final Integer IDENTITY_GROUP = 0;
	public static final Integer IDENTITY_MALL = 1;
	
	public static final List<Integer> divideAccounUserList = new ArrayList<>();
	static {
		divideAccounUserList.add(IDENTITY_GROUP);
		divideAccounUserList.add(IDENTITY_MALL);
	}
	
}
