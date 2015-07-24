package com.rongyi.osm.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/main")
public class MainController extends BaseController {
	private Logger logger = Logger.getLogger(this.getClass());
	
	
	/**
	 * 首页
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		try {
			logger.info(">>>home");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return "main";
	}
	
	
}
