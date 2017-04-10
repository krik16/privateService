package com.rongyi.rss.tradecenter.osm;

import com.rongyi.easy.tradecenter.param.ComplaintParam;
import com.rongyi.easy.tradecenter.param.ComplaintResultParam;

/**
 * 申诉操作服务
 *
 * @author chenjun
 * @date 2017-04-10
 */
public interface IOrderComplaintService {

    /**
     * 同意申诉
     *
     * @param param * @return
     */
    void agree(ComplaintResultParam param);

    /**
     * 拒绝申诉
     *
     * @param param
     * @return
     */
    void disAgree(ComplaintResultParam param);

    /**
     * 发起申诉
     *
     * @param param
     * @return
     */
    String create(ComplaintParam param);

}
