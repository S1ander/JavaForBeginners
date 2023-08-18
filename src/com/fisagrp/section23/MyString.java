package com.fisagrp.section23;

public class MyString {

	public String str;

	public MyString(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
	}

	public boolean isHexadecimal() {
		if (str == null || str.length() == 0) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
				return false;
			}
		}

		return true;
	}

}
