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

import com.rongyi.settle.constants.ConstantEnum;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年10月16日下午4:44:58
 *
 **/

@Controller
public class BaseController {
	
	public static final Integer PAGE_SIZE = ConstantEnum.PAGE_SIZE.getCodeInt();// 分页大小

	public static final Integer CURRENT_PAGE = ConstantEnum.CURRENT_PAGE.getCodeInt();// 当前页数

	public String getUserName(HttpServletRequest request){
		if(request.getSession().getAttribute("userName") != null)
			return request.getSession().getAttribute("userName").toString();
		return "";
	}

}
