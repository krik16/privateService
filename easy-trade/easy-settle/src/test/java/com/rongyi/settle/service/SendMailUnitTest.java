package com.rongyi.settle.service;

import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.settle.BaseTest;
import com.rongyi.settle.mapper.PaymentStatementMapper;
import com.rongyi.settle.unit.SendEmailUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

/**
 * Created by kejun on 2015/12/8.
 */
public class SendMailUnitTest extends BaseTest{

    @Autowired
    @Qualifier("sendEmailUnit")
    SendEmailUnit sendEmailUnit;

//    @Autowired
//    private  PaymentStatementMapper paymentStatementMapper;

//    @Test
    public void sendEmailTest(){
//        PaymentStatementDto paymentStatementDto = paymentStatementMapper.searchDtoById(1);
        PaymentStatementDto paymentStatementDto =new PaymentStatementDto();
        sendEmailUnit.sendMail(paymentStatementDto);
    }
}
