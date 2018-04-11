package com.db;

import java.util.Map;

public class Page {
	
	
	public byte getPageType() {
		return pageType;
	}
	public void setPageType(byte pageType) {
		this.pageType = pageType;
	}
	int pageNo;
	byte pageType;
	
	Map<Integer,Cell> records;
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public Map<Integer, Cell> getRecords() {
		return records;
	}
	public void setRecords(Map<Integer, Cell> records) {
		this.records = records;
	}

}
