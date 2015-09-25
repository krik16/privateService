/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月21日上午11:15:53
 * @Description: TODO
 **/

package com.rongyi.settle.web.controller;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.service.PaymentStatementService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: 柯军
 * @Description: 对账单列表
 * @datetime:2015年9月21日上午11:15:53
 *
 **/
@Controller
@RequestMapping("/paymentStatement")
public class PaymentStatementController {

    Logger logger = LoggerFactory.getLogger(PaymentStatementController.class);

    @Autowired
    private PaymentStatementService paymentStatementService;

    /**
     * @Description: 对账单列表（包括所有列表，审核列表，商家对账单列表）
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:01:04
     **/
    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(@RequestBody Map<String, Object> map) {
        try {
            Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
            Integer searchType = Integer.valueOf(map.get("searchType").toString());
            Integer searchStatus = Integer.valueOf(map.get("searchStatus").toString());
            if (searchType == 0) {//查询对账单列表
                if (searchStatus == 0) {
                    map.put("searchStatus", null);
                } else map.put("searchStatus", 5);
            } else if (searchType == 1) {//查询对账单审核列表
                if (searchStatus == 0) {
                    map.put("searchStatus", 0);
                } else map.put("searchStatus", 3);
            } else if (searchType == 2) {//查询待付款列表
                if (searchStatus == 0) {
                    map.put("searchStatus", 4);
                } else map.put("searchStatus", 6);
            } else if (searchType == 3) {//查询付款列表
                map.put("searchStatus", 6);
            } else if (searchType == 4) {//查询付款记录列表
                map.put("searchStatus", 11);
            }
            List<PaymentStatementDto> list = paymentStatementService.selectPageList(map, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt());
            Integer count = paymentStatementService.selectPageListCount(map);
            return ResponseData.success(list, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failure(CodeEnum.FIAL_STATEMENT_LIST.getCodeInt(), CodeEnum.FIAL_STATEMENT_LIST.getValueStr());
        }
    }

    /**
     * @Description: 生成对账单
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:02:46
     **/
    @RequestMapping("/generate")
    public ResponseData generate(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 对账单明细
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:02:58
     **/
    @RequestMapping("/info")
    public ResponseData info(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 对账单审核（代付款）
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:03:17
     **/
    @RequestMapping("/verify")
    public ResponseData verify(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        ResponseData result = null;
        try {
            logger.info("============ 对账/代付款批量审核 =============");
            String idStr = map.containsKey("ids") ? map.get("ids").toString() : null;
            Integer status = map.containsKey("status") ? Integer.valueOf(map.get("status").toString()) : null;
            if (StringUtils.isBlank(idStr) || status==null){
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt()
                        ,CodeEnum.FIAL_PARAMS_ERROR.getValueStr()) ;
            }
            List<Integer> ids = new ArrayList<>();
            for (String id : idStr.split(",")){
                ids.add(Integer.valueOf(id.trim()));
            }
            if (paymentStatementService.updatePaymentStatusByIds(ids, status)) {
                result = ResponseData.success();
            }else{
                result = ResponseData.failure(CodeEnum.FIAL_UPDATE_PAYMENT.getCodeInt()
                        ,CodeEnum.FIAL_UPDATE_PAYMENT.getValueStr());
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        logger.info(result.toString());
        return result;
    }

    /**
     * @Description: 导出对账单明细（财务操作）
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:03:26
     **/
    @RequestMapping("/exportFinanceExcel")
    public ResponseData exportFinanceExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 作废
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:04:09
     **/
    @RequestMapping("/invalid")
    public ResponseData invalid(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 商品订单查询(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:04:23
     **/
    @RequestMapping("/merchandiseList")
    public ResponseData merchandiseList(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 导出商品订单明细(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:04:46
     **/
    @RequestMapping("exportMerchandiseExcel")
    public ResponseData exportMerchandiseExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 优惠券订单查询(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:05:09
     **/
    @RequestMapping("/couponList")
    public ResponseData couponList(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * @Description: 导出优惠券订单明细(商家操作)
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:05:30
     **/
    @RequestMapping("exportCouponExcel")
    public ResponseData exportCouponExcel(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        return null;
    }

}

