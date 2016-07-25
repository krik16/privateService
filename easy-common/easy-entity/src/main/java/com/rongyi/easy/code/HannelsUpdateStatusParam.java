package com.rongyi.easy.code;

import java.util.List;

/**
 * Created by shaozhou on 2016/6/30.
 */
public class HannelsUpdateStatusParam {
    private List<Hannels> hannelsList;// hannel_id id 集合 批量通过和批量作废传多个
    private String operate;//操作类型(1 审核通过/批量通过，2审核不通过，3作废/批量作废 4删除)
    public List<Hannels> getHannelsList() {
        return hannelsList;
    }

    public void setHannelsList(List<Hannels> hannelsList) {
        this.hannelsList = hannelsList;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @Override
    public String toString() {
        return "HannelsUpdateStatusParam{" +
                "hannelsList=" + hannelsList +
                ", operate='" + operate + '\'' +
                '}';
    }
}
