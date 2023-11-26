package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Elements
	
	@FindBy(xpath ="//span[text()= 'My Account']")
	WebElement lnkMyaccountElement;
	
	@FindBy(linkText = "Register")
	WebElement lnkRegisterElement;
	
	@FindBy(linkText = "Login")
	WebElement lnkLoginElement;
	
   //Action Methods
	public void ClickMyAccount() {
		lnkMyaccountElement.click();
	}
 
	public void clickRegister() {
		lnkRegisterElement.click();
	}
	
	public void clickLogin() {
		lnkLoginElement.click();
		
	}
}
