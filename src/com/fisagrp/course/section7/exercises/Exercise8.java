package com.fisagrp.course.section7.exercises;

public class Exercise8 {
	public boolean isLeapYear(int year) {

		if (year <= 0) {
			return false;
		}
		if (year % 4 != 0) {
			return false;
		}
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		if (year % 4 == 0 && year % 100 == 0) {
			if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				return true;
			}
			if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
				return false;
			}
		}
		return false;
	}
}
