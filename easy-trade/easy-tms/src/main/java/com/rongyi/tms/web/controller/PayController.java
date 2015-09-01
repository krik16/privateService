/**   
 * @Title: DrawApplyController.java 
 * @Package: com.rongyi.tms.web.controller 
 * @Description: TODO
 * @author user  
 * @date 2015年5月14日 下午2:34:57 
 */

package com.rongyi.tms.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.PayEnum;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.entity.MallLifeUserEntity;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.PayService;
import com.rongyi.tms.service.RefundService;

/**
 * @Author: 柯军
 * @Description: 付款
 * @datetime:2015年5月19日上午11:21:27
 * 
 **/
@Controller
@RequestMapping("/pay")
public class PayController extends BaseController {
	private static final Log LOGGER = LogFactory.getLog(PayController.class);
	protected ResponseResult result = new ResponseResult();
	@Autowired
	private PayService payService;

	@Autowired
	private RefundService refundService;

	@Autowired
	ROAMalllifeUserService rOAMallLifeUserService;

	@Autowired
	IRpbService rpbService;

	@Autowired
	Sender sender;

	@Autowired
	ROAOrderFormService rOAOrderFormService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(ModelMap model, String currentMallId, HttpServletRequest request, HttpServletResponse response, HttpSession session, String currpage) {
		model.addAttribute("currpage", currpage);
		return "/pay/pay";
	}

