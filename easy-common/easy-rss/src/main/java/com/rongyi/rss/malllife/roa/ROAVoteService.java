
/**   
 * @Title: ROAVoteService.java 
 * @Package: com.rongyi.rss.malllife.roa 
 * @Description: TODO
 * @author user  
 * @date 2015年6月3日 下午8:36:35 
 */


package com.rongyi.rss.malllife.roa;

import java.util.List;

import com.rongyi.easy.malllife.domain.UserVote;
import com.rongyi.easy.malllife.vo.VoteInfoVO;
import com.rongyi.easy.malllife.vo.VoteVO;

/** 
 * @Description 
 * @author 袁波
 * @date 2015年6月3日 下午8:36:35 
 */

public interface ROAVoteService {
    /**
     * 获取投票选项
     * 
     * @param contentId
     * @return
     */
    public List<VoteVO> getAllVoteByContentId(String contentId);
    /**
     * 查询用户是否投票指定文章
     * 
     * @param userId
     * @param contentId
     * @return
     */
    public UserVote getUserVoteInfo(String userId, String contentId);
    /**
     * 更新投票数量
     * 
     * @param voteId
     * @return
     */
    public int updateVoteNumber(String voteId);
    

    /**
     * 添加用户投票记录
     * @param userId
     * @param voteId
     * @param contentId
     * @return
     */
    public int insertUserVote(String userId, String voteId, String contentId) ;
    /**
     * 根据用户id,文章或活动的id获取投票信息
     * @param contenId
     * @param userId
     * @return
     * @throws Exception
     */
    public VoteInfoVO getVoteInfo(String contentId, String userId) throws Exception ;
    
    /**
     * 投票操作数据
     * @param contentId
     * @param userId
     * @param voteId
     * @return
     */
    public String updateVote(String contentId, String userId,String voteId);
}
