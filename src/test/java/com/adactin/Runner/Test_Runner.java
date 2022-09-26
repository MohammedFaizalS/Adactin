package com.adactin.Runner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Adactin.Baseclass.BaseClass;
import com.sdp.PageObjectManager;

public class Test_Runner extends BaseClass{

	public static WebDriver driver=BaseClass.Browser_Launch("Chrome");
	public static PageObjectManager pom =new PageObjectManager(driver);
	public static void main(String[] args) throws IOException {

		driver=	Get_URL("https://adactinhotelapp.com/");

		//Login

		User_Input(pom.getInstancelp().getUsername(), "Faizal123");
		User_Input(pom.getInstancelp().getPassword(), "123456789");
		User_Click(pom.getInstancelp().getLoginButton());

		//Search Hotel

		DropDown_select(pom.getInstancesh().getLocation(), "index", "1");

		DropDown_select(pom.getInstancesh().getHotels(), "value", "Hotel Creek");

		DropDown_select(pom.getInstancesh().getRoomtype(), "Visibletext", "Double");

		DropDown_select(pom.getInstancesh().getNumber_of_Rooms(), "VisibleText", "6 - Six");

		User_Clear(pom.getInstancesh().getCheckIn());
		User_Input(pom.getInstancesh().getCheckIn(), "07/10/2022");

		User_Clear(pom.getInstancesh().getCheckout());
		User_Input(pom.getInstancesh().getCheckout(), "10/10/2022");

		DropDown_select(pom.getInstancesh().getAdults_Room(), "VisibleText", "2 - Two");

		DropDown_select(pom.getInstancesh().getChild_Room(), "VisibleText", "2 - Two");

		//Take_Screenshot(+".//Screenshot//SearchHotel.png");

		User_Click(pom.getInstancesh().getSubmitButton());



		User_Click(pom.getInstanceSh2().getRadiobutton());

		//Take_Screenshot(".//Screenshot//selecthotel.png");

		User_Click(pom.getInstanceSh2().getContinueButton());

		//		//PAGE_3

		Scroll_UsingElement(pom.getInstancebh().getFirstname());

		User_Input(pom.getInstancebh().getFirstname(), "Mohammed");

		User_Input(pom.getInstancebh().getLastname(), "Faizal");

		User_Input(pom.getInstancebh().getAddress(), "199/7 b sri balaji nagar chennai-600099");

		User_Input(pom.getInstancebh().getCreditCardNumber(), "1234567899876543");

		DropDown_select(pom.getInstancebh().getCreditCardType(), "Value", "VISA");

		DropDown_select(pom.getInstancebh().getExpiryMonth(), "value", "10");

		DropDown_select(pom.getInstancebh().getExpiryYear(), "value", "2020");

		User_Input(pom.getInstancebh().getCvv_Number(), "222");

		//Take_Screenshot(".//Screenshot//BookHotel.png");

		User_Click(pom.getInstancebh().getBookNow_Button());



		//Booking Confirmation

//		System.out.println(Get_Attribute(pom.getInstancebc().getOrdervalidation()));	
		Scroll_UsingElement(pom.getInstancebc().getOrdervalidation());

		//Take_Screenshot(".//Screenshot//bookingconfiromation.png");

		User_Click(pom.getInstancebc().getMy_itinerary());


		//My_itinerary

		System.out.println(Get_Attribute(pom.getInstancebi().getConfirmOrder()));


		User_Click(pom.getInstancebi().getConfirmHotel());
		User_Click(pom.getInstancebi().getCancelSelected());
		

		//Take_Screenshot(".//Screenshot//My_itinerary.png");

		Confirm_Alert("accept");

		User_Click(pom.getInstancebi().getLogOut());

		//Take_Screenshot(".//Screenshot//Finalpage.png");


		//		if (Order1.equalsIgnoreCase(Order2)) {
		//			System.out.println("Order number are same");
		//		}else {
		//			System.out.println("Order number are different");
		//		}
		//

		driver.quit();

	}

}
