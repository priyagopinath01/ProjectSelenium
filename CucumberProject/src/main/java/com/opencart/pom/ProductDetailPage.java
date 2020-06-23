package com.opencart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.baseclass.BaseClass;

public class ProductDetailPage extends BaseClass {
	
	public ProductDetailPage() {
	      PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//a[text()='Samsung SyncMaster 941BW']")
		private WebElement samsungMonitor;
		
	   @FindBy(xpath="//button[text()='Add to Cart']")
	   private WebElement AddCart;
	   
		
		 public WebElement getSamsungMonitor() {
			return samsungMonitor;
		}

		public WebElement getAddCart() {
			return AddCart;
		}
}
