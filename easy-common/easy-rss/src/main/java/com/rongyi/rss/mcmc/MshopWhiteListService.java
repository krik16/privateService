package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.easy.mcmc.entity.MshopWhiteList;

/**
 * 摩店建商品白名单服务
 * @author ll
 * @date 2016-03-18
 * @package com.rongyi.rss.mcmc
 * @project easy-goods => easy-mcmc
 */
public interface MshopWhiteListService {
	/**
	 * 主键查询白名单
	 * @param id	主键ID
	 * @return	MshopWhiteList
	 */
    MshopWhiteList selectByPrimaryKey(Integer id);

    /**
	 * 主键删除白名单
	 * @param id	主键ID
	 * @return	成功条数
	 */
    int deleteByPrimaryKey(Integer id);

    /**
	 * 添加白名单
	 * @param mshopWhiteList	白名单对象
	 * @return	成功条数
	 */
    int insertSelective(MshopWhiteList mshopWhiteList);

    /**
	 * 主键更新选中白名单
	 * @param mshopWhiteList	白名单对象
	 * @return	成功条数
	 */
    int updateByPrimaryKeySelective(MshopWhiteList mshopWhiteList);

    /**
	 * 商家ID删除白名单
	 * @param merchantId	上架ID
	 * @return	成功条数
	 */
    int deleteByMerchantId(String merchantId);

    /**
	 * 返回所有店铺白名单
	 * @return	白名单列表
	 */
    List<MshopWhiteList> findAllShopWhiteList();

    /**
	 * 返回所有商场白名单列表
	 * @return	白名单列表
	 */
    List<MshopWhiteList> findAllMallWhiteList();

    /**
	 * 返回所有集团白名单列表
	 * @return	白名单列表
	 */
    List<MshopWhiteList> findAllGroupWhiteList();

    /**
	 * 商家ID是否是白名单
	 * @param merchantId	商家ID
	 * @return	true | false
	 */
    boolean isExistMerchant(String merchantId);
}
