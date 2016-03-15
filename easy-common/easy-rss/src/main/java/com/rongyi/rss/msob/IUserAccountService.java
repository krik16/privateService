package com.rongyi.rss.msob;


import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.user.UserAccountDto;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.entity.UserAccountEntity;
import com.rongyi.easy.rmmm.param.user.AccountParam;

import java.util.List;

public interface IUserAccountService {


    public boolean bindAccount(RmmmUserInfoEntity usersEntity, UserAccountEntity accountEntity) throws Exception;

    /**
     * 根据用户绑定的账户id获取账户信息
     *
     * @param accountId
     * @return
     * @throws Exception
     */
    public UserAccountEntity getAccountInfoById(Integer accountId) throws Exception;

    /**
     * 获取用户账号
     *
     * @param userId
     * @param type   //0查全部 1支付宝 2 银行
     * @return
     * @throws MallShopException
     */
    public List<UserAccountDto> getUserAccountListByUserId(Integer userId, Integer type) throws MallShopException;
	/**
     * 修改/添加账号信息
     *
     * @param accountParam
     * @return
     * @throws MallShopException
     */
    public Integer modifyUserAccount(AccountParam accountParam) throws MallShopException;

    /**
     * 根据导购id获取导购账号信息
     */
    public List<UserAccountDto> getAccountListByGuideId(Integer guideId) throws Exception;


    /**
     * 根据 账号返回账号信息
     *
     * @param code
     * @return 返回账号信息
     * @throws Exception
     */
    public UserAccountEntity findUserAccountDtoByCode(String code) throws Exception;
//	/**
//	 * 根据导购id获取导购账号信息
//	 */
//	public UserAccountDto getAccountListBySaleId(Integer guideId) throws Exception;

    /**
     * 返回店铺下 店长的 imId
     * @param shopIds 店铺ID
     * @return
     * @throws Exception
     */
    public List<String> findImId(List<String> shopIds) throws Exception;

}
