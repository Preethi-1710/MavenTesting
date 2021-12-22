package org.testngsuite;

import org.testng.annotations.Test;

public class CompanyDetails {

	@Test(priority = -7)
	private void company3() {
		System.out.println("Company 3: Zoho");

	}

	@Test(priority = 7)
	private void company1() {
		System.out.println("Company 1: TCS");
	}

	@Test(priority = 17, invocationCount = 4)
	private void company2() {
		System.out.println("Company 2: CTS");

	}

}
