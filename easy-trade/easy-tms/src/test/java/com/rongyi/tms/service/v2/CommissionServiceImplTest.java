package com.rongyi.tms.service.v2;

import com.rongyi.easy.tms.vo.v2.CommissionVO;
import com.rongyi.rss.tms.CommissionService;
import com.rongyi.tms.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/3/2 16:49
 **/
public class CommissionServiceImplTest extends BaseTest{

    @Autowired
    CommissionService commissionService;

    @Test
    @Rollback(false)
    public void addCommissionTest(){
        CommissionVO commissionVO = new CommissionVO();
        commissionVO.setType(1);
        commissionVO.setRegisterId("123");
        commissionVO.setCreateAt(new Date());
        commissionVO.setFinishAt(new Date());
        commissionVO.setRegisterPhone("12345678");
        commissionVO.setRegisterType(1);
        commissionVO.setOrderNo("123123123131");
        commissionService.addCommission(commissionVO);
    }
}
