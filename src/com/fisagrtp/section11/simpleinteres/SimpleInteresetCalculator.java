package com.fisagrtp.section11.simpleinteres;

import java.math.BigDecimal;

public class SimpleInteresetCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInteresetCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// total value=principal + principal * interest * noOfYEARS

		return principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
	}

}
