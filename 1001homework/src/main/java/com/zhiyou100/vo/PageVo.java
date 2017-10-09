package com.zhiyou100.vo;

public class PageVo {
	
	/**
	 * 页码
	 */
	private Integer pageIndex;
	
	/**
	 * 查询条数
	 */
	private Integer pageSize;
	
	/**
	 * 查询的起始位置
	 */
	private Integer startIndex;

	@Override
	public String toString() {
		return "PageVo [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", startIndex=" + startIndex + "]";
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	// 重写 getter 方法计算数据库起始位置
	public Integer getStartIndex() {
		
		if (pageIndex != null && pageSize != null) {
			
			return (pageIndex - 1) * pageSize;
		}else {
			
			return null;
		}
	}
}
