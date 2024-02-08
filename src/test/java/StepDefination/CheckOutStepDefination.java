package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.CheckoutPage;
import Utils.TextContextSetUp;
import io.cucumber.java.en.Then;

public class CheckOutStepDefination {

	public WebDriver driver;
	public String HomepageText;
	public String ChildWindowText;
	TextContextSetUp textcontextsetup;
	public CheckoutPage checkoutPage;

	public CheckOutStepDefination(TextContextSetUp textcontextsetup) {

		this.textcontextsetup = textcontextsetup;
		this.checkoutPage=textcontextsetup.pageObjectManager.CheckoutPage();
	}

	@Then("^User proceed to checkout and validate the (.+) items in checkout page$")
	public void User_proceed_to_checkout_and_validate(String name) {

		checkoutPage.CheckoutItems();
		checkoutPage.ProductName().split("-")[0].trim();
	}

	@Then("Verify user has ability to enter promo code and place the order. ")
	public void Verify_user_has_ability_to_enter_promo_code_and_place_the_order() {

		
		Assert.assertTrue(checkoutPage.VerifyPromoButton());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
	}
}
