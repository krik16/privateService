package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 积分规则
 * @datetime:2015年5月4日上午11:04:57
 *
 **/
public class IntegralRule implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -2157281988285089040L;

    private Integer id;

    private String mallId;

    /**
     * 状态：0删除，1正常
     */
    private Integer status;

    /**
     * 审核状态：0未审核,1审核未通过,2审核通过
     */
    private Integer verifyStu;

    /**
     * 发布状态：0未发布，1发布失败,2发布成功
     */
    private Integer published;

    /**
     * 审核未通过的时候,需要写下理由
     */
    private String reason;

    /**
     * 提交人
     */
    private Long createId;

    private Date createAt;

    private Long updateId;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVerifyStu() {
        return verifyStu;
    }

    public void setVerifyStu(Integer verifyStu) {
        this.verifyStu = verifyStu;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

}