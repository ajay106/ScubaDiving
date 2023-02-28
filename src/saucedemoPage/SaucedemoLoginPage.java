package saucedemoPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoLoginPage {
	WebDriver driver;
	By uName = By.id("user-name");
	By uPass = By.xpath("//*[@id=\"password\"]");
	By uButton = By.name("login-button");
	String usrName = "standard_user";
	String usrPass = "secret_sauce";
	By errMsg=By.xpath("//*[@class='error-message-container error']");
	String actErrorMsg="Epic sadface: Username and password do not match any user in this service";
	public  SaucedemoLoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void Saucedemologin() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(uName).sendKeys(usrName);
		driver.findElement(uPass).sendKeys(usrPass);
		driver.findElement(uButton).click();
	}
	public void SaucedemologinWithInvalid() throws InterruptedException {
		driver.get("https://www.saucedemo.com/"); 
		Thread.sleep(3000);
		driver.findElement(uName).sendKeys("Inv");
		Thread.sleep(3000);
		driver.findElement(uPass).sendKeys("pas");
		Thread.sleep(3000);
		driver.findElement(uButton).click();
		Thread.sleep(3000);
		String gettingErrorMsg=driver.findElement(errMsg).getText();
		if(actErrorMsg.equalsIgnoreCase(gettingErrorMsg))
		{
			System.out.println("Test Case Passed Actual error message : " + gettingErrorMsg);
		}
	}

}
