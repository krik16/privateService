package com.rongyi.rss.messagement;
/**
 * 提供给mobile mallife
 * @author lijing
 *
 */
public interface MMNoticePraiseService {
	/**
	 * 点赞或取消点赞，    type 0是点赞  1是取消
	 * @param noticeId
	 * @param userId
	 * @param type
	 * @return
	 * @throws Exception
	 */
   public Boolean saveOrDeletePraise(Integer noticeId,String userId,int type) throws Exception;
   /**
    * 判断这个人 有没有点赞
    * @param noticeId
    * @param userId
    * @return
    */
   public Boolean isPraise(Integer noticeId,String userId);
}
