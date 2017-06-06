package com.rongyi.easy.bdata.param;

import com.rongyi.easy.bsoms.param.BaseParam;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

/**
 * Created by WUH on 2017/5/19.
 * 店铺搜索实体
 */
public class ShopSearchParam extends BaseParam {
    //店铺基础信息
    private List<String> idList;  //店铺Mid
    private String name; //店铺名
    private List<String> shopNatures; //店铺性质 0商场商铺  1商场专柜  2街边店 3特卖店  4连锁总部
    private List<Integer> shopTypes;  //店铺类型   0普通店   1免税店  2专柜  3折扣  4旗舰 5加盟店
    private List<Integer> validList;   //店铺状态   0正常  1隐藏  2删除 3待处理
    private Integer businessStatus; //营业状态  0正常营业  1即将营业  2暂停营业  3停止营业   4待处理
    private List<String> parentIds;

    //商场信息
    private String zoneId;  //商圈商场id
    private String shopNumber;  //铺位号
    private String customCategoryId; //商场专属id
    private String categoryId; //店铺品牌分类id

    private Date startTime;  //开始时间
    private Date endTime;   //结束时间

    private String voidKey;
    private String voidVal;

    public String getVoidKey() {
        return voidKey;
    }

    public void setVoidKey(String voidKey) {
        this.voidKey = voidKey;
    }

    public String getVoidVal() {
        return voidVal;
    }

    public void setVoidVal(String voidVal) {
        this.voidVal = voidVal;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Integer> getValidList() {
        return validList;
    }

    public void setValidList(List<Integer> validList) {
        this.validList = validList;
    }

    public Integer getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
    }

    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(String customCategoryId) {
        this.customCategoryId = customCategoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
