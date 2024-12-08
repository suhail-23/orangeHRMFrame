package com.orange.testCasesOrange;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.base.BaseClassofOrange;
import com.orange.pageobjects.DashboardPage;

public class DashboardTest extends BaseClassofOrange {
	DashboardPage dash;

	@Parameters("browser")

	@BeforeMethod (groups={"Smoke","Sanity","Regression"}) 
		public void setup(String browser) {
			launchApp(browser);
		}
	@AfterMethod (groups={"Smoke","Sanity","Regression"}) 
	public void teardown() {
		getDriver().quit();
	}
	@Test (groups={"Smoke","Sanity","Regression"})
	public void DashBooardOpened() throws Throwable{
		dash= new DashboardPage();
		dash.ValidateDashboardOpened();
		boolean result=dash.ValidateDashboardOpened();
		Assert.assertTrue(result);
	}
	
}
