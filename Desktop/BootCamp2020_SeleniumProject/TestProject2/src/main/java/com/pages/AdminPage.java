package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	@FindBy (name = "searchSystemUser[userName]")
	WebElement userNameField;
	
	@FindBy (id = "searchSystemUser_employeeName_empName")
	WebElement empNameField;
	
	@FindBy (id = "searchBtn")
	WebElement searchBtn;

}
