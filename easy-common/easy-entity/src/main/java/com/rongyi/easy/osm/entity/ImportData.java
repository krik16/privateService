package com.rongyi.easy.osm.entity;

import java.io.Serializable;

/**
 * Created by yangyang on 2017/3/10.
 */
public class ImportData implements Serializable {

    private Integer operation;
    private BillHead billHead;
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
}
