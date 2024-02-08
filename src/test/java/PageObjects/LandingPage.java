package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	By Serach = By.xpath("//input[@type=\"search\"]");
	By ProductName = By.cssSelector("h4[class='product-name']");
	By ClickOnTopDeals = By.xpath("//a[normalize-space()='Top Deals']");
	By Incremaent = By.cssSelector("a.increment");
	By AddToCart=By.cssSelector(".product-action button");
	
	public void searchText(String Name) {

		driver.findElement(Serach).sendKeys(Name);
	}

	public String SearchProductName() {

		return driver.findElement(ProductName).getText();
	}
	
	public void IncrementQuantity(int quantity) {
		
	 int i=quantity-1;
	 while(i>0) {
		 
		 driver.findElement(Incremaent).click();
		 i--;
	 }
	}
	
	public void AddtoCart() {
		
		driver.findElement(AddToCart).click();
	}

	public void TopDeals() {

		driver.findElement(ClickOnTopDeals).click();
	}
	
	public String GetcurrentUrl() {
		
		return driver.getCurrentUrl();
	}
}
