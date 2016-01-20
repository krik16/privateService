package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by lijing on 2015/12/22 14:02
 * 内容模版列表vo
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class ForumTemplateVO implements Serializable {
    private Integer id;
    /**模版标题*/
    private String name;
    /**模版样例图片*/
    private String pic;
    private String updateUser;
    private Date updateAt;
   /**城市集合*/
    private List<TemplateCityVO> cityList;

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
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public List<TemplateCityVO> getCityList() {
        return cityList;
    }

    public void setCityList(List<TemplateCityVO> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("pic", pic)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("cityList", cityList)
                .toString();
    }
}
