package StepDef;

import cucumber.api.java.en.*;

public class Login2 {

	@Given("Application displays welcome")
	public void Application_displays_welcome() {
		 System.out.println("Welcome ");
	}
	
	@Given("open newtours application")
	public void open_newtours_application() {
		 System.out.println("Opens application");
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		 System.out.println("username : "+string+" password : "+string2);
	}

	@When("Click login button")
	public void click_login_button() {
		 System.out.println("Click login button");
	   
	}

	@Then("verify pass")
	public void verify_pass() {
		 System.out.println("pass");
	  
	}

	@Then("verify failure")
	public void verify_failure() {
		 System.out.println("fail");
	   
	}


}
