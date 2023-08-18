package com.fisagrp.section19;

public class Exercise1 {
	public boolean doesHaveElementGreaterThan(int[] array, int number) {

		if (array.length == 0) {
			return false;
		}

		for (int element : array) {

			if (element > number) {
				return true;
			}
		}

		return false;
	}
}
