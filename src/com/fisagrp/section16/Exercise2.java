package com.fisagrp.section16;

public class Exercise2 {

	public boolean hasConsecutiveDuplicates(String str) {
		if (str.isEmpty() || str.length() == 1) {
			return false;
		}
		for (int i = 0; i < str.length() - 1; i++) {
			char currentChar = str.charAt(i);
			char nextChar = str.charAt(i + 1);

			if (currentChar == nextChar) {
				return true;
			}
		}

		return false;
	}
}
