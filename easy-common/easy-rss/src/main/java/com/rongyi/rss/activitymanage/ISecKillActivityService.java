package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activity.entity.GroupStockParam;
import com.rongyi.easy.activity.entity.QuerySecKillGoods;
import com.rongyi.easy.activitymanage.entity.ActivityGoods;
import com.rongyi.easy.activitymanage.vo.secKill.SecKillActivitySessionVO;
import com.rongyi.easy.activitymanage.vo.secKill.SecKillActivityVO;
import com.rongyi.easy.activitymanage.vo.secKill.SecKillGoodVO;

import java.util.List;

/**
 * @author chenjun
 * @date 2017/5/2 10:37
 */
public interface ISecKillActivityService {

    /**
     * 活动详情(不包含场次和商品)
     * @param activityId
     * @return
     */
    public SecKillActivityVO detailActivityForSecKill(int activityId);

    /**
     * 秒杀活动详情(包含场次和商品)
     * @param activityId
     * @return
     */
    public SecKillActivityVO detailActivityAndSessionForSecKill(int activityId);

    /**
     * 查询活动商品数据
     * @param querySecKillGoods
     * @return
     */
    public List<ActivityGoods> getResActivityGoods(QuerySecKillGoods querySecKillGoods);

    /**
     * 活动商品详情
     * @return
     */
    public SecKillGoodVO detailActivityGoodForSecKill(int activityGoodId);

    /**
     * 查询sku正在进行的秒杀活动
     * @param specId
     * @param goodId
     * @return
     */
    public ActivityGoods getCommoditySeckillActivity(String specId, String goodId);

    /**
     * 活动商品详情
     * @return
     */
    public SecKillGoodVO detailActivityGoodForSecKill(int activityGoodId, String specId);

    /**
     * 查询秒杀活动商品状态
     * @return
     */
    public List<SecKillGoodVO> listActivityGoodForSecKill(List<Integer> activityGoodIds);

    /**
     * 批量增加库存操作
     */
    public  boolean returnStock(List<GroupStockParam> params);

    /**
     * 批量减少库存操作
     * @param params
     * @return
     */
    public boolean reduceStock(List<GroupStockParam> params);
}
