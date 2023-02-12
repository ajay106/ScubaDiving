package seleniumPractice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajays\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		// driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		// driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		String usrName = "standard_user";
		String usrPass = "secret_sauce";
		By uName = By.id("user-name");
		By uPass = By.xpath("//*[@id=\"password\"]");
		By uButton = By.name("login-button");
		driver.findElement(uName).sendKeys(usrName);
		Thread.sleep(3000);
		driver.findElement(uPass).sendKeys(usrPass);
		String text=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4")).getText();
		Thread.sleep(3000);
		driver.findElement(uButton).click();
		Thread.sleep(3000);
		
	    Boolean	result=text.equals("Password for all users:");
	    if(result) {
	    	System.out.println("Test Case Passed");
	    }
	    else {
	    	System.out.println("Test Case Failed");
	    }
		System.out.println("Chrome Browser logoff successfully");
		
		driver.quit();

	}

}
