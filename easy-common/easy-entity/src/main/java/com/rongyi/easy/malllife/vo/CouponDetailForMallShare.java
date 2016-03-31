package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class CouponDetailForMallShare implements Serializable{

@Expose
private List<Result> result = new ArrayList<Result>();

public List<Result> getResult() {
return result;
}

public void setResult(List<Result> result) {
this.result = result;
}

}