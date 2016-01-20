//package com.rongyi.easy.coupon.old_vo;
//
//import org.apache.commons.lang.builder.ToStringBuilder;
//
//import java.io.Serializable;
//import java.util.List;
//
//public class OldMallVO implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    private String id;
//    private String type;//关联类型(mall or shop)
//    private String icon;//商家图片
//    private String title;//商家名称
//    private String address;//商家地址
//    private List<Double> location;//经纬度
//    private String telephone; //商家电话
//
//    public String getIcon() {
//        return icon;
//    }
//
//    public void setIcon(String icon) {
//        this.icon = icon;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<Double> getLocation() {
//        return location;
//    }
//
//    public void setLocation(List<Double> location) {
//        this.location = location;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getTelephone() {
//        return telephone;
//    }
//
//    public void setTelephone(String telephone) {
//        this.telephone = telephone;
//    }
//
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this)
//                .append("id", id)
//                .append("type", type)
//                .append("icon", icon)
//                .append("title", title)
//                .append("address", address)
//                .append("location", location)
//                .append("telephone", telephone)
//                .toString();
//    }
//}
