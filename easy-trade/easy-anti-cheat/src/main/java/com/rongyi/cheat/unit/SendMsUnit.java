package com.rongyi.cheat.unit;

import com.rongyi.cheat.constants.Constant;
import com.rongyi.cheat.util.SmsUtil;
import com.rongyi.easy.cheat.AccountBlacklist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 发送黑名单短信通知
 * Created by kejun on 2015/10/27.
 */
@Component
public class SendMsUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(SendMsUnit.class);
    @Autowired
    SmsUtil smsUtil;

    public void sendBlackListMs(List<AccountBlacklist> mailWranList, Date startTime, Date endTime) {
        LOGGER.info("发送黑名单通知短信,startTime={},endTime={}",startTime,endTime);
        String phones = Constant.BLACKLIST_CONFIG.SEND_PHONE;
        for (AccountBlacklist accountBlacklist : mailWranList) {
            String payType = (accountBlacklist.getPayType() == 0) ? "支付宝" : "微信";
            String otherMessage = "";
            if (accountBlacklist.getCount() >= Integer.valueOf(Constant.BLACKLIST_CONFIG.FREEZE_COUNT)) {
                otherMessage = "此账号支付购买次数超出自动冻结上限,系统自动冻结该账号。";
            }
            smsUtil.sendMoreMsMessage(phones.split(","), accountBlacklist.getCount(), accountBlacklist.getPayAccount(), payType, startTime, endTime, otherMessage);
        } 
    }

}
