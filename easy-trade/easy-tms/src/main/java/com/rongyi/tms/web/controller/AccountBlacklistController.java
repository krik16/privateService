/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年8月14日上午9:59:27
 * @Description: TODO
 *
 **/

package com.rongyi.tms.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.cheat.AccountBlacklist;
import com.rongyi.rss.cheat.IAntiCheatService;
import com.rongyi.tms.constants.Constant;

/**
 * @Author: 柯军
 * @Description: 账号黑名单
 * @datetime:2015年8月14日上午9:59:27
 * 
 **/
@Controller
@RequestMapping("/accountBlack")
public class AccountBlacklistController extends BaseController {

	private static final Logger LOGGER = Logger.getLogger(AccountBlacklistController.class);

	@Autowired
	IAntiCheatService antiCheatService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session, String currpage) {
		model.addAttribute("currpage", currpage);
		return "/accountBlack/accountBlack";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/accountBlackList", method = RequestMethod.POST)
	public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		try {
			LOGGER.info("----accountBlack list ------");
			Map<String, Object> map = getJsonMap(request);
			String currpage = (String) map.get("currpage");
			Map<String, Object> resultMap = antiCheatService.getPageMap(Integer.valueOf(currpage), Constant.PAGE.PAGESIZE, map);
			Integer pageTotle = (Integer) resultMap.get("count");
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", (List<AccountBlacklist>) resultMap.get("list"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/accountBlack/accountBlack_list";
	}

	@RequestMapping("/frozenAccount")
	@ResponseBody
	public ResponseResult weixinRefund(@RequestParam Integer id, Model model) {
		LOGGER.info("================冻结账号====================");
		ResponseResult result = new ResponseResult();
		try {
			Map<String, Object> resultMap = antiCheatService.updateFrozenAccount(new String[] { id.toString() });
			result.setSuccess(Boolean.valueOf(resultMap.get("success").toString()));
			result.setMessage(resultMap.get("message").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
