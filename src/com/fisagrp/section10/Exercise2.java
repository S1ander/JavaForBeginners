package com.fisagrp.section10;

public class Exercise2 {

	private int side;

	public Exercise2(int side) {
		if (side > 0)
			this.side = side;
	}

	public int calculateArea() {
		// TODO: Calculate and return the area of the square
		// area= side*side
		if (this.side <= 0) {
			return -1;
		}
		return (this.side * this.side);

	}

	public int calculatePerimeter() {
		// TODO: Calculate and return the perimeter of the square
		// perimeter= 4(sides)
		// side=<0 return -1
		if (this.side <= 0) {
			return -1;
		}
		return (4 * this.side);

	}

}
