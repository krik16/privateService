package com.rongyi.rss.usercenter.malllife;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/11/19
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/11/19              1.0            创建文件
 *
 */

import com.rongyi.easy.malllife.param.MalllifeCollectParam;

import java.util.List;

public interface IMalllifeUserCollectionService {


    /**
     * 收藏
     * @param malllifeCollectParam
     * @return
     */
    public int collection(MalllifeCollectParam malllifeCollectParam)throws Exception;



    /**
     * 取消收藏
     * @param userId
     * @param collectId
     * @param collectType 收藏类型  0商场 ， 1店铺，2品牌，3商品
     * @return 0失败 1成功
     * @throws Exception
     */
    public int uncollect(String userId,String collectId,Integer collectType)throws Exception;
    /**
     * 返回收藏编号列表
     * @param userId 用户Id
     * @param collectType 收藏类型  0商场 ， 1店铺，2品牌，3商品
     * @return
     */
    public List<String> getCodeByUserId(String userId,int collectType)throws Exception;

}
