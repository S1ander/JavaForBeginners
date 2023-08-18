package com.fisagrp.section11.charvalues;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122)
			return true;

		if (ch >= 65 && ch <= 90)
			return true;
		return false;
	}

	public boolean isConsonant() {
		// TODO Auto-generated method stub
		if (isAlphabet() && !isVowel())
			return true;
		return false;

	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

}
