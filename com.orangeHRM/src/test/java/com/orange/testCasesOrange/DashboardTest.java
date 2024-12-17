package com.orange.testCasesOrange;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.base.BaseClassofOrange;
import com.orange.dataprovider.DataProviders;
import com.orange.pageobjects.DashboardPage;
import com.orange.pageobjects.LoginPage;
import com.orange.utility.Log;

public class DashboardTest extends BaseClassofOrange {
	DashboardPage dash;
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
	@Test (dataProvider = "CredentialsToLoginIn", dataProviderClass = DataProviders.class,groups={"Smoke","Sanity","Regression"})
	public void DashBooardOpened(String User,String pass) throws Throwable{
		Log.startTestCase("AdminIsOpened");
		login= new LoginPage();
		Log.info("user will be login ");
		login.Login(User, pass);		
		dash= new DashboardPage();
		dash.ValidateDashboardOpened();
		boolean result=dash.ValidateDashboardOpened();
		Assert.assertTrue(result);
	}
	@Test (dataProvider = "CredentialsToLoginIn", dataProviderClass = DataProviders.class,groups={"Smoke","Sanity","Regression"})
	public void DashBooardOpenedFailed(String User,String pass) throws Throwable{
		Log.startTestCase("AdminIsOpened");
		login= new LoginPage();
		Log.info("user will be login ");
		login.Login(User, pass);		
		dash= new DashboardPage();
		dash.ValidateDashboardOpened();
		boolean result=dash.ValidateDashboardOpened();
		Assert.assertTrue(false);
	}
}
