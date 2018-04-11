package com.db;

public class Cell {
	
	int pageNumber;
	short payLoadSize;
	int rowId;
	Payload payload;
	short location;
	
	public short getLocation() {
		return location;
	}
	public void setLocation(short location) {
		this.location = location;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	
	public short getPayLoadSize() {
		return payLoadSize;
	}
	public void setPayLoadSize(short payLoadSize) {
		this.payLoadSize = payLoadSize;
	}
	public int getRowId() {
		return rowId;
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	

}
