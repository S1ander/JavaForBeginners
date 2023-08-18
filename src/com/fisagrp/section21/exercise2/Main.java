package com.fisagrp.section21.exercise2;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle("Circle", 5.0);
		circle.displayInfo();

		Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
		rectangle.displayInfo();
	}
}
