package com.rongyi.rss.code;

import com.rongyi.easy.code.HannelResponseVO;
import com.rongyi.easy.code.HannelsSaveParam;
import com.rongyi.easy.code.HannelsSearchParam;
import com.rongyi.easy.code.HannelsUpdateStatusParam;

import java.util.Map;

/**
 * Created by shaozhou on 2016/6/29.
 * 促销推广码service层
 */
public interface HannelsService {
    /**
     * 查询促销推广码数量
     * @param hannelsSearchParam
     * @return
     */
    int count(HannelsSearchParam hannelsSearchParam) throws Exception;
    /**
     * 查询促销推广码列表
     * @param hannelsSearchParam
     * @return
     */
    HannelResponseVO list(HannelsSearchParam hannelsSearchParam) throws Exception;
    /**
     * 当选择渠道为买手，导购和店长时，有效期内有效的推广码互斥
     * @param hannelsSaveParam
     * @return
     */
    boolean validMutex(HannelsSaveParam hannelsSaveParam) throws Exception;

    /**
     * 保存促销推广码数据
     * @param saveMap
     * @throws Exception
     */
    void save(Map<String, Object> saveMap) throws Exception;

    /**
     * 修改促销推广码状态
     * @param map
     * @throws Exception
     */
    void operateHannelStatus(Map<String,Object> map) throws Exception;
}
