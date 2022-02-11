package com.fdmgroup.bookstore.model;

public class AudioBook {

	private int timeLengthSeconds;

	public AudioBook(int timeLengthSeconds) {
		super();
		this.timeLengthSeconds = timeLengthSeconds;
	}

	public int getTimeLengthSeconds() {
		return timeLengthSeconds;
	}

	public void setTimeLengthSeconds(int timeLengthSeconds) {
		this.timeLengthSeconds = timeLengthSeconds;
	}
	
}
