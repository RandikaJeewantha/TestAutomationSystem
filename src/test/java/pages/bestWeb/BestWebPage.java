package pages.bestWeb;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class BestWebPage extends TestBase{

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	
	
	
	/* Initialising the page objects */

	
	public BestWebPage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingBestWebPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/bestweb", currentUrl);
	}
	
}
