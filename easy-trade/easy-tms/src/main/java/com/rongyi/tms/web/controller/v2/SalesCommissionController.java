package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 佣金相关Controller
 * Created by hebo on 2016/2/26.
 */
@Controller
@RequestMapping("/v2/salesCommission")
public class SalesCommissionController {
    Logger logger = LoggerFactory.getLogger(SalesCommissionController.class);

    @Autowired
    private SalesCommissionService salesCommissionService;

    @RequestMapping("/expandList")
    @ResponseBody
    public ResponseData findExpandList(@RequestBody Map<String, Object> map) {
        ResponseData result = null;
        try {
            logger.info("findExpandList begin paramMap={}", map);
            if (!map.containsKey("currentPage") || !map.containsKey("searchType")){
                result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            map.put("pageSize", Constant.PAGE.PAGESIZE);
            map.put("type", ConstantEnum.COMMISSION_STATUS_0.getCodeInt());
            List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);
            int totalAccount = salesCommissionService.countCommission(map);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
