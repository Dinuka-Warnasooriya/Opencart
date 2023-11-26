package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath ="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPasswordElement;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;
		
	
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		txtPasswordElement.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
		
	}
	
}