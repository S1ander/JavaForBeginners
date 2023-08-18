package com.fisagrp.section12.switchexercises;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determineNameOfDay(1));
		System.out.println(determineWeekDay(2));

	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";

		}

		return "Invalid day";

	}

	public static boolean determineWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		case 6:
			return false;

		}

		return false;

	}

	public static String determineMonthOfYear(int dayNumber) {
		switch (dayNumber) {

		case 1:
			return "January";
		case 2:
			return "Febrary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "Agost";
		case 9:
			return "Tuesday";
		case 10:
			return "Wednesday";
		case 11:
			return "Thursday";
		case 12:
			return "Friday";
		}

		return "Invalid day";

	}

}
