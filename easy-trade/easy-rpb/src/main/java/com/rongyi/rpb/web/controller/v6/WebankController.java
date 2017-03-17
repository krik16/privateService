package com.rongyi.rpb.web.controller.v6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 微众通知处理
 * Created by sujuan on 2017/3/16.
 */
@Controller
@RequestMapping("/webank")
public class WebankController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebankController.class);

    @RequestMapping("statementDown")
    public void statementDown(HttpServletRequest request) {
        LOGGER.info("微众对账单通知下载");
        try {
            Map map =  request.getParameterMap();
            LOGGER.info("微众对账单通知下载map:{}",map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
