/**
 * @Copyright (C),上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年5月4日上午11:47:27
 * @Description: TODO
 *
 **/

package com.rongyi.rss.mms;

import java.util.List;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.domain.member.PhotoRead;
import com.rongyi.easy.domain.member.PhotoType;

/**
 * 
 * ClassName: PhotoReadService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 图片审核过后 <br/>
 * date: 2015年6月1日 下午5:16:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */

public interface PhotoReadService {

  public void insert(PhotoRead photoRead) throws RYServiceException;


  public void deletByMallIdAndPhotoType(String mallId, PhotoType photoType)
      throws RYServiceException;

  /**
   * 
   * deletAndinsertBatch:删除完了再插入数据库. <br/>
   * 
   * @author bin.zhang
   * @param mallId
   * @param photoType
   * @param photoReads
   * @throws RYServiceException
   * @since JDK 1.6
   */
  public void deleteAndinsertBatch(String mallId, PhotoType photoType, List<PhotoRead> photoReads)
      throws RYServiceException;

  public List<PhotoRead> queryByMallIdAndPhotoType(String mallId, PhotoType photoType)
      throws RYServiceException;

  public List<String> queryReturnFileUrl(String mallId, PhotoType photoType)
      throws RYServiceException;



}
