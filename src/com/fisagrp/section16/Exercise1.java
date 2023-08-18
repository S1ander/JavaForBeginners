package com.fisagrp.section16;

public class Exercise1 {

	public int countUppercaseLetters(String str) {
		int count = 0;

		if (str.isEmpty()) {
			return count;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		return count;
	}
}