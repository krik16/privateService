package com.rongyi.easy.msgcenter;

import java.io.Serializable;
import java.util.List;

/**
 * 推送对象
 *
 * @author yaoyiwei
 * @date 2016-06-06
 * @version 1.0
 */
public class PushInfoDTO implements Serializable {
    private static final long serialVersionUID = -3022699601318372670L;

    private Integer sourcePlatform;        // 上传端 1.商家后台  2.摩店APP
    private Integer updateIdentity;        // 上传人身份  1商场管理员、2品牌管理员、3分公司、4店长、5导购、6买手
    private Integer updateUserId;           //下架人id
    private List<Integer> pushPlatforms;    // 1.商家后台 2.摩店APP 3.摩店管理平台
    private List<Integer> pushTargets;       // 推送对象 对象id

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Integer getSourcePlatform() {
        return sourcePlatform;
    }

    public void setSourcePlatform(Integer sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
    }

    public Integer getUpdateIdentity() {
        return updateIdentity;
    }

    public void setUpdateIdentity(Integer updateIdentity) {
        this.updateIdentity = updateIdentity;
    }

    public List<Integer> getPushPlatforms() {
        return pushPlatforms;
    }

    public void setPushPlatforms(List<Integer> pushPlatforms) {
        this.pushPlatforms = pushPlatforms;
    }

    public List<Integer> getPushTargets() {
        return pushTargets;
    }

    public void setPushTargets(List<Integer> pushTargets) {
        this.pushTargets = pushTargets;
    }
}
