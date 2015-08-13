package com.rongyi.cheat.constants;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.framework.spring.context.utils.SpringContextUtil;

public interface Constant {

	/*PropertyConfigurer propertyConfigurer = (PropertyConfigurer) SpringContextUtil.getBean("propertyConfigurer");
	interface BLACK_ROLL {
		String WARN_COUNT = propertyConfigurer.getProperty("WARN.COUNT").toString();//报警数量
		String FREEZE_COUNT = propertyConfigurer.getProperty("FREEZE.COUNT").toString();//直接冻结数量
	}*/

	
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
	    int PAGESIZE = 15;
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
	

}
