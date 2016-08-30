package com.rongyi.rss.content;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.dto.ForumHotAreaDto;
import com.rongyi.easy.content_v2.entity.ForumHotArea;

import java.util.List;

/**
 * Created by user on 2016/8/29.
 * 热门城市接口
 */
public interface IHotAreaService {
    /**
     * 查询热门城市列表 (app)
     * @return 热门城市列表
     */
    List<ForumHotAreaDto> getHotAreaDtoList();

    /**
     * 查询热门城市列表 （ryoms）
     * @return 热门城市列表
     */
    List<ForumHotArea> getHotAreaList();

    /**
     * 批量保存热门城市
     * @param list 热门城市list
     * @param operateId 操作者ID
     * @return 影响行数
     */
    int saveList(List<ForumHotArea> list,Integer operateId);

    /**
     * 删除热门城市
     * @param id 热门城市Id
     * @return 0失败 1成功
     */
    ResponseVO deleteById(Integer id);

}
