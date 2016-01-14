package com.rongyi.easy.content_v2.vo;

import com.rongyi.easy.mcmc.vo.LiveBullInfoVO;
import com.rongyi.easy.mcmc.vo.LiveCommodityVO;
import com.rongyi.easy.mcmc.vo.LiveVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/10/26.
 */
public class LiveDetailVO implements Serializable{
    /**
     * 直播id
     */
    private String liveId;

    /**
     * 直播名
     */
    private String liveTitle;

    /**
     * 买手id
     */
    private String bullId;

    /**
     * 直播开始时间
     */
    private long beginTime;

    /**
     * 直播结束时间
     */
    private long endTime;

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 直播状态 [0:发布/预热中，1:上线/进行中，2:下线(已过期)]
     */
    private int status;

    /**
     * 商品列表
     */
    private List<LiveCommodityVO> commodityList;

    /**
     * 直播定点（该直播下商品最多的商场或者街边店）
     */
    private String liveAddress;

    /**
     * 直播定点经纬度
     */
    private List<Double> location;

    /**
     * 品牌列表，按商品数量排序
     */
    private List<String> brandNames;

    /**
     * 直播用户信息
     */
    private LiveBullInfoVO bullInfo;

    /**
     * 距离
     */
    private Double distance;

    /**
     * sessionId
     */
    private String jsessionId;

    /**
     * 定点位置id
     */
    private String liveAddressId;

    /**
     * 地址类型 0商场，1街边店
     */
    private int zoneType;





    private String bullNickName;// 买手昵称
    private String bullLogo;// 买手头像
    private Double bullGrade;// 买手评级
    private Integer bullFansNum;// 用户关注数（粉丝）
    private Integer liveCount;// 买手直播场次
    private Integer commodityCount;// 买手持有的商品总数
    private Integer ifAttention = 0;// 是否已关注0否1是
    private String bullIntroduction;// 买手简介
    private String bullImId;// 买手环信id


    public LiveDetailVO(){

    }
    public LiveDetailVO(LiveVO liveVo){
        if(liveVo !=null) {
            this.liveId = liveVo.getLiveId();
            this.liveTitle=liveVo.getLiveName();
            this.bullId=liveVo.getBullId();
            this.beginTime=liveVo.getBeginTime();
            this.endTime=liveVo.getEndTime();
            this.createTime=liveVo.getCreateTime();
            this.status=liveVo.getStatus();
            this.commodityList=liveVo.getCommodityList();
            this.liveAddress=liveVo.getLiveAddress();
            this.location=liveVo.getLocation();
            this.brandNames=liveVo.getBrandNames();
            this.bullInfo=liveVo.getBullInfo();
            this.distance=liveVo.getDistance();
            this.jsessionId=liveVo.getJsessionId();
            this.liveAddress=liveVo.getLiveAddress();
            this.zoneType=liveVo.getZoneType();
        }
    }

    public String getLiveId() {
        return liveId;
    }

    public void setLiveId(String liveId) {
        this.liveId = liveId;
    }

    public String getLiveTitle() {
        return liveTitle;
    }

    public void setLiveTitle(String liveTitle) {
        this.liveTitle = liveTitle;
    }

    public String getBullId() {
        return bullId;
    }

    public void setBullId(String bullId) {
        this.bullId = bullId;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<LiveCommodityVO> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<LiveCommodityVO> commodityList) {
        this.commodityList = commodityList;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public List<String> getBrandNames() {
        return brandNames;
    }

    public void setBrandNames(List<String> brandNames) {
        this.brandNames = brandNames;
    }

    public LiveBullInfoVO getBullInfo() {
        return bullInfo;
    }

    public void setBullInfo(LiveBullInfoVO bullInfo) {
        this.bullInfo = bullInfo;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getJsessionId() {
        return jsessionId;
    }

    public void setJsessionId(String jsessionId) {
        this.jsessionId = jsessionId;
    }

    public String getLiveAddressId() {
        return liveAddressId;
    }

    public void setLiveAddressId(String liveAddressId) {
        this.liveAddressId = liveAddressId;
    }

    public int getZoneType() {
        return zoneType;
    }

    public void setZoneType(int zoneType) {
        this.zoneType = zoneType;
    }

    public String getBullNickName() {
        return bullNickName;
    }

    public void setBullNickName(String bullNickName) {
        this.bullNickName = bullNickName;
    }

    public String getBullLogo() {
        return bullLogo;
    }

    public void setBullLogo(String bullLogo) {
        this.bullLogo = bullLogo;
    }

    public Double getBullGrade() {
        return bullGrade;
    }

    public void setBullGrade(Double bullGrade) {
        this.bullGrade = bullGrade;
    }

    public Integer getBullFansNum() {
        return bullFansNum;
    }

    public void setBullFansNum(Integer bullFansNum) {
        this.bullFansNum = bullFansNum;
    }

    public Integer getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(Integer liveCount) {
        this.liveCount = liveCount;
    }

    public Integer getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(Integer commodityCount) {
        this.commodityCount = commodityCount;
    }

    public Integer getIfAttention() {
        return ifAttention;
    }

    public void setIfAttention(Integer ifAttention) {
        this.ifAttention = ifAttention;
    }

    public String getBullIntroduction() {
        return bullIntroduction;
    }

    public void setBullIntroduction(String bullIntroduction) {
        this.bullIntroduction = bullIntroduction;
    }

    public String getBullImId() {
        return bullImId;
    }

    public void setBullImId(String bullImId) {
        this.bullImId = bullImId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("liveId", liveId)
                .append("liveTitle", liveTitle)
                .append("bullId", bullId)
                .append("beginTime", beginTime)
                .append("endTime", endTime)
                .append("createTime", createTime)
                .append("status", status)
                .append("commodityList", commodityList)
                .append("liveAddress", liveAddress)
                .append("location", location)
                .append("brandNames", brandNames)
                .append("bullInfo", bullInfo)
                .append("distance", distance)
                .append("jsessionId", jsessionId)
                .append("liveAddressId", liveAddressId)
                .append("zoneType", zoneType)
                .append("bullNickName", bullNickName)
                .append("bullLogo", bullLogo)
                .append("bullGrade", bullGrade)
                .append("bullFansNum", bullFansNum)
                .append("liveCount", liveCount)
                .append("commodityCount", commodityCount)
                .append("ifAttention", ifAttention)
                .append("bullIntroduction", bullIntroduction)
                .append("bullImId", bullImId)
                .toString();
    }
}
