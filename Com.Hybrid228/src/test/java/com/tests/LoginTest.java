package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage lp=null;
	
	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		lp= new LoginPage(driver);
	}
	@Test(groups = "sanity")
	public void test01() {
		lp.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test(groups = "sanity")
	public void test02() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
		
	}
	@Test(groups = "sanity")
	public void test03() {
		 throw new SkipException("Skiping testcase");
	}
	
}
