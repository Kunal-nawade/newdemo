package com.orangeHRM.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMpage {
	WebDriver driver;

	@FindBy(xpath="//a[normalize-space()='Contact Sales']")
	private WebElement ContactSale;
	
	@FindBy(xpath="//a[normalize-space()='Book a Free Demo']")
	private WebElement BookfreeDemo;
	
	public void clickContactSale() {
		ContactSale.click();
	}
	
	public void clickfreeDemo() {
		BookfreeDemo.click();
	}
	
	public OrangeHRMpage(WebDriver d){
		driver=d;
		PageFactory.initElements(d,this);
	}
}
