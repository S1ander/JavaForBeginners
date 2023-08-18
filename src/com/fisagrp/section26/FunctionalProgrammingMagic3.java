package com.fisagrp.section26;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingMagic3 {

	public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
		if (courses == null) {
			return List.of();
		}

		return courses.stream().map(String::length).collect(Collectors.toList());
	}
}
