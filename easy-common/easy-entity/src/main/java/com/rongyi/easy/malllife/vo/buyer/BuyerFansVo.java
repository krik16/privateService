package com.rongyi.easy.malllife.vo.buyer;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/3/18
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/3/18              1.0            创建文件
 *
 */

import java.io.Serializable;

public class BuyerFansVo  implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fansId; //粉丝Id

    private String nickName;//粉丝昵称

    private String fansLogo;//粉丝头像

    private String fansImId;//IM ID


    public String getFansId() {
        return fansId;
    }

    public void setFansId(String fansId) {
        this.fansId = fansId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFansLogo() {
        return fansLogo;
    }

    public void setFansLogo(String fansLogo) {
        this.fansLogo = fansLogo;
    }

    public String getFansImId() {
        return fansImId;
    }

    public void setFansImId(String fansImId) {
        this.fansImId = fansImId;
    }
}
