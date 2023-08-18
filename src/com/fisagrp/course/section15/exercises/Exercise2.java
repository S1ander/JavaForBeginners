package com.fisagrp.course.section15.exercises;

public class Exercise2 {
	public int getLastDigit(int number) {
		if (number == 0) {
			return 0;
		}
		if (number < 0) {
			return -1;
		}
		int lastDigit = number % 10;

		return lastDigit;
	}
}
