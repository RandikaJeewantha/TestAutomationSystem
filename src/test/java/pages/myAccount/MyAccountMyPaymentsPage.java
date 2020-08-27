package pages.myAccount;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class MyAccountMyPaymentsPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	
	
	
	/* Initialising the page objects */

	
	public MyAccountMyPaymentsPage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingMyAccountMyPaymentsPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/myaccount/mypayments", currentUrl);
	}
}
