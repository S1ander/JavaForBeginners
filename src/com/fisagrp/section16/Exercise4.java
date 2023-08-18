package com.fisagrp.section16;

public class Exercise4 {
	public String findLongestWord(String sentence) {

		if (sentence.isEmpty()) {
			return "";
		}

		String[] words = sentence.split(" ");

		String longestWord = "";
		int maxLength = 0;

		for (String word : words) {

			if (word.length() > maxLength) {
				longestWord = word;
				maxLength = word.length();
			}
		}

		return longestWord;
	}
}
