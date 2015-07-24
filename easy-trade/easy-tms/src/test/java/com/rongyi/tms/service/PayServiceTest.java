/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日下午6:36:36
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.tms.BaseTest;

/**	
 * @Author:  柯军
 * @Description: TODO 
 * @datetime:2015年5月19日下午6:36:36
 *
 **/

public class PayServiceTest extends BaseTest{
    
    @Autowired
    PayService payService;
    
    @Autowired
    ROAMallService mallService;
    
    
//    @Test
    public void selectListTest(){
        payService.selectPayPageListCount(new HashMap<String, Object>());
        payService.selectPayPageList(new HashMap<String, Object>(), 1, 10);
    }
    
    @Test
    public void getMailListTest(){
        String keywords ="test";
        logger.info("keywords:"+keywords);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name", keywords);
        try{
            Map<String, Object> result = mallService.getMalls(map, 1, 10);
            System.err.println(result.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
