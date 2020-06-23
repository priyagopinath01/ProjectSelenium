package com.opencart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//input[@name='email']")
		private WebElement emailField;;

		@FindBy(xpath="//input[@name='password']")
		private WebElement passwrord ;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginButton;
		
		public WebElement getEmailField() {
			return emailField;
		}

		public WebElement getPasswrord() {
			return passwrord;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

}
