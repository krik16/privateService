package com.rongyi.easy.rmmm.vo.system;

import com.rongyi.easy.rmmm.vo.PageVO;

import java.io.Serializable;
import java.util.List;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  系统消息列表
 * time:  2015/4/16
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/4/16              1.0            创建文件
 *
 */
public class SystemMsgListVo extends PageVO implements Serializable{

    List<SystemMsgVo> systemMsgVoList;

    public List<SystemMsgVo> getSystemMsgVoList() {
        return systemMsgVoList;
    }

    public void setSystemMsgVoList(List<SystemMsgVo> systemMsgVoList) {
        this.systemMsgVoList = systemMsgVoList;
    }
}
