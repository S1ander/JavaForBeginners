package com.fisagrp.section23;

public class StringMagic2 {

	public String reverseWordsInSentence(String sentence) {
		// Edge case: if the sentence is null, return "INVALID"
		if (sentence == null) {
			return "INVALID";
		}

		// Edge case: if the sentence is empty, return an empty string
		if (sentence.isEmpty()) {
			return "";
		}

		// Split the sentence into words
		String[] words = sentence.split(" ");

		// Initialize a StringBuilder to store the reversed sentence
		StringBuilder reversedSentence = new StringBuilder();

		// Iterate over each word and reverse it
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversedSentence.append(reversedWord).append(" ");
		}

		// Trim any trailing whitespace and return the reversed sentence
		return reversedSentence.toString().trim();
	}
}
