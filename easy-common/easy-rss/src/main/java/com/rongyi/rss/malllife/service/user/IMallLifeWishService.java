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

    int updateCount(UserInfoVO userInfo, MallLifeWishParam mallLifeWishParam);
}
