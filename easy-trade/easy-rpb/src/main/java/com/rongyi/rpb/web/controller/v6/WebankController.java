package com.rongyi.rpb.web.controller.v6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
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

            String sign = request.getParameter("sign");
            String nonce = request.getParameter("nonce");
            String timestamp = request.getParameter("timestamp");
            LOGGER.info("sign:{},nonce:{},timestamp:{}",sign,nonce,timestamp);
            String body = request.getParameter("body");
            LOGGER.info("body:{}",body);
            String Body = request.getParameter("Body");
            LOGGER.info("Body:{}",Body);
            String jsonString = request.getParameter("JsonString");
            LOGGER.info("jsonString:{}", jsonString);



            Enumeration e =  request.getAttributeNames();
            LOGGER.info("e:{}",e);
            Object sign1 = request.getAttribute("sign");
            Object nonce1 = request.getAttribute("nonce");
            Object timestamp1 = request.getAttribute("timestamp");
            LOGGER.info("sign1:{},nonce1:{},timestamp1:{}",sign1,nonce1,timestamp1);
            Object body1 = request.getAttribute("body");
            LOGGER.info("body1:{}",body1);
            Object Body1 = request.getAttribute("Body");
            LOGGER.info("Body1:{}",Body1);
            Object jsonString1 = request.getAttribute("JsonString");
            LOGGER.info("jsonString1:{}", jsonString1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
