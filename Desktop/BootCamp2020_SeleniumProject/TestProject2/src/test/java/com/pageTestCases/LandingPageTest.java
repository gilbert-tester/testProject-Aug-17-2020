package com.pageTestCases;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LandingPage;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LandingPageTest extends TestBase{
	LandingPage landingpage;
	HomePage homepage;
	
	
	public  LandingPageTest() {
		super();
	
	}

  @BeforeMethod
  public void setUp() {
  initialization();
  landingpage = new LandingPage();
   }
  
  @Test (priority =1)
  public void getLandingPageTitle () {
	  
	 String title = landingpage.validateLandingPageTitle();    
	 Assert.assertEquals(title, "OrangeHRM");
  }
  @Test(priority =2)

 public void getHrmLogoImageTest () {
	boolean flag = landingpage.validateHrmLogo(); 
 Assert.assertTrue(flag);
  } 
  
  @Test(priority =3)

  public void getLoginTest () {
	  
	  homepage = landingpage.login(prop.getProperty("username"), prop.getProperty("password"));
  }
  
  
  

  @AfterMethod
  public void tearDown() {
  
  driver.quit();
  
  }

}
