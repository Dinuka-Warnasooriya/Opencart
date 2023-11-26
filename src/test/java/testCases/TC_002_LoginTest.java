package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	
@Test(groups = {"sanity","Master"})	
public void test_login() {
	
	try {
		logger.info("*** Starting TC_002_LoginTest ****");
		
		HomePage hPage = new HomePage(driver);
		hPage.ClickMyAccount();
		logger.info("Clicked on My account");
		hPage.clickLogin();
		logger.info("Clicked on Login");
		
		LoginPage lPage =new LoginPage(driver);
		logger.info("providing login details");
		lPage.setEmail(rb.getString("email"));
		lPage.setPassword(rb.getString("password"));
		lPage.clickLogin();
		logger.info("Clicked on Login button");
		MyAccountPage macc = new MyAccountPage(driver);
	    boolean targetpage = macc.isMyAccountPageExists();
	    Assert.assertEquals(targetpage,true,"Invalid login data ");

	} catch (Exception e) {
		Assert.fail();
	}
	
	logger.info("*** Finished TC_002_LoginTest ****");

}
	
	
}
