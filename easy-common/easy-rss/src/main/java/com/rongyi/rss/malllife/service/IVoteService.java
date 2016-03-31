
/**   
 * @Title: IVoteService.java 
 * @Package: com.rongyi.rss.msob 
 * @Description: TODO
 * @author user  
 * @date 2015年6月2日 下午3:27:44 
 */


package com.rongyi.rss.malllife.service;

import java.util.Date;
import java.util.List;

import com.rongyi.easy.malllife.domain.UserVote;
import com.rongyi.easy.malllife.domain.Vote;
import com.rongyi.easy.malllife.vo.VoteInfoVO;
import com.rongyi.easy.malllife.vo.VoteVO;
/** 
 * @Description com.rongyi.app.biz.service.VoteService  com.rongyi.app.biz.dao.VoteDao 中接口迁移
 * @author yuanbo
 * @date 2015年6月2日 下午3:27:44 
 */

public interface IVoteService {
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
