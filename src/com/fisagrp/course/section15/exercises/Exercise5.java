package com.fisagrp.course.section15.exercises;

public class Exercise5 {
	public int reverseNumber(int number) {
		// TODO: Write your code here
		int reversedNumber = 0;
		int digit = 1;

		if (number == 0) {
			return 0;
		}
		if (number < 0) {
			return -1;
		}

		while (number > 0) {
			digit = number % 10;
			number /= 10;
			reversedNumber = reversedNumber * 10 + digit;

		}
		return reversedNumber;

	}
}
