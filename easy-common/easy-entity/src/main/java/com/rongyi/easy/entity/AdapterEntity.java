package com.rongyi.easy.entity;

import java.io.Serializable;

public class AdapterEntity implements Serializable {
  private static final long serialVersionUID = 4004977640188669601L;

  private Integer id;

  private String mallId;

  private String mallUrl;

  private String userName;

  private String password;

  private String ryUrl;

  private String methodName;

  private String ownerId;

  private String adaptClass;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getMallUrl() {
    return mallUrl;
  }

  public void setMallUrl(String mallUrl) {
    this.mallUrl = mallUrl;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRyUrl() {
    return ryUrl;
  }

  public void setRyUrl(String ryUrl) {
    this.ryUrl = ryUrl;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getAdaptClass() {
    return adaptClass;
  }

  public void setAdaptClass(String adaptClass) {
    this.adaptClass = adaptClass;
  }

  @Override
  public String toString() {
    return "AdapterEntity [id=" + id + ", mallId=" + mallId + ", mallUrl=" + mallUrl
        + ", userName=" + userName + ", password=" + password + ", ryUrl=" + ryUrl
        + ", methodName=" + methodName + ", ownerId=" + ownerId + ", adaptClass=" + adaptClass
        + "]";
  }

}
