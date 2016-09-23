package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.entity.ActivityGoods;
import com.rongyi.easy.activitymanage.vo.ActivityGoodsVO;
import com.rongyi.easy.activitymanage.vo.RefSecSkillGoods;

import java.util.List;

/**
 * Created by yangyang on 2016/9/22.
 */
public interface MerchantActivityGoodsService {

    /**
     * 获取可以报名商品列表
     * @param shopId
     * @param activityId
     * @return
     */
    public List<ActivityGoodsVO> getResGoods(String shopId,Integer activityId);

    /**
     * 报名商品
     * @param refSecSkillGoods
     * @return
     */
    public boolean editResGoodsInfo(RefSecSkillGoods refSecSkillGoods);

    /**
     * 获取活动列表
     * @param activityId
     * @param shopId
     * @param status
     * @return
     */
    public  List<ActivityGoods> getResGoods(Integer activityId, String shopId,Integer status);

    /**
     * 获取活动详情
     * @param activityGoodsId
     * @return
     */
    public  ActivityGoods resGoodsDetail(Integer activityGoodsId);
}
