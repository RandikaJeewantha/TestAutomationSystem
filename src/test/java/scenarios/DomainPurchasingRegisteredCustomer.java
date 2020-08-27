package scenarios;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.domainRegistration.DomainReasonPage;
import pages.domainRegistration.DomainSearchPage;
import pages.myAccount.MyAccountLoginPage;

public class DomainPurchasingRegisteredCustomer extends TestBase {
	
	DomainSearchPage domainSearchPage;
	DomainReasonPage domainReasonPage;
	MyAccountLoginPage myAccountLoginPage;
	
	@Before()
    public void beforeScenarioStart(){
		initialization();
		domainSearchPage = new DomainSearchPage();
		domainReasonPage = new DomainReasonPage();
		myAccountLoginPage = new MyAccountLoginPage();
    }	
	
	@After()
    public void afterScenarioFinish(){
		
		/* Close the browser. */
		tearDown();
    }
	
	@Then("The user types a domain name in the search bar.")
	public void theUserTypesDomainNameInTheSearchBar() throws InterruptedException {
		domainSearchPage.enterDomainSearchKeyword();
	}

	@Then("The user clicks the Search button.")
	public void theUserClicksTheSearchButton() {
		domainSearchPage.clickDomainSearchButton();
	}

	@Then("The user clicks the CAT1 Add button.")
	public void theUserClicksTheCAT1AddButton() {
		domainSearchPage.clickCat1AddButton();
	}

	@Then("The user clicks the Continue button.")
	public void theUserClicksTheContinueButton() {
		domainSearchPage.clickContinueButton();
	}

	@When("The user is on the domainreason page.")
	public void theUserIsOnTheDomainReasonPage() {
		domainReasonPage.checkingDomainReasonPageUrl();
	}

	@Given("Reason for the selected Domain name ex: {string}.")
	public void reasonForTheSelectedDomainName(String reason) throws InterruptedException {
		domainReasonPage.enterDomainReasonKeyword(reason);
	}

	@Then("The user clicks the Login and Continue button.")
	public void theUserClicksTheLoginAndContinueButton() {
		domainReasonPage.clickLoginAndContinueButton();
	}
	
	@When("The user is on the myaccountlogin page with callback url to domainuserroles page.")
	public void theUserIsOnTheMyAccountLoginPageWithCallbackUrlToDomainUserRolesPage() {
		myAccountLoginPage.checkingMyAccountLoginPageUrlWithCustomerBackURLTodomainUserRolesPage();
	}
}
