package com.orangeHRM.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.orangeHRM.TestClass.BaseClass;

public class ScreenShotUtility extends BaseClass {

	
	public static void ScreenShot(WebDriver driver) throws IOException {
		Date d=new Date();
		String date=d.toString().replace(":", "-");
		TakesScreenshot ss =(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File destiny=new File("C:\\Users\\91848\\eclipse-workspace\\OrangeHRM\\ScreenShot\\orangeHRM"+date+".jpg");
		FileHandler.copy(source, destiny);
	}
}
