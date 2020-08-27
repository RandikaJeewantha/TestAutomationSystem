package pages.myAccount;

import org.testng.Assert;

import base.TestBase;

public class MyDomainListPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	


	/* Initialising the page objects */

	
	public MyDomainListPage() {
		
	}


	/* Actions */


	public void checkingMyDomainListPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/mydomainlist", currentUrl);
	}
	
}