package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.entity.MallEntity;
import com.rongyi.easy.entity.ShopEntity;
import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.entity.BankInfoEntity;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.entity.UserAccountEntity;
import com.rongyi.easy.rmmm.param.user.UserManagerParam;
import com.rongyi.easy.rmmm.vo.merchant_inviteCode.MerchantAccountLinkVO;
import com.rongyi.easy.rmmm.vo.merchant_inviteCode.MerchantAccountVO;
import com.rongyi.easy.rmmm.vo.merchant_inviteCode.ShoppingGuideVO;

public interface ROAMerchantAccountService {

    /**
     * 注册账号
     *
     * @throws MallShopException
     */
    public boolean insertUserInfo(UserManagerParam userManagerParam) throws MallShopException;

    /**
     * 根据用户相关信息获取商家账号列表VO
     *
     * @param entity
     * @return
     * @throws Exception
     */
    public MerchantAccountVO getMerAccountVOByParam(MerchantAccountLinkVO merchantAccountLinkVO) throws Exception;

    /**
     * 根据用户信息获取商家账号列表VO
     *
     * @param entity
     * @return
     * @throws Exception
     */
    public MerchantAccountVO getMerAccountVO(RmmmUserInfoEntity entity) throws Exception;

    /**
     * 根据条件查满足条件的用户的数量
     *
     * @return
     * @throws Exception
     */
    public Integer getUserInfoTotalRecordByParam(Map<String, Object> paraMap) throws Exception;

    /**
     * 根据条件查满足条件的用户相关信息
     *
     * @param paraMap
     * @return
     * @throws Exception
     */
    public List<MerchantAccountLinkVO> getUserInfoListByParam(Map<String, Object> paraMap) throws Exception;

    /**
     * 查所有用户的数量
     *
     * @return
     * @throws Exception
     */
    public Integer getAllUserInfoTotalRecord() throws Exception;

    /**
     * 查询所有用户信息
     *
     * @param paraMap
     * @return
     * @throws Exception
     */
    public List<RmmmUserInfoEntity> getAllUserInfo(Map<String, Object> paraMap) throws Exception;

    /**
     * 账号冻结/解冻
     *
     * @param userId
     * @param isSuspended true=冻结，false=false
     * @return
     * @throws Exception
     */
    public boolean updateVituralAccountStatus(String userId, boolean isSuspended) throws Exception;

    /**
     * 启用或者停用用户账号0正常 1禁用
     *
     * @param paraMap
     * @throws Exception
     */
    public void updateMerAccountStatus(Map<String, Object> paraMap) throws Exception;

    /**
     * 根据用户id查用户信息
     *
     * @param id
     * @throws Exception
     */
    public RmmmUserInfoEntity getUserInfoById(Integer id) throws Exception;

    /**
     * 根据用户id查绑定的资金账户信息
     *
     * @param userId
     * @throws Exception
     */
    public List<UserAccountEntity> getUserAccountListInfo(Integer userId) throws Exception;

    /**
     * 根据店长查该店铺下的导购列表信息
     *
     * @param paraMap
     * @return
     * @throws Exception
     */
    public List<ShoppingGuideVO> getShopGuideInfoListByUserId(Map<String, Object> paraMap) throws Exception;

    /**
     * 根据店长查导购数量
     *
     * @param paraMap
     * @return
     * @throws Exception
     */
    public Integer getShopGuideTotalRecordByUserId(Map<String, Object> paraMap) throws Exception;

    /**
     * 通过id获取银行信息
     *
     * @param bankId
     * @throws Exception
     */
    public BankInfoEntity getBankInfoById(Integer bankId) throws Exception;

    /**
     * 根据银行卡类型列出对应的列表(1储蓄卡 2信用卡)
     *
     * @param type
     * @throws Exception
     */
    public List<BankInfoEntity> listCreditOrMemory(Integer type) throws Exception;

    /**
     * 验证用户手机  昵称
     *
     * @param userPhone
     * @param nickName
     * @throws Exception
     */
    public Boolean validatePhoneOrNickName(String userPhone, String nickName) throws Exception;
    
    /**
     * 验证用户手机昵称
     * @param userPhone
     * @param nickName
     * @param type =2在买手列表中查   ！=2在非买手列表查
     * @return
     * @throws Exception
     */
    public Boolean validatePhoneOrNickName(String userPhone, String nickName,Integer type) throws Exception;

    /**
     * 根据商场名查商场  模糊查询
     *
     * @param mallName
     * @return
     * @throws Exception
     */
    public List<MallEntity> getMallEntityByMallName(String mallName) throws Exception;

    /**
     * 根据店铺名查店铺  模糊查询
     *
     * @param shopName
     * @return
     * @throws Exception
     */
    public List<ShopEntity> getShopEntityByMallName(String shopName, String mallMId) throws Exception;


    /**
     * 修改商家账号相关信息
     *
     * @param paraMap
     * @param merUserId
     * @return
     * @throws Exception
     */
    public Boolean updateMerAccountInfo(Map<String, Object> paraMap, Integer merUserId) throws Exception;

    /**
     * 模糊查询用户手机号码
     *
     * @param userAccount
     * @return
     * @throws Exception
     */
    public List<RmmmUserInfoEntity> selectUserPhoneByUserAccount(String userAccount) throws Exception;
    
    /**
     * 验证用户信息是否已存在 
     * @param paramsMap
     *               userAccount
     *               userNickName
     *               userPhone
     *               type
     *               id
     * @return
     */
    public boolean validateUserByUserParam(Map<String, Object> paramsMap)throws Exception;
}
