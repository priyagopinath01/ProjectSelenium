package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class BookHotel extends BaseClass{
public BookHotel() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@name='hotel_name_dis']")
private WebElement hotelName;

@FindBy(xpath="//input[@name='location_dis']")
private WebElement location;

@FindBy(xpath="//input[@name='room_type_dis']")
private WebElement roomType;

@FindBy(xpath="//input[@name='room_num_dis']")
private WebElement roomNum;

@FindBy(xpath="//input[@name='total_days_dis']")
private WebElement totalDays;

@FindBy(xpath="//input[@name='price_night_dis']")
private WebElement priceperNight;

@FindBy(xpath="//input[@name='total_price_dis']")
private WebElement totalPrice;

@FindBy(xpath="//input[@name='gst_dis']")
private WebElement gst;

@FindBy(xpath="//input[@name='final_price_dis']")
private WebElement finalPrice;

@FindBy(xpath="//input[@name='first_name']")
private WebElement firstName;

@FindBy(xpath="//input[@name='last_name']")
private WebElement lastName;

@FindBy(xpath="//textarea[@name='address']")
private WebElement address;

@FindBy(xpath="//input[@name='cc_num']")
private WebElement cardNum;

@FindBy(xpath="//select[@name='cc_type']")
private WebElement cardType;

@FindBy(xpath="//select[@name='cc_exp_month']")
private WebElement expMonth;

@FindBy(xpath="//select[@name='cc_exp_year']")
private WebElement expYear;

@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement cvvNumber;

@FindBy(xpath="(//input[@type='button'])[1]")
private WebElement bookNow;

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCardNum() {
	return cardNum;
}

public WebElement getCardType() {
	return cardType;
}

public WebElement getExpMonth() {
	return expMonth;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCvvNumber() {
	return cvvNumber;
}

public WebElement getBookNow() {
	return bookNow;
}

public WebElement getHotelName() {
	return hotelName;
}

public WebElement getLocation() {
	return location;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getRoomNum() {
	return roomNum;
}

public WebElement getTotalDays() {
	return totalDays;
}

public WebElement getPriceperNight() {
	return priceperNight;
}

public WebElement getTotalPrice() {
	return totalPrice;
}

public WebElement getGst() {
	return gst;
}

public WebElement getFinalPrice() {
	return finalPrice;
}

}
