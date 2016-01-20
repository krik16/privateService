package com.rongyi.easy.redi.param;

import java.util.List;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.redi.vo.BailianActivityVo;

/**
 * 活动信息同步   参数
 * @author user 
 */
public class ActivityParam extends BaseParam{

    private final static String ownerId = com.rongyi.core.constant.Constants.OWNERID.BAILIAN;
    
	private Integer count;
	private Integer currentPage;
	private Integer pageSize;
	private Integer pages;
	private Integer end;
	private Integer start;
    
    private List<BailianActivityVo> list;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public List<BailianActivityVo> getList() {
		return list;
	}

	public void setList(List<BailianActivityVo> list) {
		this.list = list;
	}

    public String getOwnerId() {
        return ownerId;
    }
}
