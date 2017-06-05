package com.rongyi.rpb.web.controller.v6;

import com.rongyi.rpb.bizz.PayNotifyBizz;
import com.rongyi.rpb.bizz.StatementBizz;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * 微众通知处理
 * Created by sujuan on 2017/3/16.
 */
@Controller
@RequestMapping("/webank")
public class WebankController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebankController.class);
    @Autowired
    PayNotifyBizz payNotifyBizz;
    @Autowired
    StatementBizz statementBizz;

    /**
     * 微众支付宝扫码支付异步通知
     */
    @RequestMapping("/pay/notify")
    public void alipayNotify(HttpServletRequest request, HttpServletResponse response ,@RequestBody Map<String,String> paramMap) {
        LOGGER.info("微众支付宝扫码支付异步通知start");
        try {
//            Map<String, String> map = Utils.getRequestParams(request);
            payNotifyBizz.webankAlipayNotify(paramMap);
            response.getWriter().print("ok");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("微众支付宝扫码支付异步通知处理异常");
        }
    }

    /**
     * 微众微信公众号支付异步通知
     */
    @RequestMapping("/wechat/pay/notify")
    public void wechatNotify(HttpServletRequest request, HttpServletResponse response ) {
        LOGGER.info("微众微信公众号支付异步通知start");
        try {
            // 获取请求参数
            InputStream inStream ;
            String resultJson ;
                inStream = request.getInputStream();
                ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while ((len = inStream.read(buffer)) != -1) {
                    outSteam.write(buffer, 0, len);
                }
                outSteam.close();
                inStream.close();
                resultJson = new String(outSteam.toByteArray(), "utf-8");
            System.out.println("#######微众微信支付回调请求参数：#######" + resultJson);
                Map<String,String> map =(Map<String,String>) JSONObject.fromObject(resultJson);
            payNotifyBizz.webankWechatNotify(map);
            response.getWriter().print("{\"return_msg\":\"OK\",\"return_code\":\"SUCCESS\"}");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("微众微信公众号支付异步通知处理异常");
        }
    }

    @RequestMapping("/statementDown")
    public void statementDown(HttpServletRequest request) {
        LOGGER.info("微众对账单通知下载");
        try {
            // 获取请求参数
            InputStream inStream ;
            String resultJson ;
            inStream = request.getInputStream();
            ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inStream.read(buffer)) != -1) {
                outSteam.write(buffer, 0, len);
            }
            outSteam.close();
            inStream.close();
            resultJson = new String(outSteam.toByteArray(), "utf-8");
            LOGGER.info("微众对账单通知下载map:{}", resultJson);
            JSONObject jsonObject = JSONObject.fromObject(resultJson);
            final JSONObject data = JSONObject.fromObject(jsonObject.getString("data"));
            this.validStatmentDown(data);

            // 下载对账单，并将对账单发给运营人员
            statementBizz.synStatementFile(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * @Description 校验微众参数 
     * @param data
     */
    private void validStatmentDown(JSONObject data) {
        String app_id = data.getString("app_id");
        String file_id = data.getString("file_id");
        String token = data.getString("token");
        String workDate = data.getString("work_date");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date yes = calendar.getTime();
        String yesDate = format.format(yes);
        LOGGER.info("yesDate={}",yesDate);
        if (StringUtils.isBlank(app_id) || StringUtils.isBlank(file_id)
              || StringUtils.isBlank(token) || StringUtils.isBlank(workDate)
                ||!yesDate.equals(workDate)) {
          throw new RuntimeException("微众回调接口参数异常, paramMap = " + data.toString());
        }
    }
}
