package com.rongyi.pay.core.tianyi.param;

import com.rongyi.pay.core.util.BaseData;

/**
 * Created by yangyang on 2017/4/10.
 */
public class TianyiParam extends BaseData {

    private TianyiOrderParam tianyiOrderParam;

    private PayDetailParam payDetailParam;

    public TianyiOrderParam getTianyiOrderParam() {
        return tianyiOrderParam;
    }

    public void setTianyiOrderParam(TianyiOrderParam tianyiOrderParam) {
        this.tianyiOrderParam = tianyiOrderParam;
    }

    public PayDetailParam getPayDetailParam() {
        return payDetailParam;
    }

    public void setPayDetailParam(PayDetailParam payDetailParam) {
        this.payDetailParam = payDetailParam;
    }
}
