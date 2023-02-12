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

}
