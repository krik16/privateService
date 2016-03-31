package com.rongyi.easy.malllife.vo;
import java.io.Serializable;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Parking implements Serializable{

@Expose
private String name;
@Expose
private String charge;
@Expose
private String capacity;
@Expose
private String remark;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getCharge() {
return charge;
}

public void setCharge(String charge) {
this.charge = charge;
}

public String getCapacity() {
return capacity;
}

public void setCapacity(String capacity) {
this.capacity = capacity;
}

public String getRemark() {
return remark;
}

public void setRemark(String remark) {
this.remark = remark;
}

}