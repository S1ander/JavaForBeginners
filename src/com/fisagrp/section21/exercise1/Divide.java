package com.fisagrp.section21.exercise1;

class Divide implements Operation {
	@Override
	public int perform(int x, int y) {
		if (y == 0) {
			return -1;
		}
		return x / y;
	}
}
