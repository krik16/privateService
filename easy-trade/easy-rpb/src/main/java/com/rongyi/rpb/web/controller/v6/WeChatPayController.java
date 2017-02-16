package com.rongyi.rpb.web.controller.v6;

import com.rongyi.pay.core.wechat.util.XMLParser;
import com.rongyi.rpb.bizz.PayNotifyBizz;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * conan
 * 2016/11/9 17:05
 **/
@Controller
@RequestMapping("/v6/wechat")
public class WeChatPayController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeChatPayController.class);

    @Autowired
    PayNotifyBizz payNotifyBizz;

    /**
     * @param request  request
     * @param response response
     *                 Description: V3版本微信支付异步通知
     **/
    @RequestMapping("/pay/notify")
    public void payNotify(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, String> requestMap = parseXml(request);
            LOGGER.info("微信支付异步通知开始,tradeNo={}", requestMap.get("transaction_id"));

            payNotifyBizz.wechatPayNotify(requestMap);

            Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("return_code", "SUCCESS");
            responseMap.put("return_msg", "OK");
            this.setResponse(response, responseMap);

            LOGGER.info("微信支付异步通知处理完成并成功通知response");
        } catch (Exception e) {
            LOGGER.error("微信支付异步通知处理失败e={}", e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 解析微信异步通知中的xml元素值
     **/
    @SuppressWarnings("unchecked")
    private static Map<String, String> parseXml(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        try {
            InputStream inputStream = request.getInputStream();
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputStream);
            Element root = document.getRootElement();
            List<Element> elementList = root.elements();
            for (Element e : elementList)
                map.put(e.getName(), e.getText());
            inputStream.close();
        } catch (Exception e) {
            LOGGER.error("解析微信返回结果xml失败");
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 支付通知处理成功通知微信服务器
     **/
    private void setResponse(HttpServletResponse response, Map<String, Object> responseMap) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        String xml = XMLParser.getXmlFormMap(responseMap, true);
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.append(xml);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
