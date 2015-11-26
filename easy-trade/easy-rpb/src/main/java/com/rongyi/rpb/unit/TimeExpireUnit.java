package com.rongyi.rpb.unit;

import com.rongyi.core.common.util.DateUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * Created by kejun on 2015/11/17.
 * 支付失效时间检查
 */
@Component
public class TimeExpireUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(TimeExpireUnit.class);

    /**
     * @Description: 支付宝支付超时时间获取
     * @param: timeStart
     * @param: timeExpire
     * @Author: 柯军
     **/

    public String aliPayTimeExpire(String timeStart, String timeExpire) {
        //默认支付失效时间是30分钟
        String itBPay = "30m";
        try {
            if (StringUtils.isEmpty(timeStart) || StringUtils.isEmpty(timeExpire)) {
                LOGGER.info("支付宝支付失效时间参数不合法,timeStart={},timeExpire={}", timeStart, timeExpire);
            } else if (DateUtil.dateDiff(DateUtil.stringToDate(timeStart), DateUtil.stringToDate(timeExpire)) < 1) {
                LOGGER.info("支付宝支付失效时间小于1分钟，属于无效条件，timeStart={},timeExpire={}", timeStart, timeExpire);
            } else if (DateUtil.dateDiff(DateUtil.stringToDate(timeStart), DateUtil.stringToDate(timeExpire)) > (15 * 24 * 60)) {
                LOGGER.info("支付宝支付失效时间大于15天，属于无效条件，timeStart={},timeExpire={}", timeStart, timeExpire);
            } else {
                itBPay = String.valueOf(DateUtil.dateDiff(DateUtil.stringToDate(timeStart), DateUtil.stringToDate(timeExpire)));
            }
        } catch (Exception e) {
            LOGGER.warn("支付宝支付失效时间参数不合法,忽略，返回默认值,timeStart={},timeExpire={},exception={}", timeStart, timeExpire,e.getMessage());
        }
        return itBPay;
    }

    /**
     * @Description: 微信支付超时时间获取
     * @param:
     * @Author: 柯军
     **/

    public String weixinPayTimeExpire(String timeStart, String timeExpire) {

        try {
            if (StringUtils.isEmpty(timeStart) || StringUtils.isEmpty(timeExpire)) {
                LOGGER.info("微信支付失效时间参数不合法,默认给予失效时间为30分钟，timeStart={},timeExpire={}", timeStart, timeExpire);
                timeStart = DateUtil.getCurrDateTime().toString();
                timeExpire = DateUtil.dateToString(DateUtil.addTime(DateUtil.stringToDate(timeStart), 30, Calendar.MINUTE), "yyyyMMddHHmmss");
            } else if (DateUtil.dateDiff(DateUtil.stringToDate(timeStart), DateUtil.stringToDate(timeExpire)) < 5) {
                LOGGER.info("微信支付失效时间间隔小于5分钟，默认给予失效时间为5分钟，timeStart={},timeExpire={}", timeStart, timeExpire);
                timeExpire = DateUtil.dateToString(DateUtil.addTime(DateUtil.stringToDate(timeStart), 5, Calendar.MINUTE), "yyyyMMddHHmmss");
            } else if (DateUtil.dateDiff(DateUtil.stringToDate(timeStart), DateUtil.stringToDate(timeExpire)) > (15 * 24 * 60)) {
                LOGGER.info("微信支付失效时间大于15天，属于无效条件，默认给予失效时间为30分钟，timeStart={},timeExpire={}", timeStart, timeExpire);
                timeExpire = DateUtil.dateToString(DateUtil.addTime(DateUtil.stringToDate(timeStart), 30, Calendar.MINUTE), "yyyyMMddHHmmss");
            }
            return  DateUtil.dateToString(DateUtil.stringToDate(timeExpire),"yyyyMMddHHmmss");
        } catch (Exception e) {
            LOGGER.warn("微信支付失效时间参数不合法,忽略，返回默认值,timeStart={},timeExpire={},exception={}", timeStart, timeExpire, e.getMessage());
        }
        //默认支付失效时间是30分钟
        return DateUtil.dateToString(DateUtil.addTime(DateUtil.getCurrDateTime(), 30, Calendar.MINUTE), "yyyyMMddHHmmss");
    }
}
