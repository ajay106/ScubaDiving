package saucedemoTest;

import org.testng.annotations.Test;

import saucedemoPage.SaucedemoHomePage;
import saucedemoPage.SaucedemoLoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SauceTest {
	@Test(priority = 0)
	public void validateValidLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajays\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SaucedemoLoginPage login = new SaucedemoLoginPage(driver);
		login.Saucedemologin();
		driver.quit();
	}

	@Test(priority = 1)
	public void validInvalidLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajays\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SaucedemoLoginPage login = new SaucedemoLoginPage(driver);
		login.SaucedemologinWithInvalid();
		driver.quit();
	}

	@Test(priority = 2)
	public void selectSingleProduct() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajays\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SaucedemoHomePage homePage = new SaucedemoHomePage(driver);
		SaucedemoLoginPage login = new SaucedemoLoginPage(driver);
		login.Saucedemologin();
		homePage.singleProductSelectPage();
		homePage.yourCartPage();
		homePage.checkOutPage();
		homePage.checkOutOverviewPage();
		homePage.checkOutComplete();
		driver.quit();
	}
	@Test //(priority = 3)
	public void selectMultiProduct() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajays\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SaucedemoHomePage homePage = new SaucedemoHomePage(driver);
		SaucedemoLoginPage login = new SaucedemoLoginPage(driver);
		login.Saucedemologin();
		homePage.multiProductSelectPage();
		homePage.yourCartPage();
		homePage.checkOutPage();
		homePage.checkOutOverviewPage();
		homePage.checkOutComplete();
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNg test has started");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestNg test has stopped");
	}
}
