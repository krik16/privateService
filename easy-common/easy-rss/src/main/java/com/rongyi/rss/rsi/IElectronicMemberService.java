package com.rongyi.rss.rsi;

import com.rongyi.easy.revc.entity.ElectronicMember;

/**
 * 电子会员接口
 * @author baodk
 */
public interface IElectronicMemberService {

    
    /**
     * 获取电子会员信息 
     * @return
     */
    public ElectronicMember getEleMemberInfo(String memberNo);
}
