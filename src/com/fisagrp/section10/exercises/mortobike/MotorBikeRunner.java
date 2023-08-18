package com.fisagrp.section10.exercises.mortobike;

public class MotorBikeRunner {
	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somethingElse = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());

		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);

//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed = ducatiSpeed + 100;
//		ducati.setSpeed(ducatiSpeed);

		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);
		System.out.println(honda.getSpeed());

		honda.increaseSpeed(100);
		honda.decreaseSpeed(50);

//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed = hondaSpeed + 100;
//		honda.setSpeed(hondaSpeed);

		System.out.println(honda.getSpeed());
//		ducati.setSpeed(20);
//		honda.setSpeed(0);
	}
}
