package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	public static WebDriver driver;
	
	@FindBy(id = "order_no")
	private WebElement Ordervalidation;
	
	@FindBy(id = "my_itinerary")
	private WebElement my_itinerary;

	public BookingConfirmation(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getOrdervalidation() {
		return Ordervalidation;
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

}
