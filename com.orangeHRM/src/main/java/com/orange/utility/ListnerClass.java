package com.orange.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.orange.action.*;
import com.orange.base.*;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ListnerClass extends ExtentManager implements ITestListener 	 {
	
	ActionClass action= new ActionClass();
	public void onTestStart(ITestResult result) {
		 
		  Etest = extent.createTest(result.getName());
		  Etest.createNode(result.getName());
		 }
	
	public void onTestSuccess(ITestResult result) {
		  if (result.getStatus() == ITestResult.SUCCESS) {
		   Etest.log(Status.PASS, "Pass Test case is: " + result.getName());
		  }
		 }
			/*
			 * public void onTestFailure(ITestResult result) { if (result.getStatus() ==
			 * ITestResult.FAILURE) { test.log(Status.FAIL,
			 * MarkupHelper.createLabel(result.getName() + " - Test Case Failed",
			 * ExtentColor.RED)); test.log(Status.FAIL,
			 * MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed",
			 * ExtentColor.RED));
			 * 
			 * String pathString = action.screenShot(BaseClass.getDriver(),
			 * result.getName()); try { test.addScreenCaptureFromPath(pathString); } catch
			 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); } }
			 * }
			 */
			
			  public  void onTestFailure(ITestResult result) { 
				  if (result.getStatus() ==ITestResult.FAILURE) {	 
			     Etest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() +" - Test Case Failed", ExtentColor.RED));
			     Etest.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed",ExtentColor.RED));
			 
				  }//String pathString = null;	  
			 String ImgPath = action.screenShot(BaseClassofOrange.getDriver(),result.getName()); 
				  try {
				 Etest.addScreenCaptureFromPath(ImgPath);
			 Etest.fail("ScreenShot is Added",MediaEntityBuilder.createScreenCaptureFromPath(ImgPath).build());
					// Etest.fail("ScreenShot is Added",MediaEntityModelProvider.;

				  } 
			 catch (Exception e){ 
			 
			// TODO Auto-generated catch block 
				 e.printStackTrace();  
			 }
            }
		
			 

	public void onTestSkipped(ITestResult result) {
		  if (result.getStatus() == ITestResult.SKIP) {
		   Etest.log(Status.SKIP, "Skipped Test case is: " + result.getName());
		  }
		 }
		 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		  // TODO Auto-generated method stub
		 }
		 public void onStart(ITestContext context) {
		  // TODO Auto-generated method stub

		 }
		 public void onFinish(ITestContext context) {
		  // TODO Auto-generated method stub
		 }


}
