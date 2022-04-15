package com.orangeHRM.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactSalePage {

	WebDriver driver;
	Select st;
	@FindBy(xpath="//input[@id='Form_submitForm_FullName']")
	private WebElement FullName;
	
	@FindBy(xpath="//input[@id='Form_submitForm_CompanyName']")
	private WebElement CompanyName;
	
	@FindBy(xpath="//input[@id='Form_submitForm_JobTitle']")
	private WebElement JobTitle;
	
	@FindBy(xpath="//select[@id='Form_submitForm_NoOfEmployees']")
	private WebElement NumofEmp;
	
	@FindBy(xpath="//div[@title='Select Country +']//div[@class='iti__flag iti__aa']")
	private WebElement Country;
	
	@FindBy(xpath="//ul[@id='iti-0__country-listbox']//li")
	private List<WebElement> CountryList;
	
	@FindBy(xpath="//input[@id='Form_submitForm_Contact']")
	WebElement PhoneNum;
	
	@FindBy(xpath="//input[@id='Form_submitForm_Email']")
	private WebElement Email;
	
	@FindBy(xpath="//textarea[@id='Form_submitForm_Comment']")
	private WebElement YourText;

	@FindBy(xpath="//input[@id='Form_submitForm_action_request']")
	WebElement Submit;
	
	public void clickSubmit() {
		Submit.click();
	}
	
	public void sendfullname(String a) {
		FullName.sendKeys(a);
	}
	
	public void sendcompanyname(String a) {
		CompanyName.sendKeys(a);
	}
	
	public void sendjobtitle(String a) {
		JobTitle.sendKeys(a);
	}
	
	public void sendemail(String a) {
		Email.sendKeys(a);
	}
	
	public void sendyourtext(String a) {
		YourText.sendKeys(a);
	}
	
	public void sendPhonenum(String a) {
		PhoneNum.sendKeys(a);
	}
	
	public void dropdownEMP(int i) {
		st=new Select(NumofEmp);
		st.selectByIndex(i);
	}
	
	public void selectCountry(String a) {
		for(WebElement cnt:CountryList) {
			if(cnt.getText().equalsIgnoreCase(a)) {
				cnt.click();
			}
		}
	}
	
	public ContactSalePage(WebDriver d){
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public void clickNumEmp() {
		NumofEmp.click();
	}
	
	public void clickcountry() {
		Country.click();
	}
}

