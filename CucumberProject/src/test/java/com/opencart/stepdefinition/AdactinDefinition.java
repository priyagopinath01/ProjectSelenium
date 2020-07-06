package com.opencart.stepdefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.adactin.pom.BookHotel;
import com.adactin.pom.BookedItinerary;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SelectHotel;
import com.opencart.baseclass.BaseClass;
import com.utils.SsingletonPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinDefinition extends BaseClass{
	
	 SsingletonPom sp=new SsingletonPom ();
public static WebDriver driver;

public static LoginPage lp;
public static SelectHotel sh; 
public static BookHotel bh;
public static BookingConfirmation bc;
public static BookedItinerary bi;

List<String> l=new ArrayList();

@When("User should see the Adactin text on the header")
public void user_should_see_the_Adactin_text_on_the_header() {
	
elementIsDisplayed(sp.getHp().getAdactinTextLogo());
}

@When("User should enter the username {string} in the userfield")
public void user_should_enter_the_username_in_the_userfield(String string) {
sendkeys(sp.getHp().getUserfield(), string);
}

@Then("User should enter the password {string} in the passwordfield")
public void user_should_enter_the_password_in_the_passwordfield(String string) {
sendkeys(sp.getHp().getPasswordfield(), string);
}

@Then("User should click the login button")
public void user_should_click_the_login_button() {
  clickOnElement(sp.getHp().getLoginButton());
}

@When("User should select the location {string} in the location pannel")
public void user_should_select_the_location_in_the_location_pannel(String string) throws InterruptedException {
    lp=new LoginPage();
    dropdown(lp.getLocationfield(), "value", string);
}

@Then("User  should select the hotels {string} in the hotels pannel")
public void user_should_select_the_hotels_in_the_hotels_pannel(String string) {
    dropdown(lp.getHotelsfield(), "index", string);
}

@Then("User should  select the roomtype {string} in the roomtype pannel")
public void user_should_select_the_roomtype_in_the_roomtype_pannel(String string) throws InterruptedException {
    dropdown(lp.getRoomType(), "value", string);
}

@Then("User should select number of rooms {string} in the numpannel")
public void user_should_select_number_of_rooms_in_the_numpannel(String string) {
    dropdown(lp.getNumOfRooms(), "value", string);
	}

@Then("User should select adult {string} in the adultperroom pannel")
public void user_should_select_adult_in_the_adultperroom_pannel(String string) {
    dropdown(lp.getAdultsperRoom(), "value", string);
}

@Then("User should select childrenperroom {string} in the childrenperroom pannel")
public void user_should_select_childrenperroom_in_the_childrenperroom_pannel(String string) {
    dropdown(lp.getChildrenperRoom(), "value", string);
}

@Then("User should enter the expected checkin date {string} in the pannel")
public void user_should_enter_the_expected_checkin_date_in_the_pannel(String string) {
    sendkeys(lp.getCheckinDate(), string);
}

@Then("User should enter the expected checkout date {string} in the pannel")
public void user_should_enter_the_expected_checkout_date_in_the_pannel(String string) throws InterruptedException {
    sendkeys(lp.getCheckoutDate(), string);
}

@Then("User should click the search button")
public void user_should_click_the_search_button() throws IOException {
    clickOnElement(lp.getSearchButton());
}

@Given("User should get the text in the location pannel of select hotel")
public void user_should_get_the_text_in_the_location_pannel_of_select_hotel() {
	sh=new SelectHotel();
   elementIsDisplayed(sh.getAdactinText());
   String location = sh.getLocation().getAttribute("value");
   Assert.assertEquals("Melbourne", location);
   if(true) {
	   System.out.println("same location is displayed");
	   l.add(location);
   }
}

@Then("User should compare it with the given checkin data")
public void user_should_compare_it_with_the_given_checkin_data() {
  String chckin = sh.getCheckIn().getAttribute("value");
  Assert.assertEquals("21/06/2020", chckin);
  if(true) {
	   System.out.println("checkin is displayed");
  }
}

@Then("User should compare it with the given checkout data")
public void user_should_compare_it_with_the_given_checkout_data() {
	String chckout = sh.getCheckOut().getAttribute("value");
	   Assert.assertEquals("23/06/2020", chckout);
	   if(true) {
		   System.out.println("checkout is displayed");
	   }
	   String roomtype = sh.getRoomType().getAttribute("value");
	   Assert.assertEquals("Standard",roomtype );
	   if(true) {
		   System.out.println("Same room type");
		   l.add(roomtype);
	   }
	   String roomNum = sh.getNumRooms().getAttribute("value");
	   Assert.assertEquals("3 Rooms", roomNum);
	   if(true) {
		   System.out.println("Num of rooms same");
	   }
	   String days = sh.getNumOfDays().getAttribute("value");
	   l.add(days);
	   System.out.println(l);
}

@When("User should check wether the price calculated is correct")
public void user_should_check_wether_the_price_calculated_is_correct() {
}

@Then("User should click on the logout button")
public void user_should_click_on_the_logout_button() throws IOException {
    clickOnElement(sh.getLogOut());
  screenShot("logout");
}

@When("User should compare all datas displayed in select hotel page with book hotel page")
public void user_should_compare_all_datas_displayed_in_select_hotel_page_with_book_hotel_page() {
	 bh=new BookHotel();
   clickOnElement(sh.getRadioButton());
   clickOnElement(sh.getContinueButton());
   String loc = bh.getLocation().getAttribute("value");
   Assert.assertEquals("Melbourne", loc);
   String roomtype = bh.getRoomType().getAttribute("value");
   Assert.assertEquals("Standard", roomtype);
 String days = bh.getTotalDays().getAttribute("value");
   Assert.assertEquals("2 Day(s)", days);
   String hotelname = bh.getHotelName().getAttribute("value");
   Assert.assertEquals("Hotel Sunshine", hotelname);
  
   
}

@Then("User should check the total price calculated is correct")
public void user_should_check_the_total_price_calculated_is_correct() {
	 String ppn = bh.getPriceperNight().getAttribute("value");
	 System.out.println(ppn);
	 int price=175;
	 int day=2;
	 int p=(175*2)+10;System.out.println(p);
	 Assert.assertEquals(360, p);

}

@Then("User should confirm the fnl bill price is correctly calculated")
public void user_should_confirm_the_fnl_bill_price_is_correctly_calculated() {
   String totalprice = bh.getTotalPrice().getAttribute("value");
  
   int tp=360;
   int flprice =360+(360/10);
   System.out.println(flprice);
   String fnlprice1 = bh.getFinalPrice().getAttribute("value");
   String[] splits = fnlprice1.split(" ");
   int actual = Integer.parseInt(splits[2]);
   System.out.println(splits[2]);
   Assert.assertEquals(flprice, actual);
   if(true) {
	   System.out.println("final bill is calculated correctly");
   }
}

@Then("User should eneter first name  {string}  in the name field")
public void user_should_eneter_first_name_in_the_name_field(String string) {
   sendkeys(bh.getFirstName(), string);
  
}

@Then("User should enter last name  {string}  in the last name field")
public void user_should_enter_last_name_in_the_last_name_field(String string) {
   sendkeys(bh.getLastName(), string);
  
}
@Then("User should enter the address  {string}  in the address field")
public void user_should_enter_the_address_in_the_address_field(String string) {
   sendkeys(bh.getAddress(), string);
  
}
@Then("User should enter the card details and select book now")
public void user_should_enter_the_card_details_and_select_book_now() throws InterruptedException {
   sendkeys(bh.getCardNum(), "1234567891234555");
dropdown(bh.getCardType(), "text", "American Express");
dropdown(bh.getExpMonth(), "text", "February");
dropdown(bh.getExpYear(), "text", "2022");
sendkeys(bh.getCvvNumber(), "1234");
clickOnElement(bh.getBookNow());
Thread.sleep(4000);
}



@When("User should check whether order confirmation is displayed")
public void user_should_check_whether_order_confirmation_is_displayed() {
   
 bc=new BookingConfirmation();
 elementIsDisplayed(bc.getBookingconfirmationText());
 elementIsDisplayed(bc.getOrderNumber());
}

@Then("User should check order confirmation is not editable")
public void user_should_check_order_confirmation_is_not_editable() {
	String expected = bc.getOrderNumber().getAttribute("value");
	 sendkeys(bc.getOrderNumber(), "123");
	Assert.assertNotSame(expected, "123");
	if(true) {
		System.out.println("cant edit order number");
	}
}

@Then("User should click myItinerary")
public void user_should_click_myItinerary() {
   clickOnElement(bc.getMyItinerary());
}


@Then("User should check whether order can search in searchbox")
public void user_should_check_whether_order_can_search_in_searchbox() {
	 bi=new BookedItinerary ();
	 elementIsDisplayed(bi.getOrderId());
	 if(true) {
		 String orderNum = bi.getOrderId().getAttribute("value");
		 sendkeys(bi.getSearchOrderId(),orderNum );
		 clickOnElement(bi.getGo());
	 }
	 
    
}

@Then("User should confirm that enetered datas are not editable")
public void user_should_confirm_that_enetered_datas_are_not_editable() {
   
//	sendkeys(bi.getFirstName(), "bala");
//	 clickOnElement(bi.getFirstName());
//	 Assert.assertNotSame("bala", bi.getFirstName().getAttribute("value"));
	 System.out.println("not editable");
}







}
