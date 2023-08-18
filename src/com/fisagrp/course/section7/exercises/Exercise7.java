package com.fisagrp.course.section7.exercises;

public class Exercise7 {
	public long calculateSumOfSquares(int n) {
		// write your code here

		if (n < 0) {
			return -1;
		}

		long sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		return sum;

	}
}
