Feature: Testing the adactin hotel reservation application using automation test
@sc
Scenario: Verify user should see the hotel application
When User should see the Adactin text on the header
@sc
Scenario: Verify user is able to login the application
When User should enter the username "priyagopinath" in the userfield
Then User should enter the password "Z94RR4" in the passwordfield
And  User should click the login button
@sc
Scenario: Verify user is able to give checkout dates later than checkin 
When User should select the location "Melbourne" in the location pannel
Then User  should select the hotels "2" in the hotels pannel
Then User should  select the roomtype "Standard" in the roomtype pannel
Then User should select number of rooms "3" in the numpannel
And  User should select adult "2" in the adultperroom pannel
And  User should select childrenperroom "0" in the childrenperroom pannel
 @ignore
Scenario: Verify whether it goes to next page when  checkin and checkout are correctly given
And  User should enter the expected checkin date "16/06/2020" in the pannel
And  User should enter the expected checkout date "15/06/2020" in the pannel
And  User should click the search button
@sc
Scenario: Verify whether it goes to next page when  checkin and checkout are correctly given
And  User should enter the expected checkin date "21/06/2020" in the pannel
And  User should enter the expected checkout date "23/06/2020" in the pannel
And  User should click the search button
@sc
 Scenario: Verify whether the datas in the select hotel page are same as given datas in search hotel page
 Given User should get the text in the location pannel of select hotel
 Then  User should compare it with the given checkin data 
 Then  User should compare it with the given checkout data
 @ignore
Scenario: Verify total price is calculated as num*pricepernight*noofromms and logout is working
When User should check wether the price calculated is correct
Then User should click on the logout button 
@sc
Scenario: Verify wether the datas displayed in book hotel page is same as select hotel page
When User should compare all datas displayed in select hotel page with book hotel page
Then User should check the total price calculated is correct
Then User should confirm the fnl bill price is correctly calculated
Then User should eneter first name  "priya"  in the name field
And User should enter last name  "gopinath"  in the last name field
And User should enter the address  "induvihar"  in the address field
And User should enter the card details and select book now 
@sc
Scenario: Verify wether order confirmation is diplayed in confirmation page and itenary details are correct and cant edit
When User should check whether order confirmation is displayed 
Then User should check order confirmation is not editable
Then User should click myItinerary
Then User should check whether order can search in searchbox
And User should confirm that enetered datas are not editable





