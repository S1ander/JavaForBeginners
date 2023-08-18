package com.fisagrp.course.section7.exercises;

public class Exercise5 {
	// TriangleValidator

	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		// write your code here

		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		}
		int sumAngles = angle1 + angle2 + angle3;

		if (sumAngles == 180) {
			return true;
		}
		return false;

//		boolean isSumAngles180 = sumAngles == 180;
//
//		return isSumAngles180;
	}
}
