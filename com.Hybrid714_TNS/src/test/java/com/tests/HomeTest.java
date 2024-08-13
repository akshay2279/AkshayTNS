package com.tests;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;


public class HomeTest extends BaseClass{

	LoginPage lp=null;
	HomePage hp=null;
	
	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		hp= new HomePage(driver);
		lp= new LoginPage(driver);

		
	}
	@Test
	public void test01() throws Exception {
		 lp.validLogin01();
          hp.productselection();

	}


	
}
