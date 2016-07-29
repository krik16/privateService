package com.rongyi.tms.web.controller;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.constant.CommissionEnum;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.vo.SalesCommissionParam;
import com.rongyi.easy.tms.vo.SalesCommissionVO;
import com.rongyi.rss.mallshop.order.ROACommodityCommissionService;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.ResponseResult;
import com.rongyi.tms.moudle.vo.UserInfo;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.SalesCommissionService;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 袁波
 * @Description 佣金 controller
 * @date 2015年5月25日 下午9:57:57
 */
@Controller
@RequestMapping("/sc")
public class SalesCommissionController extends BaseController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SalesCommissionController.class);

	@Autowired
	private SalesCommissionService commissionService;

	@Autowired
	private SalesCommissionAuditLogService commissionAuditLogService;

	@Autowired
	private ROACommodityCommissionService roaCommodityCommissionService;

	@RequestMapping("/search")
	public String searchIntegralComm(String module) {
		return module + "/sales_commission-search";
	}

	@RequestMapping(value = "/list")
	public String findByPage(@ModelAttribute("param") SalesCommissionParam params, String module, ModelMap modelMap, HttpServletRequest request) {
		LOGGER.info("SalesCommissionController list param={}", params.toString());
		try {
			PagingVO<SalesCommissionVO> pagingvos = commissionService.findByPage(params);
			request.setAttribute("list", pagingvos.getDataList());
			request.setAttribute("currpage", pagingvos.getCurrentPage());
			request.setAttribute("rowCont", pagingvos.getTotalPage());
			if (module.equals("merchant")) {
				if ("1".equals(params.getStatus()) && !"5".equals(params.getStatus())) {
					return module + "/sales_commission-search-list";
				} else {
					return module + "/sales_commission_checked-list";
				}
			} else {
				if (params.getStatus().equals("2")) {
					return module + "/sales_commission-search-list";
				} else {
					return module + "/sales_commission_checked-list";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
			return Constant.VIEW_MSG.ERROR;
		}
	}

	@RequestMapping(value = "/check")
	@ResponseBody
	public ResponseResult checkCommission(CheckParam params, HttpSession session, HttpServletRequest request) {
		LOGGER.info("SalesCommissionController check param={}", params);
		ResponseResult result = new ResponseResult();
		try {
			if (StringUtils.isBlank(params.getIds()) || params.getStatus() == null || (params.getStatus() == -1 && StringUtils.isBlank(params.getReason()))) {
				result.setCode(CodeEnum.ERROR_PARAM.getActionCode());
				result.setMessage(CodeEnum.ERROR_PARAM.getMessage());
				result.setSuccess(false);
			} else {
				UserInfo userInfo = this.getSessionUser(request, session);
				if (userInfo != null) {
					int updateResult = commissionService.updateBatch(params, userInfo.getUsername());
					if (updateResult > 0) {
						if (params.getStatus() < 0) {
							// 审核不通过时 向用户推送消息 add by ZhengYl 2015-06-03
							Map<String, String> map = new HashMap<>();
							SalesCommissionVO salesCommissionVO = commissionService.selectOneById(Integer.parseInt(params.getIds()));
							map.put("orderNumber", salesCommissionVO.getOrderNo());
							map.put("commission", salesCommissionVO.getCommissionAmount().toString());
							map.put("eventType", CommissionEnum.COMMISSION_CHECK_FAIlURE.getCode().toString());
							roaCommodityCommissionService.sendBodyByOrderEventType(map);
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
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setSuccess(false);
		}
		return result;
	}

	@RequestMapping(value = "/detail")
	public String checkDrawApply(int id, String module, HttpServletRequest request, ModelMap modelMap) {
		LOGGER.info("SalesCommissionController detail module={},id={}", module, id);
		String returnView;
		try {
			if (id == 0) {
				request.setAttribute("msg", "参数传递有误！");
				returnView = Constant.VIEW_MSG.ERROR;
			} else {
				SalesCommissionVO commission = commissionService.selectOneById(id);
				int operate = module.equals("merchant") ? 1 : 2;
				SalesCommissionAuditLog auditLog = commissionAuditLogService.selectByCommissionId(id, operate);
				LOGGER.info(auditLog == null ? "没有审核记录" : (auditLog.getMemo() == null ? "审核通过，没有不通过理由" : auditLog.getMemo()));
				if (auditLog != null) {
					commission.setReason(auditLog.getMemo());
				}
				modelMap.addAttribute("apply", commission);
				returnView = module + "/sales_commission-detail";
			}
		} catch (Exception e) {
			request.setAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
			request.setAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
			returnView = Constant.VIEW_MSG.ERROR;
		}
		return returnView;
	}

	@RequestMapping(value = "getReason")
	public void getUnPassReason(Integer id, Integer operate, HttpServletResponse response) {
		LOGGER.info("SalesCommissionController detail operate={},id={}", operate, id);
		Map<String, Object> resultMap = new HashMap<>();
		if (id == 0) {
			resultMap.put("msg", "");
		} else {
			SalesCommissionAuditLog log = commissionAuditLogService.selectByCommissionId(id, operate);
			resultMap.put("msg", log == null ? "" : log.getMemo());
		}
		JSONObject json = JSONObject.fromObject(resultMap);
		responseJson(json.toString(), response);
	}

	@RequestMapping(value = "payingNow")
	@ResponseBody
	public ResponseResult payingToSellerNow() {
		ResponseResult result = new ResponseResult();
		try {
			commissionService.statisticsCommissionAmountTrigger(1);
			commissionService.statisticsCommissionAmountTrigger(2);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
		}
		return result;

	}
}
