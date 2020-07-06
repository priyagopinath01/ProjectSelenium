package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class BookedItinerary extends BaseClass {
	public BookedItinerary() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='order_id_347831']")
	private WebElement orderId;
	
	@FindBy(xpath="//input[@name='order_id_text']")
	private WebElement searchOrderId;
	
	@FindBy(xpath="//input[@value='priya']")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement go;

	public WebElement getGo() {
		return go;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getFirstName() {
		return firstName;
	}
	

}
