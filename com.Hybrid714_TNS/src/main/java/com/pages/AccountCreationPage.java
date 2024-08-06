package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilities.DriverUtils;

public class AccountCreationPage {
	
	WebDriver driver=null;
	DriverUtils ut=null;


	public AccountCreationPage(WebDriver driver) {

		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class= 'btn btn-block btn-primary btn-sm pull-right']")
	WebElement adduserbtn;
	
	@FindBy(id="username")
	WebElement usernameField;
	
	@FindBy(id="course")
	WebElement courseField;
	
	@FindBy(id="Male")
	WebElement genderField;
	
//	@FindBy(id="drop")
//	WebElement testDropDown = driver.findElement(By.xpath("//select[@class ='form-control'"));  
//	Select dropdown = new Select(testDropDown);  
	


	
	@FindBy(id="mobile")
	WebElement mobileBtn;
	
	public void clickAddUserBtn() {
		adduserbtn.click();
		
	}
	
	public void enterField() {
		usernameField.sendKeys("Akshay");
		courseField.sendKeys("Java");
		genderField.sendKeys("Male");
	}

}
