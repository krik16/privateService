package com.rongyi.rss.malllife.service;

import com.rongyi.easy.malllife.vo.UserInfoVO;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  用户管理
 * time:  2015/6/1
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/1              1.0            创建文件
 *
 */
public interface IUserService {


    /**
     * 注册用户
     * @param phone
     * @param pwd
     * @param nickName
     * @throws Exception
     */
    public void registUser(String phone, String pwd, String nickName, String avatar) throws Exception;

    /**
     * 用户名是：phone和name  密码：encrypted_password
     * @param uid
     * @return
     * @throws Exception
     */
    public UserInfoVO getByUid(String uid) throws Exception;

    /**
     * 20140818lim 更新
     * @param userId
     * @param phone
     * @param pwd
     * @param nickname
     * @throws Exception
     */
    public void update(String userId, String phone, String pwd, String nickname, String avatar) throws Exception;


    public void updateImID(String userId) throws Exception;

    /**
     * 注册IM账号
     * @param userId
     * @param imUser
     * @throws Exception
     */
    public void updateImUser(String userId, String imUser) throws Exception;




    /**
     * get user
     * @param id
     * @return
     * @throws Exception
     */
    public UserInfoVO getUsersById(String id) throws Exception;

    /**
     * get user
     * @param id
     * @return
     * @throws Exception
     */
    public UserInfoVO getUserInfoById(String id) throws Exception;

    /**
     * get user
     * @param openId
     * @return
     * @throws Exception
     */
    public UserInfoVO getUserInfoByOpenId(String openId) throws Exception;

    /**
     * 第三方登录，若openId不存在，则新建一个用户
     * @param openId
     * @return
     * @throws Exception
     */
    public UserInfoVO thirdLogin(String openId, String channel, String nickname, String avatar) throws Exception;

    /**
     * 用户名是：phone和name  密码：encrypted_password
     * @param openId
     * @return
     * @throws Exception
     */
    public UserInfoVO getByOpenId(String openId) throws Exception ;

}
