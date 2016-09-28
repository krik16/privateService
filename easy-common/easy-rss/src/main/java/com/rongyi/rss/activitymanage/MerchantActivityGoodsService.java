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
     * @param shopId 店铺id
     * @param activityId 活动id
     * @param bullId 买手id
     * @param userType 店长或者导购
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
     * @param status,0未审核1未通过、退回2通过3撤销报名4强制撤销
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
     * @param activityId 活动id
     * @param goodsId 商品id
     * @param skuId  规格id
     * @param addJoinCount 新增数量
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

    /**
     * 撤销报名
     * @param id
     * @param goodsId
     * @return
     */
    public boolean updateActivityGoodsStatus(Integer id,String goodsId);
}
