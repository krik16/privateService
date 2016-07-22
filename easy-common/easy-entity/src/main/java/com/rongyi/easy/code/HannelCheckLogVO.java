package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by shaozhou on 2016/6/29.
 * 促销推广码审核操作返回vo
 */
public class HannelCheckLogVO implements Serializable {
    private Integer id;
    private Byte type;//type 1 表示审核不通过 2作废不通过
    private String reason;// 审核不通过或作废不通过 理由
    private Long createAt;
    private String createBy;
}
