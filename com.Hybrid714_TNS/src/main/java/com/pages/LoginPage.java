package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.utilities.ExcelUtils;

public class LoginPage  {

	WebDriver driver=null;
	
	//LoginPage lp= new LoginPage(driver);
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	WebElement signinBtn;
	
	@FindBy(xpath="//input[@id='field-email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='field-password']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='submit-login']")
	WebElement signinLoginBtn;
	
	@FindBy(xpath="//li[@class = 'alert alert-danger']")
	WebElement failedLoginMsg;
	
	
	public void validLogin01() throws Exception
	{
		signinBtn.click();
		username.clear();
		username.sendKeys(ExcelUtils.readCelData(1, 0));
		password.clear();
		password.sendKeys(ExcelUtils.readCelData(1, 1));
		signinLoginBtn.click();
	}
	
//	public HomePage validLogin() {
//		username.sendKeys("akshay.wanjari03@gmail.com");
//		password.sendKeys("Akshay@7729");
//		signinLoginBtn.click();
//		return new HomePage(driver);
//	}
	
	public void loginToApplication(String uname, String pass) {
		
		signinBtn.click();
		username.sendKeys(uname);
		password.sendKeys(pass);
		signinLoginBtn.click();
	}
	
	public boolean failedLoginMsg01()
	{
		if(failedLoginMsg.isDisplayed())
		{
			return true;
		}
		else {
			return false;
		}
//		Assert.assertTrue(failedLoginMsg.isDisplayed(), "Authentication failed");
//		return false;
		
	}
}
