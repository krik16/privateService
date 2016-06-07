package com.rongyi.tms.service.v2;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/3/2 16:49
 **/
public class CartOrderTest extends BaseTest {

    @Autowired
    IOrderQueryService iOrderQueryService;

    @Test
//    @Rollback(false)
    public void getPageDataList() throws Exception {
        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("orderNo", "1051047427841143108");
        getPageDataList(paramsMap);
    }

    private List<OrderManagerVO> getPageDataList(Map<String, Object> paramsMap) throws Exception {
        List<OrderManagerVO> orderForms = new ArrayList<>();
        int pageSize = 1000;
        int TOTAL_SIZE = paramsMap.containsKey("pageSize") ? Integer.valueOf(paramsMap.get("pageSize").toString()) : 5000;
        int currentPage = 1;
        for (int i = 0; i < TOTAL_SIZE / pageSize; i++) {
            paramsMap.put("pageSize", pageSize);
            paramsMap.put("currentPage", currentPage);
            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchSubListByMap(paramsMap);
            List<OrderManagerVO> pageData = pagingVO.getDataList();
            if (pageData != null) {
                orderForms.addAll(pageData);
                if (pageData.size() < pageSize)
                    break;
            } else
                break;
            currentPage++;
        }
        return orderForms;
    }
}