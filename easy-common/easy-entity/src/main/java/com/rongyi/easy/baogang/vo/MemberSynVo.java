package com.rongyi.easy.baogang.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2017/1/16.
 */
public class MemberSynVo implements Serializable {
    private Integer total;//当前会员总数
    private Integer synNum;//可同步会员数
    private Integer num;//当前返回同步会员数
    private Integer totalPage;//同步数据总页数
    private Integer pageSize;//每页条数(默认500)
    private Integer page;//当前页数
    private List<MemberDetailVo> memberDetails;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSynNum() {
        return synNum;
    }

    public void setSynNum(Integer synNum) {
        this.synNum = synNum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<MemberDetailVo> getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(List<MemberDetailVo> memberDetails) {
        this.memberDetails = memberDetails;
    }

    @Override
    public String toString() {
        return "MemberSynVo{" +
                "total=" + total +
                ", synNum=" + synNum +
                ", num=" + num +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", page=" + page +
                ", memberDetails=" + memberDetails +
                '}';
    }
}
