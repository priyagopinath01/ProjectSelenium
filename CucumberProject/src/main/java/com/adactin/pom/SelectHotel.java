package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class SelectHotel extends BaseClass{
public SelectHotel() {
PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//img[@alt='AdactIn Group']")
	private WebElement adactinText;
	
	@FindBy(xpath="//input[@name='location_0']")
	private WebElement location;
	
	@FindBy(xpath="//input[@name='arr_date_0']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@name='dep_date_0']")
	private WebElement checkOut;
	
	@FindBy(xpath="//input[@name='rooms_0']")
	private WebElement numRooms;
	
	@FindBy(xpath="//input[@name='room_type_0']")
	private WebElement roomType;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement logOut;
	
	@FindBy(xpath="//input[@name='price_night_0']")
	private WebElement priceperNight;
	
	@FindBy(xpath="//input[@name='no_days_0']")
	private WebElement numOfDays;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radioButton;
	
	@FindBy(xpath="//input[@name='continue']" )
	private WebElement continueButton;
	
	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getPriceperNight() {
		return priceperNight;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getNumOfDays() {
		return numOfDays;
	}

	public void setLogOut(WebElement logOut) {
		this.logOut = logOut;
	}

	public WebElement getAdactinText() {
		return adactinText;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getNumRooms() {
		return numRooms;
	}

	public WebElement getRoomType() {
		return roomType;
	}
	
	
}
