package com.fisagrp.section19;

public class Exercise4 {

	public boolean isSorted(int[] array) {

		// Edge case: If the array length is 1 or less, it is technically sorted, so
		// return true.
		if (array.length <= 1) {
			return true;
		}

		// Iterate over the array, starting from the second element
		for (int i = 1; i < array.length; i++) {
			// If the current element is less than the previous one, the array is not
			// sorted, so return false.
			if (array[i] < array[i - 1]) {
				return false;
			}
		}

		// If the method has not returned yet, that means no elements were out of order,
		// so the array is sorted.
		return true;
	}
}
