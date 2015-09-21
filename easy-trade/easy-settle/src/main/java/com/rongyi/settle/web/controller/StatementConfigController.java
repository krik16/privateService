/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日下午2:31:18
 * @Description: TODO
 *
 **/

package com.rongyi.settle.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.service.StatementConfigService;

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
		Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
		List<StatementConfig> list = statementConfigService.selectPageList(map, currentPage,ConstantEnum.PAGE_SIZE.getCodeInt());
		Integer count = statementConfigService.selectPageListCount(map);
		return ResponseData.success(list,currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
	}
	@RequestMapping("/add")
	public ResponseData add(){
		return null;
	}
	
	@RequestMapping("/save")
	public ResponseData save(){
		return null;
	}
	
	@RequestMapping("/update")
	public ResponseData update(){
		return null;
	}
	
	@RequestMapping("/modify")
	public ResponseData modify(){
		return null;
		
	}
	
	@RequestMapping("/info")
	public ResponseData info(){
		return null;
	}
}
