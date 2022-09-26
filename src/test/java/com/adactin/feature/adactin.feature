Feature: Hotel Booking In Adactin Application 

@smoketest
Scenario Outline: Login page
Given user Launch The Given Url
When user Enter The Username in "<username>" Field
And user Enter The Password in "<password>" Field
Then user Click The Login Button And It Navigates To Search The HOTEL 

Examples:

|username|password|
|java|java123|
|python|python123|
|selenium|selenium123|
|Faizal123|123456789|

@smoketest 
Scenario: User Select The Hotel In Adactin Application 
	When user Select The Hotel Location From Dropdown 
	And user Select The Hotel Name From List Of Dropdown 
	And user Select The Hotel Room Type From List Of Dropdown 
	And user Select Number Of Room From List Of Dropdown 
	And user Select Check In Date 
	And user Select Check Out Date 
	And user Select Adult Per Room From Dropdown 
	And user Select Children per Room From Dropdown 
	Then user Click The Search Button And It Navigates To Hotel Select Page 
@smoketest 
Scenario: User Confirm The Hotel In Adactin Application 
	When user Confirm the Hotel By Clicking On The Radio Button 
	Then user Click On The Continue Button And It Navigates To Book A Hotel Page 
@smoketest 
Scenario: User Book The Hotel In Adactin Application 
	When user Scroll Down To Certain Limit Till Firstname Field 
	And user Enter The Firstname IN Firstname Field 
	And user Enter The Lastname IN Lastname Field 
	And user Enter The Billing Address In Billing Address Field 
	And user Enter The Credit Card Number In The Credit Card Number Field 
	And user Select The Credit Card Type In The Credit Card Type Field 
	And user Select The Credit Card Expiry Date In Select Month Field 
	And user Select The Credit Card Expiry Date In Select Year Field 
	And user Enter The Cvv Number in the Cvv Field 
	Then user Click On Book Now Button and It Navigates to Booking Confirmation Page 
@sanitytest 
Scenario: User Confirm Booking In Adactin Application 
	When user Scroll Down Till The Bottom Of The Page 
	Then user Click On My Itinenary Button In The Adaction Application So It Navigates To Booked Itinenary Page 
@sanitytest 
Scenario: User Confirms The Order Id In Booked Itinenary Of Adactin Application 
	When user Select All The Booked Itinenary 
	And user Click Ok On Alert Created 
	Then user Click On Logout Button So It Navigates To The Home Page 
	
	
	
	
	
	
 