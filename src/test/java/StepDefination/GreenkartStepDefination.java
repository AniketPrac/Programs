package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import Utils.TextContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenkartStepDefination {

	public WebDriver driver;
	public String HomepageText;
	public String ChildWindowText;
	TextContextSetUp textcontextsetup;
	LandingPage landingPage;
	
	public GreenkartStepDefination(TextContextSetUp textcontextsetup) {
		
		this.textcontextsetup=textcontextsetup;
		this.landingPage=textcontextsetup.pageObjectManager.getlandingPage();
	}
	
	@Given("User is on greencart landing page")
	public void user_is_on_greencart_landing_page() {
		
		//Assert.assertTrue(landingPage.GetcurrentUrl().contains("GreenKart"));
		
}
	@When("^User is search with shortname (.+) and extract actual name of product$")
	public void user_is_search_with_shortname_and_extract_actual_name_of_product(String Sname) throws InterruptedException {
		
		
		//pageObjectManager=new PageObjectManager(textcontextsetup.driver);
		
		
		
		//LandingPage LandingPage=new LandingPage(textcontextsetup.driver);
		
		landingPage.searchText(Sname);
		
		//textcontextsetup.driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(name);
		
		Thread.sleep(2000);
		
		HomepageText=landingPage.SearchProductName().split("-")[0].trim();
	   
		System.out.println(HomepageText);
	}
	
	
//	@When("Added {String} items of selected product to cart")
//	public void Added_items_of_selected_product_to_cart(String quantity){
//		 
//		
//		landingPage.IncrementQuantity(Integer.parseInt(quantity));
//		landingPage.AddtoCart();
//	} 
	
}
