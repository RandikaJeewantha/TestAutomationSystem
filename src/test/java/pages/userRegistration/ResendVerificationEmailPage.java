package pages.userRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ResendVerificationEmailPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */


	@FindBy(partialLinkText = "Resend your Email verification")
	WebElement emailVerifyLink;


	/* Initialising the page objects */


	public ResendVerificationEmailPage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void findEmailVerifyLink(){
		emailVerifyLink.isDisplayed();
	}
}
