package com.google.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class OpeningGoogle {
	
	public static ExtentReports reports;
	public static ExtentTest testlog;
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setUP() {
		
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(".\\Reports\\ExtentReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		
		htmlReport.config().setReportName("Test Report");
		reports.setSystemInfo("Host Name", "Test Host");
		reports.setSystemInfo("Enviroment", "Automation testing");
		reports.setSystemInfo("User Name", "QA Automation");
		htmlReport.config().setDocumentTitle("Automation report");
		htmlReport.config().setTheme(Theme.STANDARD);
	}
	
	@Test
	public void execute() throws InterruptedException {
		
		testlog = reports.createTest("Google scenario");
		testlog.info("Setting chrome browser");
		driver = new ChromeDriver();
	      // browser type and chromedrover.exe path as parameters
	      System.setProperty("webdriver.chrome.driver",
	      ".\\chromedriver.exe");
	      testlog.info("SLaunching URL");
	      String url = "https://www.google.co.in/";
	      driver.get(url);
	      testlog.info("Waiting for 5 sec");
	      Thread.sleep(5000);

	}
	
	@AfterMethod
	public void tearDown() {
	      testlog.info("closing the broswer");
	      driver.quit();
		
	}

}
