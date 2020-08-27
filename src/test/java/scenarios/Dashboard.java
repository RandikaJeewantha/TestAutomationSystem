package scenarios;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.bestWeb.BestWebPage;
import pages.dashboard.DashboardPage;
import pages.domainRegistration.DomainSearchPage;
import pages.myAccount.MyAccountDomainInterestPage;
import pages.myAccount.MyAccountEditProfilePage;
import pages.myAccount.MyAccountLoginPage;
import pages.myAccount.MyAccountMyDocumentsProfilePage;
import pages.myAccount.MyAccountMyPaymentsPage;
import pages.myAccount.MyDomainListPage;
import pages.mysiteService.MysiteServiceDomainSelectPage;

public class Dashboard extends TestBase {
	
	DashboardPage dashboardPage;
	DomainSearchPage domainSearchPage;
	MyAccountLoginPage myAccountLoginPage;
	MyDomainListPage myDomainListPage;
	MyAccountEditProfilePage myAccountEditProfilePage;
	MysiteServiceDomainSelectPage mysiteServiceDomainSelectPage;
	MyAccountMyPaymentsPage myAccountMyPaymentsPage;
	MyAccountMyDocumentsProfilePage myAccountMyDocumentsProfilePage;
	BestWebPage bestWebPage;
	MyAccountDomainInterestPage myAccountDomainInterestPage;
	
	@Before()
    public void beforeScenarioStart(){
		initialization();
		dashboardPage = new DashboardPage();
		domainSearchPage = new DomainSearchPage();
		myAccountLoginPage = new MyAccountLoginPage();
		myDomainListPage = new MyDomainListPage();
		myAccountEditProfilePage = new MyAccountEditProfilePage();
		mysiteServiceDomainSelectPage = new MysiteServiceDomainSelectPage();
		myAccountMyPaymentsPage = new MyAccountMyPaymentsPage();
		myAccountMyDocumentsProfilePage = new MyAccountMyDocumentsProfilePage();
		bestWebPage = new BestWebPage();
		myAccountDomainInterestPage = new MyAccountDomainInterestPage();
    }	
	
	@After()
    public void afterScenarioFinish(){
		/* Close the browser. */
		tearDown();
    }
	
	@Given("The dashboard page to the user.")
	public void givenTheDashboardPageToTheUser() throws InterruptedException {
		domainSearchPage.goToMyAccountLoginPage();
		myAccountLoginPage.enterLoginCreditials(commonTestUserNameOrEmail, commonTestUserPassword);
		myAccountLoginPage.clickLogInButton();
		dashboardPage.checkingDashboardPageUrl();
	}
	
	@When("The user clicks the My Domains button.")
	public void theUserClicksTheMyDomainsButton() {
		dashboardPage.clickMyDomainsButton();
	}
	
	@Then("The user must be on the mydomainlist / domains page.")
	public void theUserMustBeOnTheMyDomainListPage() {
		myDomainListPage.checkingMyDomainListPageUrl();
	}
	
	@When("The user clicks the My Profile button.")
	public void theUserClicksTheMyProfileButton() {
		dashboardPage.clickMyProfileButton();
	}
	
	@Then("The user must be on the My Profile page.")
	public void theUserMustBeOnTheMyProfilePage() {
		myAccountEditProfilePage.checkingMyAccountEditProfilePageUrl();
	}
	
	@When("The user clicks the My Site button.")
	public void theUserClicksTheMySiteButton() {
		dashboardPage.clickMySiteButton();
	}
	
	@Then("The user must be on the My Site page.")
	public void theUserMustBeOnTheMySitePage() {
		mysiteServiceDomainSelectPage.checkingMysiteServiceDomainSelectPageUrl();
	}
	
	@When("The user clicks the My Payments button.")
	public void theUserClicksTheMyPaymentsButton() {
		dashboardPage.clickMyPaymentsButton();
	}
	
	@Then("The user must be on the My Payments page.")
	public void theUserMustBeOnTheMyPaymentsPage() {
		myAccountMyPaymentsPage.checkingMyAccountMyPaymentsPageUrl();
	}
	
	@When("The user clicks the Documents button.")
	public void theUserClicksTheDocumentsButton() {
		dashboardPage.clickDocumentsButton();
	}
	
	@Then("The user must be on the My Documents page.")
	public void theUserMustBeOnTheMyDocumentsPage() {
		myAccountMyDocumentsProfilePage.checkingMyAccountMyDocumentsProfilePageUrl();
	}
	
	@When("The user clicks the Register Now button.")
	public void theUserClicksTheRegisterNowButton() {
		dashboardPage.clickRegisterNowButton();
	}
	
	@Then("The user must be on the Best Web page.")
	public void theUserMustBeOnTheBestWebPage() {
		bestWebPage.checkingBestWebPageUrl();
	}
	
	@When("The user clicks the Submit Interest button.")
	public void theUserClicksTheSubmitInterestButton() {
		dashboardPage.clickSubmitInterestButton();
	}
	
	@Then("The user must be on the Submit Interest page.")
	public void theUserMustBeOnTheSubmitInterestPage() {
		myAccountDomainInterestPage.checkingMyAccountDomainInterestPageUrl();
	}
}