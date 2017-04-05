package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by yangyang on 2017/3/10.
 */

@XmlRootElement(name = "IMPORTDATA")
@XmlType(propOrder = { "operation", "billHead" ,"billBody"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ImportData implements Serializable {

    @XmlElement(name = "OPERATION")
    private Integer operation;
    @XmlElement(name = "BILLHEAD")
    private BillHead billHead;
    @XmlElement(name = "BILLBODY")
    private BillBody billBody;

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public BillHead getBillHead() {
        return billHead;
    }

    public void setBillHead(BillHead billHead) {
        this.billHead = billHead;
    }

    public BillBody getBillBody() {
        return billBody;
    }

    public void setBillBody(BillBody billBody) {
        this.billBody = billBody;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
