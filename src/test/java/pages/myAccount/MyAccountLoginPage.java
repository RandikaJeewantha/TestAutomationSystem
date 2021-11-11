package pages.myAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import pages.dashboard.DashboardPage;

public class MyAccountLoginPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */


	@FindBy(id = "Email")
	WebElement loginEmailInputField;
	
	@FindBy(id = "Password")
	WebElement loginPasswordInputField;

	@FindBy(id = "dologin")
	WebElement loginButton;
	
	@FindBy(id = "error")
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

}
