package pages.domainRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class DomainReasonPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */

	
	@FindBy(id = "DomainReasonForm_DomainReasonForm_187109")
	WebElement domainReasonInputField;

	@FindBy(id = "DomainReasonForm_DomainReasonForm_action_saveDomainReason")
	WebElement loginAndContinueButton;
	
	
	/* Initialising the page objects */

	
	public DomainReasonPage() {
		PageFactory.initElements(driver, this);
	}

	
	/* Actions */

	
	public void checkingDomainReasonPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/domainreason", currentUrl);
	}
	
	public void enterDomainReasonKeyword(String reason) throws InterruptedException{
		Thread.sleep(1000);
		domainReasonInputField.sendKeys(reason);
	}
	
	public void clickLoginAndContinueButton(){
		loginAndContinueButton.click();
	}
	
}