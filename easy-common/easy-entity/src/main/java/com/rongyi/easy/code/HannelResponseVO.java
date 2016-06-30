package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2016/6/29.
 */
public class HannelResponseVO implements Serializable {
    private List<HannelsVO> hannelsVOList;
    private int waitCheckCount;//待审核数量
    private int disAgreeCount;//审核未通过数量
    private int waitStartCount;//待开始数量
    private int processingCount;//进行中数量
    private int endCount;//已结束数量
    private int cancleCount;//已作废数量

    public List<HannelsVO> getHannelsVOList() {
        return hannelsVOList;
    }

    public void setHannelsVOList(List<HannelsVO> hannelsVOList) {
        this.hannelsVOList = hannelsVOList;
    }

    public int getWaitCheckCount() {
        return waitCheckCount;
    }

    public void setWaitCheckCount(int waitCheckCount) {
        this.waitCheckCount = waitCheckCount;
    }

    public int getDisAgreeCount() {
        return disAgreeCount;
    }

    public void setDisAgreeCount(int disAgreeCount) {
        this.disAgreeCount = disAgreeCount;
    }

    public int getWaitStartCount() {
        return waitStartCount;
    }

    public void setWaitStartCount(int waitStartCount) {
        this.waitStartCount = waitStartCount;
    }

    public int getProcessingCount() {
        return processingCount;
    }

    public void setProcessingCount(int processingCount) {
        this.processingCount = processingCount;
    }

    public int getEndCount() {
        return endCount;
    }

    public void setEndCount(int endCount) {
        this.endCount = endCount;
    }

    public int getCancleCount() {
        return cancleCount;
    }

    public void setCancleCount(int cancleCount) {
        this.cancleCount = cancleCount;
    }
}
