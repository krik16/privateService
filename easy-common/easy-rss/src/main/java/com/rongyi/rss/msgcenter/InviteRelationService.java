package com.rongyi.rss.msgcenter;

import com.rongyi.easy.msgcenter.vo.InviteRelationVo;

import java.util.List;

/**
 * Created by shaozhou on 2016/8/26.
 */
public interface InviteRelationService {

    List<InviteRelationVo> getInviteRecordByUserId(Integer userId);
}
