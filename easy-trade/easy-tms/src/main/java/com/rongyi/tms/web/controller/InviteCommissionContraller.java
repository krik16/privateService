/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月6日下午6:07:43
 * @Description: TODO
 *
 **/

package com.rongyi.tms.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.tms.entity.InviteCommission;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.service.InviteCommissionService;

/**
 * @Author: 柯军
 * @Description: 邀请佣金controller
 * @datetime:2015年9月6日下午6:07:43
 * 
 **/

@Controller
@RequestMapping("invite")
public class InviteCommissionContraller extends BaseController {

	private static final Logger LOGGER = Logger.getLogger(InviteCommissionContraller.class);

	@Autowired
	InviteCommissionService inviteCommissionService;

	
	/**	
	 * @Description:邀请返佣审核  
	 * @param model
	 * @param module 商家审核/财务审核
	 * @param currpage
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月6日下午6:23:42
	 **/
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(ModelMap model, String module,String currpage) {
		model.addAttribute("currpage", currpage);
		return "/"+module+"/invite_commission";
	}
	
	/**	
	 * @Description: 邀请返佣列表 
	 * @param model
	 * @param request
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月6日下午6:24:34
	 **/
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String list(ModelMap model, HttpServletRequest request) {
		try {
			LOGGER.info("----- invite list -----");
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e1) {
				LOGGER.error(e1);
			}
			String paramsJson = request.getParameter("paramsJson");
			if (paramsJson == null) {
				Map<String, Object> resultMap = new HashMap<String, Object>();
				resultMap.put("msg", "参数为NULL，请关闭再重试！");
				resultMap.put("status", 0);
				return null;
			}
			Map<String, Object> map = JsonUtil.getMapFromJson(paramsJson);
			Integer currpage = Integer.valueOf(map.get("currpage").toString());
			List<InviteCommission> list = inviteCommissionService.selectPageList(currpage, Constant.PAGE.PAGESIZE, map);
			double pageTotle = inviteCommissionService.selectPageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/invite/invite_list";
	}

}
