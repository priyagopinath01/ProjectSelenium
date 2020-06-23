package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {
PageFactory.initElements(driver, this);	
}
@FindBy(xpath="(//td[@colspan='2'])[3]")
private WebElement bookingconfirmationText;

@FindBy(xpath="//input[@name='order_no']")
private WebElement orderNumber;

@FindBy(xpath="//input[@name='my_itinerary']")
private WebElement myItinerary;

public WebElement getMyItinerary() {
	return myItinerary;
}

public WebElement getBookingconfirmationText() {
	return bookingconfirmationText;
}

public WebElement getOrderNumber() {
	return orderNumber;
}


}
