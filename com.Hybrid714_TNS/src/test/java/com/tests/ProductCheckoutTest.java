package com.tests;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.ProductCheckoutPage;
import com.pages.LoginPage;


public class ProductCheckoutTest extends BaseClass{

	LoginPage lp=null;
	ProductCheckoutPage hc=null;
	
	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		hc= new ProductCheckoutPage(driver);
		lp= new LoginPage(driver);

	}
	@Test
	public void test01() throws Exception {
		 lp.validLogin01();
          hc.productselection();

	
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
