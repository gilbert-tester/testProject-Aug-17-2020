package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase{

	@FindBy (id = "welcome")
	WebElement welcomeUserName;
	
	@FindBy (xpath = "Admin")
	WebElement admin;
	
	
	
	public HomePage () {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean userNameDisplay() {
		
		 return welcomeUserName.isDisplayed();
	}
	
	public void adminButton () {
		
		admin.click();
		
		
	}
	
	
	
	
}
