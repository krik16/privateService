package com.rongyi.tms.web.controller;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rongyi.core.util.AmountConversion;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.QueryOrderParamVO;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.excel.ExportTradeDetailExcel;
import com.rongyi.tms.moudle.vo.ResponseResult;
import com.rongyi.tms.moudle.vo.TradeDetailCount;
import com.rongyi.tms.service.TradeDetailService;

@Controller
@RequestMapping("/tradeDetail")
public class TradeDetailController extends BaseController {

	private static final Logger LOGGER = Logger.getLogger(TradeDetailController.class);

	@Autowired
	TradeDetailService tradeDetailService;

	@Autowired
	ExportTradeDetailExcel exportTradeDetailExcel;

	@Autowired
	IRpbService rpbService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(ModelMap model, String currpage) {
		model.addAttribute("currpage", currpage);
		return "/tradeDetail/tradeDetail";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String list(ModelMap model, HttpServletRequest request) {
		try {
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e1) {
				LOGGER.error(e1);
			}
			String paramsJson = request.getParameter("paramsJson");
			LOGGER.info("----- trade list -----paramsJson="+paramsJson);
			Map<String, Object> map = JsonUtil.getMapFromJson(paramsJson);
			String currpage = (String) map.get("currpage");
				List<TradeVO> list = tradeDetailService.selectTradePageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE);
			double pageTotle = tradeDetailService.selectTradePageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			TradeDetailCount inocme = getTradeCount(map, 0);
			DecimalFormat df = new DecimalFormat("0.00");
			model.addAttribute("inocmeAmount", df.format(inocme.getAmountCount()));
			model.addAttribute("inocmeTotal", inocme.getTotalCount());
			TradeDetailCount expense = getTradeCount(map, 1);
			model.addAttribute("expenseAmount", df.format(expense.getAmountCount()));
			model.addAttribute("expenseTotal", expense.getTotalCount());
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/tradeDetail/tradeDetail_list";
	}

	/**
	 * @Description: 收入（支出）总数
	 * @param map
	 * @param tradeType
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月12日下午2:12:55
	 **/
	private TradeDetailCount getTradeCount(Map<String, Object> map, Integer tradeType) {
		TradeDetailCount tradeDetailCount = new TradeDetailCount();
		tradeDetailCount.setTradeType(tradeType);
		if (map.get("tradeType") == null || StringUtils.isEmpty(map.get("tradeType").toString()) || tradeType.equals(Integer.valueOf(map.get("tradeType").toString()))
				|| "5".equals(map.get("tradeType"))) {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.putAll(map);
			paramMap.put("tradeType", tradeType);
			if (tradeDetailService.selectTradeCount(paramMap) != null)
				tradeDetailCount = tradeDetailService.selectTradeCount(paramMap);
		}
		if (tradeDetailCount.getAmountCount() == null)
			tradeDetailCount.setAmountCount(0d);
		if (tradeDetailCount.getTotalCount() == null)
			tradeDetailCount.setTotalCount(0l);
		return tradeDetailCount;
	}

	/**
	 * @Description: 交易明细
	 * @param model
	 * @param id
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月11日下午2:32:24
	 **/
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info(ModelMap model, Integer id, String tradeNo) {
		TradeVO tradeVO = tradeDetailService.selectById(id);
		PaymentLogInfo paymentLogInfo = rpbService.selectByTradeNo(tradeNo);
		if (paymentLogInfo != null)
			tradeVO.setBuyerAccount(paymentLogInfo.getBuyer_email());
		tradeDetailService.setIntegralAndCouponDiscount(tradeVO);
		model.addAttribute("trade", tradeVO);
		model.addAttribute("discountAmount", AmountConversion.fenToYuan(tradeVO.getHbDiscount() + tradeVO.getCouponDiscountInt() + tradeVO.getScore()));
		getRongyiAccount(model, tradeVO.getPayChannel());
		return "/tradeDetail/tradeDetail_info";
	}

	/**
	 * @Description: 验证导出报表总数是否超过限制
	 * @param request
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月12日下午3:20:14
	 **/
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/validateExcelCount")
	@ResponseBody
	public ResponseResult validateExcelCount(HttpServletRequest request) {
		ResponseResult result = new ResponseResult();
		result.setSuccess(true);
		Map<String, Object> map = JsonUtil.getMapFromJson(request.getParameter("paramsJson"));
		int tradeDetailCount = tradeDetailService.selectTradePageListCount(map);
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
		LOGGER.info("---导出交易明细报表---"+request.getParameter("paramsJson"));
		exportTradeDetailExcel.exportExcel(request, response);
	}

	/**
	 * @Description: 订单查询页面
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月7日下午3:15:24
	 **/
	@RequestMapping(value = "/queryOrder")
	public String queryOrder() {
		return "/tradeDetail/queryOrder";
	}

	/**
	 * @Description: 订单数据查询
	 * @param request
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月7日下午2:43:59
	 **/
	@RequestMapping(value = "/orderInfo")
	@ResponseBody
	public QueryOrderParamVO orderInfo(HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		Map<String, Object> map = JsonUtil.getMapFromJson(request.getParameter("paramsJson"));
		QueryOrderParamVO queryOrderParamVO = rpbService.queryOrder(map);
		return queryOrderParamVO;
	}

	/**
	 * @Description: 获取容易网支付账号
	 * @param model
	 * @param payChannel
	 * @Author: 柯军
	 * @datetime:2015年6月11日下午2:32:12
	 **/
	private void getRongyiAccount(ModelMap model, Integer payChannel) {
		if (ConstantEnum.PAY_CHANNEL_ZHIFUBAO.getCodeInt().equals(payChannel)) {// 容易网支付宝账号
			model.addAttribute("rongyiAccount", ConstantEnum.RONGYI_ZHIFUBAO_ACCOUNT.getCodeStr());
			model.addAttribute("rongyiName", ConstantEnum.RONGYI_ZHIFUBAO_NAME.getCodeStr());
		} else if (ConstantEnum.PAY_CHANNEL_ZHIFUBAO.getCodeInt().equals(payChannel)) {// 容易网微信账号
			model.addAttribute("rongyiAccount", ConstantEnum.RONGYI_WEIXIN_ACCOUNT.getCodeStr());
			model.addAttribute("rongyiName", ConstantEnum.RONGYI_WEIXIN_NAME.getCodeStr());
		} else {
			// TODO 添加容易网银行卡信息
		}
	}

}
