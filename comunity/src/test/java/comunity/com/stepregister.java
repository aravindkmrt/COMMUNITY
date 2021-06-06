package comunity.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepregister extends Baseclassregister {
	Pojomatrimony l;

	@Given("user have to enter into comunity matrimony page")
	public void user_have_to_enter_into_comunity_matrimony_page() throws InterruptedException {

		launchBrowser();
		loadUrl("https://www.communitymatrimony.com/");
		driver.findElement(By.xpath("//a[@data-content='register_free']")).click();
		WebElement w1 = driver.findElement(By.xpath("//select[@id='domainName']"));
		selectValue(w1, "konguvellalarmatrimony");
		WebElement w2 = driver.findElement(By.xpath("//select[@id='profile']"));
		selectIndex(w2, 1);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kavinkumar");
		driver.findElement(By.xpath("(//*[@class='radiolabel radio_button'])[1]")).click();
		WebElement w3 = driver.findElement(By.xpath("//*[@id='dobDay']"));
		selectIndex(w3, 24);
		WebElement w4 = driver.findElement(By.xpath("//*[@id='dobMonth']"));
		selectIndex(w4, 9);
		WebElement w5 = driver.findElement(By.xpath("//*[@id='dobYear']"));
		selectValue(w5, "1997");
		WebElement w6 = driver.findElement(By.xpath("//*[@id='maritalStatus']"));
		selectIndex(w6, 1);
		WebElement w7 = driver.findElement(By.xpath("//*[@id='subCaste']"));
		selectValue(w7, "Sempoothan");
		WebElement w8 = driver.findElement(By.xpath("//*[@id='motherTongue']"));
		selectValue(w8, "Tamil");
		driver.findElement(By.xpath("//*[@id='mobileNo']")).sendKeys("8220553047");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Kk8220553047");
		driver.findElement(By.xpath("//*[@value='REGISTER NOW']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kaviselvam609@gmail.com");

	}

	public void user_have_to_pass_valid_username_and_valid_password() throws InterruptedException {
//		driver.findElement(By.xpath("(//*[@name='idEmail'])[1]")).sendKeys("aravindkmrt@gmail.com");
//		WebElement pass = driver.findElement(By.xpath("//*[@id='passwordClear1']"));
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].setAttribute('value','Aravind1723')", pass);
//
	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() {
		//driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
	}

	@Then("user should be invalid credentials page")
	public void user_should_be_invalid_credentials_page() {
//		WebElement f = driver.findElement(By.xpath("(//*[contains(text(),'Invalid Matrimony')])[2]"));
//		if (f.isDisplayed()) {
//			System.out.println("incorrect password");
//
//		} else {
//			System.out.println("correct password");
//		}

	}

}
