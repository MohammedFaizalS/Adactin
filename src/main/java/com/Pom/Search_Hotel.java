package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement Number_of_Rooms;
	
	@FindBy(id = "datepick_in")
	private WebElement CheckIn;
	
	@FindBy(id = "datepick_out")
	private WebElement Checkout;
	
	@FindBy(id = "adult_room")
	private WebElement Adults_Room;
	
	@FindBy(id = "child_room")
	private WebElement Child_Room;
	
	@FindBy(id = "Submit")
	private WebElement SubmitButton;

	public Search_Hotel(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumber_of_Rooms() {
		return Number_of_Rooms;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdults_Room() {
		return Adults_Room;
	}

	public WebElement getChild_Room() {
		return Child_Room;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	
}
