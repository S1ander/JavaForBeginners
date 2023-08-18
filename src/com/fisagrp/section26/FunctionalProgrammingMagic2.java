package com.fisagrp.section26;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic2 {

	public static List<Integer> getCubesOfFirstNNumbers(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Input cannot be negative");
		}

		return IntStream.range(1, n + 1).map(e -> e * e * e).boxed().collect(Collectors.toList());
	}
}
