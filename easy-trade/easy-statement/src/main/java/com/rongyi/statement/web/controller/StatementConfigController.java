/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日下午2:31:18
 * @Description: TODO
 *
 **/

package com.rongyi.statement.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.statement.entity.StatementConfig;
import com.rongyi.statement.constants.ConstantEnum;
import com.rongyi.statement.service.StatementConfigService;

/**	
 * @Author:  柯军
 * @Description:  对账单配置controller
 * @datetime:2015年9月17日下午2:31:18
 *
 **/
@Controller
@RequestMapping("/statementConfig")
public class StatementConfigController {

	@Autowired
	StatementConfigService statementConfigService;
	
	/**	
	 * @Description: 分页查询配置列表 
	 * @param request
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月17日下午2:55:37
	 **/
	@RequestMapping("/list")
	@ResponseBody
	public ResponseData getPageList(HttpServletRequest request,@RequestBody Map<String, Object> map){
//		String paramsJson = request.getParameter("paramsJson");
//		Map<String, Object> map = JsonUtil.getMapFromJson(paramsJson);
		Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
		List<StatementConfig> list = statementConfigService.selectPageList(map, currentPage,ConstantEnum.PAGE_SIZE.getCodeInt());
		Integer count = statementConfigService.selectPageListCount(map);
		return ResponseData.success(list,currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
	} 
}
