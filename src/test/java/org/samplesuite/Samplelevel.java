package org.samplesuite;

import org.testng.annotations.Test;

public class Samplelevel {

	@Test(invocationCount=3)
	private void tc7() {
		System.out.println("Test Case 7");
	}
	@Test(priority=9)
	private void tc5() {
		System.out.println("Test Case 5");
	}
	@Test(priority=-19)
	private void tc6() {
		System.out.println("Test Case 6");
	}

}
