package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.entity.PinTuanConfigEntity;
import org.springframework.stereotype.Service;

/**
 * Created by xuying on 2016/10/18.
 */

public interface PinTuanConfigService {

    public PinTuanConfigEntity selectByPrimaryKey(Integer id);

    public PinTuanConfigEntity selectByActivityId(Integer activityId);
}
