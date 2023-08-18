package com.fisagrp.section10;

public class Exercise3 {

	// x-coordinate of the point
	private int x;

	// y-coordinate of the point
	private int y;

	// Constructor for the Point class
	public Exercise3(int x, int y) {
		this.x = x; // Assigning x-coordinate of the point
		this.y = y; // Assigning y-coordinate of the point
	}

	// Method to get the x-coordinate of the point
	public int getX() {
		return x;
	}

	// Method to get the y-coordinate of the point
	public int getY() {
		return y;
	}

	// TODO: Implement the method to move the point by dx and dy in x and y
	// direction respectively
	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	// TODO: Implement the method to calculate the distance from this point to
	// another point
	public double distanceTo(Exercise3 other) {
		int dx = this.x - other.x;
		int dy = this.y - other.y;
		// Your code here
		// calcular distancia entre dos entradas
		return Math.sqrt(dx * dx + dy * dy);
	}
}
