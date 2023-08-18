package com.fisagrp.course.section15.exercises;

public class Exercise3 {

	/**
	 * This method calculates and returns the number of digits in a given integer.
	 * If the number is negative, it returns -1. If the number is zero, it returns 1
	 * as zero is considered to have one digit.
	 * 
	 * @param number: an integer
	 * @return number of digits in number, or -1 if number is negative, or 1 if
	 *         number is zero.
	 */
	public int getNumberOfDigits(int number) {

		int numberOfDigits = 0;

		if (number == 0) {
			return 1;
		}
		if (number < 0) {
			return -1;
		}
		while (number > 0) {
			number = number / 10;
			numberOfDigits++;
		}
		return numberOfDigits;
	}
}
