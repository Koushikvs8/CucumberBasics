package StepDefination;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("user on NetBanking landng page")
	public void user_on_net_banking_landng_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user on NetBanking landng page");
	    
	}
	@Given("user on guru99  application")
	public void user_on_guru99_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user on guru99  application");
	}
	@When("User login in to application")
	public void user_login_in_to_application(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		for(String data1 :data) {System.out.println(data1);}
		
	    
	}
	@When("^User login in to application with (.+) and password (.+)$")
	public void user_login_in_to_application_with_and_password(String string, String string2) {
		System.out.println(string + " "+string2);
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("User login in to application with {string} and password h  {string} combination")
	public void user_login_in_to_application_with_and_password_combination(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string + " "+string2);
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
