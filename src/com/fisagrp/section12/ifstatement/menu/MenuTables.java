package com.fisagrp.section12.ifstatement.menu;

import java.util.Scanner;

public class MenuTables {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number1:");
		int number1 = scanner.nextInt();

		System.out.print("Enter number2:");
		int number2 = scanner.nextInt();

		System.out.println("What do you want to do: \n" + "1. Add \n" + "2. Subtract \n" + "3. Divide \n"
				+ "4. Multiply \n" + "Choose an Operation: ");
		int optionChoose = scanner.nextInt();

		switchCases(number1, number2, optionChoose);
		ifCases(number1, number2, optionChoose);

	}

	private static void switchCases(int number1, int number2, int optionChoose) {
		switch (optionChoose) {
		case 1:
			System.out.printf("%d + %d = %d", number1, number2, number1 + number2).println();
			break;
		case 2:
			System.out.printf("%d - %d = %d", number1, number2, number1 - number2).println();
			break;
		case 3:
			System.out.printf("%d / %d = %d", number1, number2, number1 / number2).println();
			break;
		case 4:
			System.out.printf("%d * %d = %d", number1, number2, number1 * number2).println();
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
	}

	private static void ifCases(int number1, int number2, int optionChoose) {
		if (optionChoose == 1) {
			System.out.printf("%d + %d = %d", number1, number2, number1 + number2).println();
		} else if (optionChoose == 2) {
			System.out.printf("%d - %d = %d", number1, number2, number1 - number2).println();
		} else if (optionChoose == 3) {
			System.out.printf("%d / %d = %d", number1, number2, number1 / number2).println();
		} else if (optionChoose == 4) {
			System.out.printf("%d * %d = %d", number1, number2, number1 * number2).println();
		} else {
			System.out.println("Invalid Operation");
		}
	}
}
