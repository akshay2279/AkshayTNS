package com.tests;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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
	
	
	@Test(groups = "sanity", priority = 4, dataProvider = "dp")
	public void validcredentials02(String uname, String pass) throws Exception {
		lp.validLogin01();
		Assert.assertEquals(driver.getTitle(), "My Store");
	}
	
	@DataProvider
	public Object[][] dp() throws Exception {
	DataFormatter df = new DataFormatter();
	FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\com.Hybrid714_TNS\\Excel\\data.xlsx"); 
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet ("login");
	int rows=sh.getLastRowNum();
	
	String data [][]= new String[rows][2]; 
	for(int i=1;i<=rows;i++) {
		
	Cell c1= sh.getRow(i).getCell(0);        //username
	Cell c2 = sh.getRow(i).getCell(1);    //password 
	String uname = df.formatCellValue(c1); 
	String pass = df.formatCellValue(c2);
	data[i-1][0] = uname;
	data[i-1][1] = pass;

	}
	return data;
	
	}
	
//	@Test(groups = "sanity", priority = 4)
//	public void validcredentials01() throws Exception {
//		lp.validLogin01();
//		Assert.assertEquals(driver.getTitle(), "My account");
//	}
	
//	@Test(groups = "sanity", priority = 3)
//	public void validcredentials() {
//		lp.loginToApplication("akshay.wanjari03@gmail.com", "Akshay@7729");
//		Assert.assertEquals(driver.getTitle(), "My account");
//	}
	
	@Test(groups = "sanity", priority = 1)
	public void loginWithInvalidCredentials() {
		lp.loginToApplication("akshaywanjari03@gmail.com", "Akshay7729");
		//Assert.assertTrue(failedLoginMsg01. , "Authentication failed");
	}
//	@Test(groups = "sanity", priority = 2)
//	public void loginWithInvalidEmail() {
//		lp.loginToApplication("akshaywanjari03@gmail.com", "Akshay@7729");
//		//Assert.assertEquals(driver.getTitle(), "my store");
//	}
	
}
