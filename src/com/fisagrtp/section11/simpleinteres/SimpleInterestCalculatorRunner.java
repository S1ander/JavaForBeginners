package com.fisagrtp.section11.simpleinteres;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInteresetCalculator calculator = new SimpleInteresetCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}

}
