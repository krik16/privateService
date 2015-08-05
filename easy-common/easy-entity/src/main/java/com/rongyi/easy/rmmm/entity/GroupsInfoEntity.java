package com.rongyi.easy.rmmm.entity;

public class GroupsInfoEntity {
    private Integer id;

    private String name;

    private String groupMid;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGroupMid() {
        return groupMid;
    }

    public void setGroupMid(String groupMid) {
        this.groupMid = groupMid == null ? null : groupMid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}