package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activity.entity.GroupStockParam;
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
     * 秒杀活动详情
     * @param activityId
     * @return
     */
    public SecKillActivityVO detailActivityForSecKill(int activityId);

    /**
     * 秒杀活动场次列表
     * @param activityId
     * @return
     */
    public List<SecKillActivitySessionVO> listActivitySessionForSecKill(int activityId);

    /**
     * 活动商品详情
     * @return
     */
    public SecKillGoodVO detailActivityGoodForSecKill(int activityGoodId);

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
