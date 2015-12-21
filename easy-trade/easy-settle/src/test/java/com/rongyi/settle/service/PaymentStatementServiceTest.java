package com.rongyi.settle.service;

import com.rongyi.settle.BaseTest;
import com.rongyi.settle.constants.ConstantEnum;
import org.junit.Test;

/**
 * Created by kejun on 2015/12/8.
 */
public class PaymentStatementServiceTest extends BaseTest{

    @Test
    public void testStatus(){
        Integer status = 1;
        System.err.println("result="+(ConstantEnum.STATUS_1.getCodeInt().equals(status) || ConstantEnum.STATUS_3.getCodeInt().equals(status)));
    }

}
