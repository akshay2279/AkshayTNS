package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.AccountCreationPage;

public class HomeTest extends BaseClass{

	LoginPage lp=null;
	HomePage hp=null;
	
	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		hp= new HomePage(driver);
		//lp= new LoginPage(driver);

	}
	@Test
	public void test01() {
		hp = lp.validLogin();
		hp.productselection();
	
		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	//@Test(groups = "sanity")
//	public void test02() {
//		
//		dp.verifyCourses();
//		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
//		
//	}

	
}
