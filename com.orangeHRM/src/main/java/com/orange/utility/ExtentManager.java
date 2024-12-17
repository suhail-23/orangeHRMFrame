package com.orange.utility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.orange.base.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	
	public  static ExtentHtmlReporter htmlReporter;
	  public static ExtentReports extent;
	  public static ExtentTest Etest;
	  
	 
	   public static void setExtent() {
		  // Create object of  htmlrporter
		 //htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/extentReport/MyReport_"+BaseClassofOrange.getCurrentTime()+".html");
		 htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport.html");
		 // htmlReporter =new ExtentHtmlReporter("C:\\Users\\C297909\\eclipse-workspace\\com.myproject\\test-output\\ExtentReport"+"My.html");
	 
		  //below line will load extend config file
		 // C:\Users\C297909\eclipse-workspace\com.myproject\extent-config.xml
		 // htmlReporter.loadXMLConfig("C:\\Users\\C297909\\eclipse-workspace\\com.myproject\\extent-config.xml");

		 htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		  //htmlReporter.config().setDocumentTitle("AUTOMATION Test Report");
		 // htmlReporter.config().setReportName("Orange HRM Test Automation Report");
		 // htmlReporter.config().setTheme(Theme.STANDARD);
		  
		  
		 // create object of extentReptr
		  extent  = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  extent.setSystemInfo("HostName", "MyhostHost");
		  extent.setSystemInfo("ProjectName", "OrangeHRMDemo Application");
		  extent.setSystemInfo("Tester", "Suhail");
		  extent.setSystemInfo("Browser", "Chrome");

		  extent.setSystemInfo("OS", "windows");

	   }
	  
	  // below method will end report after suite
	
	  public static void endReport()
	  {
		  extent.flush();
		  
	  }
}
