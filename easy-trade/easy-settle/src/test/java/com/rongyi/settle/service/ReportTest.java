package com.rongyi.settle.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.rongyi.rss.settle.PaymentStatementGenerateService;
import com.rongyi.settle.BaseTest;

/**
 * Created by kejun on 2015/12/8.
 */
public class ReportTest extends BaseTest{

    @Autowired
    @Qualifier("paymentStatementGenerateServiceImpl")
    private PaymentStatementGenerateService paymentStatementService;


    @Test
    public void sendEmailTest(){
    	try {
			paymentStatementService.generateForSchedule();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
