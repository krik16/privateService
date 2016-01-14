package com.rongyi.rss.huanxin;

import com.rongyi.easy.huanxin.IMResultVO;
import com.rongyi.easy.malllife.exception.HuanXinException;
import com.rongyi.easy.malllife.vo.UserInfoVO;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/6/2
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/2              1.0            创建文件
 *
 */
public interface ROAHuanXinIMService {


    /**
     * 注册环信
     * @param user
     * @return
     * @throws com.rongyi.easy.malllife.exception.HuanXinException
     */
    public String registeMalifeID(UserInfoVO user)throws HuanXinException;

    /**
     * IM重置密码API
     *
     * @param user
     * @return
     * @throws Exception
     */
    public IMResultVO resetMalifePassword(UserInfoVO user, String newpassword) throws Exception ;


    /**
     * 修改呢称
     * @param user
     * @param nickname
     * @throws Exception
     */
    public IMResultVO resetMallifeNickname(UserInfoVO user,String nickname)throws Exception ;

    /**
     * 生成环信账号
     * @return
     * @throws HuanXinException
     */
    public String generationIMid()throws HuanXinException;



}
