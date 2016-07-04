package com.rongyi.rss.code;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.code.CodeGetRecord;
import com.rongyi.easy.code.InviteSearchParam;

/**
 * Created by shaozhou on 2016/7/4.
 */
public interface CodeGetRecordService {
    PagingVO<CodeGetRecord> codeGetRecordPagingVO(InviteSearchParam param);
}
