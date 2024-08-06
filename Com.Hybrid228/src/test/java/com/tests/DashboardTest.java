package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.UserPage;

public class DashboardTest extends BaseClass{

	LoginPage lp=null;
	DashBoardPage dp=null;
	
	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
//		dp= new DashBoardPage(driver);
		lp= new LoginPage(driver);

	}
	@Test
	public void test01() {
		lp.loginToApplication("kiran@gmail.com", "123456");
		dp.clickUser();
		dp= lp.validLogin();
		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test(groups = "sanity")
	public void test02() {
		
		dp.verifyCourses();
		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
		
	}

	
}
