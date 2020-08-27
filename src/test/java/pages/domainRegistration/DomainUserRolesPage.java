package pages.domainRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class DomainUserRolesPage  extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */

	
	@FindBy(id = "DomainReasonForm_DomainReasonForm_187109")
	WebElement domainReasonInputField;

	@FindBy(id = "DomainReasonForm_DomainReasonForm_action_saveDomainReason")
	WebElement loginAndContinueButton;
	
	//[@id="UserRolesBasicPre"]/a
	
	
	/* Initialising the page objects */

	
	public DomainUserRolesPage() {
		PageFactory.initElements(driver, this);
	}

	
	/* Actions */

	
	public void checkingDomainUserRolesPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/domainuserroles#/userroleform/selectoption", currentUrl);
	}
	
	public void enterDomainReasonKeyword(String reason) throws InterruptedException{
		Thread.sleep(1000);
		domainReasonInputField.sendKeys(reason);
	}
	
	public void clickLoginAndContinueButton(){
		loginAndContinueButton.click();
	}
	
}
