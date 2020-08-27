package pages.domainRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.apache.commons.lang3.RandomStringUtils;

import pages.myAccount.MyAccountLoginPage;
import base.TestBase;

public class DomainSearchPage extends TestBase {

	/* Page Factory - Object Repository - Declaring Web Site Elements */

	
	@FindBy(className = "myaccount-login")
	WebElement myAccountButton;
	
	@FindBy(id = "DomainSearchForm_DomainSearch_DomainName")
	WebElement domainNameInputField;

	@FindBy(xpath = "//*[@id=\"DomainSearchForm\"]/div[1]/div[1]/div/div/a")
	WebElement domainSearchButton;
	
	@FindBy(xpath = "/html/body/section/div[3]/div/div/a[1]")
	WebElement continueButton;
	
	@FindBy(xpath = "//*[@id=\"DomainSearchForm\"]/div[2]/div/div/div/div/div/ul[1]/li/div[3]/a[1]")
	WebElement cat1AddButton;
	
	
	/* Initialising the page objects */

	
	public DomainSearchPage() {
		PageFactory.initElements(driver, this);
	}

	
	/* Actions */

	
	public void checkingDomainSearchPageUrl(){
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(baseURL + "/domainsearch", currentUrl);
	}
	
	public MyAccountLoginPage goToMyAccountLoginPage(){
		myAccountButton.click();
		return new MyAccountLoginPage();
	}
	
	public void clickDomainSearchButton(){
		domainSearchButton.click();
	}
	
	public void clickContinueButton(){
		continueButton.click();
	}
	
	public void clickCat1AddButton(){
		cat1AddButton.click();
	}

	public void enterDomainSearchKeyword() throws InterruptedException{
		String domainKey = RandomStringUtils.randomAlphabetic(10);
		domainKey += "-testnic.lk";
		Thread.sleep(1000);
		domainNameInputField.sendKeys(domainKey);
	}
}
