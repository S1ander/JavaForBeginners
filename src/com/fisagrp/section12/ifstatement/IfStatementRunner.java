package com.fisagrp.section12.ifstatement;

public class IfStatementRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 23;

		if (i == 25) {
			System.out.println("i=25");
		} else if (i == 24) {
			System.out.println("i=24");
		} else {
			System.out.println("i!=25 and i!=24");
		}

		puzzle1();

	}

	private static void puzzle1() {
		int k = 15;

		if (k > 20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

}
