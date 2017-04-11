package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.easy.osm.vo.ComplaintFormVO;
import com.rongyi.easy.tradecenter.param.ComplaintQueryParam;

import java.util.List;

/**
 * 申诉查询服务
 *
 * @author wangjh7
 * @date 2017-4-10
 */
public interface IOrderComplaintQueryService {

    /**
     * 获取申诉列表
     *
     * @param param
     * @return
     */
    public DubboVO<List<ComplaintFormVO>> queryForList(ComplaintQueryParam param);

    /**
     * 获取申诉总数
     *
     * @param param
     * @return
     */
    public DubboVO<Integer> queryForCount(ComplaintQueryParam param);
}
