package scenarios;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.dashboard.DashboardPage;
import pages.myAccount.MyAccountEditProfilePage;
import pages.myAccount.MyAccountLoginPage;
import pages.myAccount.MyAccountMyDocumentsProfilePage;
import pages.myAccount.MyAccountMyPaymentsPage;

public class Dashboard extends TestBase {
	
	DashboardPage dashboardPage;
	MyAccountLoginPage myAccountLoginPage;
	MyAccountEditProfilePage myAccountEditProfilePage;
	MyAccountMyPaymentsPage myAccountMyPaymentsPage;
	MyAccountMyDocumentsProfilePage myAccountMyDocumentsProfilePage;
	
	@Before()
    public void beforeScenarioStart(){
		initialization();
		dashboardPage = new DashboardPage();
		myAccountLoginPage = new MyAccountLoginPage();
		myAccountEditProfilePage = new MyAccountEditProfilePage();
		myAccountMyPaymentsPage = new MyAccountMyPaymentsPage();
		myAccountMyDocumentsProfilePage = new MyAccountMyDocumentsProfilePage();
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
	
	@When("The user clicks the My Profile button.")
	public void theUserClicksTheMyProfileButton() {
		dashboardPage.clickMyProfileButton();
	}
	
	@Then("The user must be on the My Profile page.")
	public void theUserMustBeOnTheMyProfilePage() {
		myAccountEditProfilePage.checkingMyAccountEditProfilePageUrl();
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
}
