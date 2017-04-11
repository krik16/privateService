package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.bean.DubboVO;
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
    DubboVO<String> agree(ComplaintResultParam param);

    /**
     * 拒绝申诉
     *
     * @param param
     * @return
     */
    DubboVO<String> disAgree(ComplaintResultParam param);

    /**
     * 发起申诉
     *
     * @param param
     * @return
     */
    DubboVO<String> create(ComplaintParam param);

    /**
     * 取消申诉
     *
     * @param param
     * @return
     */
    DubboVO<String> cancel(ComplaintParam param);

}
