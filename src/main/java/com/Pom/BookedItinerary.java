package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
	public static WebDriver driver;

	@FindBy(xpath = "(//input[@class='select_text'])[1]")
	private WebElement ConfirmOrder;


	@FindBy(xpath = "//input[@name='check_all']")
	private WebElement ConfirmHotel;

	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement CancelSelected;

	@FindBy(id = "logout")
	private WebElement LogOut;

	public BookedItinerary(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirmOrder() {
		return ConfirmOrder;
	}

	public WebElement getConfirmHotel() {
		return ConfirmHotel;
	}

	public WebElement getCancelSelected() {
		return CancelSelected;
	}

	public WebElement getLogOut() {
		return LogOut;
	}


}
