package com.fisagrp.section26;

import java.util.List;
import java.util.Optional;

public class FunctionalProgrammingMagic5 {

	public static int findMaxEvenNumber(List<Integer> numbers) {
		if (numbers == null) {
			return 0;
		}

		Optional<Integer> maxEven = numbers.stream().filter(number -> number % 2 == 0).max(Integer::compare);

		return maxEven.orElse(0);
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 45, 67, 12, 34, 56, 78);
		int maxEven = findMaxEvenNumber(numbers);
		System.out.println("Max even number: " + maxEven);
	}
}
