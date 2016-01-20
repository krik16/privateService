//package com.rongyi.rss.mallshop;
//
//import java.util.List;
//import java.util.Set;
//
//import org.bson.types.ObjectId;
//
//import com.rongyi.easy.entity.MallLifeUserEntity;
//import com.rongyi.easy.rmmm.dto.user.UserVO;
//
///*
// * Copyright (C),上海容易网电子商务有限公司
// * Author:  俞志坚
// * Description:  
// * time:  2015/5/13
// * History: 变更记录
// * <author>           <time>             <version>        <desc>
// * 俞志坚             2015/5/13              1.0            创建文件
// *
// */
//public interface ROAMallLifeUserService {
//
//
//
//    /**
//     * 根据phone 查询摩生活用户
//     *
//     * @param phone
//     * @return
//     * @throws Exception
//     */
//    public MallLifeUserEntity getUserByPhone(String phone) throws Exception;
//
//    /**
//     * 根据openId 查询摩生活用户
//     *
//     * @param openId
//     * @return
//     * @throws Exception
//     */
//    public MallLifeUserEntity getUserByOpenId(String openId) throws Exception ;
//
//    /**
//     * 根据主键查询
//     *
//     * @param userId
//     * @return
//     * @throws Exception
//     */
//    public MallLifeUserEntity getUserByUserId(ObjectId userId) throws Exception ;
//
//    /**
//     * 收藏商品和取消商品
//     *
//     * @param collectCommoditys
//     * @param userId
//     * @throws Exception
//     */
//    public void collectCommodity(Set<String> collectCommoditys, ObjectId userId) throws Exception ;
//    
//    /**
//     * 根据买家姓名模糊查询买家信息
//     * @param name
//     * @return
//     * @throws Exception
//     */
//    public List<UserVO> getUserDetailByName(String name) throws Exception;
//
//
//
//}
