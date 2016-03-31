package com.rongyi.rss.malllife.service.user;

import com.rongyi.easy.huanxin.IMResultVO;
import com.rongyi.easy.malllife.exception.HuanXinException;
import com.rongyi.easy.malllife.vo.UserInfoVO;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/6/3
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/3              1.0            创建文件
 *
 */
public interface IHuanXinIMService {


    /**
     * 注册malllife 用户
     * @param user
     * @return
     * @throws HuanXinException
     */
    public String registeID(UserInfoVO user)throws HuanXinException;


    /**
     * 修改malllife 用户密码信息
     * @param user
     * @param newpassword
     * @return
     * @throws Exception
     */
    public IMResultVO resetPassword(UserInfoVO user, String newpassword) throws Exception;


    /**
     * 修改malllife 用户密码呢称
     * @param user
     * @param newNickname
     * @return
     * @throws Exception
     */
    public IMResultVO resetNickname(UserInfoVO user, String newNickname) throws Exception;


    /**
     * 生成环信账号
     * @return
     * @throws HuanXinException
     */
    public String generationIMid()throws HuanXinException;




}
