package com.orangeHRM.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRM.POMClass.LoginPage;

public class loginTest extends BaseClass {

	LoginPage lp;
	
	@Test(priority =1)
	public void visibleUsertab() {
		lp=new LoginPage(driver);
		boolean a=lp.isDisplayUserTab();
		log.info("User name Tab display");
		Assert.assertTrue(a, "User tab not display");
		
	}
	
	@Test(priority =2)
	public void visiblepasswordtab() {
		lp=new LoginPage(driver);
		boolean a=lp.isDisplayPassTab();
		log.info("Password Tab display");
		Assert.assertTrue(a, "Password tab not display");
	}
	
	@Test(priority =3)
	public void visibleLoginTab() {
		lp=new LoginPage(driver);
		boolean a=lp.isDisplayLoginTab();
		log.info("Login Tab display");
		Assert.assertTrue(a, "Login tab not display");
	}
	
	@Test(priority =4)
	public void visibleForgotTab() throws IOException {
		lp=new LoginPage(driver);
		boolean a=lp.isDisplayForgotTab();
		log.info("forgot password Tab display");
		Assert.assertTrue(a, "For got Password tab not display");
	}
	
	@Test(priority =5)
	public void visibleOrangHRMTab() {
		lp=new LoginPage(driver);
		boolean a=lp.isDisplayOrangeHRMTab();
		log.info("orangeHRM Tab display");
		Assert.assertTrue(a, "OrangeHRM tab not display");
	}
	
	@Test(priority =6)
	public void forgotpassClickabl() {
		lp=new LoginPage(driver);
		lp.clickforgotpass();
		log.info("Click on forgot password tab");
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL,"URL is not match");
		driver.navigate().back();
		log.info("return to back page");
	}
	
	@Test(priority =7)
	public void logiFunctionality() throws IOException {
		lp=new LoginPage(driver);
		lp.getusername();
		log.info("User name is enter");
		lp.getpassword();
		log.info("Password is enter");
		lp.clickLogin();
		log.info("Login button is click");
		String expectedURL="://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}
