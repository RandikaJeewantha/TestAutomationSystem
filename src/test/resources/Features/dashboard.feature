Feature: Dashboard Feature

	Background:
    Given The dashboard page to the user.
    	
		
  Scenario: Checking Dashboard Links Scenario 01/07 - My Domains.
  	When The user clicks the My Domains button.
    Then The user must be on the mydomainlist / domains page.
    
    
  Scenario: Checking Dashboard Links Scenario 02/07 - My Profile.
  	When The user clicks the My Profile button.
    Then The user must be on the My Profile page.
    
    
  Scenario: Checking Dashboard Links Scenario 03/07 - My Site.
  	When The user clicks the My Site button.
    Then The user must be on the My Site page.
    
    
  Scenario: Checking Dashboard Links Scenario 04/07 - My Payments.
  	When The user clicks the My Payments button.
    Then The user must be on the My Payments page.
    
    
  Scenario: Checking Dashboard Links Scenario 05/07 - Documents.
  	When The user clicks the Documents button.
    Then The user must be on the My Documents page.
    
    
    Scenario: Checking Dashboard Links Scenario 06/07 - Best Web.
  	When The user clicks the Register Now button.
    Then The user must be on the Best Web page.
    
    
    Scenario: Checking Dashboard Links Scenario 07/07 - Submit Interest / Domain Interest.
  	When The user clicks the Submit Interest button.
    Then The user must be on the Submit Interest page.
    