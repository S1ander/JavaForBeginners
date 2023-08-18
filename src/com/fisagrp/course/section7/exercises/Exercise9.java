package com.fisagrp.course.section7.exercises;

public class Exercise9 {
	public boolean isPerfectNumber(int number) {

		if (number <= 0) {
			return false;
		}
		int resultOfSum = 0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				resultOfSum += i;
			}

		}
		return resultOfSum == number;

	}
}
