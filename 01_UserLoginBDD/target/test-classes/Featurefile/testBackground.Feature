Feature: Testing Background with multiple Scenarios
	Background: luanch Browser
	    Given Launch Chome Browser
	    
	   @test  
	   Scenario: Title Validation
	       Given open url
	       And Close browser
	    
	    @smoke   
	   Scenario: Title Validation
	       Given open url
	       Then get title
	       
	    @sanity
	    Scenario: Title Validation
	       Given open url
