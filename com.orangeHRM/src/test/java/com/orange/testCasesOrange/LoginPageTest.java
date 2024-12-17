package com.orange.testCasesOrange;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.orange.action.ActionClass;
import com.orange.base.BaseClassofOrange;
import com.orange.dataprovider.DataProviders;
import com.orange.pageobjects.DashboardPage;
import com.orange.pageobjects.LoginPage;
import com.orange.utility.Log;

public class LoginPageTest  extends BaseClassofOrange{
LoginPage login;
DashboardPage dash;

@Parameters({"browser"})
@BeforeMethod (groups={"Smoke","Sanity","Regression"}) 
	public void setup( @Optional("chrome") String browser) {
		launchApp(browser);
	}
@AfterMethod (groups={"Smoke","Sanity","Regression"}) 
public void teardown() {
	getDriver().quit();
}
 @Test(dataProvider = "CredentialsToLoginIn", dataProviderClass = DataProviders.class,groups="Sanity")
 public void loginTest(String userName, String pass) throws Throwable  {
	 Log.startTestCase("loginTest");
	 
	 Log.info("user will login to url In");
		 login= new LoginPage();
	 Log.info("enter email and password");
	 login.Login(userName, pass);
	 //loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
	 Log.info("dashboard opened");
	 Log.endTestCase("loginTest");
	 
 }

}
