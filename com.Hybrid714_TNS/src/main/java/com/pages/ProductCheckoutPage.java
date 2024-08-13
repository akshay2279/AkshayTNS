package com.pages;

import java.util.ArrayList;
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

public class ProductCheckoutPage  {

	WebDriver driver=null;
	
	public ProductCheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@href,'3-clothes')]")
	WebElement Clothes;
	
//	@FindBy(xpath="//ul[@class = 'category-sub-menu']/li[2]/a]")
//	WebElement women;
	
	@FindBy(xpath="//div[@class = 'product-description']/h2/a")
	WebElement product;
	
	@FindBy(xpath="//button[@class = 'btn btn-primary add-to-cart']")
	WebElement addToCart;
	

	@FindBy(xpath="//div[@class ='cart-content-btn']/a/i")
	WebElement proceedToCheckout;
	

	
	public void productselection() throws InterruptedException {
		
		Clothes.click();
		//women.click();
		product.click();
		DriverUtils.waitForElement(addToCart, 30);
		addToCart.click();
		DriverUtils.waitForElement(proceedToCheckout, 30);
		proceedToCheckout.click();
//        actions.moveToElement(ClothesSelection).perform();
//        actions.
//		Thread.sleep(2000);
//		
//	
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,350)", "");
//		
//
//
//		Thread.sleep(3000);
//
//		productSelection.click();
		
		
//		DriverUtils.waitForElement(ClothesSelection, 20);
//		ClothesSelection.click();
		
		//System.out.println("Clothes selected");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
		Thread.sleep(2000);
//
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		
//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//        
//        element.click();
//		productSelection.click();
//		
	}
	
	
	
}
