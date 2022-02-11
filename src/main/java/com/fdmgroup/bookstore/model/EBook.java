package com.fdmgroup.bookstore.model;

public class EBook {

	private double sizeMegaBytes;

	public EBook(double sizeMegaBytes) {
		super();
		this.sizeMegaBytes = sizeMegaBytes;
	}

	public double getSizeMegaBytes() {
		return sizeMegaBytes;
	}

	public void setSizeMegaBytes(double sizeMegaBytes) {
		this.sizeMegaBytes = sizeMegaBytes;
	}
	
}
