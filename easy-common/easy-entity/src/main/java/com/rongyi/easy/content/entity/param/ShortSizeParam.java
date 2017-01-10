package com.rongyi.easy.content.entity.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

import java.io.Serializable;

/**
 * Created by WUH
 * on 2017/1/4.
 * 断码好货查询详情参数
 */
public class ShortSizeParam extends MalllifeBaseParam implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer templateId;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return "ShortSizeParam{" +
                "templateId=" + templateId +
                '}';
    }
}
