package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement continueButton;

	public Select_Hotel(WebDriver driver) {

	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	
	

}
