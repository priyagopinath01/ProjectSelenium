package com.adactin.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class HomePage extends BaseClass{
	public HomePage() {
PageFactory.initElements(driver, this);	
}
@FindBy(xpath="//img[@class='logo']")
private WebElement adactinTextLogo;
	
@FindBy(xpath="//input[@type='text']")
private WebElement userfield;

@FindBy(xpath="//input[@type='password']")
private WebElement passwordfield;



@FindBy(xpath="//input[@type='Submit']")
private WebElement loginButton;

public WebElement getAdactinTextLogo() {
	return adactinTextLogo;
}
public WebElement getUserfield() {
	return userfield;
}
public WebElement getPasswordfield() {
	return passwordfield;
}
public WebElement getLoginButton() {
	return loginButton;
}
}