	/**
	 * @Description: 提现付款列表
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月25日下午1:33:32
	 **/
	@RequestMapping(value = "/drawApplyList", method = RequestMethod.POST)
	public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		try {
			LOGGER.info("----pay list ------");
			Map<String, Object> map = getJsonMap(request);
			String currpage = (String) map.get("currpage");
			List<TradeVO> list = payService.selectPayPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE);
			double pageTotle = payService.selectPayPageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/pay/draw_apply_list";
	}

	/**
	 * @Description: 交易退款列表
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月25日下午1:34:48
	 **/
	@RequestMapping(value = "/refundList", method = RequestMethod.POST)
	public String refundList(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		try {
			LOGGER.info("----refund list ------");
			Map<String, Object> map = getJsonMap(request);
			String currpage = (String) map.get("currpage");
			// map.put("status", ConstantEnum.TRADE_STATUS_PAY_NO.getCodeInt());
			map.put("tradeType", ConstantEnum.TRADE_TYPE_REFUND.getCodeInt());
			List<TradeVO> list = buildList(refundService.selectRefundPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE));
			OrderFormEntity orderFormEntity = null;
			for (TradeVO tradeVO : list) {
				try {
					orderFormEntity = rOAOrderFormService.getOrderFormByOrderNum(tradeVO.getOrderNo());
					if (orderFormEntity != null) {
						tradeVO.setOrderId(orderFormEntity.getId().toString());
						tradeVO.setOrderUserId(orderFormEntity.getBuyerId());
					}
				} catch (Exception e) {
					LOGGER.error("roa接口未提供");
					e.printStackTrace();
				}

			}
			double pageTotle = refundService.selectRefundPageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/pay/refund_list";
	}

	/**
	 * @Description: 异常交易列表
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月25日下午1:52:32
	 **/
	@RequestMapping(value = "/exceList", method = RequestMethod.POST)
	public String exceList(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		try {
			LOGGER.info("----exce list ------");
			Map<String, Object> map = getJsonMap(request);
			String currpage = (String) map.get("currpage");
			map.put("status", ConstantEnum.TRADE_STATUS_PAY_NO.getCodeInt());
			map.put("tradeType", ConstantEnum.TRADE_TYPE_EXCE_PAY.getCodeInt());
			List<TradeVO> list = buildList(refundService.selectRefundPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE));
			OrderFormEntity orderFormEntity = null;
			for (TradeVO tradeVO : list) {
				orderFormEntity = rOAOrderFormService.getOrderFormByOrderNum(tradeVO.getOrderNo());
				if (orderFormEntity != null) {
					tradeVO.setOrderId(orderFormEntity.getId().toString());
					tradeVO.setOrderUserId(orderFormEntity.getBuyerId());
				}
			}
			double pageTotle = refundService.selectRefundPageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/pay/exce_list";
	}

	/**
	 * @Description: 获取对应列表中的买家账号信息
	 * @param list
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月10日上午11:45:24
	 **/
	private List<TradeVO> buildList(List<TradeVO> list) {
		try {
			for (TradeVO tradeVO : list) {
				if (tradeVO.getBuyerId() != null) {
					MallLifeUserEntity user = rOAMallLifeUserService.getEntityByUid(tradeVO.getBuyerId());
					if (user != null) {
						tradeVO.setBuyerId(user.getId().toString());
						tradeVO.setBuyerAccount(user.getPhone());
						tradeVO.setBuyerName(user.getUserName());
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error("获取买家账号信息失败。。" + e.getMessage());
		}
		return list;
	}

	/**
	 * @Description:打款到卖家列表
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月25日下午1:33:32
	 **/
	@RequestMapping(value = "/paySellerList", method = RequestMethod.POST)
	public String paySellerList(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		try {
			LOGGER.info("----paySeller list ------");
			Map<String, Object> map = getJsonMap(request);
			map.put("tradeType", 2);
			String currpage = (String) map.get("currpage");
			List<TradeVO> list = payService.selectPayPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE);
			double pageTotle = payService.selectPayPageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/pay/draw_apply_list";
	}

	/**	
	 * @Description: 操作退款/付款前验证是否符合条件 
	 * @param paymentId
	 * @param model
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月1日下午2:40:13
	 **/
	@RequestMapping("/validatePay")
	@ResponseBody
	public ResponseResult validatePay(@RequestParam String ids[],@RequestParam Integer operateType, Model model) {
		LOGGER.info("================操作退款/付款前验证是否符合条件 ====================");
		try {
			Map<String, Object> resultMap = rpbService.validatePayHtml(ids, operateType);
			result.setSuccess(Boolean.valueOf(resultMap.get("success").toString()));
			result.setMessage(resultMap.get("message").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * @Description: 支付
	 * @param paymentId
	 * @param type
	 * @param payChannel
	 * @param model
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年7月12日下午1:23:16
	 **/
	@SuppressWarnings("unchecked")
	@RequestMapping("/pay")
	public String pay(@RequestParam String paymentId, @RequestParam Integer type, @RequestParam Integer payChannel, Model model) {
		LOGGER.info("================支付开始====================");
		try {
			MessageEvent messageEvent = getMessageEvent(type, payChannel, paymentId, getDesc(type));
			String result = sender.convertSendAndReceive(messageEvent);
			Map<String, Object> resultMap = JsonUtil.getMapFromJson(result);
			model.addAttribute("content", resultMap.get("sHtmlText"));
		} catch (Exception e) {
			LOGGER.error("mq 获取支付页面信息失败");
			model.addAttribute("content", "获取支付信息失败，请重试");
			e.printStackTrace();
		}
		return "/pay/zhifu";
	}

	/**
	 * @Description: 微信手动退款操作
	 * @param paymentId
	 * @param type
	 * @param payChannel
	 * @param model
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年7月12日下午1:23:47
	 **/
	@RequestMapping("/weixinRefund")
	@ResponseBody
	public ResponseResult weixinRefund(@RequestParam Integer paymentId, Model model) {
		LOGGER.info("================微信手动操作退款====================");
		try {
			Map<String, Object> resultMap = rpbService.operateWeixinRefund(paymentId);
			result.setSuccess(Boolean.valueOf(resultMap.get("success").toString()));
			result.setMessage(resultMap.get("message").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @Description: 微信退款拒绝/同意操作
	 * @param paymentId
	 * @param refundRejected
	 * @param model
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月28日上午10:58:17
	 **/
	@RequestMapping("/refundRejected")
	@ResponseBody
	public ResponseResult weixinRefundRejected(@RequestParam Integer paymentId, @RequestParam Integer refundRejected, Model model) {
		LOGGER.info("================微信退款" + (refundRejected == 0 ? "同意" : "拒绝") + "操作====================");
		try {
			Map<String, Object> resultMap = rpbService.weixinRefundRejected(paymentId, refundRejected);
			result.setSuccess(Boolean.valueOf(resultMap.get("success").toString()));
			result.setMessage(resultMap.get("message").toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private String getDesc(Integer type) {
		String desc = ConstantEnum.TRADE_TYPE_TO_DRAW_APPLY.getValueStr();
		if (PayEnum.TRADE_REFUND_ONE.getCode() == type || PayEnum.TRADE_REFUND_MORE.getCode() == type)
			desc = ConstantEnum.TRADE_TYPE_REFUND.getValueStr();
		else if (PayEnum.EXCE_PAY_ONE.getCode() == type || PayEnum.EXCE_PAY_MORE.getCode() == type)
			desc = ConstantEnum.TRADE_TYPE_EXCE_PAY.getValueStr();
		return desc;
	}

	private MessageEvent getMessageEvent(Integer operateType, Integer payChannel, String paymentId, String desc) {
		MessageEvent event = new MessageEvent();
		Map<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("paymentId", paymentId);// 多个id用逗号分隔
		bodyMap.put("operateType", operateType);
		// bodyMap.put("payChannel", payChannel);
		bodyMap.put("desc", desc);
		event.setBody(bodyMap);
		event.setSource(ConstantEnum.MESSAGE_EVENT_TMS.getCodeStr());
		event.setTarget(ConstantEnum.MESSAGE_EVENT_RPB.getCodeStr());
		event.setTimestamp(DateUtil.getCurrDateTime().getTime());
		event.setType(PaymentEventType.OUTER_TO_PAY);
		return event;
	}

	/**
	 * @Description: 验证用户账号合法性
	 * @param paymentId
	 * @param session
	 * @param request
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月4日下午6:38:30
	 **/
	@RequestMapping(value = "/validateAccount")
	@ResponseBody
	public ResponseResult validateAccount(String ids, HttpSession session, HttpServletRequest request) {
		// try {
		// Map<Integer, String> map = rpbService.validateAccount(ids);
		// result.setSuccess(false);
		// if (map == null || map.isEmpty()) {
		// result.setSuccess(true);
		// result.setMessage(ConstantEnum.USER_ACCOUNT_STATUS0.getValueStr());
		// return result;
		// }
		// String message = "提现流水号为：";
		// if
		// (map.keySet().contains(ConstantEnum.USER_ACCOUNT_STATUS1.getCodeInt()))
		// {
		// result.setMessage(message +
		// map.get(ConstantEnum.USER_ACCOUNT_STATUS1.getCodeInt()) + " 的"
		// + ConstantEnum.USER_ACCOUNT_STATUS1.getValueStr());
		// } else if
		// (map.keySet().contains(ConstantEnum.USER_ACCOUNT_STATUS2.getCodeInt()))
		// {
		// result.setMessage(message +
		// map.get(ConstantEnum.USER_ACCOUNT_STATUS2.getCodeInt()) + " 的"
		// + ConstantEnum.USER_ACCOUNT_STATUS2.getValueStr());
		// } else {
		// result.setMessage(message +
		// map.get(ConstantEnum.USER_ACCOUNT_STATUS3.getCodeInt()) + " 的"
		// + ConstantEnum.USER_ACCOUNT_STATUS3.getValueStr());
		// }
		// } catch (Exception e) {
		// result.setMessage("验证用户账号是否合法失败");
		// e.printStackTrace();
		// }
		// TODO test
		result.setSuccess(true);
		return result;
	}

}
