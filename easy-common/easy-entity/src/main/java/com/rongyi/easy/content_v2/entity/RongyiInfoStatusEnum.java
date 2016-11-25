package com.rongyi.easy.content_v2.entity;

/**
 * Created by yangyang on 2016/11/11.
 */
public enum RongyiInfoStatusEnum {
    DRAFT_STATUS(0, "草稿"),
    PUBLISH_STATUS(1,"发布"),
    CLOSE_STATUS(2,"关闭"),
    REPUBLISH_STATUS(3,"重新发布");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    RongyiInfoStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}