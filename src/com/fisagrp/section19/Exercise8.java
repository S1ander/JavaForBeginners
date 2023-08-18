package com.fisagrp.section19;

import java.util.ArrayList;
import java.util.List;

public class Exercise8 {

	public List<Integer> determineMultiples(int number, int limit) {

		// Edge case: If the number is 0 or negative, or the limit is 0 or less, return
		// an empty list
		if (number <= 0 || limit <= 0) {
			return new ArrayList<>();
		}

		List<Integer> multiples = new ArrayList<>();

		// Starting from 1, multiply the number by each integer until the product is
		// less than the limit
		for (int i = 1; i * number < limit; i++) {
			// Add the product to the list
			multiples.add(i * number);
		}

		return multiples;
	}
}
