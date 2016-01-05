package com.rongyi.tms.web.controller;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.PayEnum;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
import com.rongyi.rss.rpb.IRpbService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.moudle.vo.UserInfo;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.PayService;
import com.rongyi.tms.service.PaymentStatementService;
import com.rongyi.tms.service.RefundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 柯军
 * @Description: 付款
 * @datetime:2015年5月19日上午11:21:27
 **/
@Controller
@RequestMapping("/pay")
public class PayController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PayController.class);
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

    @Autowired
    PaymentStatementService paymentStatementService;

    @Autowired
    PropertyConfigurer propertyConfigurer;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(ModelMap model, String currentMallId, HttpServletRequest request, HttpServletResponse response, HttpSession session, String currpage) {
        model.addAttribute("currpage", currpage);
        return "/pay/pay";
    }

    /**
     * @param model
     * @param request
     * @param response
     * @param session
     * @return
     * @Description: 提现付款列表
     * @Author: 柯军
     * @datetime:2015年5月25日下午1:33:32
     **/
    @RequestMapping(value = "/drawApplyList", method = RequestMethod.POST)
    public String list(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        try {
            Map<String, Object> map = getJsonMap(request);
            LOGGER.info("----drawApply list ------map=" + map);
            String currpage = (String) map.get("currpage");
            map.put("status", ConstantEnum.TRADE_STATUS_PAY_NO.getCodeInt());
            List<TradeVO> list = validateAllowOpPay(payService.selectPayPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE));
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
     * @param model
     * @param request
     * @param response
     * @param session
     * @return
     * @Description: 交易退款列表
     * @Author: 柯军
     * @datetime:2015年5月25日下午1:34:48
     **/
    @RequestMapping(value = "/refundList", method = RequestMethod.POST)
    public String refundList(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        try {
            Map<String, Object> map = getJsonMap(request);
            LOGGER.info("----refund list ------ map=" + map);
            String currpage = (String) map.get("currpage");
            map.put("tradeType", ConstantEnum.TRADE_TYPE_REFUND.getCodeInt());
            List<TradeVO> list = validateAllowOpPay(refundService.selectRefundPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE));
            double pageTotle = refundService.selectRefundPageListCount(map);
            Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
            model.addAttribute("rowCont", rowContNum);
            model.addAttribute("currpage", currpage);
            model.addAttribute("list", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("返回查询结果到界面");
        return "/pay/refund_list";
    }

    /**
     * @param model
     * @param request
     * @param response
     * @param session
     * @return
     * @Description: 异常交易列表
     * @Author: 柯军
     * @datetime:2015年5月25日下午1:52:32
     **/
    @RequestMapping(value = "/exceList", method = RequestMethod.POST)
    public String exceList(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        try {
            Map<String, Object> map = getJsonMap(request);
            LOGGER.info("----exce list ------map=" + map);
            String currpage = (String) map.get("currpage");
            map.put("status", ConstantEnum.TRADE_STATUS_PAY_NO.getCodeInt());
            map.put("tradeType", ConstantEnum.TRADE_TYPE_EXCE_PAY.getCodeInt());
            List<TradeVO> list = validateAllowOpPay(refundService.selectRefundPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE));
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
     * @param list
     * @return
     * @Description: 获取对应列表中的买家账号信息
     * @Author: 柯军
     * @datetime:2015年6月10日上午11:45:24
     **/
//    private List<TradeVO> buildList(List<TradeVO> list) {
//        try {
//            MalllifeUserInfoEntity user = null;
//            for (TradeVO tradeVO : list) {
//                LOGGER.info("查询买家账号信息，id={},listSize={}",tradeVO.getId(),list.size());
//                if (tradeVO.getBuyerId() != null) {
//                    user = rOAMallLifeUserService.getEntityByUid(tradeVO.getBuyerId());
//                } else if (tradeVO.getCouponBuyerId() != null) {
//                    user = rOAMallLifeUserService.getEntityByUid(tradeVO.getCouponBuyerId());
//                }
//                LOGGER.info("已获取买家账号");
//                if (user != null) {
//                    tradeVO.setBuyerId(user.getId().toString());
//                    tradeVO.setBuyerAccount(user.getPhone());
//                    tradeVO.setBuyerName(user.getNickName());
//                }
//            }
//        } catch (Exception e) {
//            LOGGER.error("获取买家账号信息失败。。" + e.getMessage());
//        }
//        return list;
//    }

    /**
     * @param model
     * @param request
     * @param response
     * @param session
     * @return
     * @Description:打款到卖家列表
     * @Author: 柯军
     * @datetime:2015年5月25日下午1:33:32
     **/
    @RequestMapping(value = "/paySellerList", method = RequestMethod.POST)
    public String paySellerList(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        try {

            Map<String, Object> map = getJsonMap(request);
            LOGGER.info("----paySeller list ------map=" + map);
            map.put("tradeType", 2);
            String currpage = (String) map.get("currpage");
            List<TradeVO> list = validateAllowOpPay(payService.selectPayPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE));
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
     * @param model
     * @return
     * @Description: 操作退款/付款前验证是否符合条件
     * @Author: 柯军
     * @datetime:2015年9月1日下午2:40:13
     **/
    @RequestMapping("/validatePay")
    @ResponseBody
    public ResponseResult validatePay(@RequestParam String ids[], @RequestParam Integer operateType, Model model) {
        LOGGER.info("================操作退款/付款前验证是否符合条件 ====================ids=" + ids.toString() + "operateType=" + operateType);
        ResponseResult result = new ResponseResult();
        try {
            Map<String, Object> resultMap = new HashMap<String, Object>();
            //对账单付款
            if (PayEnum.STATEMENT_ONE.getCode().equals(operateType) || PayEnum.STATEMENT_MORE.getCode().equals(operateType)) {
                resultMap = paymentStatementService.validatePay(ids, operateType);
            } else {
                resultMap = rpbService.validatePayHtml(ids, operateType);
            }
            result.setSuccess(Boolean.valueOf(resultMap.get("success").toString()));
            result.setMessage(resultMap.get("message").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @param paymentId
     * @param type
     * @param payChannel
     * @param model
     * @return
     * @Description: 支付
     * @Author: 柯军
     * @datetime:2015年7月12日下午1:23:16
     **/
    @SuppressWarnings("unchecked")
    @RequestMapping("/pay")
    public String pay(@RequestParam String paymentId, @RequestParam Integer type, @RequestParam Integer payChannel, Model model, HttpSession session, HttpServletRequest request) {
        LOGGER.info("支付开始 pay,paymentId={}，type={}，payChannel={}",paymentId,type,payChannel);
        try {

            UserInfo userInfo = this.getSessionUser(request, session);
            MessageEvent messageEvent = getMessageEvent(type, payChannel, paymentId, getDesc(type),userInfo);
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
     * @param paymentId
     * @param model
     * @return
     * @Description: 微信手动退款操作
     * @Author: 柯军
     * @datetime:2015年7月12日下午1:23:47
     **/
    @RequestMapping("/weixinRefund")
    @ResponseBody
    public ResponseResult weixinRefund(@RequestParam Integer paymentId, Model model) {
        LOGGER.info("================微信手动操作退款====================paymentId=" + paymentId);
        ResponseResult result = new ResponseResult();
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
     * @param paymentId
     * @param refundRejected
     * @param model
     * @return
     * @Description: 微信退款拒绝/同意操作
     * @Author: 柯军
     * @datetime:2015年8月28日上午10:58:17
     **/
    @RequestMapping("/refundRejected")
    @ResponseBody
    public ResponseResult weixinRefundRejected(@RequestParam Integer paymentId, @RequestParam Integer refundRejected, Model model) {
        LOGGER.info("================微信退款" + (refundRejected == 0 ? "同意" : "拒绝") + "操作====================");
        ResponseResult result = new ResponseResult();
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
        else if (PayEnum.STATEMENT_ONE.getCode() == type || PayEnum.STATEMENT_MORE.getCode() == type)
            desc = ConstantEnum.TRADE_TYPE_STATEMENT.getValueStr();
        return desc;
    }

    private MessageEvent getMessageEvent(Integer operateType, Integer payChannel, String paymentId, String desc, UserInfo userInfo) {
        MessageEvent event = new MessageEvent();
        Map<String, Object> bodyMap = new HashMap<String, Object>();
        bodyMap.put("paymentId", paymentId);// 多个id用逗号分隔
        bodyMap.put("operateType", operateType);
        bodyMap.put("desc", desc);
        bodyMap.put("userId",userInfo.getUsername());
        event.setBody(bodyMap);
        event.setSource(ConstantEnum.MESSAGE_EVENT_TMS.getCodeStr());
        event.setTarget(ConstantEnum.MESSAGE_EVENT_RPB.getCodeStr());
        event.setTimestamp(DateUtil.getCurrDateTime().getTime());
        event.setType(PaymentEventType.OUTER_TO_PAY);
        return event;
    }

    /**
     * @param session
     * @param request
     * @return
     * @Description: 验证用户账号合法性
     * @Author: 柯军
     * @datetime:2015年6月4日下午6:38:30
     **/
    @RequestMapping(value = "/validateAccount")
    @ResponseBody
    public ResponseResult validateAccount(String ids, HttpSession session, HttpServletRequest request) {
        ResponseResult result = new ResponseResult();
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
        result.setSuccess(true);
        return result;
    }

    /**
     * @param model
     * @param request
     * @param response
     * @param session
     * @return
     * @Description: 对账单列表
     * @Author: 柯军
     * @datetime:2015年9月30日下午4:18:33
     **/
    @RequestMapping("/statementList")
    public String statementList(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        try {
            LOGGER.info("----statement list ------");
            Map<String, Object> map = getJsonMap(request);
            String currpage = (String) map.get("currpage");
            List<Byte> statusList = new ArrayList<Byte>();
            statusList.add(ConstantEnum.STATEMENT_STATUE_6.getCodeByte());
            statusList.add(ConstantEnum.STATEMENT_STATUE_9.getCodeByte());
            statusList.add(ConstantEnum.STATEMENT_STATUE_10.getCodeByte());
            statusList.add(ConstantEnum.STATEMENT_STATUE_11.getCodeByte());
            map.put("statusList", statusList);
            List<PaymentStatementDto> list = validateBillAllowOpPay(paymentStatementService.selectPageList(map, Integer.valueOf(currpage), Constant.PAGE.PAGESIZE));
            double pageTotle = paymentStatementService.selectPageListCount(map);
            Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
            model.addAttribute("rowCont", rowContNum);
            model.addAttribute("currpage", currpage);
            model.addAttribute("list", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/pay/statement_list";
    }

    /**
     * @param paymentIds   付款单id
     * @param statementIds 对账单id
     * @return
     * @Description: 线下付款更新状态
     * @Author: 柯军
     * @datetime:2015年9月30日下午4:31:25
     **/
    @RequestMapping("/statementOffPay")
    @ResponseBody
    public ResponseResult statementOffPay(@RequestParam String paymentIds, @RequestParam String statementIds, @RequestParam String tradeNo) {
        ResponseResult responseResult = new ResponseResult();
        try {
            String[] paymentIdsArray = paymentIds.split(",");
            String[] statementIdsArray = statementIds.split(",");
            paymentStatementService.updateByOffPay(paymentIdsArray, statementIdsArray, tradeNo, ConstantEnum.STATEMENT_STATUE_12.getCodeInt());
            responseResult.setSuccess(true);
            responseResult.setMessage("操作成功");
        } catch (Exception e) {
            responseResult.setSuccess(false);
            responseResult.setMessage("操作失败");
            e.printStackTrace();
        }

        return responseResult;
    }

    /**
     * @param status
     * @return
     * @Description: 冻结/解冻付款
     * @Author: 柯军
     * @datetime:2015年9月30日下午5:39:03
     **/
    @RequestMapping("/freeze")
    @ResponseBody
    public ResponseResult freeze(@RequestParam String statementIds, @RequestParam Integer status) {
        ResponseResult responseResult = new ResponseResult();
        try {
            String[] statementIdsArray = statementIds.split(",");
            paymentStatementService.updateByOffPay(null, statementIdsArray, null, status);
            responseResult.setSuccess(true);
            responseResult.setMessage((status == 9 ? "冻结" : "解冻") + "成功");
        } catch (Exception e) {
            responseResult.setSuccess(false);
            responseResult.setMessage("操作失败");
            e.printStackTrace();
        }

        return responseResult;
    }

    /**
     * @Description:检查对账单是否允许用户再次操作
     * @param:
     * @Author:  柯军
     **/

    private  List<PaymentStatementDto> validateBillAllowOpPay( List<PaymentStatementDto> list){
        Integer rePayTime = 10;
        try{
            rePayTime = Integer.valueOf(propertyConfigurer.getProperty("RE_PAY_TIME"));
        }catch (Exception e){
            LOGGER.error("获取重新支付时间间隔失败，设置默认值rePayTime={}", rePayTime);
        }
//        for (PaymentStatementDto paymentStatementDto : list){
//            if(paymentStatementDto.getOpTime() != null && DateUtil.dateDiff(paymentStatementDto.getOpTime(), DateUtil.getCurrDateTime()) < rePayTime){
//                paymentStatementDto.setRePay(false);
//            }
//        }
        return list;
    }

    /**
     * @Description:检查是否允许用户再次操作
     * @param:
     * @Author:  柯军
     **/

    private List<TradeVO> validateAllowOpPay(List<TradeVO> list){
        Integer rePayTime = 10;
        try{
            rePayTime = Integer.valueOf(propertyConfigurer.getProperty("RE_PAY_TIME"));
        }catch (Exception e){
            LOGGER.error("获取重新支付时间间隔失败，设置默认值rePayTime={}", rePayTime);
        }
//        for (TradeVO tradeVO : list){
//            if(tradeVO.getOpTime() != null && DateUtil.dateDiff(tradeVO.getOpTime(), DateUtil.getCurrDateTime()) < rePayTime){
//                tradeVO.setRePay(false);
//            }
//        }
        return list;
    }

    /**
     * @param paymentId
     * @param refundRejected
     * @param model
     * @return
     * @Description: 异常交易取消付款
     * @Author: 柯军
     * @datetime:2015年8月28日上午10:58:17
     **/
    @RequestMapping("/excePayCancel")
    @ResponseBody
    public ResponseResult excePayCancel(@RequestParam Integer paymentId, @RequestParam Integer refundRejected, Model model) {
        LOGGER.info("异常交易取消付款 excePayCancel paymentId={},refundRejected={}",paymentId,refundRejected);
        ResponseResult result = new ResponseResult();
        try {
//            Map<String, Object> resultMap = rpbService.exceCancelPay(paymentId, refundRejected);
//            result.setSuccess(Boolean.valueOf(resultMap.get("success").toString()));
//            result.setMessage(resultMap.get("message").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
