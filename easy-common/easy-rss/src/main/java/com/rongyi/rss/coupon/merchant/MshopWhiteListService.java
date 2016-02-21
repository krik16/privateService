package com.rongyi.rss.coupon.merchant;

import com.rongyi.easy.coupon.entity.MshopWhiteList;

import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/2/2 13:00
 * Package:com.rongyi.rss.coupon.merchant
 * Project:easy-common
 */
public interface MshopWhiteListService {
    public MshopWhiteList selectByPrimaryKey(Integer id);

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(MshopWhiteList mshopWhiteList);

    public int updateByPrimaryKeySelective(MshopWhiteList mshopWhiteList);

    public int deleteByMerchantId(String merchantId);

    public List<MshopWhiteList> findAllShopWhiteList();

    public List<MshopWhiteList> findAllMallWhiteList();

    public List<MshopWhiteList> findAllGroupWhiteList();
}
