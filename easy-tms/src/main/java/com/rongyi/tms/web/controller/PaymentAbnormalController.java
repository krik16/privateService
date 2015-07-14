/** 
* @Title: PaymentAbnormalController.java 
* @Package com.rongyi.tms.web.controller 
* @Description: 异常支付
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月17日 下午2:25:25 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.AbnormalParam;
import com.rongyi.tms.moudle.vo.AbnormalVO;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.PaymentAbnormalPageParam;
import com.rongyi.tms.moudle.vo.UserInfo;
import com.rongyi.tms.service.PaymentAbnormalService;
import com.rongyi.tms.service.impl.PaymentAbnormalPayServiceImpl;

/**
 * @author ZhengYl
 *
 */
@Controller
@RequestMapping("/ab")
public class PaymentAbnormalController extends BaseController {
	private static final Log LOGGER = LogFactory.getLog(DrawApplyController.class);

	@Autowired
	private PaymentAbnormalService paymentAbnormalService;

	@Autowired
	private ROAOrderFormService roaOrderFormService;

	@Autowired
	private ROAMalllifeUserService malllifeUserService;

	@Autowired
	private PaymentAbnormalPayServiceImpl paymentAbnormalPayServiceImpl;

	@RequestMapping("/search")
	public String searchIntegralComm() {
		return "abnormal/abnormal-search";
	}

	@RequestMapping(value = "/list")
	public String findByPage(@ModelAttribute("param") PaymentAbnormalPageParam param, ModelMap modelMap,
			HttpServletRequest request) {
		try {
			Map<String, Object> params = param.toParamsMap();

			PagingVO<AbnormalVO> pagingvos = paymentAbnormalService.findByPage(params);
			request.setAttribute("list", pagingvos.getDataList());
			request.setAttribute("currpage", pagingvos.getCurrentPage());
			request.setAttribute("rowCont", pagingvos.getTotalPage());
			if (param.getStatus().equals("0")) {
				return "abnormal/abnormal-search-list";
			} else {
				return "abnormal/abnormal-checked-list";
			}

		} catch (Exception e) {
			LOGGER.info(e);
			modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
			return Constant.VIEW_MSG.ERROR;
		}
	}

	@RequestMapping(value = "/edit")
	public String editPage(int id, ModelMap modelMap) {
		String returnViewString = "abnormal/abnormal-edit";
		try {
			if (id != 0) {
				AbnormalVO abnormalVO = paymentAbnormalService.selectOneById(id);
				modelMap.addAttribute("abnormal", abnormalVO);
				LOGGER.info(abnormalVO);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.error(exception);
			modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, exception.getMessage());
			returnViewString = Constant.VIEW_MSG.ERROR;
		}
		return returnViewString;
	}

	@RequestMapping(value = "/view")
	public String viewPage(int id, ModelMap modelMap) {
		String returnViewString = "abnormal/abnormal-detail";
		try {
			if (id != 0) {
				AbnormalVO abnormalVO = paymentAbnormalService.selectOneById(id);
				modelMap.addAttribute("abnormal", abnormalVO);
				LOGGER.info(abnormalVO);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.error(exception);
			modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, exception.getMessage());
			returnViewString = Constant.VIEW_MSG.ERROR;
		}
		return returnViewString;
	}

