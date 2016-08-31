/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月7日上午11:28:43
 * @Description: TODO
 **/

package com.rongyi.tms.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.tms.moudle.vo.CouponOrderVO;
import com.rongyi.tms.service.CouponOrderService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: 柯军
 * Description: 优惠券订单实现
 * datetime:2015年9月7日上午11:28:43
 *
 **/

@Service
public class CouponOrderServiceImpl extends BaseServiceImpl implements CouponOrderService {

    private static final String NAMESPACE = "com.rongyi.tms.mapper.xml.CouponOrderMapper";

    @Override
    public List<CouponOrderVO> selectPageList(Integer currentPage, Integer pageSize, Map<String, Object> map) {
        if (currentPage != null && pageSize != null) {
            map.put("currentPage", (currentPage - 1) * pageSize);
            map.put("pageSize", pageSize);
        }
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
    }

    @Override
    public Integer selectPageListCount(Map<String, Object> map) {
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
    }

    @Override
    public CouponOrderVO selectById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
    }

}
