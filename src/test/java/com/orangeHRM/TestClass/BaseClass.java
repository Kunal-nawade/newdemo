package com.orangeHRM.TestClass;

import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.orangeHRM.UtilityClasses.Listener.class)
public class BaseClass {

	public static WebDriver driver;
	public static Logger log;
	@BeforeTest
	public void setMethod() {
		log=Logger.getLogger("OrangeHRM");
	    PropertyConfigurator.configure("log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		log.info("Browser open");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		log.info("URL open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
		log.info("Browser Close");
	}
}
