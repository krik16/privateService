package com.rongyi.easy.mcmc.param;

import com.rongyi.easy.util.StandardConvertionUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 查询礼品参数类
 *
 * @author yaoyiwei
 * @date 2016-11-24
 * @version 1.0
 *
 */
public class SearchGiftParam extends PaginationParam implements Serializable {

    private String id;
    private String platform;
    private String code;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createAt;
    private Integer commodityRange;
    private Integer terminalType;
    private String keyword;
    private Integer status;
    private String reason;
    private String mappingId;

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

    public Integer getCommodityRange() {
        return commodityRange;
    }

    public void setCommodityRange(Integer commodityRange) {
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getTerminalType() {
        return StandardConvertionUtil.convertPlatformToTerminalType(this.platform);
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
                "code='" + code + '\'' +
                ", id='" + id + '\'' +
                ", platform='" + platform + '\'' +
                ", name='" + name + '\'' +
                ", createAt=" + createAt +
                ", commodityRange=" + commodityRange +
                ", terminalType=" + terminalType +
                ", keyword='" + keyword + '\'' +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                ", mappingId='" + mappingId + '\'' +
                "} " + super.toString();
    }
}
