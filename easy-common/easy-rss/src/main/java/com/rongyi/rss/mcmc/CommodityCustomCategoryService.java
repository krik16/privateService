package com.rongyi.rss.mcmc;

import com.rongyi.easy.mcmc.entity.CommodityCustomCategoryEntity;
import com.rongyi.easy.mcmc.param.CommodityCustomCategoryParam;

import java.util.List;

/**
 * Created by wangzehui on 2016/3/24.
 */
public interface CommodityCustomCategoryService {

    /**
     * 根据店铺或者分公司mongoid查询自定义类目
     * @param ownerMid
     * @param ownerType
     * @param pageSize
     * @return
     */
    public List<CommodityCustomCategoryEntity> selectCommodityCustomCategoryByOwnerAndType(String ownerMid,int ownerType,
        int currpage,int pageSize);

    /**
     * 根据店铺或者分公司id查询自定义类目总数
     * @param ownerId
     * @param ownerType
     * @return
     */
    public int selectCommodityCustomCategoryCountByOwnerAndType(String ownerId,int ownerType);

    /**
     * 新增修改商品自定义类目
     * @param param
     * @param ownerId
     * @param ownerMid
     * @param identity
     * @return
     * @throws Exception
     */
    public int insertOrUpdateOrDeleteCustomCategory(CommodityCustomCategoryParam param,Integer ownerId,
                                                        String ownerMid,Integer userId,int identity) throws Exception;

    public CommodityCustomCategoryEntity selectById(int id);

    public List<CommodityCustomCategoryEntity> selectByIds(List<Integer> ids);
}
