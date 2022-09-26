$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Given Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username in \"\u003cusername\u003e\" Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password in \"\u003cpassword\u003e\" Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search The HOTEL",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "java",
        "java123"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "python",
        "python123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "selenium",
        "selenium123"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    },
    {
      "cells": [
        "Faizal123",
        "123456789"
      ],
      "line": 16,
      "id": "hotel-booking-in-adactin-application;login-page;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Given Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username in \"java\" Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password in \"java123\" Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search The HOTEL",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Given_Url()"
});
formatter.result({
  "duration": 49995150400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "java",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Username_in_Field(String)"
});
formatter.result({
  "duration": 239574700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "java123",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Password_in_Field(String)"
});
formatter.result({
  "duration": 111280800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_The_HOTEL()"
});
formatter.result({
  "duration": 1045036200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Given Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username in \"python\" Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password in \"python123\" Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search The HOTEL",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Given_Url()"
});
formatter.result({
  "duration": 617379800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "python",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Username_in_Field(String)"
});
formatter.result({
  "duration": 98725400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "python123",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Password_in_Field(String)"
});
formatter.result({
  "duration": 123415000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_The_HOTEL()"
});
formatter.result({
  "duration": 1168811600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Given Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username in \"selenium\" Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password in \"selenium123\" Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search The HOTEL",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Given_Url()"
});
formatter.result({
  "duration": 696024900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Username_in_Field(String)"
});
formatter.result({
  "duration": 131123200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium123",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Password_in_Field(String)"
});
formatter.result({
  "duration": 107058700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_The_HOTEL()"
});
formatter.result({
  "duration": 1006956500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Given Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username in \"Faizal123\" Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password in \"123456789\" Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search The HOTEL",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Given_Url()"
});
formatter.result({
  "duration": 825942900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faizal123",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Username_in_Field(String)"
});
formatter.result({
  "duration": 282403100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_Enter_The_Password_in_Field(String)"
});
formatter.result({
  "duration": 104889700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_The_HOTEL()"
});
formatter.result({
  "duration": 1871817600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User Select The Hotel In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user Select The Hotel Location From Dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Select The Hotel Name From List Of Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Hotel Room Type From List Of Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select Number Of Room From List Of Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select Adult Per Room From Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Select Children per Room From Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click The Search Button And It Navigates To Hotel Select Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Hotel_Location_From_Dropdown()"
});
formatter.result({
  "duration": 243503700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Hotel_Name_From_List_Of_Dropdown()"
});
formatter.result({
  "duration": 179326200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Hotel_Room_Type_From_List_Of_Dropdown()"
});
formatter.result({
  "duration": 155310600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Number_Of_Room_From_List_Of_Dropdown()"
});
formatter.result({
  "duration": 168339800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Check_In_Date()"
});
formatter.result({
  "duration": 199502500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Check_Out_Date()"
});
formatter.result({
  "duration": 208177900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Adult_Per_Room_From_Dropdown()"
});
formatter.result({
  "duration": 184799500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_Children_per_Room_From_Dropdown()"
});
formatter.result({
  "duration": 198369000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_The_Search_Button_And_It_Navigates_To_Hotel_Select_Page()"
});
formatter.result({
  "duration": 1478269500,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User Confirm The Hotel In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirm-the-hotel-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user Confirm the Hotel By Clicking On The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Click On The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Confirm_the_Hotel_By_Clicking_On_The_Radio_Button()"
});
formatter.result({
  "duration": 104027800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 2134133300,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User Book The Hotel In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-the-hotel-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Scroll Down To Certain Limit Till Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Firstname IN Firstname Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Lastname IN Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Credit Card Number In The Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Credit Card Type In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Credit Card Expiry Date In Select Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select The Credit Card Expiry Date In Select Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Enter The Cvv Number in the Cvv Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Click On Book Now Button and It Navigates to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Scroll_Down_To_Certain_Limit_Till_Firstname_Field()"
});
formatter.result({
  "duration": 55855600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Firstname_IN_Firstname_Field()"
});
formatter.result({
  "duration": 110872100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Lastname_IN_Lastname_Field()"
});
formatter.result({
  "duration": 115264600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 140281600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 122952600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 203399200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Credit_Card_Expiry_Date_In_Select_Month_Field()"
});
formatter.result({
  "duration": 232349400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Credit_Card_Expiry_Date_In_Select_Year_Field()"
});
formatter.result({
  "duration": 290463600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Cvv_Number_in_the_Cvv_Field()"
});
formatter.result({
  "duration": 198677300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_Book_Now_Button_and_It_Navigates_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 61916000,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "User Confirm Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirm-booking-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Scroll Down Till The Bottom Of The Page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "user Click On My Itinenary Button In The Adaction Application So It Navigates To Booked Itinenary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Scroll_Down_Till_The_Bottom_Of_The_Page()"
});
formatter.result({
  "duration": 5806303100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_My_Itinenary_Button_In_The_Adaction_Application_So_It_Navigates_To_Booked_Itinenary_Page()"
});
formatter.result({
  "duration": 840119400,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "User Confirms The Order Id In Booked Itinenary Of Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirms-the-order-id-in-booked-itinenary-of-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "user Select All The Booked Itinenary",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "user Click Ok On Alert Created",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user Click On Logout Button So It Navigates To The Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Select_All_The_Booked_Itinenary()"
});
formatter.result({
  "duration": 99898100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_Ok_On_Alert_Created()"
});
formatter.result({
  "duration": 127036000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_Logout_Button_So_It_Navigates_To_The_Home_Page()"
});
formatter.result({
  "duration": 1436911500,
  "status": "passed"
});
});