package com.fisagrp.section10.exercises.book;

public class Book {

	private int noOfCopies;

	// constructor

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	// getters and setter
	void setnoOfCopies(int noOfCopies) { // local variable
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	// methods used for control of numbers which will be inserted
	// and to change the state of an parameter
	public void increaseNoOfCopies(int howMuch) {
		setnoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
//		if (howMuch<=this.speed)
		setnoOfCopies(this.noOfCopies - howMuch);
	}
}
