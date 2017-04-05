package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by yangyang on 2017/3/14.
 */
@XmlRootElement(name = "RESULT")
@XmlType(propOrder = { "resultCode", "resultMsg"})
@XmlAccessorType(XmlAccessType.FIELD)
public class HaiXingResult implements Serializable {


    @XmlElement(name = "RESULT_CODE")
    private String resultCode;
    @XmlElement(name = "RESULT_MSG")
    private String resultMsg;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }


}
