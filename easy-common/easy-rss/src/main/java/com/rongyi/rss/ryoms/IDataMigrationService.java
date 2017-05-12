package com.rongyi.rss.ryoms;

import java.util.List;

/**
 * Created by WUH on 2017/5/9.
 * 数据迁移接口层
 */
public interface IDataMigrationService {

    /**
     * 数据迁移接口（无商场）
     * @param id 原id
     */
    void process(String id);

    /**
     * 数据迁移（有商场）
     * @param id id
     */
    void processMallShop(String id);
    /**
     * 根据原店铺id获取新店铺id
     * @param id 原id
     * @return 新id，若新建失败，返回空
     */
    List<String> getNewId(String id);
}
