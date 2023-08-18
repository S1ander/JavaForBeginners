package com.fisagrp.section26;

import java.util.List;

public class FunctionalProgrammingMagic4 {

	public static long sumOfSquares(List<Integer> numbers) {

		if (numbers == null) {
			return 0;
		}

		return numbers.stream().mapToLong(number -> number * number).sum();
	}
}
