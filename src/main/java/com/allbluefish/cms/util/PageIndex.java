/*
 * Copyright 2008. 
 * This document may not be reproduced, distributed or used 
 * in any manner whatsoever without the expressed written 
 * permission of Fish Corp. 
 *
 */

package com.allbluefish.cms.util;

/**
 * utility tool class for PageIndex.
 * 
 */
public class PageIndex {

	public static final String PAGE_NUM = "page";
	public static final String PAGE_ORDER = "pageOrder";
	private static final int PAGE_SIZE = 10;
	private int totalRows; // 总行数
	private int pageSize = PAGE_SIZE; // 每页显示的行数
	private int currentPage; // 当前页号
	private int startRow; // 当前页在数据库中的起始行
	private String pageUrl;// 当前页的URL

	public int getCurrentRows() {
		return (currentPage - 1) * pageSize;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public PageIndex() {
		this.pageUrl = "";
	}

	public PageIndex(String pageUrl, String servletPath, int pageSize) {
		this.pageSize = pageSize;
		this.pageUrl = pageUrl;
		this.pageUrl += servletPath;
	}

	public int getStartRow() {
		this.startRow = (this.currentPage - 1) * this.pageSize;
		return this.startRow;
	}

	public int getTotalPages() {
		int totalPages = totalRows / pageSize;
		int mod = totalRows % pageSize;
		if (mod > 0) {
			totalPages++;
		}
		return totalPages == 0 ? 1 : totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setTotalRows(int rows) {
		this.totalRows = rows;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void first() {
		currentPage = 1;
		startRow = 0;
	}

	public void previous() {
		if (currentPage == 1) {
			return;
		}
		currentPage--;
		startRow = (currentPage - 1) * pageSize;
	}

	/**
	 * call this method when the last but not first page is empty.
	 */
	public void clearPageNumber() {
		if (this.getCurrentPage() > 1
				&& this.getTotalPages() < this.getCurrentPage())
			this.setCurrentPage(this.getTotalPages());
	}

	public void next() {
		if (currentPage < getTotalPages()) {
			currentPage++;
		}
		startRow = (currentPage - 1) * pageSize;
	}

	public void last() {
		currentPage = getTotalPages();
		startRow = (currentPage - 1) * pageSize;
	}

	public void refresh(int currentPage) {
		this.currentPage = currentPage;
		if (this.currentPage > this.getTotalPages()) {
			last();
		}
	}
}
