package com.rongyi.easy.mcmc.param;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询礼品参数类
 *
 * @author yaoyiwei
 * @version 1.0
 * @date 2016-11-24
 */
public class SearchGiftParam extends PaginationParam implements Serializable {

    private String id;
    private String platform;
    private String code;
    private String name;
    private String commodityRange;
    private Integer terminalType;
    private String keyword;
    private Integer status;
    private String reason;
    private String mappingId;
    private Date createAtStart;
    private Date createAtEnd;
    private String freePostage;  // 0包邮 1不包邮
    private String mallMid;

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public String getFreePostage() {
        return freePostage;
    }

    public void setFreePostage(String freePostage) {
        this.freePostage = freePostage;
    }

    public Date getCreateAtStart() {
        return createAtStart;
    }

    public void setCreateAtStart(Date createAtStart) {
        this.createAtStart = createAtStart;
    }

    public Date getCreateAtEnd() {
        return createAtEnd;
    }

    public void setCreateAtEnd(Date createAtEnd) {
        this.createAtEnd = createAtEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCommodityRange() {
        return commodityRange;
    }

    public void setCommodityRange(String commodityRange) {
        this.commodityRange = commodityRange;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTerminalType() {
        return this.terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    @Override
    public String toString() {
        return "SearchGiftParam{" +
                "id='" + id + '\'' +
                ", platform='" + platform + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", commodityRange=" + commodityRange +
                ", terminalType=" + terminalType +
                ", keyword='" + keyword + '\'' +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                ", mappingId='" + mappingId + '\'' +
                ", createAtStart=" + createAtStart +
                ", createAtEnd=" + createAtEnd +
                '}';
    }
}
