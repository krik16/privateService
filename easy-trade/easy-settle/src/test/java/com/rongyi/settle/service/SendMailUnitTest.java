package com.rongyi.settle.service;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.settle.BaseTest;
import com.rongyi.settle.unit.SendEmailUnit;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by kejun on 2015/12/8.
 */
public class SendMailUnitTest extends BaseTest{

    @Autowired
    @Qualifier("sendEmailUnit")
    SendEmailUnit sendEmailUnit;


    @Test
    public void sendEmailTest(){
        PaymentStatementDto paymentStatementDto = new PaymentStatementDto();
        paymentStatementDto.setBussinessEmail("kejun@rongyi.com");
        paymentStatementDto.setCycleStartTime(DateUtil.stringToDate("2015-10-30 00:00:00"));
        paymentStatementDto.setCycleEndTime(DateUtil.stringToDate("2015-10-30 23:59:59"));
        paymentStatementDto.setBatchNo("BSR1510260083");
        paymentStatementDto.setBussinessId("51f9da2831d65584ab0022a7");
        paymentStatementDto.setBussinessName("哈根达斯");
        sendEmailUnit.sendMail(paymentStatementDto);
    }
}
