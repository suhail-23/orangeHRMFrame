package com.orange.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.action.ActionClass;
import com.orange.base.BaseClassofOrange;

public class DashboardPage extends BaseClassofOrange {
@FindBy(xpath="//h6[text()='Dashboard']") WebElement Dashboard;
ActionClass action= new ActionClass();
//button[@type='button']//i[@class='oxd-icon bi-chevron-right']
@FindBy(xpath="//button[@type='button']//i[@class='oxd-icon bi-chevron-right']") WebElement sideBtnMenu;
	
	public DashboardPage()
{ PageFactory.initElements(getDriver(), this);
		}
	public boolean ValidateDashboardOpened() throws Throwable{
		return action.isDisplayed(getDriver(), Dashboard);
		
	}
	public void clickSideBarMenuBtn()throws Throwable{
		action.click(getDriver(), sideBtnMenu);
	}
	
}
