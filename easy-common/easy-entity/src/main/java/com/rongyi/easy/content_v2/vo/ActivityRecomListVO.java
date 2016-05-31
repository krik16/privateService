package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * create by com.rongyi.easy.content_v2.vo ideaworkspace :author lijing
 * User:lijing
 * DATE : 2016/4/8
 * TIME : 17:47
 * ideaworkspace.
 */
public class ActivityRecomListVO implements Serializable {

     private String name;

     private String pic;/**选中钱的图片*/

     private String selectedPic;/**选中后的图片*/
     private Integer isSingle;
     private Integer isChecked;
     private List<ActivityContentListVO> contentList = new ArrayList<ActivityContentListVO>();

     public Integer getIsSingle() {
          return isSingle;
     }

     public void setIsSingle(Integer isSingle) {
          this.isSingle = isSingle;
     }

     public Integer getIsChecked() {
          return isChecked;
     }

     public void setIsChecked(Integer isChecked) {
          this.isChecked = isChecked;
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

     public List<ActivityContentListVO> getContentList() {
          return contentList;
     }

     public void setContentList(List<ActivityContentListVO> contentList) {
          this.contentList = contentList;
     }

     public String getSelectedPic() {
          return selectedPic;
     }

     public void setSelectedPic(String selectedPic) {
          this.selectedPic = selectedPic;
     }

     @Override
     public String toString() {
          return new ToStringBuilder(this)
                  .append("name", name)
                  .append("pic", pic)
                  .append("selectedPic", selectedPic)
                  .append("contentList", contentList)
                  .append("isSingle", isSingle)
                  .append("isChecked", isChecked)
                  .toString();
     }
}
