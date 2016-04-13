package com.rongyi.rss.mallshop.user;

import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * Description:推送摩店查询接口
 * Author: 袁波
 * DATE: 2016/1/25 20:20
 * Package:com.rongyi.service.user
 * Project:easy-common
 */
public interface ROAPushShopUserService {
    public List<RmmmUserInfoEntity> findByShopMid(String shopMid, List<Integer> identities);

    public List<RmmmUserInfoEntity> findAllUsers(Integer type);
    
    public List<RmmmUserInfoEntity> findByUserBuyerParam(Map<String, Object> param);

    /**
     *
     * @param phone
     * @param type 1:买手 0：其他身份
     * @return
     */
    public List<RmmmUserInfoEntity> findUserByPhone(String phone,Integer type);

}
