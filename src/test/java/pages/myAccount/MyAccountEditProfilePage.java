package pages.myAccount;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class MyAccountEditProfilePage extends TestBase{

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	
	
	
	/* Initialising the page objects */

	
	public MyAccountEditProfilePage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingMyAccountEditProfilePageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/myaccount/editprofile", currentUrl);
	}
}
