package com.rongyi.easy.solr.param;

import java.io.Serializable;

/**
 * 卡卷置顶参数
 *
 * @author wangjh7
 * @date 2016-04-22
 */
public class ActivityStickParam implements Serializable {
    private String id = "";
    private int position = 0;

    public String getId() {
        return id;
    }

    /**
     * 卡劵ID
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    /**
     * 设置置顶的位置（数字越大，越靠前）
     *
     * @param position 位置
     */
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ActivityStickParam{" +
                "id='" + id + '\'' +
                ", position=" + position +
                '}';
    }
}
