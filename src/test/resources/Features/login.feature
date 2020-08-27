Feature: Login Feature

	Background:
    When The user is on the domainsearch page.
    Then The user clicks the My Account button.
		
		
  Scenario Outline: Checking Valid Credentials Scenario 01 - User Email Verified / User Approved - Should Go To Dashboard.
    Then The user enters "<username>" and "<password>".
    And The user clicks the Log In button.
    Then The user must be on the Dashboard.
    
    Examples:
    	| username 				 | password |
    	| info@example.net | 1234 		|
    	
    
  Scenario Outline: Checking Incomplete Profile Scenario 02 - User Profile incomplete [NIC/Mobile/Address] - Should Display Essential Details Form.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user navigates to the Essential Details Form.
	    
	  Examples:
	   	| username 					| password |
	    | example@gmail.com | 1234     |     
    
    	
  Scenario Outline: Checking Valid Credentials Scenario 02/06 - User Email Not Verified / User Approved - Should Go To Dashboard.
    Then The user enters "<username>" and "<password>".
    And The user clicks the Log In button.
    Then The user must be on the Dashboard.
    
    Examples:
    	| username 			 | password |
    	| web@nethfm.com | 1234 		|
    	
    	
	Scenario Outline: Checking Valid Credentials Scenario 03/06 - User Email Verified / User Pending - Should Go To Dashboard.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the Dashboard.
	    
	  Examples:
	    | username 			 						| password |
	    | samirawadduwage@gmail.com | 1234 		 |
	    	
	    	
	Scenario Outline: Checking Valid Credentials Scenario 04/06 - User Email Not Verified / User Pending - Should Go To Resend Verification Email Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the Resend Verification Email Page.
	    
	  Examples:
	    | username 			 						| password |
	    | foruonline777@gmail.com   | 1234 		 |
	    	
	    	
	Scenario Outline: Checking Valid Credentials Scenario 05/06 - User Email Verified / User Rejected - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "Sorry ! You are not an active member".
	    
	  Examples:
	   	| username 			 						| password |
	    | mafadotaiu@gmail.com      | 1234 		 |
	    
	    
  Scenario Outline: Checking Valid Credentials Scenario 06/06 - User Email Not Verified / User Rejected - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "Sorry ! You are not an active member".
	    
	  Examples:
	   	| username 			 						| password |
	    | mowinpro@gmail.com        | 1234 		 |
	    
	    
	Scenario Outline: Checking Invalid Credentials Scenario 01/07 - User Does Enter Valid Email / Valid Password - Should Go To Dashboard.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the Dashboard.
	    
	  Examples:
	   	| username 			 						| password |
	    | info@lankahost.net        | 1234 		 | 
	    
	    
	Scenario Outline: Checking Invalid Credentials Scenario 02/07 - User Does Enter Invalid Email / Valid Password - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "The username / password entered doesn't seem to be correct".
	    
	  Examples:
	   	| username 			 						| password |
	    | info@lankahost.net/       | 1234 		 |
	    
	    
	Scenario Outline: Checking Invalid Credentials Scenario 03/07 - User Does Enter Valid Email / Invalid Password - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "The username / password entered doesn't seem to be correct".
	    
	  Examples:
	   	| username 			 						| password |
	    | info@lankahost.net        | 1234458  |
	    
	    
	Scenario Outline: Checking Invalid Credentials Scenario 04/07 - User Does Enter Invalid Email / Invalid Password - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "The username / password entered doesn't seem to be correct".
	    
	  Examples:
	   	| username 			 						| password |
	    | info@lankahost.net/       | 1234458  |
	    
	    
	Scenario Outline: Checking Invalid Credentials Scenario 05/07 - User Does Not Enter Anything - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "Please enter username/ Password".
	    
	  Examples:
	   	| username | password |
	    |          |          |
	    
	    
	Scenario Outline: Checking Invalid Credentials Scenario 06/07 - User Does Not Include Email / Include Password - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "Please enter username/ Password".
	    
	  Examples:
	   	| username | password |
	    |          | 1234     |
	    
	    
	Scenario Outline: Checking Invalid Credentials Scenario 07/07 - User Does Include Email / Not Include Password - Should Not Go To Any Page.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user must be on the same page with Validation Message as "Please enter your password".
	    
	  Examples:
	   	| username 					 | password |
	    | info@lankahost.net |          |
	    
	    
	Scenario Outline: Checking Incomplete Profile Scenario 01/01 - User Profile incomplete [NIC/Mobile/Address] - Should Display Essential Details Form.
	  Then The user enters "<username>" and "<password>".
	  And The user clicks the Log In button.
	  Then The user navigates to the Essential Details Form.
	    
	  Examples:
	   	| username 					 					| password |
	    | pavankarunarathna@gmail.com | 1234     |    	
	    	