package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.dto.user.PosUserInfoDto;
import com.rongyi.easy.rmmm.param.user.PosUserManagerParam;

import java.util.List;

/*
 * Description:POS用户信息操作
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2016/7/29    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface IPosUserService {


    /**
     * 添加账号
     * @param posUserManagerParam
     * @return 0成功 -1失败
     * @throws Exception
     */
    public int savePosUser(PosUserManagerParam posUserManagerParam)throws Exception;

    /**
     * 批量添加账号
     * @param posUserManagerParamList
     * @throws Exception
     */
    public void savePosUserBatch(List<PosUserManagerParam> posUserManagerParamList)throws Exception;

    /**
     * 返回用户信息
     * @param userAccount 用户账号
     * @return
     * @throws Exception
     */
    public PosUserInfoDto findPosUser(String userAccount)throws Exception;


    /**
     * 根据用户账号修改密码
     * @param userAccount
     * @param pwd
     * @return
     */
    public int updataPwdByUserAccount(String userAccount,String pwd);





}
