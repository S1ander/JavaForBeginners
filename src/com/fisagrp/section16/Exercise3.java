package com.fisagrp.section16;

public class Exercise3 {
	public int getRightmostDigit(String str) {

		if (str.isEmpty()) {
			return -1;
		}

		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				return Character.getNumericValue(c);
			}
		}

		return -1;
	}
}
