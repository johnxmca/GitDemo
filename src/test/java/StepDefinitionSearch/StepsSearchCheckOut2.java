package StepDefinitionSearch;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Base.Base;
import PageObjModel.CheckOutPage;
import PageObjModel.HomePage;

public class StepsSearchCheckOut2 extends Base{

	

	HomePage homepg;
	CheckOutPage checkpg ;
	



	@When("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		homepg=new HomePage(driver);
		homepg.addToCart().click();

	}

	@When("^user proceeded to checkout page$")
	public void user_proceeded_to_checkout_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homepg.cartIconClick().click();
		homepg.ProceedtoCheckOutClick().click();
		Thread.sleep(4000L);

	}

	@Then("^verify selcted \"([^\"]*)\" item is dispalyed in checkout page$")
	public void verify_selcted_item_is_dispalyed_in_checkout_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		checkpg = new CheckOutPage(driver);
		Assert.assertTrue(checkpg.checkProductName().getText().contains(arg1));

	}
	
	

    @Then("^verify selected (.+) item is been displayed in checkout page$")
    public void verify_selected_item_is_been_displayed_in_checkout_page(String name) throws Throwable {
        
    	checkpg = new CheckOutPage(driver);
		Assert.assertTrue(checkpg.checkProductName().getText().contains(name));
    	
    }

}