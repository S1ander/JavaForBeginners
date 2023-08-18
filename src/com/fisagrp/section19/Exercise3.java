package com.fisagrp.section19;

public class Exercise3 {
	private int[] array1;
	private int[] array2;

	public Exercise3(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		return sum1 == sum2;
	}

	private int calculateSum(int[] array) {

		int sum = 0; // Initialize sum to 0

		for (int num : array) {
			sum += num;
		}

		return sum;
	}
}