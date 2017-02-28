package com.rongyi.rss.malllife.service.user;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.malllife.domain.activity.MallLifeWishDO;
import com.rongyi.easy.malllife.param.activity.MallLifeWishParam;
import com.rongyi.easy.malllife.vo.UserInfoVO;

import java.util.List;

/**
 * Created by WUH on 2017/2/17.
 * 蜜桃节活动服务接口层
 */
public interface IMallLifeWishService {
    MallLifeWishDO generateCard(UserInfoVO userInfo, MallLifeWishParam malllifeWishParam);

    int edit(UserInfoVO userInfo, MallLifeWishParam malllifeWishParam);

    ResponseVO list(MallLifeWishParam malllifeWishParam);

    int getCount();

    List<MallLifeWishDO> getByPage(MallLifeWishParam malllifeWishParam);

    MallLifeWishDO getByUserId(UserInfoVO userInfo);

    MallLifeWishDO getById(MallLifeWishParam wishParam);

    int updateCount(UserInfoVO userInfo, MallLifeWishParam mallLifeWishParam);

    boolean checkApproval(UserInfoVO userInfo, MallLifeWishParam wishParam);
    /**
     * 获取当前用户
     * @param userId
     * @return
     */
    public int getRankByUserId(String userId);


    /**
     * 返回排行榜
     * @param rank 排行前 rank位
     * @return
     */
    public List<MallLifeWishDO> getWishRank(int rank);


    /**
     * 排行榜
     * @param userInfo 用户信息
     * @param rankCount 排行前 rank位
     * @return
     */
    ResponseVO getWishRank(UserInfoVO userInfo, int rankCount);




}
