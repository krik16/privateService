package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 佣金相关Controller
 * Created by hebo on 2016/2/26.
 */
@Controller
@RequestMapping("/salesCommissionV2")
public class SalesCommissionController {
    Logger logger = LoggerFactory.getLogger(SalesCommissionController.class);

    @RequestMapping("/expandList")
    @ResponseBody
    public ResponseData findExpandList(@RequestBody Map<String, Object> map) {
        try {
            logger.info("findExpandList begin paramMap={}", map);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
