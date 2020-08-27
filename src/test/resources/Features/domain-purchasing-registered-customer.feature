Feature: Domain purchases by an already registered customer.
		
		
  Scenario Outline: Purchases CAT 1 - full domain package Scenario 01/01 - From domain search page without login - gives login account details to all.
    When The user is on the domainsearch page.
    Then The user types a domain name in the search bar.
    Then The user clicks the Search button.
    Then The user clicks the CAT1 Add button.
    Then The user clicks the Continue button.
    When The user is on the domainreason page.
    Given Reason for the selected Domain name ex: "<reason>".
    Then The user clicks the Login and Continue button.
    When The user is on the myaccountlogin page with callback url to domainuserroles page.
    Then The user enters "<username>" and "<password>".
    And The user clicks the Log In button.
    When The user is on the domainuserroles page.
    Then The user click on the Preview button to preview user existing profile details. 
    
    Examples:
    	| reason 					   | username 					 | password |
    	| For Test Purpose	 | info@lankahost.net  | 1234 		|