package StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Login {
	WebDriver driver;
	
/*
@Given("user opens login page in newtours application")
public void user_opens_login_page_in_newtours_application() {
  System.out.println("user opened the application");
  
  	System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp");
	WebElement signin= driver.findElement(By.linkText("SignIn"));
	signin.click();
  
}

@When("user enters valid username as {string} and password as {string}")
public void user_enters_valid_username_as_and_password_as(String string, String string2) {
	 System.out.println("username"+string+" and password "+string2);
	 
	// WebElement uname= driver.findElement(By.name("userName"));
	//	uname.sendKeys(string);
		//WebElement pwd= driver.findElement(By.name("password"));
		//pwd.sendKeys(string2);
	
	 PageObject loigntest=PageFactory.initElements(driver, PageObject.class);
	 PageObject.user.sendKeys(string);
	 PageObject.pwd.sendKeys(string2);
	 
}

@When("Click submit button")
public void click_submit_button() throws InterruptedException {
	 System.out.println("clicked on submit button");
	 
	// WebElement log= driver.findElement(By.name("Login"));
		//log.click();
		PageObject loigntest=PageFactory.initElements(driver, PageObject.class);
		PageObject.log.click();
		Thread.sleep(5000);
}

@Then("verify login success")
public void verify_login_success() throws InterruptedException {
	 System.out.println("login success");
	Thread.sleep(5000);
	
	 String log_title=driver.getTitle();
		if(log_title.equals("Home"))
		Assert.assertTrue(true);
		else
		Assert.assertTrue(false);
	 driver.close();
	 
}
*/	
	
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
		  System.out.println("user opened the application");
		  
		  	System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://10.232.237.143:443/TestMeApp");
			WebElement signin= driver.findElement(By.linkText("SignIn"));
			signin.click();
	}

	@When("user enters valid username as {string} and password as {string}")
	public void user_enters_valid_username_as_and_password_as(String string, String string2) {
		 PageObject loigntest=PageFactory.initElements(driver, PageObject.class);
		 PageObject.user.sendKeys(string);
		 PageObject.pwd.sendKeys(string2);
	}

	@When("Click submit button")
	public void click_submit_button() {
		PageObject loigntest=PageFactory.initElements(driver, PageObject.class);
		PageObject.log.click();
	}

	@Then("verify login success")
	public void verify_login_success() throws InterruptedException {
		System.out.println("login success");
		Thread.sleep(5000);
		
		 String log_title=driver.getTitle();
			if(log_title.equals("Home"))
			Assert.assertTrue(true);
			else
			Assert.assertTrue(false);
		 driver.close();
	}

	@When("user search for products")
	public void user_search_for_product(DataTable prod) {
	  List<String> p_name=prod.asList();
	  
	  for(String i:p_name)
	  {
		  System.out.println(i);
	  }
	}

	@When("verify")
	public void verify() {
		System.out.println("verified_search");
	   
	}

	@Then("close")
	public void close() {
		System.out.println("close_serach");
	   
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
