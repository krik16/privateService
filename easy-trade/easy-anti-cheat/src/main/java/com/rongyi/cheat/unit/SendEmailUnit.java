package com.rongyi.cheat.unit;

import com.rongyi.cheat.constants.Constant;
import com.rongyi.cheat.mail.MailService;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.cheat.AccountBlacklist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 发送黑名单邮件通知
 * Created by kejun on 2015/10/27.
 */

@Component
public class SendEmailUnit {

    @Autowired
    MailService mailService;

    private static final Logger LOGGER = LoggerFactory.getLogger(SendEmailUnit.class);

    public void sendWranEmail(List<AccountBlacklist> mailWranList, Date startTime, Date endTime) {
        StringBuffer sb = new StringBuffer();
        sb.append("以下账号存在刷单风险,在");
        sb.append(DateUtil.dateToString(startTime));
        sb.append("至");
        sb.append(DateUtil.dateToString(endTime));
        sb.append("此时间内:\n");
        for (AccountBlacklist accountBlacklist : mailWranList) {
            sb.append("账号：");
            sb.append(accountBlacklist.getPayAccount());
            sb.append(",账号类型：");
            sb.append((accountBlacklist.getPayType() == 0) ? "支付宝" : "微信");
            sb.append(",购买总数量：");
            sb.append(accountBlacklist.getCount());
            sb.append(";");
            if (accountBlacklist.getCount() >= Integer.valueOf(Constant.BLACKLIST_CONFIG.FREEZE_COUNT)) {//购买总数超出限定的自动冻结上限
                sb.append("此账号在此时间段支付购买超出自动冻结上限");
                sb.append(Constant.BLACKLIST_CONFIG.FREEZE_COUNT);
                sb.append(",");
                sb.append("系统自动进行冻结账号操作，如查明属于系统误操作，请解冻该账号");
            }
            sb.append("\n");
        }

        sb.append("黑名单列表访问地址:");
        sb.append(Constant.BLACKLIST_CONFIG.BLACKLIST_URL);
        try {
            LOGGER.info("发送报警邮件，收件人列表={}", getToAddress().toString());
            mailService.sendAttachmentEmail("刷单风险账号预警", Constant.BLACKLIST_CONFIG.SEND_ADDRESS, getToAddress(), sb.toString(), null);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private Set<String> getToAddress() {
        String toAddress = Constant.BLACKLIST_CONFIG.TO_ADDRESS;
        String[] arrays = toAddress.split(",");
        return new HashSet(Arrays.asList(arrays));
    }
}
