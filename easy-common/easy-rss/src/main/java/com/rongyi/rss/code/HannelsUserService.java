package com.rongyi.rss.code;

import com.rongyi.easy.code.HannelsUser;

import java.util.List;
import java.util.Map;

/**
 * Created by shaozhou on 2016/7/21.
 */
public interface HannelsUserService {
    /**
     * 根据hannels_id 删除数据
     * @param id
     */
    void deleteByHannelsId(Integer id);

    /**
     * 批量新增hannel_user数据
     * @param hannelUserMap
     * @return
     */
    int saveHannelsUsers(Map<String, Object> hannelUserMap);

    /**
     * 通过hannels_id 查询hannelsUser
     * @param id
     * @return
     */
    List<HannelsUser> selectByHannelsId(Integer id);
}
