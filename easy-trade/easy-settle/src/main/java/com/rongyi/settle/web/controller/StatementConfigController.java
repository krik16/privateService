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

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ObjectConvert;
import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.settle.constants.CodeEnum;
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
	
	@Autowired
    private ROARedisService redisService;
	
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
		try{
			Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
			List<StatementConfig> list = statementConfigService.selectPageList(map, currentPage,ConstantEnum.PAGE_SIZE.getCodeInt());
			Integer count = statementConfigService.selectPageListCount(map);
			return ResponseData.success(list,currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
		}catch(Exception e){
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.FIAL_CONFIG_LIST.getCodeInt(),CodeEnum.FIAL_CONFIG_LIST.getValueStr());
		}
		
	}
	/**	
	 * @Description: 增加配置 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午2:55:32
	 **/
	@RequestMapping("/add")
	@ResponseBody
	public ResponseData add(HttpServletRequest request){
		return ResponseData.success(getRuleCode());
	}
	
	
	/**	
	 * @Description: 保存配置 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午2:57:11
	 **/
	@RequestMapping("/save")
	@ResponseBody
	public ResponseData save(HttpServletRequest request,@RequestBody Map<String, Object> map){
		try {
//			StatementConfig statementConfig = new StatementConfig();
			BussinessInfo bussinessInfo = new BussinessInfo();
			StatementConfig statementConfig = (StatementConfig) ObjectConvert.convertFromMap(StatementConfig.class, map);
//			MapUtils.toObject(statementConfig, map);
//			MapUtils.toObject(bussinessInfo, map);
			statementConfigService.saveStatementConfigAndInfo(statementConfig, bussinessInfo);
			return ResponseData.success();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseData.failure(CodeEnum.FIAL_CONFIG_LIST.getCodeInt(),CodeEnum.FIAL_CONFIG_LIST.getValueStr());
	}
	
	
	/**	
	 * @Description: 修改配置 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午2:59:22
	 **/
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData update(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description:  变更配置 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午2:59:34
	 **/
	@RequestMapping("/modify")
	@ResponseBody
	public ResponseData modify(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
		
	}
	
	
	/**	
	 * @Description: 配置详情 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:00:10
	 **/
	@RequestMapping("/info")
	@ResponseBody
	public ResponseData info(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 审核配置 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:00:26
	 **/
	@RequestMapping("/verify")
	@ResponseBody
	public ResponseData verify(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 生成规则编码 
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月22日下午3:37:03
	 **/
	private String getRuleCode(){
		StringBuffer sb = new StringBuffer();
		try {
			sb.append("BSR");
			sb.append(DateUtil.getCurrentDateYYMMDD());
			String key = sb.toString();
			String ruleCode = redisService.get(key);
			if(StringUtils.isEmpty(ruleCode)){
				sb.append("0001");
			}else{
				int num = Integer.valueOf(ruleCode.substring(10,14));
				String str = String.format("%04d", ++num);  
				sb.append(str);
			}	
			redisService.set(key,sb.toString());
			redisService.expire(key,60*60*48);//两天后失效
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}