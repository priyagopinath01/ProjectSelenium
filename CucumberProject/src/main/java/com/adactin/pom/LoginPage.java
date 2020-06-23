package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement locationfield;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotelsfield;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement numOfRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkinDate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkoutDate ;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsperRoom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childrenperRoom;

	@FindBy(xpath="//input[@name='Submit']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getLocationfield() {
		return locationfield;
	}

	public WebElement getHotelsfield() {
		return hotelsfield;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getAdultsperRoom() {
		return adultsperRoom;
	}

	public WebElement getChildrenperRoom() {
		return childrenperRoom;
	}
	
	
}
