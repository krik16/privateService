/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年10月16日下午4:44:58
 * @Description: TODO
 *
 **/

package com.rongyi.settle.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年10月16日下午4:44:58
 *
 **/

@Controller
public class BaseController {

	public String getUserName(HttpServletRequest request){
		if(request.getSession().getAttribute("userName") != null)
			return request.getSession().getAttribute("userName").toString();
		return "";
	}

}
