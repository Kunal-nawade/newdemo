package com.orangeHRM.TestClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangeHRM.POMClass.ContactSalePage;
import com.orangeHRM.POMClass.LoginPage;
import com.orangeHRM.POMClass.OrangeHRMpage;

public class OrangeHRMTest extends BaseClass {

	OrangeHRMpage hrm;
	@BeforeClass
	public void HRMpageOpen() {
		LoginPage lp=new LoginPage(driver);
		lp.clickorangeHRM();
		log.info("OrangeHRm is click");
		
		Set<String> s=driver.getWindowHandles();
		List<String> handler=new ArrayList<String>(s);
		driver.switchTo().window(handler.get(1));
	}
	
	@Test(priority=1)
	public void clickablContactSale() {
		hrm=new OrangeHRMpage(driver);
		hrm.clickContactSale();
		log.info("Contact Sale is click");
		String expectedURL="https://www.orangehrm.com/contact-sales/";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test(priority=2)
	public void contactSaleInfo() {
		ContactSalePage csi =new ContactSalePage(driver);
		csi.sendfullname("kunal nawade");
		log.info("Full name is enter");
		csi.sendcompanyname("Mphesis.pvt.lmt");
		log.info("Company name is enter");
		csi.sendjobtitle("QA tester");
		log.info("job title is enter");
		csi.clickNumEmp();
		log.info("Click on number of employ");
		csi.dropdownEMP(4);
		log.info("Number of employ is selected");
		csi.clickcountry();
		log.info("Click on country");
		csi.selectCountry("India");
		log.info("country is selected");
		csi.sendPhonenum("1254515");
		log.info("Phone number is enter");
		csi.sendemail("yipogo7257@aikusy.com");
		log.info("Email is enter");
		csi.sendyourtext("is it ok");
		log.info("your message is enter");
		
	}
	
}
