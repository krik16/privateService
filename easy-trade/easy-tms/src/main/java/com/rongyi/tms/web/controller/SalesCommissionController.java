package com.rongyi.tms.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

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
import com.rongyi.core.constant.CommissionEnum;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.vo.SalesCommissionParam;
import com.rongyi.easy.tms.vo.SalesCommissionVO;
import com.rongyi.rss.mallshop.order.ROACommodityCommissionService;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.UserInfo;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.SalesCommissionService;

/**
 * @author 袁波
 * @Description 佣金 controller
 * @date 2015年5月25日 下午9:57:57
 */
@Controller
@RequestMapping("/sc")
public class SalesCommissionController extends BaseController {
    private static final Log LOGGER = LogFactory.getLog(SalesCommissionController.class);

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
        try {
            PagingVO<SalesCommissionVO> pagingvos = commissionService.findByPage(params);
            request.setAttribute("list", pagingvos.getDataList());
            request.setAttribute("currpage", pagingvos.getCurrentPage());
            request.setAttribute("rowCont", pagingvos.getTotalPage());
            if (module.equals("merchant")) {
                if (params.getStatus().equals("1")) {
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
            LOGGER.info(e);
            modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
            modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
            return Constant.VIEW_MSG.ERROR;
        }
    }

    @RequestMapping(value = "/check")
    @ResponseBody
    public ResponseResult checkCommission(CheckParam params, HttpSession session, HttpServletRequest request) {
    	ResponseResult result = new ResponseResult();
        try {
            if (StringUtils.isBlank(params.getIds()) || params.getStatus() == null || (
                params.getStatus() == -1 && StringUtils.isBlank(params.getReason()))) {
                result.setCode(CodeEnum.ERROR_PARAM.getActionCode());
                result.setMessage(CodeEnum.ERROR_PARAM.getMessage());
                result.setSuccess(false);
            } else {
                UserInfo userInfo = this.getSessionUser(request, session);
                if (userInfo != null) {
                    int updateResult =
                        commissionService.updateBatch(params, userInfo.getUsername());
                    if (updateResult > 0) {
                        if (params.getStatus() < 0) {
                            // 审核不通过时 向用户推送消息 add by ZhengYl 2015-06-03
                            Map<String, String> map = new HashMap<String, String>();
                            SalesCommissionVO salesCommissionVO =
                                commissionService.selectOneById(Integer.parseInt(params.getIds()));
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
            LOGGER.info(e);
            result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
            result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
            result.setSuccess(false);
        }
        return result;
    }

    @RequestMapping(value = "/detail")
    public String checkDrawApply(int id, String module, HttpServletRequest request, ModelMap modelMap) {
        String returnView = "";
        try {
            if (id == 0) {
                request.setAttribute("msg", "参数传递有误！");
                returnView = Constant.VIEW_MSG.ERROR;
            } else {
                SalesCommissionVO commission = commissionService.selectOneById(id);
                int operate = module.equals("merchant") ? 1 : 2;
                SalesCommissionAuditLog auditLog =
                    commissionAuditLogService.selectByCommissionId(id, operate);
                LOGGER.info(auditLog == null ?
                    "没有审核记录" :
                    (auditLog.getMemo() == null ? "审核通过，没有不通过理由" : auditLog.getMemo()));
                if (auditLog != null) {
                    commission.setReason(auditLog.getMemo());
                }
                modelMap.addAttribute("apply", commission);
                returnView = module + "/sales_commission-detail";
            }
        } catch (Exception e) {
            LOGGER.error(e);
            request.setAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
            request.setAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
            returnView = Constant.VIEW_MSG.ERROR;
        }
        return returnView;
    }

    @RequestMapping(value = "getReason")
    public void getUnPassReason(Integer id, Integer operate, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if (id == 0) {
            resultMap.put("msg", "");
        } else {
            SalesCommissionAuditLog log =
                commissionAuditLogService.selectByCommissionId(id, operate);
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
            commissionService.statisticsCommissionAmountTrigger();
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info(e);
            result.setSuccess(false);
        }
        return result;

    }
}
