Feature: Dashboard Feature

	Background:
    Given The dashboard page to the user.
    
    
  Scenario: Checking Dashboard Links Scenario 02/07 - My Profile.
  	When The user clicks the My Profile button.
    Then The user must be on the My Profile page.
    
    
  Scenario: Checking Dashboard Links Scenario 04/07 - My Payments.
  	When The user clicks the My Payments button.
    Then The user must be on the My Payments page.
    
    
  Scenario: Checking Dashboard Links Scenario 05/07 - Documents.
  	When The user clicks the Documents button.
    Then The user must be on the My Documents page.
