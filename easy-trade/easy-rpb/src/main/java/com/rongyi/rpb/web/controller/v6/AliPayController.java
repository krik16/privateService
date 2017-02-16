package com.rongyi.rpb.web.controller.v6;

import com.rongyi.pay.core.ali.utils.Utils;
import com.rongyi.rpb.bizz.PayNotifyBizz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * conan
 * 2016/11/9 17:05
 **/
@Controller
@RequestMapping("/v6/ali")
public class AliPayController {

    @Autowired
    PayNotifyBizz payNotifyBizz;
    private static final Logger LOGGER = LoggerFactory.getLogger(AliPayController.class);

    /**
     * 支付宝支付通知
     */
    @RequestMapping("/pay/notify")
    public void notify(HttpServletRequest request,HttpServletResponse response) {
        try {
            Map<String, String> map = Utils.getRequestParams(request);
            LOGGER.info("支付宝异步通知处理开始,map={}", map);
            payNotifyBizz.aliPayNotify(map);
            response.getWriter().print("success");
            LOGGER.info("支付宝异步通知处理结束");
        } catch (Exception e) {
            LOGGER.error("微信支付异步通知处理失败e={}", e.getMessage());
            e.printStackTrace();
        }

    }
}
