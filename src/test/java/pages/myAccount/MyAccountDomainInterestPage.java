package pages.myAccount;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class MyAccountDomainInterestPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	
	
	
	/* Initialising the page objects */

	
	public MyAccountDomainInterestPage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingMyAccountDomainInterestPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/myaccount/domaininterest", currentUrl);
	}
}
