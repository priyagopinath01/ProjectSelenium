package com.opencart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class HomePage extends BaseClass {

public HomePage() {
PageFactory.initElements(driver, this);	}
	
@FindBy(xpath="//input[@type='text']")
private WebElement searchBox;

@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
private WebElement searchButton;

@FindBy(xpath="(//a[@data-toggle='dropdown'])[4]")
private WebElement component;

@FindBy(xpath="//a[text()='Monitors (2)']")
private WebElement Monitors;

@FindBy(xpath="//a[text()='Samsung SyncMaster 941BW']")
private WebElement samsungMonitor;

@FindBy(xpath="//span[text()='My Account']")
private WebElement  myAccount;

@FindBy(xpath="//a[text()='Login']")
private WebElement loginOption;

@FindBy(xpath="//a[text()='Your Store']")
private WebElement myStore;

@FindBy(xpath="//a[text()='Your Store']")
private WebElement yourStore;

public WebElement getYourStore() {
	return yourStore;
}

public WebElement getMyStore() {
	return myStore;
}

public WebElement getSearchBox() {
	return searchBox;
}

public WebElement getSearchButton() {
	return searchButton;
}

public WebElement getComponent() {
	return component;
}

public WebElement getMonitors() {
	return Monitors;
}

public WebElement getSamsungMonitor() {
	return samsungMonitor;
}

public WebElement getMyAccount() {
	return myAccount;
}

public WebElement getLoginOption() {
	return loginOption;
}


}
