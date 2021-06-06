package comunity.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassregister {
	public static WebDriver driver;
	public static Actions ac;
	public static Alert al;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	public static ArrayList<String> a;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void toGetTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);

	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static String enteredTxt(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toMove(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element);
	}

	public static void toContext(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element);

	}

	public static void toDrop(WebElement src, WebElement dest) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, dest);

	}

	public static void alertAccept() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		driver.switchTo().defaultContent();

	}

	public static void alertDismiss() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		driver.switchTo().defaultContent();

	}

	public static void alertType(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);

	}

	public static void alertGetTxt() {
		al = driver.switchTo().alert();
		al.getText();

	}

	public static void screenshot(String value) throws IOException {
		ts = (TakesScreenshot) driver;
		File dest = new File("C:\\Users\\aravi\\eclipse-workspace\\screenshot");
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);

	}

	public static void frameName(String name) {
		driver.switchTo().frame(name);

	}

	public static void frameIndex(int i) {
		driver.switchTo().frame(i);

	}

	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void frameParent() {
		driver.switchTo().parentFrame();

	}

	public static void framedefault() {
		driver.switchTo().defaultContent();

	}

	public static void selectIndex(WebElement element, int i) {
		s = new Select(element);
		s.selectByIndex(i);
	}

	public static void selectText(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void selectValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void multiple(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void allSelectedOption(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());

		}

	}

	public static void firstSelected(WebElement element) {
		s = new Select(element);
		WebElement firstSelected = s.getFirstSelectedOption();
		System.out.println(firstSelected);

	}

	public static void deselectIndex(WebElement element, int i) {
		s = new Select(element);
		System.out.println(i);

	}

	public static void deselectVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deselectValue(WebElement element, String text) {
		s = new Select(element);
		s.deselectByValue(text);

	}

	public static void windowsId() {
		Set<String> windowsId = driver.getWindowHandles();
		System.out.println(windowsId);
		

	}

	public static void windowId() {
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	}

}
