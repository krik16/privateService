package com.rongyi.easy.content_v2.param;

import java.io.Serializable;

/**
 * Created by WUH
 * on 2017/1/3.
 * 内容管理操作类
 */
public class ForumContentOperateParam  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer stick;    //是否置顶
    private Integer status;   //0待发布、1已发布、2已关闭
    private Integer isDeleted;  //是否删除：否[0], 是[1], 默认为0未删除
    private String userName;  //修改人用户名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStick() {
        return stick;
    }

    public void setStick(Integer stick) {
        this.stick = stick;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ForumContentOperateParam{" +
                "id=" + id +
                ", stick=" + stick +
                ", status=" + status +
                ", isDeleted=" + isDeleted +
                ", userName='" + userName + '\'' +
                '}';
    }
}
