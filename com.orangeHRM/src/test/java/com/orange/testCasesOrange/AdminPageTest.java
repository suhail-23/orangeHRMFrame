package com.orange.testCasesOrange;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.base.BaseClassofOrange;
import com.orange.dataprovider.DataProviders;
import com.orange.pageobjects.AdminPage;
import com.orange.pageobjects.LoginPage;
import com.orange.utility.Log;

public class AdminPageTest extends BaseClassofOrange {
	AdminPage admin;
	LoginPage login;
	@Parameters({"browser"})
	@BeforeMethod (groups={"Smoke","Sanity","Regression"}) 
		public void setup(@Optional("Chrome") String browser) {
			launchApp(browser);
		}
	@AfterMethod (groups={"Smoke","Sanity","Regression"}) 
	public void teardown() {
		getDriver().quit();
	}
	@Test(dataProvider = "CredentialsToLoginIn", dataProviderClass = DataProviders.class ,groups= {"Sanity","Regression"})
	public void AdminIsOpen(String User,String pass) throws Throwable{
		Log.startTestCase("AdminIsOpened");
		login= new LoginPage();
		Log.info("user will be login ");
		login.Login(User, pass);
		admin= new AdminPage();
		Log.info("User Click on admin in menu");
		admin.ClickAdminInmenu();
	    admin.ValidateAdminPageOpened();
	    Log.endTestCase("Admin is opened");
	    
	}
}
