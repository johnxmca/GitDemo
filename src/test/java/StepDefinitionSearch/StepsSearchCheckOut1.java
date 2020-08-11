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

public class StepsSearchCheckOut1 {

	public WebDriver driver;

	HomePage homepg;
	CheckOutPage checkpg;

	@Given("^User is on Greencart landing page$")
	public void user_is_on_Greencart_landing_page() throws Throwable {
		

		driver = Base.getDriverDetails();

		
	}

	@When("^User searched for \"([^\"]*)\" vegetable$")
	public void user_searched_for_vegetable(String arg1) throws Throwable {

		homepg = new HomePage(driver);
		homepg.findSearch().sendKeys(arg1);
		Thread.sleep(4000L);

	}
	
	
	   @When("^User searched for (.+) vegetables$")
	    public void user_searched_for_vegetables(String name) throws Throwable {
		   

			homepg = new HomePage(driver);
			homepg.findSearch().sendKeys(name);
			Thread.sleep(4000L);
	        
	    }

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Assert.assertTrue(homepg.checkProdName().getText().contains(arg1));

	}

	

}