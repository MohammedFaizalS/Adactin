package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_AHotel {


	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement Firstname;

	@FindBy (id = "last_name")
	private WebElement Lastname;

	@FindBy(id = "address")
	private WebElement Address;

	@FindBy(id = "cc_num")
	private WebElement CreditCardNumber;

	@FindBy(id = "cc_type")
	private WebElement CreditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement ExpiryMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ExpiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement Cvv_Number;

	@FindBy(id = "book_now")
	private WebElement BookNow_Button;

	public Book_AHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNumber() {
		return CreditCardNumber;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCvv_Number() {
		return Cvv_Number;
	}

	public WebElement getBookNow_Button() {
		return BookNow_Button;
	}




}
