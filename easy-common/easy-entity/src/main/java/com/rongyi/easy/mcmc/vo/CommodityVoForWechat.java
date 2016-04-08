package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xuying on 2016/3/18.
 */
public class CommodityVoForWechat implements Serializable{

    private  String weAndTeStatus;
    private  String terminal;
    private  String id;
    private  String type;

    public String getWeAndTeStatus() {
        return weAndTeStatus;
    }

    public void setWeAndTeStatus(String weAndTeStatus) {
        this.weAndTeStatus = weAndTeStatus;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getId() {
        return id;
    }

    public void setIds(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
