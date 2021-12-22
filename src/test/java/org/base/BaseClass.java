package org.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert ale;
	public static TakesScreenshot tk;
	public static JavascriptExecutor js;
	public static Select s;
	public static WebDriverWait w;

	// to launch Browser
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// to get Url
	public static void loadUrl(String url) {
		driver.get(url);

	}

	// to maximize the browser
	public static void maxBrowser() {
		driver.manage().window().maximize();

	}

	// to get webpage title
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	// to get current webpage url
	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// to quit the browser
	public static void quitBrowser() {
		driver.quit();
	}

	// to send the values in text box
	public static void sendKeys(WebElement e, String text) {
		e.sendKeys(text);

	}

	// to click the button
	public static void butnClick(WebElement e) {
		e.click();
	}

	// to get the text
	public static void performGetText(WebElement e) {
		String text = e.getText();
		System.out.println(text);

	}

	// to perform move to element
	public static void performMoveToElement(WebElement e) {
		a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	// to perform Drag and drop
	public static void peformDragAndDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();

	}

	// to perform double click
	public static void peformDoubleClick(WebElement e) {
		a.doubleClick(e).perform();
	}

	// to peform context click
	public static void peformContextClick(WebElement e) {
		a.contextClick(e).perform();

	}

	// to perform key up button
	public static void performKeyUp(WebElement e) {
		a.keyUp(e, Keys.SHIFT).perform();
	}

	// to perform key down button
	public static void performKeyDown(WebElement e) {
		a.keyDown(e, Keys.SHIFT).perform();

	}

	// to perform enter key
	public static void performEnter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// to perform down key
	public static void peformDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// to accept the alert
	public static void acceptAlert() {
		ale.accept();
	}

	// to dismiss the alert
	public static void dismissAlert() {
		ale.dismiss();
	}

	// to get screenshot
	public static void getScreenshot() throws IOException {
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\preet\\eclipse-workspace\\Selenium7Task\\screenshots\\scr1.png");
		FileUtils.copyFile(src, dest);
	}

	// to scroll up the page
	public static void scrollUp(WebElement pageUp) {
		js.executeScript("arguments[0].scrollIntoView(false)", pageUp);

	}

	// to scroll down the page
	public static void scrollDown(WebElement pageDown) {
		js.executeScript("arguments[0].scrollIntoView(true)", pageDown);
	}

	// to insert the value [if send keys method not worked]
	public static void setAttribute(WebElement e, String text) {
		js.executeScript("arguments[0].setAttribute('value','text')", e);
	}

	// to get a text entered in a text box [replacement for getText]
	public static void getAttribute(WebElement e) {
		Object obj = js.executeScript("arguments[0].getAttribute('Value')", e);
		String s = (String) obj;
		System.out.println(s);
	}

	// to click the button using javascriptexecutor
	public static void click(WebElement e) {
		js.executeScript("arguments[0].click()", e);
	}

	// to switch to string id or name using frames
	public static void switchToStringId(String text) {
		driver.switchTo().frame(text);
	}

	// to switch web element ref name using frames
	public static void switchToWebElementref(WebElement e) {
		driver.switchTo().frame(e);
	}

	// to switch index using frames
	public static void swithcToIndex(int index) {
		driver.switchTo().frame(index);
	}

	// to switch parent frame
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	// to switch default content
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// to fetch parent window id
	public static void parentWindowId() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

	}

	// to fetch all window ids
	public static void fetchAllWindows() {
		Set<String> allWindowsId = driver.getWindowHandles();
		allWindowsId.addAll(allWindowsId);

	}

	// to switch window url
	public static void switchWindowUrl(String url) {
		driver.switchTo().window(url);
	}

	// to switch window title
	public static void switchWindowTitle(String title) {
		driver.switchTo().window(title);
	}

	// to switch window id
	public static void switchWindowId(String windowId) {
		driver.switchTo().window(windowId);
	}

	// to select by index in Drop down
	public static void selectByIndex(int index) {
		s.selectByIndex(index);
	}

	// to select by visible text in drop down
	public static void selectByVisibleText(String text) {
		s.selectByVisibleText(text);
	}

	// to select by value in drop down
	public static void selectByValue(String value) {
		s.selectByValue(value);

	}

	// to select multiple options in drop down
	public static void selectMultipleOptions() {
		boolean b = s.isMultiple();
		System.out.println(b);
	}

	// to get first selected option in drop down
	public static void firstSelectedOption() {
		WebElement firstSelected = s.getFirstSelectedOption();
		System.out.println(firstSelected.getText());

	}

	// to deselect by Index in drop down
	public static void deselectByIndex(int index) {
		s.deselectByIndex(index);
	}

	// to deselect by visible text in drop down
	public static void deselectByVisibleText(String text) {
		s.deselectByVisibleText(text);
	}

	// to deselect by value in drop down
	public static void deselectByValue(String value) {
		s.deselectByValue(value);
	}

	// to deselect all in drop down
	public static void deselectAll() {
		s.deselectAll();
	}

	// implicit wait
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// explicit wait [alertIsPresent]
	public static void explicitWait() {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.alertIsPresent());
	}

	public static String excelRead(String SheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\preet\\eclipse-workspace\\MavenProj\\workbook\\DataRead.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sh = book.getSheet(SheetName);

		Row r = sh.getRow(rowNo);

		Cell c = r.getCell(cellNo);

		int type = c.getCellType();

		String name = "";

		if (type == 1) {
			name = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dat = c.getDateCellValue();
			System.out.println(dat);

			SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-YYYY");
			name = sim.format(dat);

		} else {
			double d = c.getNumericCellValue();
			System.out.println(d);
			long log = (long) d;
			System.out.println(log);
			name = String.valueOf(log);
		}
		return name;

	}

}
