package com.rongyi.tms.service.v2;

import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.tms.BaseTest;
import com.rongyi.tms.constants.ConstantEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hebo on 2016/2/29.
 */
public class SalesCommissionServiceIMplTest extends BaseTest{

    @Autowired
    private SalesCommissionService salesCommissionService;

    @Test
    public void testFindCommissionList(){
        Map<String,Object> map = new HashMap<>();
        map.put("startRecord", 0);
        map.put("pageSize", 5);
        map.put("type", ConstantEnum.COMMISSION_TYPE_0.getCodeInt());
        map.put("searchType", 1);
        System.out.println("============>>>>>>>>>>>>>>>>> map"+map);
        List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);
        System.out.println("============>>>>>>>>>>>>>>>>> list"+list);
    }

}
