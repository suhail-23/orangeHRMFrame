package com.orange.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.action.ActionClass;
import com.orange.base.BaseClassofOrange;

public class AdminPage  extends BaseClassofOrange{
	ActionClass action= new ActionClass();
	
	public AdminPage()
	{ PageFactory.initElements(getDriver(), this);
			}
	@FindBy(xpath="//span[text()='Admin']") WebElement AdmininMenu;
	
	//span[text()='Admin']
	public void ClickAdminInmenu() throws Throwable{
	action.click(getDriver(), AdmininMenu);	
	}
	
	public boolean ValidateAdminPageOpened() throws Throwable{
		return action.isDisplayed(getDriver(), AdmininMenu);
	}
		
}
