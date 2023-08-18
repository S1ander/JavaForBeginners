package com.fisagrp.section10.exercises.book;

public class Library {
	public static void main(String[] args) {
		// Instances
		
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(100);
		Book cleanCode = new Book(100);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
//		artOfComputerProgramming.setnoOfCopies(10);
//		effectiveJava.setnoOfCopies(10);
//		cleanCode.setnoOfCopies(11);

	}
}
