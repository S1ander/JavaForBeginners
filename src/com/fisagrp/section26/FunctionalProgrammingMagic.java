package com.fisagrp.section26;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingMagic {

	public static List<Integer> filterOddNumbers(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
	}
}
