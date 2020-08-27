package pages.mysiteService;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class MysiteServiceDomainSelectPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	
	
	
	/* Initialising the page objects */

	
	public MysiteServiceDomainSelectPage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingMysiteServiceDomainSelectPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/mysiteservice/domainselect", currentUrl);
	}
}
