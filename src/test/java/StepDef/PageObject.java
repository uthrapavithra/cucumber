package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver;
	/*PageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this.driver);
	}*/
	
	@FindBy(name="userName") public static WebElement user;
	@FindBy(name="password") public static WebElement pwd;
	@FindBy(name="Login") public static WebElement log;

}
