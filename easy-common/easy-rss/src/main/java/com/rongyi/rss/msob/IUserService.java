package com.rongyi.rss.msob;

import com.rongyi.easy.malllife.pojo.BuyerInfoPojo;
import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.user.UserShopMallAccountDto;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.param.MessageParam;
import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;
import com.rongyi.easy.rmmm.param.UserImCountParam;
import com.rongyi.easy.rmmm.param.user.UserManagerParam;
import com.rongyi.easy.rmmm.vo.AssistantListVO;
import com.rongyi.easy.rmmm.vo.UserinfoListVO;
import com.rongyi.easy.rmmm.vo.UserinfoVO;

import java.util.List;
import java.util.Map;

/**
 *
 * @ClassName: IUserService
 * @Description: 获取导购信息
 * @author wzh
 * @date 2015年5月27日 上午11:16:15
 *
 */

public interface IUserService {
	
	/**
     * 查询
     * @param userId
     * @return
     * @throws Exception
     */
    public RmmmUserInfoEntity selectByUserId(Integer userId) throws Exception;


    /**
     * 添加负责人，返回负责人id
     * @param param
     * @return
     * @throws Exception
     */
    public Integer insertPrincipal(PrincipalAndCategoryParam param) throws Exception;

    /**
     * 保存用户环信账号
     * @param userId
     * @param huanXinIMID
     * @throws Exception
     */
    public void saveIm(Integer userId,String huanXinIMID)throws Exception;


    /**
     * 注册
     * @param usersEntity
     * @return
     * @throws Exception
     */
    public boolean userRegist(RmmmUserInfoEntity usersEntity) throws Exception;

    /**
     * 店员认证添加个人信息
     *
     * @param param
     * @param userId
     * @return
     * @throws Exception
     */
    public Integer updateSaleUser(PrincipalAndCategoryParam param, Integer userId) throws Exception;


    /** 根据用户Id获取用户店铺商场账号信息
     * @param userId
     * @return
     * @throws Exception
     */
    public UserShopMallAccountDto getUserShopMallAccountInfo(Integer userId)throws Exception;



    /**
     * 通过主键查询user 实体
     *
     * @param userId
     * @return
     */
    public RmmmUserInfoEntity selectCheckingUserByPrimaryKey(Integer userId)throws Exception;


    /**
     * 通过环信id获得用户信息
     *
     * @param param
     * @return
     * @throws Exception
     */
    public UserinfoVO getUsersEntityByUserCount(UserImCountParam param) throws Exception;


    /**
     * 通过shopId获得店员的总数
     *
     * @param param
     * @return
     * @throws Exception
     */
    public Integer getTotalRecord(MessageParam param) throws Exception;


    /**
     * 通过shopId获得店员列表
     *
     * @param param
     * @return
     * @throws Exception
     */
    public AssistantListVO getAssistantsByShopId(MessageParam param) throws Exception;


    /**
     * 取消店员审核时将其设置为2 审核中
     *
     * @throws Exception
     */
    public void deleteSaleBySaleId(MessageParam param) throws Exception;

    /**
     * 店员审核
     *
     * @param param
     * @throws Exception
     */
    public void verifySaleBySaleId(MessageParam param, RmmmUserInfoEntity user) throws Exception;


    /**
     * 判断用户是否有这个权限
     *
     * @param permissionId
     * @param userId
     * @return
     * @throws Exception
     */
    public Boolean checkUserPermission(Integer permissionId, Integer userId) throws Exception;

    /**
     * 通过userId获取权限id集合
     *
     * @param userId
     * @return
     * @throws Exception
     */
    public List<Integer> getRolesPermissionIds(Integer userId) throws Exception;

    /**
     * 通过shopId查找负责人信息
     */
    public RmmmUserInfoEntity getPrincipalByShopId(Integer shopId) throws Exception;

    /**
     * 通过手机号查用户信息
     * @param phone
     * @param identity
     * @return
     */
    public RmmmUserInfoEntity getUsersEntityByPhone(String phone,String identity);


    /**
     * 手机号的List信息
     * @param phone
     * @return
     */
    public List<RmmmUserInfoEntity> getUserListByPhone(String phone)throws MallShopException;

    /**
     *
     * @param phone
     * @param flag 1 全部状态
     * @return
     * @throws MallShopException
     */
    public List<RmmmUserInfoEntity> getUserAllListByPhone(String phone,int flag)throws MallShopException;

    /**
     * 修改密码/昵称／手机／头像
     *
     * */
    public boolean editInfo(RmmmUserInfoEntity usersEntity);

    /**
     * 用户信息修改
     * @param paramStr 修改的参数
     * @param phone 手机号
     * @param flag 0修改手机号 1修改密码
     * @return
     * @throws MallShopException
     */
    public boolean updateByPhone(String paramStr,String phone,int flag)throws MallShopException;

    /**
     * 根据用户昵称，用户UUID获取
     * @param flag  标识位
     * @param strName  0 查昵称 1查UUID
     * @return
     */
    public RmmmUserInfoEntity getUsersEntityByStrName(int flag,String strName,String identity)throws MallShopException;



    /**
     * 注册并验证用户
     * @param userManagerParam
     * @return
     * @throws Exception
     */
    public boolean userRegistAndVerify(UserManagerParam userManagerParam) throws MallShopException;


    /**
	 * 根据shopId查询导购列表
	 * @param paraMap
	 * @return
	 * @throws Exception
	 */
	public UserinfoListVO pagingContentForumList(Map<String, Object> paraMap) throws Exception;
	
	/**
	 * 根据shopId查询导购数量
	 * @param paraMap
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecord(Map<String, Object> paraMap) throws Exception;


    public void save_im(Integer userId,String imId)throws  Exception;
    
    /**
     * 修改个人信息
     * @param paramsMap
     * @return
     */
    public boolean updateUserInfo(Map<String, Object> paramsMap)throws  Exception;
    
    /**
	 * 根据用户id查用户信息,不管是否禁用
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public RmmmUserInfoEntity getUserInfoById(Integer id) throws Exception;


    /**
     * 根据 用户ID 生成 邀请码
     * @param userId
     * @return
     */
    public String generationSharCode(Integer userId)throws Exception;

    /**
     * 判断 当前邀请码是否有效
     * @param sharCode
     * @return 存在 true 不存在 false
     */
    public Boolean sharCodeIsExist(String sharCode)throws Exception;
    
    /**
     * 通过userId获取导购部分数据
     * @param userId
     * @return
     * @throws Exception
     */
    public UserinfoVO selectRmmmUserInfoByUserId(Integer userId) throws Exception;

    /**
     * 编辑用户简介
     * @param userId 用户id
     * @param desc 用户描述
     * @return
     * @throws MallShopException
     */
    public Integer editUserDesc(Integer userId,String desc)throws MallShopException;
    
    /**
     * 根据手机号和昵称查询用户
     * @param map
     * @return
     */
    public RmmmUserInfoEntity selectRmmmUserInfoByUserPhoneAndNickName(Map map);
    
    /**
     * 根据条件查询用户信息
     * @param paramsMap
     * @return
     */
    public RmmmUserInfoEntity selectRmmmUserInfoByUserParam(Map<String, Object> paramsMap);


    /**
     * 登录时记录 pushId
     * @param pushId
     * @param userPhone
     * @return
    * @throws Exception
     */
    public boolean updatePushId(String pushId,String userPhone) throws Exception;
    
    /**
     * 根据邀请码查询导购或者买手数据
     *
     * @param sharCode
     * @return 
     */
    public BuyerInfoPojo selectUserBySharCode(String sharCode) throws Exception;
}
