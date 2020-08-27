package pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import pages.bestWeb.BestWebPage;
import pages.myAccount.MyAccountDomainInterestPage;
import pages.myAccount.MyAccountEditProfilePage;
import pages.myAccount.MyAccountMyDocumentsProfilePage;
import pages.myAccount.MyAccountMyPaymentsPage;
import pages.myAccount.MyDomainListPage;
import pages.mysiteService.MysiteServiceDomainSelectPage;

public class DashboardPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */
	
	
	@FindBy(id = "Form_FillEssentialDetailForm")
	WebElement fillEssentialDetailForm;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[1]/div/div[2]/p[2]/a")
	WebElement myDomainsButton;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[2]/div/div[2]/p[2]/a")
	WebElement myProfileButton;

	@FindBy(xpath = "/html/body/section/div[2]/div[3]/div/div[2]/p[2]/a")
	WebElement mySiteButton;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[4]/div/div[2]/p[2]/a")
	WebElement myPaymentsButton;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[5]/div/div[2]/p[2]/a")
	WebElement documentsButton;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[6]/div/div[2]/p[2]/a")
	WebElement registerNowButton;
	
	@FindBy(xpath = "/html/body/section/div[2]/div[7]/div/div[2]/p[2]/a")
	WebElement submitInterestButton;
	
	
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
	
	public MyDomainListPage clickMyDomainsButton(){
		myDomainsButton.click();
		return new MyDomainListPage();
	}
	
	public MyAccountEditProfilePage clickMyProfileButton(){
		myProfileButton.click();
		return new MyAccountEditProfilePage();
	}
	
	public MysiteServiceDomainSelectPage clickMySiteButton(){
		mySiteButton.click();
		return new MysiteServiceDomainSelectPage();
	}
	
	public MyAccountMyPaymentsPage clickMyPaymentsButton(){
		myPaymentsButton.click();
		return new MyAccountMyPaymentsPage();
	}
	
	public MyAccountMyDocumentsProfilePage clickDocumentsButton(){
		documentsButton.click();
		return new MyAccountMyDocumentsProfilePage();
	}
	
	public BestWebPage clickRegisterNowButton(){
		registerNowButton.click();
		return new BestWebPage();
	}
	
	public MyAccountDomainInterestPage clickSubmitInterestButton(){
		submitInterestButton.click();
		return new MyAccountDomainInterestPage();
	}
}
