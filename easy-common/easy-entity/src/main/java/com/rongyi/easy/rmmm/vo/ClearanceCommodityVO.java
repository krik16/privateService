package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommodityBuyerVO;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ClearanceCommodityVO implements Serializable {

  private List<CommodityBuyerVO> list;// 清仓商品详情列表

  private String title = "特惠商品";
  
  private List<String> pics;// 存放图片的全路径

  public List<CommodityBuyerVO> getList() {
    return list;
  }

  public void setList(List<CommodityBuyerVO> list) {
    this.list = list;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<String> getPics() {
    return pics;
  }

  public void setPics(List<String> pics) {
    this.pics = pics;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("list", list)
            .append("title", title)
            .append("pics", pics)
            .toString();
  }
}
