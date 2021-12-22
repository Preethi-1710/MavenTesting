package org.samplesuite;

import org.testng.annotations.Test;

public class Samplelevel3 {

	@Test(enabled=false)
	private void tc10() {
		System.out.println("Test Case 10");
	}

	@Test(priority=-87)
	private void tc8() {
		System.out.println("Test Case 8");
	}

	@Test(priority=-9,invocationCount=5)
	private void tc9() {
		System.out.println("Test Case 9");
	}
}
