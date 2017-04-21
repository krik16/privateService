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
 * 2017/4/14 15:13
 **/
@Controller
@RequestMapping("/tianyi")
public class TianyiController {

    private static final Logger log = LoggerFactory.getLogger(TianyiController.class);

    @Autowired
    PayNotifyBizz payNotifyBizz;

    /**
     * 天翼退款通知
     */
    @RequestMapping("/h5pay/notify")
    public void payNotify(HttpServletRequest request,HttpServletResponse response) {
        log.info("翼支付h5支付通知处理开始");
        try {
            Map<String, String> map = Utils.getRequestParams(request);
            payNotifyBizz.tianyiH5payNotify(map);
            response.getWriter().print("UPTRANSEQ_"+map.get("UPTRANSEQ"));
            log.info("翼支付h5支付通知处理结束");
        } catch (Exception e) {
            log.error("翼支付h5支付通知处理失败e={}", e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * 天翼退款通知
     */
    @RequestMapping("/refund/notify")
    public void notify(HttpServletRequest request,HttpServletResponse response) {
        log.info("翼支付退款通知处理开始");
        try {
            Map<String, String> map = Utils.getRequestParams(request);
            payNotifyBizz.tianyiRefundNotify(map);
            response.getWriter().print(map.get("ourTransNo"));
            log.info("翼支付退款通知处理结束");
        } catch (Exception e) {
            log.error("翼支付退款通知处理失败e={}", e.getMessage());
            e.printStackTrace();
        }

    }

}
