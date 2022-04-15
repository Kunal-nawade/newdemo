package com.orangeHRM.UtilityClasses;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends ScreenShotUtility  implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		System.out.println("Execution is started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase is successfully passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase is failed and hence taking screenshot");
		try {
			ScreenShotUtility.ScreenShot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase is skipped");
	}
}
