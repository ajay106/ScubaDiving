package saucedemoPage;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoHomePage {
	WebDriver driver;
	By appLogo = By.className("app_logo");
	By addToCartBackPack = By.id("add-to-cart-sauce-labs-backpack");
	By cart = By.className("shopping_cart_badge");
	By yourCart = By.className("header_secondary_container");
	String actualTextYourCart = "Your Cart";
	By checkOut = By.id("checkout");
	String actualCheckOut = "CHECKOUT: YOUR INFORMATION";
	By checkOutPage = By.className("title");
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By zipCode = By.id("postal-code");
	By continueBtn = By.id("continue");
	String actualOverview = "Checkout: Overview";
	By overviewPageTitle = By.xpath("//*[@class='title']");
	By finishBtn = By.id("finish");
	By checkOutCmpltTitle = By.className("title");
	String actualCheckOutComplete = "Checkout: Complete!";
	By addToCartBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
	By addToCartBoltTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By addToCartFleeceJacket = By.xpath("//*[@data-test='add-to-cart-sauce-labs-fleece-jacket']");
	By addToOnesie = By.id("add-to-cart-sauce-labs-onesie");
	By removeBtn =By.id("remove-sauce-labs-backpack");

	public SaucedemoHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void singleProductSelectPage() {
		boolean appLogoStatus = driver.findElement(appLogo).isDisplayed();

		if (appLogoStatus) {
			System.out.println("Successfully logged in to the home page");
		}
		driver.findElement(addToCartBackPack).click();
		String Cartvalue = driver.findElement(cart).getText();
		System.out.println("Added" + Cartvalue + "product in to the cart");
	}
	public void multiProductSelectPage() throws InterruptedException {
		boolean appLogoStatus = driver.findElement(appLogo).isDisplayed();
		if (appLogoStatus) {
			System.out.println("Successfully logged in to the home page");
		}
		//driver.findElement(removeBtn).click();
		Thread.sleep(4000);
		driver.findElement(addToCartBackPack).click();
		driver.findElement(addToCartBikeLight).click();
		driver.findElement(addToCartBoltTshirt).click();
		driver.findElement(addToCartFleeceJacket).click();
		driver.findElement(addToOnesie).click();
		String Cartvalue = driver.findElement(cart).getText();
		System.out.println("Added" + Cartvalue + "product in to the cart");
	}
	public void yourCartPage() {
		driver.findElement(cart).click();
		String yourCartTitle = driver.findElement(yourCart).getText();
		assertEquals(actualTextYourCart, yourCartTitle, "You cart page opened");
		driver.findElement(checkOut).click();
	}
	public void checkOutPage() {
		String checkOutTitle = driver.findElement(checkOutPage).getText();
		if (actualCheckOut.equalsIgnoreCase(checkOutTitle)) {
			System.out.println("You are in checkOut page");
		}
		driver.findElement(firstName).sendKeys("ajay");
		driver.findElement(lastName).sendKeys("patil");
		driver.findElement(zipCode).sendKeys("411033");
		driver.findElement(continueBtn).click();
	}
	public void checkOutOverviewPage() {
		String overViewTitle = driver.findElement(overviewPageTitle).getText();
		if (actualOverview.equalsIgnoreCase(overViewTitle)) {
			System.out.println("You are in checkOutOverview  page");
		}
		driver.findElement(finishBtn).click();
	}
	public void checkOutComplete() {
		String completeCheckOutTitle = driver.findElement(checkOutCmpltTitle).getText();
		if (actualCheckOutComplete.equalsIgnoreCase(completeCheckOutTitle)) {
			System.out.println("You are in checkout complete page. You orderred product successfully");
		}
	}
}
