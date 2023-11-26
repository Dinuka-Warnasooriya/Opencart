package testCases;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


import pageObjects.HomePage;
import testBase.BaseClass;
import pageObjects.AccountRegistrationPage;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	
	@Test(groups = {"Regression","Master"})
	void test_account_Registration(){
		
		logger.debug("application logs..");
		logger.info("*** Starting TC_001_AccountRegistrationTest ***");
		try {
			HomePage hp =new HomePage(driver);
			hp.ClickMyAccount();
			
			logger.info("Clicked on My Account link");
			hp.clickRegister();
			logger.info("Clicked on register link");
			
			
			AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
			logger.info("Providing customer data");
			
			regPage.setFirstName(randomString().toUpperCase());
			regPage.setLastName(randomString().toUpperCase());
			regPage.setEmail(randomString()+"@gmail.com");
			regPage.setPassword(randomAlphaNumeric());
			regPage.setPrivacyPolicy();
			regPage.clickContinue();
			logger.info("Clicked on continue");
			
			String confmsg = regPage.getConfirmationMsg();
			logger.info("Validating expected message");
			Assert.assertEquals(confmsg,"Congratulations! Your new account has been successfully created!", "not getting expected message");
			
				
			
		} catch (Exception e) {
			logger.error("Test failed");
			Assert.fail();
		}
		
		logger.info("*** Finished TC_001_AccountRegistrationTest *** ");
	}

	
}
