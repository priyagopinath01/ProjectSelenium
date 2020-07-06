Feature: Searching a product in opencart application as guest user and registered user using automation script

Scenario: Verify user is able to search product using searchbox
When User should  enter the product name in the search box
And User should click on the searchbutton.

Scenario: Verify user is able to login the application
    When User should see My Account text on the header
    Then User should enter the emailaddress "priyagopinath58@gmail.com" in the emailfield of login pannel
    And User should enter the password in the passwordfield "priya@123" of the login pannel
    And User click on the login button
 
//Scenario: Verify user can place order as registered user
    
    
