package com.pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.utilities.DriverUtils;

public class HomePage  {

	WebDriver driver=null;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[@class = 'h3 product-title']/a")
	List<WebElement> productList;
	
//	@FindBy(xpath="//ul[@class = 'category-sub-menu']/li[2]/a]")
//	WebElement women;
	
//	@FindBy(xpath="//div[@class = 'product-description']/h2/a")
//	WebElement product;
//	
//	@FindBy(xpath="//button[@class = 'btn btn-primary add-to-cart']")
//	WebElement addToCart;
//	
//
//	@FindBy(xpath="//div[@class ='cart-content-btn']/a/i")
//	WebElement proceedToCheckout;
	

	
	public void productselection() throws InterruptedException {
		
		
		
		
		for(WebElement e : productList) {
		  System.out.println(e.getText());
		}
		
		
//		
	}
	
	
	
}
