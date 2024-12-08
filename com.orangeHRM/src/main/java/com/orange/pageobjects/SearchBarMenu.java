package com.orange.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.action.ActionClass;
import com.orange.base.BaseClassofOrange;

public class SearchBarMenu extends BaseClassofOrange {
 public SearchBarMenu () {
	 PageFactory.initElements(getDriver(), this);
	}
 ActionClass action= new ActionClass();
@FindBy(xpath="//div//input[@placeholder='Search']") WebElement searchBar;
//span[text()='Admin']
@FindBy(xpath="//span[text()='Admin']") WebElement Admin;

public void searchInBar(String pageName) throws Throwable{
	action.type(searchBar, pageName);	
}
public AdminPage clickOnadminInMenu()throws Throwable{
	action.click(getDriver(), Admin);
	return new AdminPage();
}

}