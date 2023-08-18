package com.fisagrp.section13.exercises;

public class Exercise1 {
	private int marks;

	public Exercise1(int marks) {
		// TODO: Assign 'marks' to the instance variable 'this.marks'
		this.marks = marks;
	}

	public char assignGrade() {
		// TODO: Implement the method which assigns the grade based on marks.
		// If marks are less than 0 or greater than 100, return 'X'
		// If marks are greater than or equal to 90, return 'A'
		// If marks are greater than or equal to 80, return 'B'
		// If marks are greater than or equal to 70, return 'C'
		// If marks are greater than or equal to 60, return 'D'
		// If marks are greater than or equal to 50, return 'E'
		// If marks are less than 50, return 'F'
		if (marks >= 0 && marks <= 100) {
			if (marks >= 90 && marks <= 100) {
				return 'A';
			} else if (marks >= 80 && marks < 90) {
				return 'B';
			} else if (marks >= 70 && marks < 80) {
				return 'C';
			} else if (marks >= 60 && marks < 70) {
				return 'D';
			} else if (marks >= 50 && marks < 60) {
				return 'E';
			} else if (marks < 50) {
				return 'F';
			}
		}
		return 'X';
	}
}
