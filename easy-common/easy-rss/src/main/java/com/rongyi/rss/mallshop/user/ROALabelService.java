package com.rongyi.rss.mallshop.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/15
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/15              1.0            创建文件
 *
 */

import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.userlabel.LabelDto;

import java.util.List;

public interface ROALabelService {

    /**
     * 返回标签信息
     * @param flag 1 常用标签 2 用户自定义
     * @return
     */
    public List<LabelDto> getLabelList(int flag);


    /**
     * 根据名称返回标签信息
     * @param labelName
     * @return
     * @throws com.rongyi.easy.mallshop.MallShopException
     */
    public LabelDto getLabelByName(String labelName)throws MallShopException;


}
