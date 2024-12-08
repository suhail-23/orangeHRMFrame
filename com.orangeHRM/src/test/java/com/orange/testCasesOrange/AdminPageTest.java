package com.orange.testCasesOrange;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.base.BaseClassofOrange;
import com.orange.pageobjects.AdminPage;
import com.orange.pageobjects.LoginPage;

public class AdminPageTest extends BaseClassofOrange {
	AdminPage admin;
	LoginPage login;
	@Parameters("browser")

	@BeforeMethod (groups={"Smoke","Sanity","Regression"}) 
		public void setup(String browser) {
			launchApp(browser);
		}
	@AfterMethod (groups={"Smoke","Sanity","Regression"}) 
	public void teardown() {
		getDriver().quit();
	}
	@Test(groups= {"Sanity","Regression"})
	public void AdminIsOpen(String User,String pass) throws Throwable{
		login= new LoginPage();
		login.Login(User, pass);
		admin= new AdminPage();
		admin.ClickAdminInmenu();
	    admin.ValidateAdminPageOpened();
	    
	}
}
