package org.testngsuite;

import org.testng.annotations.Test;

public class BankInfo {

	@Test
	private void bank2() {
		System.out.println("Bank Info 2: Axis Bank");
	}

	@Test(enabled = false)
	private void bank3() {
		System.out.println("Bank Info 3: Canara Bank");

	}

	@Test(priority=-77)
	private void bank1() {
		System.out.println("Bank Info 1: Hdfc bank");
	}
}
