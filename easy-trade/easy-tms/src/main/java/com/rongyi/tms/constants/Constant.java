package com.rongyi.tms.constants;
public interface Constant {
	String USER_SESSION_KEY = "user_session_key"; //
	interface DATE_FROMAT{
	    String FORMAT_SECOND="yyyy-MM-dd HH:mm:ss";
	}
	interface VIEW_MSG{
	    String MSG="msg";
	    String DETAIL="detail";
	    String ERROR="error";
	}
	
	interface PAGE {
	    int CURRENTPAGE = 1;
	    int PAGESIZE = 10;
	}
	interface SENDSIZE{
	    int SIZE=50;
	}
	interface INSERTSIZE{
        int SIZE=500;
    }
	interface USERINFO {
		/** 超级管理员 */
		String TYPE_SUPER_ADMIN = "superAdmin";
		/** 商场管理员 */
		String TYPE_MALL_ADMIN = "mallAdmin";
		
	}

	interface ORDER_STATUS{
		/** 待付款 */
		String UPPAYED = "1";
	}

}
