package com.fisagrp.section13.exercises;

public class Exercise3 {
	public boolean isVowel(char ch) {

		// Use a switch statement to check for each vowel, both lowercase and uppercase
		// to java 9

		switch (ch) {

		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;

		// TO JAVA >14
//			 switch (ch) {
//		        
//		        case 'A','a':
//		        case 'E','e':
//		        case 'I','i':
//		        case 'O','o':
//		        case 'U','u':return true;
//		        default: return false;
		}

	}
}
