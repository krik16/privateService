package com.rongyi.tms.service.v2;

import com.rongyi.easy.tms.vo.v2.CommissionVO;
import com.rongyi.rss.tms.CommissionService;
import com.rongyi.tms.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/3/2 16:49
 **/
public class CommissionServiceImplTest extends BaseTest{

    @Autowired
    CommissionService commissionService;

    @Autowired
    SalesCommissionService salesCommissionService;

//    @Test
//    @Rollback(false)
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

    @Test
    public void testfindCommissionListForMallShop(){
//        ={startRecord=0, status=0, userId=1842, pageSize=3, currentPage=1, date=0}
        Map<String,Object> map = new HashMap<>();
        map.put("startRecord",0);
        map.put("userId",1842);
        map.put("pageSize",3);
        map.put("currentPage",1);
        map.put("date",0);
        map.put("searchType",7);
        map.put("type",1);
        salesCommissionService.findCommissionList(map);
    }
}
