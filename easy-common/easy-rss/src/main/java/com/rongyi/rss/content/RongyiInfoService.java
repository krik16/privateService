package com.rongyi.rss.content;

import com.rongyi.easy.content_v2.entity.RongyiInfo;

import java.util.List;

/**
 * Created by yangyang on 2016/11/10.
 */
public interface RongyiInfoService {

    public boolean saveOrUpdateRongyiInfo(RongyiInfo rongyiInfo);

    public RongyiInfo selectById(Integer id);

    public boolean updateStatus(RongyiInfo rongyiInfo);

    public List<RongyiInfo> getRongyiInfoByPage(Integer currentPage,Integer pageSize);

    public Integer countRongyiInfoList(RongyiInfo rongyiInfo);
}
