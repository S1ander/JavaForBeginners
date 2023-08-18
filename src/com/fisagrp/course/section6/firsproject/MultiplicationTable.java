package com.fisagrp.course.section6.firsproject;

public class MultiplicationTable {

	void printMultiplicationTable() {
		// for (int i = 1; i <= 10; i++) {
		// System.out.printf("%d * %d =%d", 5, i, 5 * i).println();
		// }

		printMultiplicationTable(5);

	}

	void printMultiplicationTable(int table) {
		// for (int i = 1; i <= 10; i++) {
		// System.out.printf("%d * %d =%d", table, i, table* i).println();
		// }

		printMultiplicationTable(table, 1, 10);

	}

	void printMultiplicationTable(int table, int from, int to) {

		for (int i = from; i <= to; i++) {

			System.out.printf("%d * %d =%d", table, i, table * i).println();

		}

	}

}
