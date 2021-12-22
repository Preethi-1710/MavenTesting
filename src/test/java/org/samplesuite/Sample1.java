package org.samplesuite;

import org.testng.annotations.Test;

public class Sample1 {

	@Test
	private void tc3() {
		System.out.println("Test Case 3");
	}

	@Test(enabled=false)
	private void tc1() {
		System.out.println("Test Case 1");
	}

	@Test
	private void tc4() {
		System.out.println("Test Case 4");
	}

	@Test
	private void tc2() {
		System.out.println("Test Case 2");
	}

}
