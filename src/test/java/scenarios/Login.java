package scenarios;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.dashboard.DashboardPage;
import pages.myAccount.MyAccountLoginPage;

public class Login extends TestBase {
	
	MyAccountLoginPage myAccountLoginPage;
	DashboardPage dashboardPage;
	
	@Before()
    public void beforeScenarioStart(){
		initialization();
		myAccountLoginPage = new MyAccountLoginPage();
		dashboardPage = new DashboardPage();
    }	
	
	@After()
    public void afterScenarioFinish(){
		
		/* Close the browser. */
		tearDown();
    }

	@Then("The user clicks the My Account button.")
	public void theUserClicksTheMyAccountButton() {
		domainSearchPage.goToMyAccountLoginPage();
	}

	@Then("The user enters {string} and {string}.")
	public void theUserEntersCreditials(String userName, String password) throws InterruptedException {
		myAccountLoginPage.enterLoginCreditials(userName, password);
	}

	@And("The user clicks the Log In button.")
	public void theUserClicksTheLogInButton() {
		myAccountLoginPage.clickLogInButton();
	}

	@Then("The user must be on the Dashboard.")
	public void theUserMustBeOnTheDashboard() {
		dashboardPage.checkingDashboardPageUrl();
	}
	
	@Then("The user must be on the same page with Validation Message as {string}.")
	public void theUserMustBeOnTheMyAccountLoginPage(String message) {
		myAccountLoginPage.checkingMyAccountLoginPageMessage(message);
	}
	
	@Then("The user navigates to the Essential Details Form.")
	public void theUserNavigatesToEssentialDetailsForm() {
		dashboardPage.checkingEssentialDetailsFormVisible();
	}
}
