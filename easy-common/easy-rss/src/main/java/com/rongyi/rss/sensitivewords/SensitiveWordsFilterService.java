package com.rongyi.rss.sensitivewords;

/**
 * Created by xgq on 2016/1/21.
 */
public interface SensitiveWordsFilterService {
    /**
     * 检查是否包含敏感词
     *
     * @param content
     * @param type    1为评论  2为商品名称,3昵称
     * @return true表示包含敏感词；false表示不包含敏感词
     */
    public boolean checkSensitiveWords(String content, int type);
}
