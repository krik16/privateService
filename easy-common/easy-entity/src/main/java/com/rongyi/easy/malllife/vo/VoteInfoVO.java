package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 投票info信息 类AppVoteInfoVO.java的实现描述：TODO 类实现描述
 * 
 * @author rongyi11 2014年8月21日 下午8:29:37
 */
public class VoteInfoVO implements Serializable{

    private String       title;    // 投票标题
    private Boolean      isVote;   // 是否投票
    private Integer      voteId;   // 投票的选项
    private Integer      voteCount; // 投票统计
    private List<VoteVO> votes;    // 投票选项

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getIsVote() {
        return isVote;
    }

    public void setIsVote(Boolean isVote) {
        this.isVote = isVote;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public List<VoteVO> getVotes() {
        return votes;
    }

    public void setVotes(List<VoteVO> votes) {
        this.votes = votes;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}
