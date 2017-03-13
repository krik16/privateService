package com.rongyi.easy.osm.entity;

import com.google.inject.internal.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2017/3/10.
 */
public class BillBody implements Serializable {

    private List<PluData> pluDataList = Lists.newArrayList();

    public List<PluData> getPluDataList() {
        return pluDataList;
    }

    public void setPluDataList(List<PluData> pluDataList) {
        this.pluDataList = pluDataList;
    }
}
