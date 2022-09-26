package com.Adaction.Stepdefinition;

import org.openqa.selenium.WebDriver;
import com.Adactin.Baseclass.BaseClass;
import com.adactin.Runner.Runner_Class;
import com.sdp.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass{

	public static WebDriver driver=Runner_Class.driver;
	public static PageObjectManager pom =new PageObjectManager(driver);


	@Given("^user Launch The Given Url$")
	public void user_Launch_The_Given_Url() throws Throwable {

		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username in \"([^\"]*)\" Field$")
	public void user_Enter_The_Username_in_Field(String value) throws Throwable {

		User_Input(pom.getInstancelp().getUsername(), value);
	}

	@When("^user Enter The Password in \"([^\"]*)\" Field$")
	public void user_Enter_The_Password_in_Field(String value) throws Throwable {

		User_Input(pom.getInstancelp().getPassword(), value);
	}

	@Then("^user Click The Login Button And It Navigates To Search The HOTEL$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_The_HOTEL() throws Throwable {

		User_Click(pom.getInstancelp().getLoginButton());
	}

	@When("^user Select The Hotel Location From Dropdown$")
	public void user_Select_The_Hotel_Location_From_Dropdown() throws Throwable {

		DropDown_select(pom.getInstancesh().getLocation(), "index", "1");
	}

	@When("^user Select The Hotel Name From List Of Dropdown$")
	public void user_Select_The_Hotel_Name_From_List_Of_Dropdown() throws Throwable {

		DropDown_select(pom.getInstancesh().getHotels(), "value", "Hotel Creek");
	}

	@When("^user Select The Hotel Room Type From List Of Dropdown$")
	public void user_Select_The_Hotel_Room_Type_From_List_Of_Dropdown() throws Throwable {

		DropDown_select(pom.getInstancesh().getRoomtype(), "Visibletext", "Double");

	}

	@When("^user Select Number Of Room From List Of Dropdown$")
	public void user_Select_Number_Of_Room_From_List_Of_Dropdown() throws Throwable {

		DropDown_select(pom.getInstancesh().getNumber_of_Rooms(), "VisibleText", "6 - Six");
	}

	@When("^user Select Check In Date$")
	public void user_Select_Check_In_Date() throws Throwable {

		User_Clear(pom.getInstancesh().getCheckIn());
		User_Input(pom.getInstancesh().getCheckIn(), "07/10/2022");

	}

	@When("^user Select Check Out Date$")
	public void user_Select_Check_Out_Date() throws Throwable {

		User_Clear(pom.getInstancesh().getCheckout());
		User_Input(pom.getInstancesh().getCheckout(), "10/10/2022");

	}

	@When("^user Select Adult Per Room From Dropdown$")
	public void user_Select_Adult_Per_Room_From_Dropdown() throws Throwable {
		DropDown_select(pom.getInstancesh().getAdults_Room(), "VisibleText", "2 - Two");

	}

	@When("^user Select Children per Room From Dropdown$")
	public void user_Select_Children_per_Room_From_Dropdown() throws Throwable {

		DropDown_select(pom.getInstancesh().getChild_Room(), "VisibleText", "2 - Two");

	}

	@Then("^user Click The Search Button And It Navigates To Hotel Select Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Hotel_Select_Page() throws Throwable {

		User_Click(pom.getInstancesh().getSubmitButton());

	}

	@When("^user Confirm the Hotel By Clicking On The Radio Button$")
	public void user_Confirm_the_Hotel_By_Clicking_On_The_Radio_Button() throws Throwable {

		User_Click(pom.getInstanceSh2().getRadiobutton());

	}

	@Then("^user Click On The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {

		User_Click(pom.getInstanceSh2().getContinueButton());

	}

	@When("^user Scroll Down To Certain Limit Till Firstname Field$")
	public void user_Scroll_Down_To_Certain_Limit_Till_Firstname_Field() throws Throwable {

		Scroll_UsingElement(pom.getInstancebh().getFirstname());

	}

	@When("^user Enter The Firstname IN Firstname Field$")
	public void user_Enter_The_Firstname_IN_Firstname_Field() throws Throwable {

		User_Input(pom.getInstancebh().getFirstname(), "Mohammed");

	}

	@When("^user Enter The Lastname IN Lastname Field$")
	public void user_Enter_The_Lastname_IN_Lastname_Field() throws Throwable {

		User_Input(pom.getInstancebh().getLastname(), "Faizal");

	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {

		User_Input(pom.getInstancebh().getAddress(), "199/7 b sri balaji nagar chennai-600099");

	}

	@When("^user Enter The Credit Card Number In The Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {

		User_Input(pom.getInstancebh().getCreditCardNumber(), "1234567899876543");

	}

	@When("^user Select The Credit Card Type In The Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {

		DropDown_select(pom.getInstancebh().getCreditCardType(), "Value", "VISA");

	}

	@When("^user Select The Credit Card Expiry Date In Select Month Field$")
	public void user_Select_The_Credit_Card_Expiry_Date_In_Select_Month_Field() throws Throwable {

		DropDown_select(pom.getInstancebh().getExpiryMonth(), "value", "10");

	}

	@When("^user Select The Credit Card Expiry Date In Select Year Field$")
	public void user_Select_The_Credit_Card_Expiry_Date_In_Select_Year_Field() throws Throwable {

		DropDown_select(pom.getInstancebh().getExpiryYear(), "value", "2020");

	}

	@When("^user Enter The Cvv Number in the Cvv Field$")
	public void user_Enter_The_Cvv_Number_in_the_Cvv_Field() throws Throwable {

		User_Input(pom.getInstancebh().getCvv_Number(), "222");

	}

	@Then("^user Click On Book Now Button and It Navigates to Booking Confirmation Page$")
	public void user_Click_On_Book_Now_Button_and_It_Navigates_to_Booking_Confirmation_Page() throws Throwable {

		User_Click(pom.getInstancebh().getBookNow_Button());

	}


	@When("^user Scroll Down Till The Bottom Of The Page$")
	public void user_Scroll_Down_Till_The_Bottom_Of_The_Page() throws Throwable {

		Scroll_UsingElement(pom.getInstancebc().getOrdervalidation());

	}

	@Then("^user Click On My Itinenary Button In The Adaction Application So It Navigates To Booked Itinenary Page$")
	public void user_Click_On_My_Itinenary_Button_In_The_Adaction_Application_So_It_Navigates_To_Booked_Itinenary_Page() throws Throwable {

		User_Click(pom.getInstancebc().getMy_itinerary());

	}

	@When("^user Select All The Booked Itinenary$")
	public void user_Select_All_The_Booked_Itinenary() throws Throwable {

		User_Click(pom.getInstancebi().getConfirmHotel());

	}

	@When("^user Click Ok On Alert Created$")
	public void user_Click_Ok_On_Alert_Created() throws Throwable {

		User_Click(pom.getInstancebi().getCancelSelected());
		Confirm_Alert("accept");

	}

	@Then("^user Click On Logout Button So It Navigates To The Home Page$")
	public void user_Click_On_Logout_Button_So_It_Navigates_To_The_Home_Page() throws Throwable {

		User_Click(pom.getInstancebi().getLogOut());
	}




}
