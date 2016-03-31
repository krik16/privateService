package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.dto.shop.ShopDto;
import com.rongyi.easy.rmmm.entity.UserShopEntity;
import com.rongyi.easy.rmmm.param.MessageParam;
import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;

public interface IUsersShopService {

	public ShopDto getShopDtoByUserId(Integer userId) throws Exception;


    /**
     * 通过userId得到UserShopEntity
     * @param userId
     * @return
     */
    public UserShopEntity getUsersShopByUserId(Integer userId) throws Exception;
    /**
     * 通过userId,status查UserShopEntity
     * @param userId
     * @return
     * @throws Exception
     */
    public UserShopEntity getUsersShopByStatusAndUserId(Integer userId) throws Exception;
    /**
     * 通过userId和shopId得到UserShopEntity
     * 注：添加负责人使用
     * @param userId
     * @param shopId
     * @return
     * @throws Exception
     */
    public UserShopEntity getUsersShopByUserIdAndShopId(Integer userId,Integer shopId)  throws Exception;

    /**
     * 通过shopId获取user shop关联表的信息
     * @param shopId
     * @return
     * @throws Exception
     */
    public UserShopEntity getUsersShopByShopId(Integer shopId) throws Exception;
    /**
     * 添加店员认证信息
     * @param param
     * @param userId
     * @return
     * @throws Exception
     */
    public Integer insertSaleUserShop(PrincipalAndCategoryParam param,Integer userId) throws Exception;

    /**
     * 当店员审核未通过时根据saleId将users shop表的状态改为删除态
     * 0:删除,1:正常
     * @param param
     * @throws Exception
     */
    public void updateUsersShopBySaleId(MessageParam param) throws Exception;
}
