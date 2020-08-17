package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LandingPage extends TestBase{

	//Page factory  or Object rrepository define
	// now actions according to object repository

	@FindBy (name = "txtUsername")
	WebElement username;

	@FindBy (id = "txtPassword")
	WebElement password;

	@FindBy (id = "btnLogin")
	WebElement loginbtn;

	@FindBy (xpath = "//*[@id=\"divLogo\"]/img")
	WebElement hrmlogo;


	// initializing page factory
	public LandingPage () {

		PageFactory.initElements(driver, this);
	}

	// Initializing Actions

	public String validateLandingPageTitle () {
		return driver.getTitle();

	}

	public boolean validateHrmLogo () {
		return hrmlogo.isDisplayed();

	}


	public HomePage login (String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();	
		
		
		return new HomePage();
	}








}
