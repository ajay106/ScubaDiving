package saucedemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import saucedemoPage.SaucedemoLoginPage;

public class SaucedemoLoginWithInvalidCredTest {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajays\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SaucedemoLoginPage login=new SaucedemoLoginPage(driver);
		login.SaucedemologinWithInvalid ();
		driver.quit();
	}
}
 