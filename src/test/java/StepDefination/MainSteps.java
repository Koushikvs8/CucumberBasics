package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("user on NetBanking landng page")
	public void user_on_net_banking_landng_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user on NetBanking landng page");
	    
	}
	@When("User login in to application with {string} and password {string}")
	public void user_login_in_to_application_with_and_password(String string, String string2) {
		System.out.println(string + " "+string2);
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("Home page is displayes")
	public void home_page_is_displayes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home_page_is_displayes");
	   
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cards_are_displayed");
	   
	}
}
