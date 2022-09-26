package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.Baseclass.BaseClass;
import com.Pom.Book_AHotel;
import com.Pom.BookedItinerary;
import com.Pom.BookingConfirmation;
import com.Pom.LoginPage;
import com.Pom.Search_Hotel;
import com.Pom.Select_Hotel;

public class PageObjectManager {

	public static WebDriver driver;

	private static LoginPage lp;
	private static Search_Hotel sh;
	private static Select_Hotel Sh2;
	private static Book_AHotel bh;
	private static BookingConfirmation bc;
	private static BookedItinerary bi;

	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage getInstancelp() {
		lp=new LoginPage(driver);
		return lp;
	}

	public Search_Hotel getInstancesh() {
		sh=new Search_Hotel(driver);
		return sh;
	}

	public Select_Hotel getInstanceSh2() {
		Sh2=new Select_Hotel(driver);
		return Sh2;
	}

	public Book_AHotel getInstancebh() {
		bh=new Book_AHotel(driver);
		return  bh;
	}


	public BookingConfirmation getInstancebc() {
		bc=new BookingConfirmation(driver);
		return bc;
	}

	public BookedItinerary getInstancebi() {
		bi=new BookedItinerary(driver);
		return bi;
	}




}
