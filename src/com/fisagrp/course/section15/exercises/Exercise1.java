package com.fisagrp.course.section15.exercises;

public class Exercise1 {

	public int calculateFactorial(int number) {
		int factorial = 1;
		if (number < 0) {
			return -1;
		}

		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
