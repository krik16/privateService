package com.rongyi.settle.web.controller.vo;

import com.rongyi.easy.roa.vo.MallAddressVO;
import com.rongyi.easy.roa.vo.ShopPositionVO;

import java.io.Serializable;

/**
 * 临时VO
 * Created by he on 2015/10/15.
 */
public class RelevanceVO implements Serializable{

    private String id;
    private String name;

    private ShopPositionVO position;

    private MallAddressVO mallAddress;

    public MallAddressVO getMallAddress() {
        return mallAddress;
    }

    public void setMallAddress(MallAddressVO mallAddress) {
        this.mallAddress = mallAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShopPositionVO getPosition() {
        return position;
    }

    public void setPosition(ShopPositionVO position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "RelevanceVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
