package com.fisagrp.course.section7.exercises;

public class Exercise3 {
	// Time converter

	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method
		if (hours < 0) {
			return -1;
		}
		int minutes = hours * 60;

		return minutes;
	}

	public static int convertDaysToMinutes(int days) {

		if (days < 0) {
			return -1;
		}

		int minutes = (60 * 24) * days;
		return minutes;
	}

}
