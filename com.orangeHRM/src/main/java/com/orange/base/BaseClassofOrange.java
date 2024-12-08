package com.orange.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.orange.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassofOrange {
public static Properties prop;
public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
public static WebDriver getDriver() {
	// Get Driver from threadLocalmap
	return driver.get();
	//now we call getDriver() in further classes
}
//loafing configuration file

@BeforeSuite(groups={"Smoke","Sanity","Regression"})
public void loadConfig() {
	ExtentManager.setExtent();
	LogManager.resetConfiguration();
	//DOMConfiguration.configure("log4j2.xml");
	DOMConfigurator.configure("log4j2.xml");
	//above line will initialize the xml using DOM tree//
	
	try {
		prop = new Properties();
		System.out.println("super constructor invoked");
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\Config.properties");
		prop.load(ip);

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
// launch in browser setup
public  void launchApp(String browserName) {
    WebDriverManager.chromedriver().setup(); 
   // String browserName= prop.getProperty("browser");
    if (browserName.equalsIgnoreCase("chrome")) {
        WebDriverManager.chromedriver().setup(); 
   	 driver.set(new ChromeDriver());
 }
    else if(browserName.equalsIgnoreCase("FireFox")) {
        WebDriverManager.firefoxdriver().setup(); 
	     driver.set(new FirefoxDriver());
 }
    else if (browserName.equalsIgnoreCase("IE")) {
        WebDriverManager.iedriver().setup(); 
	  //driver= new InternetExplorerDriver();
        driver.set(new InternetExplorerDriver());
 }
    getDriver().manage().window().maximize();
  //Delete all the cookies
  		getDriver().manage().deleteAllCookies();
  		//Implicit TimeOuts
  		getDriver().manage().timeouts().implicitlyWait
  		(Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
  		//PageLoad TimeOuts
  		getDriver().manage().timeouts().pageLoadTimeout
  		(Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
    getDriver().get(prop.getProperty("url"));
	}
  
	public static String getCurrentTime() {  
	     String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());  
	     return currentDate;  
	 }
	@AfterSuite(groups={"Smoke","Sanity","Regression"})
	public void afterSuite() {
		ExtentManager.endReport();
		getDriver().quit();
	}


}
