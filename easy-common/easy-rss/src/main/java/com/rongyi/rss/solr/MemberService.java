package com.rongyi.rss.solr;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.solr.UserDocument;

/**
 * 会员索引service
 * @author baodk
 */
public interface MemberService {

    /**
     * 添加会员索引
     * @param userDocument
     */
    public boolean addMemberIndex(UserDocument userDocument);
    
    /**
     * 删除会员索引
     * @param memberNo:会员编号
     */
    public boolean deleteMemeberIndex(String memberNo);
    
    /**
     * 更新会员索引
     * @param userDocument
     */
    public boolean updateMemberIndex(UserDocument userDocument);
    
    /**
     * 查询会员索引
     * @param memeberNo:会员编号
     * @return
     */
    public UserDocument selectMemeberIndex(String memeberNo);
    
    /**
     * 查询全部会员索引（包括电子会员和实体会员）
     * @param map
     * @return
     */
    public PagingVO<UserDocument> searchMemeberIndex(Map<String, Object> map, PagingVO<UserDocument> paging);
//    public List<UserDocument> searchMemeberIndex(Map<String, Object> map);
     
    /**
     * 清除所有会员索引
     */
    public boolean removeMemeberIndex();
}
