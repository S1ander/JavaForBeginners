package com.fisagrp.section32;

enum DaysOfWeek {

	MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"),
	SATURDAY("Saturday"), SUNDAY("Sunday");

	private String name;

	DaysOfWeek(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isWeekday() {
		return this != SATURDAY && this != SUNDAY;
	}

	public boolean isHoliday() {
		return this == SATURDAY || this == SUNDAY;
	}

}