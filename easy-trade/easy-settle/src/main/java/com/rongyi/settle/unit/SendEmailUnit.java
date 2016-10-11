package com.rongyi.settle.unit;


import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.settle.mail.MailService;
import com.rongyi.settle.util.DateUtils;
import com.rongyi.settle.util.ReportFilesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 发送对账单邮件
 * Created by kejun on 2015/12/08.
 */

@Component
public class SendEmailUnit {

    @Autowired
    MailService mailService;

    @Autowired
    PropertyConfigurer propertyConfigurer;


    private static final Logger LOGGER = LoggerFactory.getLogger(SendEmailUnit.class);

    /**
     * @Description: 异步发送邮件
     * @param:
     * @Author:  柯军
     **/

    public void sendMailNysn(final PaymentStatementDto paymentStatementDto) {
        final Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sendMail(paymentStatementDto);
                } catch (Exception e) {
                    LOGGER.error("对账单邮件发送失败");
                    e.printStackTrace();
                }

            }
        };
        thread.start();
    }

    public void sendMail(PaymentStatementDto paymentStatementDto) {
        LOGGER.info("paymentStatementDto={}",paymentStatementDto);
        StringBuffer sb = new StringBuffer();
        sb.append("您好:\n");
        sb.append(" ");
        sb.append("附件为");
        sb.append(DateUtil.dateToString(paymentStatementDto.getCycleStartTime()));
        sb.append("至");
        sb.append(DateUtil.dateToString(paymentStatementDto.getCycleEndTime()));
        sb.append("的对账单，请您查收。");
        sb.append("如无问题,请您及时登录商家后台确认。");
        try {
            String fileName = ReportFilesUtil.getSettlememtExcelFilePath(paymentStatementDto.getBussinessName(),paymentStatementDto.getCycleStartTime(),propertyConfigurer,paymentStatementDto.getBussinessId(),paymentStatementDto.getRuleCode());
            LOGGER.info("发送对账单邮件，收件人列表={},fileName={}", paymentStatementDto.getBussinessEmail(),fileName);
            List<String> fileNameList = new ArrayList<String>();
            fileNameList.add(fileName);
            mailService.sendAttachmentEmail("商户对账单", propertyConfigurer.getProperty("SEND_ADDRESS"), getToAddress(paymentStatementDto.getBussinessEmail()), sb.toString(), fileNameList);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description: 获取收件人地址
     * @param:
     * @Author: 柯军
     **/

    private Set<String> getToAddress(String address) {
        String[] arrays = address.split(";");
        return new HashSet(Arrays.asList(arrays));
    }

    /**
     * @Description:获取附件路径名称
     * @param:
     * @Author: 柯军
     **/

    private List<String> getFileName(PaymentStatementDto paymentStatementDto) {
        StringBuilder sb = new StringBuilder();
        sb.append(propertyConfigurer.getProperty("settle.file.path"));
        sb.append(paymentStatementDto.getBussinessId());
        sb.append("/");
        sb.append("容易网商户对账单-");
        sb.append(paymentStatementDto.getBussinessName());
        sb.append(DateUtils.getDateStr(paymentStatementDto.getCycleStartTime()));
        sb.append(".xlsx");
        List<String> fileNameList = new ArrayList<String>();
        fileNameList.add(sb.toString());
        return fileNameList;
    }
}
