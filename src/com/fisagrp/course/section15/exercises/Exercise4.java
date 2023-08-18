package com.fisagrp.course.section15.exercises;

public class Exercise4 {

	public int getSumOfDigits(int number) {
		// Write your code here
		int sumOfDigits = 0;

		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}
		while (number > 0) {
			int digit = number % 10;
			sumOfDigits += digit;
			number /= 10;
		}
		return sumOfDigits;
	}
}
