package com.orangeHRM.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement Login;
	
	@FindBy(xpath="//a[normalize-space()='Forgot your password?']")
	private WebElement ForgotpassWord;
	
	@FindBy(xpath="//a[normalize-space()='OrangeHRM, Inc']")
	WebElement orangeHRM;
	
	public void clickorangeHRM() {
		orangeHRM.click();
	}
	public boolean isDisplayUserTab() {
		boolean b=Username.isDisplayed();
		return b;
	}
	
	public boolean isDisplayPassTab() {
		boolean b=Password.isDisplayed();
		return b;
	}
	
	public boolean isDisplayLoginTab() {
		boolean b=Login.isDisplayed();
		return b;
	}
	
	public boolean isDisplayForgotTab() {
		boolean b=ForgotpassWord.isDisplayed();
		return b;
	}
	
	public boolean isDisplayOrangeHRMTab() {
		boolean b=orangeHRM.isDisplayed();
		return b;
	}
	
	public void getusername() {
		Username.sendKeys("Admin");
	}
	
	public void getpassword() {
		Password.sendKeys("admin123");
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public void clickforgotpass() {
		ForgotpassWord.click();
	}
	
	public LoginPage(WebDriver d){
		driver=d;
		PageFactory.initElements(d,this);
	}
	
}
