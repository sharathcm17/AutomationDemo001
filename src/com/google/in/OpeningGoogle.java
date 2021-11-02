package com.google.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningGoogle {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	      // browser type and chromedrover.exe path as parameters
	      System.setProperty("webdriver.chrome.driver",
	      ".\\chromedriver.exe");
	      String url = "https://www.google.co.in/";
	      driver.get(url);
	}

}
