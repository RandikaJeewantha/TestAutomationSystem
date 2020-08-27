package pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import pages.dashboard.DashboardPage;

public class MyAccountLoginPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */


	@FindBy(id = "CustomerLoginForm_CustomerLoginForm_Email")
	WebElement loginEmailInputField;
	
	@FindBy(id = "CustomerLoginForm_CustomerLoginForm_Password")
	WebElement loginPasswordInputField;

	@FindBy(id = "CustomerLoginForm_CustomerLoginForm_action_dologin")
	WebElement loginButton;
	
	@FindBy(id = "CustomerLoginForm_CustomerLoginForm_error")
	WebElement errorMessage;

	
	/* Initialising the page objects */


	public MyAccountLoginPage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingMyAccountLoginPageMessage(String message){
		Assert.assertEquals(errorMessage.getText(), message);
	}
	
	public void enterLoginCreditials(String userName, String password) throws InterruptedException{
		Thread.sleep(1000);
		loginEmailInputField.sendKeys(userName);
		loginPasswordInputField.sendKeys(password);
	}

	public DashboardPage clickLogInButton(){
		loginButton.click();
		return new DashboardPage();
	}
	
	public void checkingMyAccountLoginPageUrlWithCustomerBackURLTodomainUserRolesPage(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/myaccountlogin?CustomerBackURL=domainuserroles", currentUrl);
	}

}