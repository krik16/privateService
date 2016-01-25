package com.rongyi.easy.rmmm.vo;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  银行列表
 * time:  2015/4/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/4/13              1.0            创建文件
 *
 */
public class BankInfoVo implements java.io.Serializable{

   private static final long serialVersionUID = 1L;


   private Integer id;
   private String name; //银行名称
   private String logo; //银行logo
   private Integer type;//卡类型 1表示银行储蓄卡，2表示信用卡
   private Integer isDisabled;//是否禁用0正常 1禁用

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

   public String getLogo() {
      return logo;
   }

   public void setLogo(String logo) {
      this.logo = logo;
   }

   public Integer getType() {
      return type;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getIsDisabled() {
      return isDisabled;
   }

   public void setIsDisabled(Integer isDisabled) {
      this.isDisabled = isDisabled;
   }
}
