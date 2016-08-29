package com.rongyi.rss.content;

import com.rongyi.easy.content_v2.dto.ForumHotAreaDto;

import java.util.List;

/**
 * Created by user on 2016/8/29.
 * 热门城市接口
 */
public interface IHotAreaService {
    /**
     * 查询热门城市列表
     * @return 热门城市列表
     */
    List<ForumHotAreaDto> getHotAreaDtoList();
}
