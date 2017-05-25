package com.rongyi.easy.bdata.param;

import com.rongyi.easy.bsoms.param.BaseParam;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by WUH on 2017/5/19.
 * 店铺搜索实体
 */
public class ShopSearchParam extends BaseParam {
    private List<ObjectId> idList;  //店铺Mid
    private String name; //店铺名
    private List<String> shopNatures; //店铺性质 0商场商铺  1商场专柜  2街边店 3特卖店  4连锁总部
    private List<Integer> shopTypes;  //店铺类型   0普通店   1免税店  2专柜  3折扣  4旗舰 5加盟店
    private Integer valid;   //店铺状态   0正常  1隐藏  2删除
    private Integer businessStatus; //营业状态  0正常营业  1即将营业  2暂停营业  3停止营业   4待处理
    private List<ObjectId> parentIds;

    public List<ObjectId> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<ObjectId> parentIds) {
        this.parentIds = parentIds;
    }

    public List<String> getShopNatures() {
        return shopNatures;
    }

    public void setShopNatures(List<String> shopNatures) {
        this.shopNatures = shopNatures;
    }

    public List<Integer> getShopTypes() {
        return shopTypes;
    }

    public void setShopTypes(List<Integer> shopTypes) {
        this.shopTypes = shopTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
    }

    public List<ObjectId> getIdList() {
        return idList;
    }

    public void setIdList(List<ObjectId> idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
