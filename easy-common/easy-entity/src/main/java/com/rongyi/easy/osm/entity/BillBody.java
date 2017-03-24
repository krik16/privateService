package com.rongyi.easy.osm.entity;

import com.google.inject.internal.Lists;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2017/3/10.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "pluDataList"})
public class BillBody implements Serializable {

    @XmlElement(name = "PLUDATA")
    private List<PluData> pluDataList = Lists.newArrayList();

    public List<PluData> getPluDataList() {
        return pluDataList;
    }

    public void setPluDataList(List<PluData> pluDataList) {
        this.pluDataList = pluDataList;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
