package pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import pages.myAccount.MyAccountEditProfilePage;
import pages.myAccount.MyAccountMyDocumentsProfilePage;
import pages.myAccount.MyAccountMyPaymentsPage;

public class DashboardPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	@FindBy(id = "Form_FillEssentialDetailForm")
	WebElement fillEssentialDetailForm;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[2]/div/div[2]/p[2]/a")
	WebElement myProfileButton;

	@FindBy(xpath = "/html/body/section/div[2]/div[4]/div/div[2]/p[2]/a")
	WebElement myPaymentsButton;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[5]/div/div[2]/p[2]/a")
	WebElement documentsButton;
	
	
	/* Initialising the page objects */

	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}


	/* Actions */


	public void checkingDashboardPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/myaccount", currentUrl);
	}
	
	public void checkingEssentialDetailsFormVisible(){
		fillEssentialDetailForm.isDisplayed();
	}
	
	public MyAccountEditProfilePage clickMyProfileButton(){
		myProfileButton.click();
		return new MyAccountEditProfilePage();
	}
	
	public MyAccountMyPaymentsPage clickMyPaymentsButton(){
		myPaymentsButton.click();
		return new MyAccountMyPaymentsPage();
	}
	
	public MyAccountMyDocumentsProfilePage clickDocumentsButton(){
		documentsButton.click();
		return new MyAccountMyDocumentsProfilePage();
	}
}
