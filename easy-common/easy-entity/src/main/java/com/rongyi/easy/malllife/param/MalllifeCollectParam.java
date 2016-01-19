package com.rongyi.easy.malllife.param;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/11/19
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/11/19              1.0            创建文件
 *
 */

public class MalllifeCollectParam {

    /** 主键，可重复 */
    private String userId;

    /** 商品编号id */
    private String collectionId;

    /** 是否禁用0收藏 1取消收藏 */
    private Integer isDisable;

    /** 收藏类型  0商场 ， 1店铺，2品牌，3商品 */
    private Integer collectionType;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    public Integer getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(Integer collectionType) {
        this.collectionType = collectionType;
    }
}
