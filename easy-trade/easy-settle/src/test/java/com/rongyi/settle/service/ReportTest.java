package com.rongyi.settle.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rongyi.settle.BaseTest;
import com.rongyi.settle.service.impl.PaymentStatementServiceImpl;

/**
 * Created by kejun on 2015/12/8.
 */
public class ReportTest extends BaseTest{

//    @Autowired
//    @Qualifier("paymentStatementGenerateServiceImpl")
//    private PaymentStatementGenerateService paymentStatementService;
    
    @Autowired
    private PaymentStatementServiceImpl paymentStatementService2;


    @Test
    public void sendEmailTest(){
    	try {
//			paymentStatementService.generateForSchedule();
    		paymentStatementService2.generate(952, "admin");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
