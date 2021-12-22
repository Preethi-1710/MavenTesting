package org.testng;


	import java.util.Date;

	import org.base.BaseClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Sample extends BaseClass {

		@BeforeMethod
		private void bef() {
			Date d = new Date();
			System.out.println(d);

		}

		@BeforeClass
		private void befClass() {
			launchBrowser();
			loadUrl("https://en-gb.facebook.com/");
			maxBrowser();

		}

		@Test
		private void tc1() {
			pageTitle();

		}

		@AfterMethod
		private void aft() {
			Date d = new Date();
			System.out.println(d);

		}

		@AfterClass
		private void aftClass() {

			quitBrowser();
		}

	}



