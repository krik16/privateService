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
     * 如果角色是买手，传入买手id，如果角色是店长或者导购，传入userType=4
     * @param shopId
     * @param activityId
     * @return
     */
    public List<ActivityGoodsVO> getResGoods(String shopId,Integer activityId, String bullId, String userType);

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

    /**
     * 获取报名信息详情
     * @param activityGoodsId
     * @return
     */
    public  ActivityGoods resGoodsRoundDetail(Integer activityGoodsId);


    /**
     * 获取报名信息详情
     * @param activityId
     * @param activityId
     * @return
     */
    public  ActivityGoods resGoodsRoundDetail(Integer activityId,String goodsId);


    /**
     * 追加提报库存
     * @param activityId
     * @return
     */
    public  boolean addGoodsJoinCount(Integer activityId,String goodsId,String skuId,Integer addJoinCount);

    /**
     * 追加提报库存
     * @param activityGoodsId
     * @return
     */
    public  boolean addGoodsJoinCount(Integer activityGoodsId,Integer addJoinCount);

    /**
     * 获取规格库存
     * @param specId
     * @return
     */
    public  Integer getStockBySpecId(String specId);
}
