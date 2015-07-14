package com.rongyi.osm.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.osm.service.OsmAdministrationService;


@Controller
@RequestMapping("/osm")
public class OsmQueryController extends BaseController {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private OsmAdministrationService osmAdministrationService;
	
	@RequestMapping(value = "/mem_query", method = RequestMethod.POST)
	public void getTotalMemory(HttpServletRequest request,HttpServletResponse response,  HttpSession session) {
		logger.info(">>>memory_query");
		long totalMem = Runtime.getRuntime().totalMemory();
		long freeMem = Runtime.getRuntime().freeMemory();
		long maxMem = Runtime.getRuntime().maxMemory();
		Map<String,Object> resultMap=new HashMap<String,Object>(); 
		resultMap.put("msg", "查询成功！");
		resultMap.put("status", 1);
		resultMap.put("totalMem", totalMem);
		resultMap.put("freeMem", freeMem);
		resultMap.put("totalMem", maxMem);
		
		String json = JsonUtil.getJSONString(resultMap);
		responseJson(json, response);
	}
	
	/**
	 * 首页
	 * @param model
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/order_query", method = RequestMethod.POST)
	public void saveCommoditySpecColumn(HttpServletRequest request,HttpServletResponse response, HttpSession session, ModelMap modelMap,String paramsJson){
		logger.info(">>>order_query");
		Map<String,Object> resultMap=new HashMap<String,Object>(); 
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		
		Map<String, Object> paramsMap;
		if (paramsJson == null) {
			resultMap.put("msg", "参数为NULL，请重试！");
			resultMap.put("status", 0);
			String json = JsonUtil.getJSONString(resultMap);
			logger.info(json);
			responseJson(json, response);
			return ;
		}
		
		String orderNoStr = "";	
		try {
			paramsMap = JsonUtil.getMapFromJson(paramsJson);
			orderNoStr = paramsMap.get("orderNo").toString();
		} catch (Exception e) {
			resultMap.put("msg", "参数格式有误，请重试！");
			resultMap.put("status", 0);
			String json = JsonUtil.getJSONString(resultMap);
			logger.info(json);
			responseJson(json, response);
			return ;
		}
		
		try {
			OrderFormEntity order = osmAdministrationService.queryGetOrder(orderNoStr);
			if(order == null){
				resultMap.put("msg", "未找到订单！");
				resultMap.put("status", 0);
				String json = JsonUtil.getJSONString(resultMap);
				responseJson(json, response);
				return;
			}
			
			resultMap.put("msg", "查询成功！");
			resultMap.put("status", 1);
			resultMap.put("info", order);
			String json = JsonUtil.getJSONString(resultMap);
			responseJson(json, response);
			
			System.out.println("Query Success： " + orderNoStr);
			logger.info("Query Success： " + orderNoStr);
			
		} catch (Exception e) {
			resultMap.put("msg", "查询错误！");
			resultMap.put("status", 0);
			String json = JsonUtil.getJSONString(resultMap);
			logger.info(json);
			responseJson(json, response);
			return ;
		}
		
	}
	
	
}
