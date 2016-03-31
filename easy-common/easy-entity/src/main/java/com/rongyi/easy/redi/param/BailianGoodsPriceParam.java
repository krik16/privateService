package com.rongyi.easy.redi.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 
 * @author rongyi-13 2015年1月14日 下午5:41:38
 */
public class BailianGoodsPriceParam extends BaseParam implements Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  private String ownerId;
  /**
   * 商场id
   */
  private String mallId;


  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  private List<BailianGoodsPriceOptionParam> list;

  public List<BailianGoodsPriceOptionParam> getList() {
    return list;
  }

  public void setList(List<BailianGoodsPriceOptionParam> list) {
    this.list = list;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


}
