package com.rongyi.rss.code;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.code.CodeGetRecord;
import com.rongyi.easy.code.InviteSearchParam;

/**
 * Created by shaozhou on 2016/7/4.
 */
public interface CodeGetRecordService {
    /**
     * 获取使用码的数据
     * @param param
     * @return
     */
    PagingVO<CodeGetRecord> codeGetRecordPagingVO(InviteSearchParam param,int searchType);
}
