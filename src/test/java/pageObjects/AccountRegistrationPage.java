package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends HomePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Elements
	
	@FindBy(name = "firstname" )
	WebElement txtFirstnamElement;
	
	@FindBy(name ="lastname")
	WebElement txtLastnamElement;
	
	@FindBy(name="email")
	WebElement txtEmailElement;
	
	@FindBy(name="password")
	WebElement txtPasswordElement;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement btnContinuElement;
	
	@FindBy(xpath ="//p[contains(.,'Congratulations! Your new account has been successfully created!')]")
	WebElement msgConfirmationElement;
	
	@FindBy(xpath ="//input[@name='agree']")
	WebElement agreeElement;
	
	
	//Actions
	public void setFirstName(String fname) {
		txtFirstnamElement.sendKeys(fname);
		
	}
	
	public void setLastName(String lname) {
		txtLastnamElement.sendKeys(lname);
		
	}
	
	public void setEmail(String email) {
		txtEmailElement.sendKeys(email);
		
	}
	
	public void setPassword(String password) {
		txtPasswordElement.sendKeys(password);
		
	}
	
	public void setPrivacyPolicy() {
		agreeElement.click();
	}
	
	public void clickContinue() {
		btnContinuElement.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmationElement.getText());
		} catch (Exception e) {
			return (e.getMessage());
		
	}
}
	
}
