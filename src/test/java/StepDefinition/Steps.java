package StepDefinition;		

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

     
    @Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    	 System.out.println("This step Open the Firefox and launch the application");
    	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }		

   
    
    
    @When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    	System.out.println("Arg1 ---> " + arg1 + "    Arg2---> " + arg2 );
    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


  @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This step click on the Reset button.");		
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }	 
    
    
    @When("^User signup$")
    public void user_signup(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    	
    	
    	List<List<String>> data=arg1.raw();
    	System.out.println(data.get(0).get(0));	
    	System.out.println(data.get(0).get(1));	
    	System.out.println(data.get(0).get(2));	
    	System.out.println(data.get(0).get(3));	
    	
    	System.out.println(data.get(1).get(0));	
    	System.out.println(data.get(1).get(1));	
    	System.out.println(data.get(1).get(2));	
    	System.out.println(data.get(1).get(3));
    	
       
    }
    
    
    
    
    @When("^Please enter the Username (.+) and Password (.+)$")
    public void please_enter_the_Username_and_Password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Arg1 ---> " + arg1 + "    Arg2---> " + arg2 );		
    }
    
    
    
    
  @Given("^Validate browser$")
   public void validate_browser() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
  	System.out.println("Validate browser");					
  }

    @When("^Browser Trigerred$")
    public void browser_Trigerred() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Browser triggered");	
    }

    @Then("^Browser executed$")
    public void browser_executed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   	System.out.println("Browser exec");	
    	 
    }




}