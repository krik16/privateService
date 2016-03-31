package com.rongyi.rss.solr;

import com.rongyi.easy.solr.UserDocument;

/**
 * 电子会员solr service
 * @author baodk
 */
public interface ElectronicMemberService {

    /**
     * 添加电子会员索引
     * @param userDocument
     * @return
     */
    public boolean addEleMemberIndex(UserDocument userDocument);
    
    /**
     * 删除电子会员索引
     * @param memberNo:电子会员编号
     * @return true:操作成功，false:操作失败
     */
    public boolean deleteEleMemberIndex(String memberNo);
    
    /**
     * 更新电子会员索引
     * @param userDocument
     * @return true：操作成功，false:操作失败
     */
    public boolean updateELeMemberIndex(UserDocument userDocument);
    
    /**
     * 查询电子会员索引
     * @param memberNo:电子会员编号
     * @return
     */
    public UserDocument selectELeMemberIndex(String memberNo);
    
}
