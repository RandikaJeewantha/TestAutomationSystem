package pages.myAccount;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class MyAccountMyDocumentsProfilePage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	
	
	
	/* Initialising the page objects */

	
	public MyAccountMyDocumentsProfilePage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingMyAccountMyDocumentsProfilePageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/myaccount/mydocuments/profile", currentUrl);
	}
}
