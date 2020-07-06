package com.opencart.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.opencart.baseclass.BaseClass;
import com.opencart.pom.HomePage;
import com.opencart.pom.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class OpenloginDefinition extends BaseClass{
	public static WebDriver driver;
	public static HomePage hp;
//	public static ProductDetailPage pd;
public static LoginPage lp; 


@Then("User should see the your store logo in the left side")
public void user_should_see_the_your_store_logo_in_the_left_side() {
		  HomePage hp=new HomePage();
		boolean b = elementIsDisplayed(hp.getYourStore());
		Assert.assertTrue(b);
		System.out.println(b);
		}
 
@When("User should  enter the product name in the search box")
public void user_should_enter_the_product_name_in_the_search_box() throws InterruptedException {
	 HomePage hp=new HomePage();
	Thread.sleep(3000);
sendkeys(hp.getSearchBox(), "laptops");
  
}

@When("User should click on the searchbutton.")
public void user_should_click_on_the_searchbutton() {
	 HomePage hp=new HomePage();
  clickOnElement(hp.getSearchButton());
  
}

@When("User should see My Account text on the header")
public void user_should_see_My_Account_text_on_the_header() throws InterruptedException {
  Thread.sleep(3000);
  HomePage hp=new HomePage();
  elementIsDisplayed(hp.getMyAccount());
  clickOnElement(hp.getMyAccount());
  elementIsDisplayed(hp.getLoginOption());
  clickOnElement(hp.getLoginOption());
  
}




@Then("User should enter the emailaddress {string} in the emailfield of login pannel")
public void user_should_enter_the_emailaddress_in_the_emailfield_of_login_pannel(String string) {
	  lp=new  LoginPage ();
  sendkeys(lp.getEmailField(), string);
}
@Then("User should enter the password in the passwordfield {string} of the login pannel")
public void user_should_enter_the_password_in_the_passwordfield_of_the_login_pannel(String string) {
	 lp=new  LoginPage ();
	  sendkeys(lp.getPasswrord(), string);
  
}
@Then("User click on the login button")
public void user_click_on_the_login_button() {
	 lp=new  LoginPage ();
	 clickOnElement(lp.getLoginButton());
  
}



}
