package com.fisagrp.section10.exercises.mortobike;

public class MotorBike {
	// state
	// behaviour
	private int speed;

	// constructor

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	// methods
	public void setSpeed(int speed) {
//		System.out.println(speed);
//		System.out.println(this.speed);
		if (speed > 0)
			this.speed = speed;

	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
//		if (howMuch<=this.speed)
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("New item added");
	}
}
