package com.zhiyou100.util;

import java.util.List;

/**
 * 分页展示的封装
 */
public class PageInfo<T> {

	/**
	 * 当前页码
	 */
	private int pageIndex;
	
	/**
	 * 总页数
	 */
	private int pageCount;
	
	/**
	 * 当前页数据
	 */
	private List<T> data;

	public PageInfo() {
		super();
	}

	public PageInfo(int pageIndex, int pageCount, List<T> data) {
		super();
		this.pageIndex = pageIndex;
		this.pageCount = pageCount;
		this.data = data;
	}

	@Override
	public String toString() {
		return "PageInfo [pageIndex=" + pageIndex + ", pageCount=" + pageCount + ", data=" + data + "]";
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
