package com.orange.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.action.ActionClass;
import com.orange.base.BaseClassofOrange;

public class LoginPage extends BaseClassofOrange {
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
 ActionClass action= new ActionClass();
 @FindBy(xpath="//input[@name='username']") WebElement userName;
 @FindBy(xpath="//input[@type='password']") WebElement PasswordE;
 @FindBy(xpath="//button[@type='submit']") WebElement LoginBtn;
 @FindBy(xpath="//h5[text()='Login']") WebElement LoginText;
 
 public DashboardPage Login(String UserName, String Password) throws Throwable{
	 action.type(userName, UserName);
	 action.type(PasswordE, Password);
	 action.click(getDriver(), LoginBtn);
	 return new DashboardPage();
	 
 }
}
