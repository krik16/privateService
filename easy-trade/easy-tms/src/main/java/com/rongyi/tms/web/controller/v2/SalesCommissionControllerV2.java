package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.SalesCommissionService;
import com.rongyi.tms.web.controller.SalesCommissionController;
import com.rongyi.tms.web.controller.param.VerifyCommissionParam;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 佣金相关Controller
 * Created by hebo on 2016/2/26.
 */
@Controller
@RequestMapping("/v2/salesCommission")
public class SalesCommissionControllerV2 {
    Logger logger = LoggerFactory.getLogger(SalesCommissionController.class);

    @Autowired
    private SalesCommissionService salesCommissionService;

    @RequestMapping("/expandList")
    @ResponseBody
    public ResponseData findExpandList(@RequestBody Map<String, Object> map) {
        ResponseData result;
        try {
            logger.info("findExpandList begin paramMap={}", map);
            if (!map.containsKey("currentPage") || !map.containsKey("searchType")){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            map.put("pageSize", Constant.PAGE.PAGESIZE);
            map.put("type", ConstantEnum.COMMISSION_TYPE_0.getCodeInt());
            int currentPage = map.containsKey("currentPage")?Integer.valueOf(map.get("currentPage").toString()):1;
            map.put("startRecord", (currentPage-1)*Constant.PAGE.PAGESIZE);
            List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);
            int totalAccount = salesCommissionService.countCommission(map);
            result = ResponseData.success(list, currentPage,Constant.PAGE.PAGESIZE, totalAccount);
            logger.info("findExpandList end");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

    @RequestMapping("/firstOrderList")
    @ResponseBody
    public ResponseData findFirstOrderList(@RequestBody Map<String, Object> map) {
        ResponseData result;
        try {
            logger.info("findFirstOrderList begin paramMap={}", map);
            if (!map.containsKey("currentPage") || !map.containsKey("searchType")){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            map.put("pageSize", Constant.PAGE.PAGESIZE);
            map.put("type", ConstantEnum.COMMISSION_TYPE_1.getCodeInt());
            int currentPage = map.containsKey("currentPage")?Integer.valueOf(map.get("currentPage").toString()):1;
            map.put("startRecord", (currentPage-1)*Constant.PAGE.PAGESIZE);
            List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);
            int totalAccount = salesCommissionService.countCommission(map);
            result = ResponseData.success(list, currentPage,Constant.PAGE.PAGESIZE, totalAccount);
            logger.info("findFirstOrderList end");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(HttpServletRequest request) {
        ResponseData result;
        try {
            Integer id = Integer.valueOf(request.getParameter("id"));
            logger.info("detail begin id={}", id);
            if (id == null){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            SalesCommissionVO salesCommissionVO = salesCommissionService.getCommissionDetail(id);
            result = ResponseData.success(salesCommissionVO);
            logger.info("detail end");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

    @RequestMapping("/verify")
    @ResponseBody
    public ResponseData verifyCommission(@RequestBody VerifyCommissionParam param) {
        ResponseData result;
        try {
            logger.info("verifyCommission begin param={}", param);
            if (StringUtils.isBlank(param.getIds()) || param.getStatus()==null
                    || (param.getStatus()<0 && StringUtils.isBlank(param.getDesc()))){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            if (salesCommissionService.verifyCommission(param, "test"))
                result = ResponseData.success();
            else
                result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_UPDATE.getActionCode()), CodeEnum.ERROR_UPDATE.getMessage());
            logger.info("verifyCommission end");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

}
