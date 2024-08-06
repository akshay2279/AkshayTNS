package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver=null;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]")
	WebElement productSelection;
	
//	public ArrayList<String> verifyCourses() {
//		ArrayList<String> actualCourses=new ArrayList<String>();
//		for(WebElement course : courses) {
//			String text= course.getText();
//			actualCourses.add(text);
//		}
//		return actualCourses;
//	}
	
	public void productselection() {
		productSelection.click();
		
	}
	
	
	
}
