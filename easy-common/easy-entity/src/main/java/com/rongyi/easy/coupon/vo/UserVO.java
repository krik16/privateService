package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.ryoms.entity.RyUserInfo;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2015/11/26 17:18
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-common
 */
public class UserVO implements Serializable {
    private RyUserInfo ryUserInfo;
    private List<String> authorities;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserVO{");
        sb.append("ryUserInfo=").append(ryUserInfo);
        sb.append(", authorities=").append(authorities);
        sb.append('}');
        return sb.toString();
    }

    public UserVO() {
    }

    public UserVO(RyUserInfo ryUserInfo, List<String> authorities) {

        this.ryUserInfo = ryUserInfo;
        this.authorities = authorities;
    }

    public RyUserInfo getRyUserInfo() {

        return ryUserInfo;
    }

    public void setRyUserInfo(RyUserInfo ryUserInfo) {
        this.ryUserInfo = ryUserInfo;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }
}
