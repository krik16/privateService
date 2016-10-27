package com.rongyi.rss.usercenter.malllife;
  
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.malllife.exception.MallLifeException;
import com.rongyi.easy.malllife.param.MalllifeUser;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.msgcenter.UsersParamDto;
import com.rongyi.easy.usercenter.dto.malllife.MalllifeUserInfoDto;
import com.rongyi.easy.usercenter.dto.malllife.MalllifeUserListInfoDto;
import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IMallLifeUserInfoService {



    /**
     * 注册用户
     * @param malllifeUser 用户参数信息
     * @throws Exception
     */
    public String registUser(MalllifeUser malllifeUser) throws Exception;
 
    /**
     * 根据用户Id查询 uuid
     * @param id
     * @return
     * @throws Exception
     */
    public UserInfoVO getByUid(String id) throws Exception;

    /**
     * @param malllifeUser
     * @throws Exception
     */
    public void update(MalllifeUser malllifeUser) throws Exception;


    /**
     * 注册IM账号
     * @param userId
     * @param imUser
     * @throws Exception
     */
    public void updateImUser(String userId, String imUser) throws Exception;


    /**
     * get user
     * @param openId
     * @return
     * @throws Exception
     */
    public UserInfoVO getUserInfoByOpenId(String openId) throws Exception;


    /**
     * 根据用户手机号查询
     * @param phone
     * @return
     * @throws Exception
     */
    public UserInfoVO getByUserPhone(String phone) throws Exception;

    /**
     * 根据im_id查询摩生活用户
     *
     * @param imId
     * @return
     * @throws Exception
     */
    public MalllifeUserInfoEntity getUserByIMId(String imId) throws Exception;

    /**
     * 第三方登录，若openId不存在，则新建一个用户
     * @param malllifeUser
     * @return
     * @throws Exception
     */
    public UserInfoVO thirdLogin(MalllifeUser malllifeUser) throws Exception;



    /**
     * 根据phone 查询摩生活用户
     *
     * @param phone
     * @return
     * @throws Exception
     */
    public MalllifeUserInfoEntity getUserByPhone(String phone) throws Exception;

    /**
     * 根据openId 查询摩生活用户
     *
     * @param openId
     * @return
     * @throws Exception
     */
    public MalllifeUserInfoEntity getUserByOpenId(String openId) throws Exception ;

    /**
     * 根据主键查询
     *
     * @param userId
     * @return
     * @throws Exception
     */
    public MalllifeUserInfoEntity getUserByUserId(String userId) throws Exception ;



    /**
     * 收藏商品和取消商品
     *
     * @param collectCommoditys
     * @param userId
     * @throws Exception
     */
    public void collectCommodity(Set<String> collectCommoditys, String userId) throws Exception ;

    /**
     * 根据买家姓名模糊查询买家信息
     * @param name
     * @return
     * @throws Exception
     */
    public List<UserInfoVO> getUserDetailByName(String name) throws Exception;


    /**
     * 判断当前设备号是否可以注册
     * @param devuuid 设备uuid
     * @return true 可以注册 false不能注册
     * @throws Exception
     */
    public Boolean isExistBydevUuid(String devuuid,String idfa)throws Exception;



    /**
     * 根据token查询
     * @param token
     * @return userId
     * @throws Exception
     */
    public String getUserIdByToken(String token) throws Exception;

    public UserInfoVO getUserByNameOrPhoneAndPwd(String nameOrPhone,String pwd);

    /**
     * 根据卖家昵称模糊查询卖家信息
     * @param nickname
     * @return
     */
    public List<UserInfoVO> getUserDetailByNickname(String nickname);

    public List<UserInfoVO> getUsersByNicknameUsername(String nickname,
                                                       String username);

    /**
     * 根据id列表批量取出用户信息
     * @param idList
     * @return
     */
    public Map<String,UserInfoVO> getUserListByIdList(List<String> idList);



    /**
     * 登录后修改相关信息 (登录时间，登录)
     * @param malllifeUser
     * @throws Exception
     */
    public void updatelogin(MalllifeUser malllifeUser) throws Exception;

    /**
     * 返回部分数据
     * @param IdorPhone 用户Id 和手机号
     * @param type 0用户ID 1手机号
     * @param flag 0不返回收藏商品编号 1返回 兼容老接口
     * @return
     * @throws Exception
     */
    public MalllifeUserInfoDto getByIdorPhone(String IdorPhone,int type,int flag) throws Exception;

    /**
     * 红包推送查询用户列表
     * @param usersParamDto
     * @return
     */
    public PagingVO<MalllifeUserListInfoDto>  findUsesByPage(UsersParamDto usersParamDto) throws Exception;

    /**
     * 红包推送 查询用户的id
     * @return
     */
    public List<MalllifeUserListInfoDto> findAllUserIds();


    /**
     * 分享红包 判断返回 用户ID
     * @param phone 手机
     * @param channel  来源渠道  ShareRed 分享红包
     * @return   正常返回userId  禁用返回 disable
     */
    public String genUserId(String phone,String channel)throws Exception ;

    /**
     * 查询所有状态的用户信息 包含预注册
     * @param phone
     * @return
     * @throws Exception
     */
    public UserInfoVO findAllStateUserByPhone(String phone) throws Exception;


    /**
     * 根据邀请码返回用户信息
     * @param invitCode
     * @return
     * @throws Exception
     */
    public MalllifeUserInfoDto getByInvitCode(String invitCode) throws Exception;


    /**
     * 更新用户邀请码
     * @param malllifeUser
     * @throws Exception
     */
    public void updateUserInvitCode(MalllifeUser malllifeUser) throws Exception;


    /**
     * 邀请统计人数
     * @param invitCode
     * @return
     * @throws Exception
     */
    public int sumInvitCode(String invitCode)throws Exception;

    /**
     * 获取邀请码
     * @param userId
     * @param phone
     * @return
     * @throws MallLifeException
     */
    public String generInvitCode(String userId,String phone)throws MallLifeException ;

    /**
     * 获取YK码
     * @param size
     * @return
     * @throws MallLifeException
     */
    public List<String> initYkCode(int size) throws MallLifeException;

    /**
     * 获取yk码
     * @param userId
     * @return
     * @throws MallLifeException
     */
    public int getYkCode(String userId,String ykCode) throws MallLifeException;

}
