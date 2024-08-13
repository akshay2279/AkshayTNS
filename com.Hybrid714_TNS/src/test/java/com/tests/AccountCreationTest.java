
package com.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.ProductCheckoutPage;
import com.pages.LoginPage;
import com.pages.AccountCreationPage;

public class AccountCreationTest extends BaseClass{

	LoginPage lp=null;
	ProductCheckoutPage dp=null;
	AccountCreationPage up=null;
	
	@BeforeSuite
	public void setup()throws Exception {
		initialization();
		reportInit();
		up= new AccountCreationPage(driver);
		dp= new ProductCheckoutPage(driver);
		lp= new LoginPage(driver);
	}
	@Test
	public void test01() {
		lp.loginToApplication("kiran@gmail.com", "123456");
		//dp.clickUser();
		
		up.clickAddUserBtn();
		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void test02() {
		
		up.enterField();
		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
		
	}
	
}
