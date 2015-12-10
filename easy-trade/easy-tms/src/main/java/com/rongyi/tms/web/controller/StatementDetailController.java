/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年10月8日下午2:32:46
 * @Description: TODO
 *
 **/

package com.rongyi.tms.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.excel.ExportStatementDetailExcel;
import com.rongyi.tms.moudle.vo.ResponseResult;
import com.rongyi.tms.service.PaymentStatementService;

/**
 * @Author: 柯军
 * @Description: 对账交易明细
 * @datetime:2015年10月8日下午2:32:46
 * 
 **/

@Controller
@RequestMapping("/statementDetail")
public class StatementDetailController extends BaseController {

	private static final Logger LOGGER = Logger.getLogger(StatementDetailController.class);

	@Autowired
	PaymentStatementService paymentStatementService;

	@Autowired
	ExportStatementDetailExcel excelExportStatementDetailExcel;
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(ModelMap model, String currentMallId, HttpServletRequest request, HttpServletResponse response, HttpSession session, String currpage) {
		model.addAttribute("currpage", currpage);
		return "/statementDetail/statementDetail";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String list(ModelMap model, String currentMallId, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		try {
			LOGGER.info("----- statementDetail list -----");
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
			String currpage = (String) map.get("currpage");
			setSearchMap(map);
			List<PaymentStatementDto> list = paymentStatementService.selectPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE);
			double pageTotle = paymentStatementService.selectPageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/statementDetail/statementDetail_list";
	}
	/**
	 * @Description: 验证导出报表总数是否超过限制
	 * @param request
	 * @param response
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月12日下午3:20:14
	 **/
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/validateExcelCount")
	@ResponseBody
	public ResponseResult validateExcelCount(HttpServletRequest request, HttpServletResponse response) {
		ResponseResult result = new ResponseResult();
		result.setSuccess(true);
		Map<String, Object> map = JsonUtil.getMapFromJson(request.getParameter("paramsJson"));
		setSearchMap(map);
		int tradeDetailCount = paymentStatementService.selectPageListCount(map);
		if (tradeDetailCount > ConstantEnum.EXCEL_LIMIT_COUNT.getCodeInt())
			result.setSuccess(false);
		return result;
	}

	/**
	 * 报表导出
	 * 
	 * @param response
	 */
	@RequestMapping(value = "/exportExcel", method = RequestMethod.GET)
	public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("---导出结算明细报表---");
		excelExportStatementDetailExcel.exportExcel(request, response);
	}
	
	private Map<String,Object> setSearchMap(Map<String,Object> map){
		map.put("status", ConstantEnum.STATEMENT_STATUE_12.getCodeByte());
		if(map.get("minTotalPrice") != null && !StringUtils.isEmpty(map.get("minTotalPrice").toString()))
		map.put("minTotalPrice",Double.valueOf(map.get("minTotalPrice").toString())*100);
		if(map.get("maxTotalPrice") != null && !StringUtils.isEmpty(map.get("maxTotalPrice").toString()))
			map.put("maxTotalPrice",Double.valueOf(map.get("maxTotalPrice").toString())*100);
		return map;
	}
}