	@RequestMapping(value = "update")
	@ResponseBody
	public ResponseResult updateAbnormalPayment(AbnormalParam params, ModelMap modelMap, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		ResponseResult result = new ResponseResult();
		LOGGER.info("AbnormalPayment edit start>>>>>>Params: " + params);

		try {
			if (params.getOrderNo() != null) {
				OrderFormEntity order = roaOrderFormService.getOrderFormByOrderNum(params.getOrderNo());
				UserInfoVO user = malllifeUserService.getByPhone(params.getUserAccount());
				if (user != null) {
					if (order != null) {
						if (user.getUserId().equals(order.getBuyerId())) {
							UserInfo userInfo = this.getSessionUser(request, session);

							params.setUserId(user.getUserId());

							if (params.getId() == 0) {
								params.setCreateUser(userInfo.getUsername());
								params.setCreateAt(new Date());
							}

							int updateResult = paymentAbnormalService.update(params);
							if (updateResult > 0) {
								result.setSuccess(true);
							} else {
								// 数据库操作不成功
								result.setSuccess(false);
								result.setMessage(CodeEnum.ERROR_DATA.getMessage());
								result.setCode(CodeEnum.ERROR_DATA.getActionCode());
							}
						} else {
							// 订单与买家账号不匹配
							result.setSuccess(false);
							result.setMessage(CodeEnum.ERROR_ORDER_NOT_MATCH.getMessage());
							result.setCode(CodeEnum.ERROR_ORDER_NOT_MATCH.getActionCode());
						}
					} else {
						// 找不到订单
						result.setSuccess(false);
						result.setMessage(CodeEnum.ERROR_ORDER_NOT_FOUND.getMessage());
						result.setCode(CodeEnum.ERROR_ORDER_NOT_FOUND.getActionCode());
					}
				} else {
					// 找不到买家账号
					result.setSuccess(false);
					result.setMessage(CodeEnum.ERROR_ACCOUNT.getMessage());
					result.setCode(CodeEnum.ERROR_ACCOUNT.getActionCode());
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e);
			result.setSuccess(false);
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
		}

		return result;
	}

	@RequestMapping(value = "/check")
	@ResponseBody
	public ResponseResult checkAbnormalPayment(CheckParam checkParams, HttpSession session, HttpServletRequest request) {
		LOGGER.info("AbnormalPayment check start>>>>>>ids: " + checkParams.getIds());
		ResponseResult result = new ResponseResult();
		try {
			if (StringUtils.isBlank(checkParams.getIds()) || checkParams.getStatus() == null
					|| (checkParams.getStatus() == -1 && StringUtils.isBlank(checkParams.getReason()))) {
				result.setCode(CodeEnum.ERROR_PARAM.getActionCode());
				result.setMessage(CodeEnum.ERROR_PARAM.getMessage());
				result.setSuccess(false);
			} else {
				UserInfo userInfo = this.getSessionUser(request, session);
				if (userInfo != null) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("checkedBy", userInfo.getUsername());
					params.put("checkAt", new Date());
					params.put("status", checkParams.getStatus());
					params.put("remarks", checkParams.getReason());

					String[] idStrs = checkParams.getIds().split(",");
					int idIntArray[] = new int[idStrs.length];
					for (int i = 0; i < idStrs.length; i++) {
						idIntArray[i] = Integer.parseInt(idStrs[i]);
					}
					params.put("ids", idIntArray);

					int updateResult = paymentAbnormalService.updateCheckedStatus(params);
					if (updateResult > 0) {
						if (checkParams.getStatus() == 1) {
							// 发送支付请求给rpb
							paymentAbnormalPayServiceImpl.abnormalPay(idIntArray);
						}

						result.setCode(CodeEnum.SUCCESS.getActionCode());
						result.setMessage(CodeEnum.SUCCESS.getMessage());
						result.setSuccess(true);
					} else {
						result.setCode(CodeEnum.ERROR_UPDATE.getActionCode());
						result.setMessage(CodeEnum.ERROR_UPDATE.getMessage());
						result.setSuccess(false);
					}
				} else {
					result.setCode(CodeEnum.ERROR_LOGIN.getActionCode());
					result.setMessage(CodeEnum.ERROR_LOGIN.getMessage());
					result.setSuccess(false);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e);
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setSuccess(false);
		}
		return result;
	}

	@RequestMapping(value = "/del")
	@ResponseBody
	public ResponseResult deleteAbnormalPayment(CheckParam checkParams, HttpSession session, HttpServletRequest request) {
		LOGGER.info("AbnormalPayment delete start>>>>>>ids: " + checkParams.getIds());
		ResponseResult result = new ResponseResult();
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("id", checkParams.getIds());
			paymentAbnormalService.updateDeletedFlag(params);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e);
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setSuccess(false);
		}
		return result;
	}
}
